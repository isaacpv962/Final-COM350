/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC-Solution 3-8-21
 */

import java.util.Scanner;
public class CandyBarCine {
    public static void main(String[] args) {
        CandyBarCine candyBarCine = new CandyBarCine();
        candyBarCine.iniciarPrograma();
    }

    private void iniciarPrograma() {
        boolean salir = false;

        while (!salir) {
            System.out.println("Bienvenido al Candy Bar del Cine");
            System.out.println("1. Comprar productos individuales");
            System.out.println("2. Comprar combos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = leerEntero();

            switch (opcion) {
                case 1:
                    comprarProductosIndividuales();
                    break;
                case 2:
                    comprarCombos();
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }

        System.out.println("¡Gracias por su compra!");
    }

    private void comprarProductosIndividuales() {
        boolean finalizarCompra = false;
        double precioTotal = 0.0;

        while (!finalizarCompra) {
            System.out.println("Productos disponibles:");
            System.out.println("1. Pipoca pequeña - Bs 5");
            System.out.println("2. Pipoca mediana - Bs 8");
            System.out.println("3. Pipoca grande - Bs 10");
            System.out.println("4. Soda pequeña - Bs 4");
            System.out.println("5. Soda mediana - Bs 6");
            System.out.println("6. Soda grande - Bs 8");
            System.out.println("7. Finalizar compra");
            System.out.print("Seleccione un producto (1-7): ");
            int seleccion = leerEntero();

            switch (seleccion) {
                case 1:
                    PipocaPequena pipocaPequena = new PipocaPequena();
                    precioTotal += pipocaPequena.getPrecio();
                    System.out.println("Pipoca pequeña agregada al carrito.");
                    break;
                case 2:
                    PipocaMediana pipocaMediana = new PipocaMediana();
                    precioTotal += pipocaMediana.getPrecio();
                    System.out.println("Pipoca mediana agregada al carrito.");
                    break;
                case 3:
                    PipocaGrande pipocaGrande = new PipocaGrande();
                    precioTotal += pipocaGrande.getPrecio();
                    System.out.println("Pipoca grande agregada al carrito.");
                    break;
                case 4:
                    SodaPequena sodaPequena = new SodaPequena();
                    precioTotal += sodaPequena.getPrecio();
                    System.out.println("Soda pequeña agregada al carrito.");
                    break;
                case 5:
                    SodaMediana sodaMediana = new SodaMediana();
                    precioTotal += sodaMediana.getPrecio();
                    System.out.println("Soda mediana agregada al carrito.");
                    break;
                case 6:
                    SodaGrande sodaGrande = new SodaGrande();
                    precioTotal += sodaGrande.getPrecio();
                    System.out.println("Soda grande agregada al carrito.");
                    break;
                case 7:
                    finalizarCompra = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }

        System.out.println("Precio total: Bs " + precioTotal);
    }

    private void comprarCombos() {
        boolean finalizarCompra = false;
        double precioTotal = 0.0;

        while (!finalizarCompra) {
            System.out.println("Combos disponibles:");
            System.out.println("1. Combo 1 - 2 pipocas medianas y 2 sodas medianas - Descuento: Bs 1");
            System.out.println("2. Combo 2 - 1 pipoca mediana y 1 soda mediana - Descuento: Bs 0.5");
            System.out.println("3. Combo 3 - 2 pipocas grandes y 2 sodas medianas - Descuento: Bs 2");
            System.out.println("4. Finalizar compra");
            System.out.print("Seleccione un combo (1-4): ");
            int seleccion = leerEntero();

            Combo combo = new Combo();

            switch (seleccion) {
                case 1:
                    PipocaMediana pipocaMediana1 = new PipocaMediana();
                    SodaMediana sodaMediana1 = new SodaMediana();
                    combo.agregarProducto(pipocaMediana1);
                    combo.agregarProducto(pipocaMediana1);
                    combo.agregarProducto(sodaMediana1);
                    combo.agregarProducto(sodaMediana1);
                    combo.setDescuento(1.0);
                    precioTotal += combo.getPrecio();
                    System.out.println("Combo 1 agregado al carrito.");
                    break;
                case 2:
                    PipocaMediana pipocaMediana2 = new PipocaMediana();
                    SodaMediana sodaMediana2 = new SodaMediana();
                    combo.agregarProducto(pipocaMediana2);
                    combo.agregarProducto(sodaMediana2);
                    combo.setDescuento(0.5);
                    precioTotal += combo.getPrecio();
                    System.out.println("Combo 2 agregado al carrito.");
                    break;
                case 3:
                    PipocaGrande pipocaGrande3 = new PipocaGrande();
                    SodaMediana sodaMediana3 = new SodaMediana();
                    combo.agregarProducto(pipocaGrande3);
                    combo.agregarProducto(pipocaGrande3);
                    combo.agregarProducto(sodaMediana3);
                    combo.agregarProducto(sodaMediana3);
                    combo.setDescuento(2.0);
                    precioTotal += combo.getPrecio();
                    System.out.println("Combo 3 agregado al carrito.");
                    break;
                case 4:
                    finalizarCompra = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }

        System.out.println("Precio total: Bs " + precioTotal);
    }

    private int leerEntero() {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        scanner.nextLine();
        return numero;
    }
}