/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variant2;

import java.util.Arrays;
import java.util.Comparator;

public class Textbook {

    private String name;
    private String text;
    private String isbn;

    public Textbook() {
    }

    public Textbook(String name, String text, String isbn) {
        this.name = name;
        this.text = text;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIsbn() {
        return isbn;
    }

    // Task 1
    public void setIsbn(String isbn) throws IllegalISBN{
        int count = 0;
        int isbnConverted = Integer.parseInt(isbn);
        while(isbnConverted != 0)
        {
            isbnConverted /= 10;
            ++count;
        }
        if(count != 10){
            throw new IllegalISBN(count);
        }else{
            this.isbn = isbn;
        }
    }



    // Task 3
    public int maxContaingWordLength(String str) {
        int n = text.length();
        int res = 0, cnt = 0;
        int max = 0;
        if (text.contains(str)) {
            for (int i = 0; i < n; i++) {
                if (text.charAt(i) != ' ') {
                    cnt++;
                }else {
                    res = Math.max(res, cnt);
                    cnt = 0;
                }
            }


        }

        return Math.max(res, cnt);
    }



    @Override
    public String toString() {
        return "TextBook{" + "name=" + name + ", text=" + text + ", isbn=" + isbn + '}';
    }

}
