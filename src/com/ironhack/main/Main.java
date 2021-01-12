package com.ironhack.main;

public class Main {
    public static void main(String[] args) {
        int array1[] = {2, 3, 6, 7, 4};
        int newArray[] = new int[5];

        for (int i = 0; i < array1.length; i++) {
            if (i == array1.length - 1) {               //Si es el último multiplico por el primero...
                newArray[i]=array1[i] * array1[0];
            } else {                                    //Y si no, por el siguiente.
                newArray[i]=array1[i] * array1[i + 1];
            }
            System.out.println(newArray[i]);
        }

        invertArray(array1);
    }

    public static void invertArray(int array[]){
            int invertedArray[] = new int[array.length];
            System.out.println("matriz inversa:");

            for (int i = 0; i < array.length; i++){         //Recorro el array viejo hacia delante...
                invertedArray[i] = array[array.length-1-i]; //Y lo guardo en el nuevo hacia detrás.
                System.out.println(invertedArray[i]);
            }
    }
}
