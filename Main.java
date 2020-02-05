package com.company;
public class Main
{
    public static void main(String[] args)
    {
        // Declaración de Variables
        double a;
        double b;
        double Suma;
        double Resta;
        double Multi;
        double Div;

        LectorTeclado lt = LectorTeclado.getInstance(); // Declarando Lectura de Datos desde el Teclado

        // MENU PRINCIPAL
        System.out.println("***CALCULADORA***");
        System.out.println(" ");
        System.out.println("Seleccione una opción:");
        System.out.println("1- Suma");
        System.out.println("2- Resta");
        System.out.println("3- Multiplicacion");
        System.out.println("4- Division");
        System.out.println("5- Salir");
        int opc = lt.obtenerEnteroValidado("Seleccione una Opcion Correcta Por Favor");
        System.out.println(" ");

        while (opc != 5) // Inicio de Ciclo While
        {
            switch (opc) // Inicio de Estructura Switch
            {

                case 1: // SUMA
                    System.out.println("**SUMA**");
                    System.out.println("Ingrese el valor de A: ");
                    a = lt.obtenerEnteroValidado("Ingrese un Numero Por Favor");

                    System.out.println("Ingrese el valor de B: ");
                    b = lt.obtenerEnteroValidado("Ingrese un Numero Por Favor");

                    Suma = a + b;

                    System.out.println("La Suma de " + a + " y " + b + " es: " + Suma);
                    System.out.println(" ");

                    System.out.println("***CALCULADORA***");
                    System.out.println(" ");
                    System.out.println("Seleccione una opción:");
                    System.out.println("1- Suma");
                    System.out.println("2- Resta");
                    System.out.println("3- Multiplicacion");
                    System.out.println("4- Division");
                    System.out.println("5- Salir");
                    opc = lt.obtenerEnteroValidado("Seleccione una Opcion Correcta Por Favor");
                    System.out.println(" ");

                    break;


                case 2: // RESTA
                    System.out.println("**RESTA**");
                    System.out.println("Ingrese el valor de A: ");
                    a = lt.obtenerEnteroValidado("Ingrese un Numero Por Favor");

                    System.out.println("Ingrese el valor de B: ");
                    b = lt.obtenerEnteroValidado("Ingrese un Numero Por Favor");

                    Resta = a - b;

                    System.out.println("La Resta de " + a + " y " + b + " es: " + Resta);
                    System.out.println(" ");

                    System.out.println("***CALCULADORA***");
                    System.out.println(" ");
                    System.out.println("Seleccione una opción:");
                    System.out.println("1- Suma");
                    System.out.println("2- Resta");
                    System.out.println("3- Multiplicacion");
                    System.out.println("4- Division");
                    System.out.println("5- Salir");
                    opc = lt.obtenerEnteroValidado("Seleccione una Opcion Correcta Por Favor");
                    System.out.println(" ");

                    break;

                case 3: // MULTIPLICACION
                    System.out.println("**MULTIPLICACION**");
                    System.out.println("Ingrese el valor de A: ");
                    a = lt.obtenerEnteroValidado("Ingrese un Numero Por Favor");

                    System.out.println("Ingrese el valor de B: ");
                    b = lt.obtenerEnteroValidado("Ingrese un Numero Por Favor");

                    Multi = a * b;

                    System.out.println("La Multiplicación de " + a + " por " + b + " es: " + Multi);
                    System.out.println(" ");

                    System.out.println("***CALCULADORA***");
                    System.out.println(" ");
                    System.out.println("Seleccione una opción:");
                    System.out.println("1- Suma");
                    System.out.println("2- Resta");
                    System.out.println("3- Multiplicacion");
                    System.out.println("4- Division");
                    System.out.println("5- Salir");
                    opc = lt.obtenerEnteroValidado("Seleccione una Opcion Correcta Por Favor");
                    System.out.println(" ");

                    break;

                case 4: // DIVISION
                    System.out.println("**DIVISION**");
                    System.out.println("Ingrese el valor de A: ");
                    a = lt.obtenerEnteroValidado("Ingrese un Numero Por Favor");

                    System.out.println("Ingrese el valor de B: ");
                    b = lt.obtenerEnteroValidado("Ingrese un Numero Por Favor");

                    Div = a / b;

                    System.out.println("La Division de " + a + " entre " + b + " es: " + Div);
                    System.out.println(" ");

                    System.out.println("***CALCULADORA***");
                    System.out.println(" ");
                    System.out.println("Seleccione una opción:");
                    System.out.println("1- Suma");
                    System.out.println("2- Resta");
                    System.out.println("3- Multiplicacion");
                    System.out.println("4- Division");
                    System.out.println("5- Salir");
                    opc = lt.obtenerEnteroValidado("Seleccione una Opcion Correcta Por Favor");
                    System.out.println(" ");

                    break;

                default:
                    System.out.println("**Por favor seleccione una Opcion Correcta**");
                    System.out.println("***CALCULADORA***");
                    System.out.println(" ");
                    System.out.println("Seleccione una opción:");
                    System.out.println("1- Suma");
                    System.out.println("2- Resta");
                    System.out.println("3- Multiplicacion");
                    System.out.println("4- Division");
                    System.out.println("5- Salir");
                    opc = lt.obtenerEnteroValidado("Seleccione una Opcion Correcta Por Favor");
                    break;
            }
        }
    }
}