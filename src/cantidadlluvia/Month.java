/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cantidadlluvia;

/**
 *
 * @author johan
 */
public class Month {
    
    private String name;
    private int quantity;
    
    public Month(String n, int q) {
        name = n;
        quantity = q;
    }
    
    public Month() {
        name = "";
        quantity = 0;
    }
    
    public String getNameMonth() {
        return name;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setName(String n) {
        this.name = n;
    }
    
    public void setQuantity(int q) {
        this.quantity = q;
    }

}
