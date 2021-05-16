package application;

import entities.Product;
import model.services.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("HD case", 80.90));

        ProductService ps = new ProductService();

        //double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
        double sum = ps.filteredSum(list, p -> p.getPrice() < 100.00);



        System.out.println("Sum = " + String.format("%.2f", sum));
    }
}
