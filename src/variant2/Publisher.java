/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variant2;

import javax.print.attribute.standard.OrientationRequested;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Publisher {

    private String name;
    private List<PublishingOrder> orders;
    private int cntOrder = 0;

    public Publisher() {
        orders = new ArrayList();
    }

    public Publisher(String name) {
        this.name = name;
        orders = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCntOrder() {
        return cntOrder;
    }

    void addOrder(PublishingOrder order) {
        this.orders.add(order);
        cntOrder++;
    }

    // Task 2
    public void writeOrderstoFile(String filename) {

        try (FileWriter fileWriter = new FileWriter(filename + ".txt")) {
            for(PublishingOrder publishingOrder : orders) {
                fileWriter.write( "Number: " + publishingOrder.getOrderNumber() + ", name: "
                + publishingOrder.textbookName() + ", quantity: " + publishingOrder.getTextbooksQuantity() + "; ");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // Task 4
    public void startPublishing() {
        for (final PublishingOrder order : this.orders) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " Number: " + order.getOrderNumber() +
                            ", book: " + order.textbookName() + ", quantity: " + order.getTextbooksQuantity());

                }
            };

            Thread thread = new Thread(runnable);
            thread.start();
        }
    }

    @Override
    public String toString() {
        return "Publisher{" + "name=" + name + ", orders=" + orders + '}';
    }

}
