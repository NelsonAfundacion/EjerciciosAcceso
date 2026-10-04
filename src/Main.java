import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
/*
        //variables
        int num = 0, cont = 0;

        //pedimos y recogemos datos
        System.out.println("Introduce un numero");
        num = teclado.nextInt();

        if(num % 2 == 0){
            System.out.println("Es par");
            cont++;
           // cont = cont + 1;
           // cont += 1;
        }

        if(num % 7 == 0){
            System.out.println("Es multiplo de 7");
            cont++;
            // cont = cont + 1;
            // cont += 1;
        }

        System.out.println("Se cumplen " + cont + " condiciones");

        int n = 9;

        int n1 = 2;
        double res = n/n1;

//        System.out.println(res);


        // variables

        int ano_nacimiento = 0;
        int cont = 0, altura = 0;
        double peso = 0;
        int velocidad = 0;

        //pedimos y recogemos año de nacimiento

        System.out.println("Introduce año de nacimiento");
        ano_nacimiento = teclado.nextInt();

        // Pedimos altura y peso
        System.out.println("Introduce la altura");
        altura = teclado.nextInt();

        System.out.println("Introduce el peso");
        peso = teclado.nextDouble();

        System.out.println("Introduce la velocidad");
        velocidad = teclado.nextInt();

        if (ano_nacimiento % 10 == 4 || ano_nacimiento % 10 == 5 ||ano_nacimiento % 10 == 7 ){
            System.out.println("Se cumple la primera condicion");
            cont++;
        }

        if(altura/peso >= 2 && altura/peso <= 5){
            System.out.println("Se cumple la segunda condicion");
            cont++;
        }

        if (velocidad > 100 || velocidad % 11 == 0) {
            System.out.println("Se cumple la tercera condicion");
            cont++;
        }

        System.out.println("Se cumplen " + cont + " condiciones");


//ejercicio 3

        int respuesta = 0;
        double n0 = 0;
        double n2 = 0;

        System.out.println("Operacion: 1 Suma, 2 Resta,\n 3 Multiplicacion, 4 Division");
        respuesta = teclado.nextInt();

        System.out.println("Diga el primer numero");
        n0= teclado.nextDouble();

        System.out.println("Diga el segundo numero");
        n2= teclado.nextDouble();
        switch (respuesta) {

            case 1:
                System.out.println("El resultado es: " + (n0 + n2));
                break;

            case 2:
                System.out.println("El resultado es: " + (n0 - n2));
                break;
            case 3:
                System.out.println("El resultado es: " + (n0 * n2));
                break;
            case 4:
                System.out.println("El resultado es: " + (n0 / n2));
                break;
        }


        //Ejercicio 4
        //Variables
        double num = 0;
        double resul = 0;
        final double CONS = 0.3;

        System.out.println("introduce un numero: ");
        num = teclado.nextDouble();

        resul = num * CONS;

        if( resul >= 4.5 && resul <= 7.2){

            System.out.println("se cumple");
        }else {
            System.out.println("no se cumple");
        }


        //ejercicio5

//        variables
        int numeros [] = new int [5];
        double media = 0;
        int suma = 0;

        for (int i = 0; i < numeros.length; i++){

            System.out.println("Introduce numero " + (i + 1));
            numeros[i] = teclado.nextInt();

            suma += numeros[i];
        }

        media = (double)suma/numeros.length;

        for (int i = 0; i < numeros.length; i++){

          if(numeros[i] > media){
              System.out.println(numeros[i]);
          }
        }



//        ejercicio 7
//variables
        int suma = 0;
        int num = 0;

        System.out.println("Introduce un numero");
        num = teclado.nextInt();

//        num = 3;
        //suma = 3
//        i = 3

        for (int i = 1; i < num; i++) {

            suma += i;
        }

        System.out.println(suma);


//        variables
        int nVentas = 0;
        int suma = 0;

        System.out.println("Introduce numero de ventas");
        nVentas = teclado.nextInt();

        for (int i = 0; i < nVentas; i++) {

            System.out.println("Introduce venta " + (i+1));
            suma += teclado.nextInt();
        }

        System.out.println(suma);
*/

