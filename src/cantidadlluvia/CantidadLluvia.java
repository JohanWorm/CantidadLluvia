/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cantidadlluvia;

import java.util.*;
import cantidadlluvia.Month;

/**
 *
 * @author Johan Eduardo
 */
public class CantidadLluvia {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Month> listMonths = new ArrayList<Month>();
        Month minMonth = new Month();
        Month maxMonth = new Month();
        int count = 4;
        int[] valuesQuantity = new int[count];
        int prom = 0;
        Scanner scan = new Scanner(System.in);
        
        for(int j = 0; j < count; j++){
            System.out.print("Ingrese el mes:");
            String nameMonth = scan.next();
            
            System.out.print("Ingrese la cantidad de lluvia del mes:");
            int quantityMonth = scan.nextInt();
            
            listMonths.add(new Month(nameMonth, quantityMonth));
            valuesQuantity[j] = quantityMonth;
        }
        
        for (int i = 0; i < listMonths.size(); i++) {
            int min = i;
            int max = i;
            
            for (int j = 0; j < listMonths.size(); j++) {
                if (listMonths.get(j).getQuantity() < listMonths.get(min).getQuantity()) {
                    min = j;
                }
            }
            if (i != min) {
                minMonth.setName(listMonths.get(min).getNameMonth());
                minMonth.setQuantity(listMonths.get(min).getQuantity());
            }
            
            for (int j = 0; j < listMonths.size(); j++) {
                if (listMonths.get(j).getQuantity() > listMonths.get(max).getQuantity()) {
                    max = j;
                }
            }
            if (i != max) {
                maxMonth.setName(listMonths.get(max).getNameMonth());
                maxMonth.setQuantity(listMonths.get(max).getQuantity());
            }
        }
        
        for (int j = 0; j < valuesQuantity.length; j++) {
            prom = prom + valuesQuantity[j];
        }
        
        prom = prom / count;
        
        System.out.println("...................");
        System.out.println("El mes con mayor lluvia fue " + maxMonth.getNameMonth() + " con una cantidad de " + maxMonth.getQuantity());
        System.out.println("El mes con menor lluvia fue " + minMonth.getNameMonth() + " con una cantidad de " + minMonth.getQuantity());
        
        System.out.println("...................");
        System.out.println("El promedio de lluevia es de" + prom);
    }
   
}
