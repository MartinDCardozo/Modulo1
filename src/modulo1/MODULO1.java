package modulo1;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class MODULO1 {

        static ArrayList<Integer> executed = new ArrayList<>(10);

        public static void main(String args[]) {
            System.out.println("Hola bienvenido al modulo de programacion basica de Globant ");
            menu();


        }

        public boolean Exercise1() {
            Scanner user = new Scanner(System.in);
            System.out.println("1:Ingrese M si es hombre o F si es mujer");
            char sex = user.next().charAt(0);
            sex = Character.toUpperCase(sex);
            if (sex == 'M' || sex == 'F') {
                return true;
            } else {
                return false;
            }

        }

        public boolean Exercise2() {
            Scanner a = new Scanner(System.in);
            System.out.println("2:Ingrese 5 numeros enteros y el programa determinara " +
                    "si la suma de las posiciones 2,3 y 4 de dicha lista da como resultado un numero par");
            int sum = 0;
            int[] numbers = new int[5];
            System.out.println("Ingrese el primer numero");
            numbers[0] = a.nextInt();
            System.out.println("Ingrese el segundo numero");
            numbers[1] = a.nextInt();
            System.out.println("Ingrese el tercer numero");
            numbers[2] = a.nextInt();
            System.out.println("Ingrese el cuarto numero");
            numbers[3] = a.nextInt();
            System.out.println("Ingrese el quinto numero");
            numbers[4] = a.nextInt();
            for (int i = 2; i < numbers.length; i++) {
                sum += numbers[i];
            }
            if (sum % 2 == 0) {
                return true;
            } else {
                return false;
            }

        }

        public boolean Exercise3() {
            Scanner user = new Scanner(System.in);
            System.out.println("3:Ingrese 3 numeros enteros y el programa determinara si al menos 1 numero es par ");
            int accountant = 0;
            int[] list = new int[3];
            System.out.println("Ingrese el primer numero");
            list[0] = user.nextInt();
            System.out.println("Ingrese el segundo numero");
            list[1] = user.nextInt();
            System.out.println("Ingrese el tercer numero");
            list[2] = user.nextInt();
            for (int i = 0; i < list.length; i++) {
                if (list[i] % 2 == 0) {
                    accountant++;
                }
            }
            if (accountant > 0) {
                return true;
            } else {
                return false;
            }
        }

        public boolean Exercise4() {
            Scanner user = new Scanner(System.in);
            System.out.println("4:ingrese 2 palabras y el programa determinara si son iguales o no");
            System.out.println("Ingrese la primera palabra");
            String A = user.nextLine().toUpperCase();
            System.out.println("Ingrese la segunda palabra");
            String B = user.nextLine().toUpperCase();
            if (A.equals(B)) {
                return true;
            } else {
                return false;
            }
        }

        public boolean Exercise5() {
            System.out.println("5:Ingrese un numero entero y el programa analizara si es capicua o no");
            Scanner a = new Scanner(System.in);
            int number = a.nextInt(), backward = 0, oncourse;
            int original = number;
            while (number != 0) {
                oncourse = number % 10;
                backward = backward * 10 + oncourse;
                number /= 10;
            }
            return original == backward;
        }

        public boolean Exercise6() {
            System.out.println("6:El programa determinara si el numero A es menor que B ,"+"\n"+"ingrese numero A");
            Scanner user = new Scanner(System.in);
            int A = user.nextInt();
            System.out.println("ingrese numero B");
            int B = user.nextInt();
            if (A < B) {
                return true;
            } else {
                return false;
            }
        }

        public boolean Exercise7() {
            System.out.println("7:El programa determinara si la multiplicacion del numero A por B es igual " +
                    "al resultado de la division entre dichos numeros ");
            Scanner user = new Scanner(System.in);
            System.out.println("ingrese numero A");
            int A = user.nextInt();
            System.out.println("ingrese numero B");
            int B = user.nextInt();
            if (A * B == A / B) {
                return true;
            } else {
                return false;
            }
        }

        public boolean Exercise8() {
            System.out.println("8:el programa requere que ingrese 6 numeros , 3 seran almacenados " +
                    "en un array y 3 en otro ," + "\n" + " al comparar los valores dentro de cada array "+
                    "se determinara si ambos array comparten al menos 2 valores");
            Scanner user = new Scanner(System.in);
            int[] list1 = new int[3];
            int[] list2 = new int[3];
            System.out.println("Ingrese el primer numero del array A");
            list1[0] = user.nextInt();
            System.out.println("Ingrese el segundo numero del array A");
            list1[1] = user.nextInt();
            System.out.println("Ingrese el tercer numero del array A");
            list1[2] = user.nextInt();
            System.out.println("Ingrese el primer numero del array B");
            list2[0] = user.nextInt();
            System.out.println("Ingrese el segundo numero del array B");
            list2[1] = user.nextInt();
            System.out.println("Ingrese el tercer numero del array B");
            list2[2] = user.nextInt();
            int accountant = 0;
            for (int i = 0; i < list1.length; i++) {
                for (int j = 0; j < list2.length; j++) {
                    if (list1[i] == list2[j]) {
                        accountant++;
                    }
                }
            }
            if (accountant >= 2) {
                return true;
            } else {
                return false;
            }

        }

        public String Exercise9() {
            Scanner user = new Scanner(System.in);
            System.out.println("9:Ingrese una palabra y el programa invertira el orden de las letras de derecha a izquierda");
            String normal = user.next(), backwards = "";
            char l;
            for (int i = 0; i < normal.length(); i++) {
                l = normal.charAt(i);
                backwards = l + backwards;
            }
            return backwards;
        }

        public String Exercise10() {
            Scanner user = new Scanner(System.in);
            System.out.println("10:Ingrese una palabra y el programa reemplazara las vocales por x");
            String word = user.next();
            String lowerCase = word.toLowerCase();
            word = lowerCase.replaceAll("[aeiou]", "x");
            return word;

        }

        public static void menu() {
            System.out.println("Que desea hacer?" + "\n" + "1:Ejecutar uno de los 10 ejercicios indicando el indice ej:'1'." + "\n" +
                    "2:Ver los ultimos 5 ejercicios ajecutados." + "\n" + "3:Salir del programa.");
            Scanner user = new Scanner(System.in);
            int option = user.nextInt();
            int valid=0;
            if (option == 1) {
                System.out.println("Indique del 1 al 10 inclusive que ejercicio desea ejecutar.");
                int input = user.nextInt();
                while (input < 1 || input > 10) {
                    System.out.println("Debe ser un numero del 1 al 10 inclusive");
                    input = user.nextInt();
                }
                valid=input;
                Menuselection(valid);
                menu();
            }if (option == 2) {
                ListIterator<Integer> i = executed.listIterator(executed.size());
                while(i.previousIndex()!=executed.size()-6){
                    Object n=i.previous();
                    System.out.println(n+" ");
                }
                menu();
            }if (option == 3){
                System.out.println("Gracias por tu tiempo, que tengas un lindo dia");
                System.exit(0);
            }else{
                System.out.println("debe ser una de las 3 opciones");
                menu();
            }
        }


        public static void Menuselection(int valid) {
            MODULO1 modulo1 = new MODULO1();
            if (valid == 1) {
                executed.add(valid);
                System.out.println(modulo1.Exercise1());
            }
            if (valid == 2) {
                executed.add(valid);
                System.out.println(modulo1.Exercise2());
            }
            if (valid == 3) {
                executed.add(valid);
                System.out.println(modulo1.Exercise3());
            }
            if (valid == 4) {
                executed.add(valid);
                System.out.println(modulo1.Exercise4());
            }
            if (valid == 5) {
                executed.add(valid);
                System.out.println(modulo1.Exercise5());
            }
            if (valid == 6) {
                executed.add(valid);
                System.out.println(modulo1.Exercise6());
            }
            if (valid == 7) {
                executed.add(valid);
                System.out.println(modulo1.Exercise7());
            }
            if (valid == 8) {
                executed.add(valid);
                System.out.println(modulo1.Exercise8());
            }
            if (valid == 9) {
                executed.add(valid);
                System.out.println(modulo1.Exercise9());
            }
            if (valid == 10) {
                executed.add(valid);
                System.out.println(modulo1.Exercise10());
            }

        }


    }


