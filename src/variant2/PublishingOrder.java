/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variant2;

import java.util.ArrayList;
import java.util.List;

public class PublishingOrder {

    private int orderNumber;
    private Textbook textbook;
    private int textbooksQuantity;

    public PublishingOrder(int orderNumber, Textbook textbook, int textbooksQuantity) {
        this.orderNumber = orderNumber;
        this.textbook = textbook;
        this.textbooksQuantity = textbooksQuantity;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Textbook getTextbook() {
        return textbook;
    }

    public void setTextbook(Textbook textbook) {
        this.textbook = textbook;
    }

    public int getTextbooksQuantity() {
        return textbooksQuantity;
    }

    public void setTextbooksQuantity(int textbooksQuantity) {
        this.textbooksQuantity = textbooksQuantity;
    }

    @Override
    public String toString() {
        return "Order{" + "orderNumber=" + orderNumber + ", textbook=" + textbook + ", textbooksQuantity=" + textbooksQuantity + '}';
    }

    public String textbookName(){
        return textbook.getName();
    }

}
