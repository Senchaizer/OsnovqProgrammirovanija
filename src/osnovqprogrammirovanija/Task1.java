/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osnovqprogrammirovanija;

import java.util.Scanner;

 
/**
 *
 * @author user
 */
class Task1 {
Scanner scanner = new Scanner(System.in);
public void run(){
        System.out.println("----- Задача 1 ------");
        System.out.print("Введите число градусов по Цельсию: ");
        double gradC = scanner.nextDouble();
        // решение задачи
        System.out.print("По Фарингейту это будет: ");
        double gradF = gradC * 9/5 +32;
        System.out.printf("%.2f%n",gradF);
        System.out.println("----- конец задачи 1 ------");
    }
}