/*
        //variables
        int min = 0;
        int max = 0;
        int menor = 0;
        int segMenor = 0;
        int numeros [] = new int [20];
        int aux = 0;

        System.out.println("Introduce numero mas pequeño");
        min = teclado.nextInt();

        System.out.println("Introduce numero mas grande");
        max = teclado.nextInt();

        if(min > max){
            aux = min;
            min = max;
            max = aux;
        }

        menor = max;
        segMenor = max;


        //rellenamos el array
        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = (int) (Math.random() * ((max - min) + 1)) + min;

            if(numeros[i] < menor){
                menor = numeros[i];
            }

            System.out.print(numeros[i] + " ");
        }

        //34 23 28 38

        // 2 y 40

//        menor = 23

//        segMenor = 28

        for(int n: numeros){

            if(n != menor && n < segMenor){
                segMenor = n;
            }
        }










        for (int i = 30; i >= 2; i -= 2 ){
            System.out.println(i);
        }


        for (int i = 1; i <= 5; i++) {

            System.out.println("TABLA DEL " + i);
            for (int j = 1; j <= 10; j++) {

                System.out.println(i + " x " + j + " = " + i * j);
            }

            System.out.println("\n");
        }

        int r = (int) (Math.random() * ((10 - 5) + 1)) + 5;
        System.out.println(r);
        int n = 1;
        for (int num = 1; num <= r; num++ ){
            n *= num;
        }
        System.out.println(n);



    int filas = 10, columnas = 10;
    for (int
    i = 0; i < filas;i++){
        for (int j = 0; j < columnas; j++){
            System.out.print(i + "" + j + "\t");
        }
        System.out.println();
    }



        int num = 4, cont = 0;
        boolean esPrimo = true;

        for(int i = 2; i < num; i++){

            if(num % i == 0){
                esPrimo = false;
                break;
                }

        }


        int numeros [] = new int[100];
        int num = 0;
        int cont = 0;

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = (int) (Math.random() * ((100 - 1) + 1)) + 1;
            System.out.print(numeros[i] + " ");
        }

        System.out.println("Introduce un numero");
        num = teclado.nextInt();

        for (int i = 0; i < numeros.length; i++) {

            if(numeros[i] == num){
                cont++;
            }
        }

        System.out.println("Aparece " + cont + " veces");


        int temperaturas [] = new int [5];
        int temMax = 0;
        int temMin = 100;
        int suma = 0;

        for (int i = 0; i < temperaturas.length; i++) {

            temperaturas[i] = (int) (Math.random() * ((100 - 1) + 1)) + 1;

            if(temMax < temperaturas[i]){
                temMax = temperaturas[i];
            }

            if(temMin > temperaturas[i]){
                temMin = temperaturas[i];
            }
            suma += temperaturas[i];
        }

        System.out.println("La temp Minima es: "+ temMin);
        System.out.println("La temp Maxima es: "+ temMax);
        System.out.println("La temp Media es: "+ (double)suma/temperaturas.length);


       int vector1 [] = {2,4,6,8,10};
       int vector2 [] = new int[vector1.length];
       int pos = vector1.length - 1;

        for (int i = 0; i < vector1.length; i++) {

            vector2[i] = vector1[pos];
            pos--;
        }

        for(int v: vector2){
            System.out.print(v);
        }

        int n = 8;
        String mensaje = "";

        if(n % 2 == 0 ){
            mensaje  = "Es par";
        }else{
            mensaje  = "No es par";
        }

        mensaje = n % 2 == 0 ? "Es par" : "No es par";



        int num = 8;
        int num2 = 0;
        int div = 0;

        do {

            try {
                System.out.println("Introduce divisor");
                num2 = teclado.nextInt();

                div = num / num2;
            } catch (ArithmeticException e) {
                System.out.println("no se puede dividir por cero");

            } catch (InputMismatchException e) {
                System.out.println("no has introducido un numero");
                teclado.nextLine();
            }
        }while(num2 <= 0);


        System.out.println(div);

/*
        try {
            System.out.println("Hola mundo");
            Thread.sleep(1000);
            System.out.println("Estamos en clase");
            Thread.sleep(1000);
            System.out.println("Que bien lo pasamos");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
*/


        /*2) Realiza un programa que pida una cadena de
        caracteres y diga cuantas vocales hay.

         *

        String palabra = "";
        String palabra1 = "";
        int contador = 0;

        System.out.println("Dime una palabra");
        palabra = teclado.nextLine();

        palabra1 = palabra.toLowerCase();

        for(int i = 0; i < palabra.length(); i++){
            if (palabra1.charAt(i) == 'a' || palabra1.charAt(i) == 'e' ||
                    palabra1.charAt(i) == 'i' || palabra1.charAt(i) == 'o' ||
                    palabra1.charAt(i) == 'u'){
                contador++;
            }
        }
        System.out.println("La palabra era: "+ palabra + " y contiene: " + contador + " vocales");
*/






       /*Realiza un programa que, dada una cadena de caracteres A y una cadena
        de caracteres B, ambas finalizadas con el símbolo #, indique el número
        de apariciones de cada carácter de la cadena B dentro de la cadena A.
Realiza un programa que lea dos cadenas de caracteres por teclado y escriba por
 pantalla el número de apariciones de cada carácter de la segunda cadena dentro de
  la primera.
Es necesario garantizar que las cadenas finalicen con el símbolo #, es decir,
 si la cadena entrada no finaliza con el símbolo # habrá que pedir otra, hasta
 que la cadena
entrada cumpla los requisitos

Restricciones.
La CADENA_A será como máximo de 80 caracteres. La CADENA_B será como máximo de
 25 caracteres.

Ejemplo de ejecución:
CADENA_A: holA mundo mundial!#
CADENA_B: paco#
RESULTADO:   p->0
             a->2
             c->0
             o->2

       *



        String cadenaA = "";
        String cadenaB = "";
        int cont = 0;

        do{
            System.out.println("Introduce cadena A");
            cadenaA = teclado.nextLine().toLowerCase();

            if(!cadenaA.endsWith("#") || cadenaA.length() > 80){
                System.out.println("Error");
            }
        }while(!cadenaA.endsWith("#") || cadenaA.length() > 80) ;

        do{
            System.out.println("Introduce cadena B");
            cadenaB = teclado.nextLine().toLowerCase();

            if(!cadenaB.endsWith("#") || cadenaB.length() > 25){
                System.out.println("Error");
            }
        }while(!cadenaB.endsWith("#") || cadenaB.length() > 25) ;

        for (int i = 0; i < cadenaB.length(); i++) {

            char caracterB = cadenaB.charAt(i);

            for (int j = 0; j < cadenaA.length(); j++) {

                if(caracterB == cadenaA.charAt(j)){
                    cont++;
                }
            }
            System.out.println(cadenaB + " -> " + cont);
            cont = 0;
        }

* */
        /*
        * Una frase diremos que es perfecta si todas sus palabras comienzan y terminan
        *  por la misma letra. Realice un programa que solicite una cadena de caracteres,
        * y que determine si es perfecta o no. Puede suponer que el usuario empezará
        *  por una letra (no empezará con espacios o puntos, por lo tanto no es necesario
        *  controlar el inicio). Por ejemplo, las dos frases siguientes son perfectas:
        *
Laura leía la lista.
Ayuda ahora a Andalucía.




       String frase = "";
       boolean esPerfecta = true;

       System.out.println("Introduce una frase");
       frase = teclado.nextLine().toLowerCase();

       //laura leila la lista.

        //0->laura
        //1-> leila

        frase = frase.substring(0, frase.length()-1);
        System.out.println(frase);

       String palabras [] = frase.split(" ");

       char primeroC = palabras[0].charAt(0);
       char ultimoC = palabras[0].charAt(palabras[0].length()-1);

        for (int i = 1; i < palabras.length; i++) {

            char pC = palabras[i].charAt(0);
            char uC = palabras[i].charAt(palabras[i].length()-1);

            if(primeroC != pC || ultimoC != uC){
                esPerfecta = false;
                break;
            }
        }

        if(esPerfecta){
            System.out.println("La frase es perfecta");
        }else{
            System.out.println("La frase no es perfecta");
        }
    * */



















































    }
}