/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osnovqprogrammirovanija;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
class Task2 {
    public void run(){
         System.out.println("----- Задача 2 ------");
         System.out.println("Угадай задуманное число");
        Random random = new Random();
        int myNumber = random.nextInt(10-5+1)+5;
        System.out.println("Загадано число от 5 до 10: ");
        System.out.print("Отгадай: ");
        Scanner scanner = new Scanner(System.in);
        int attempt = 1;
        do{
            int gamerNumber = scanner.nextInt();
            if(myNumber == gamerNumber) {
        
        System.out.println("Ты выйграл!");
        break;
        }else{
                if (attempt < 3){
                System.out.println("Ты  проиграл! Задумано число: "+myNumber); 
                }else{
                System.out.println("----- конец задачи 2 ------");
                }
             }
        }while(true);
        }
        }
        
        
        
        



