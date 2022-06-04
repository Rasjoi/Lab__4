package com.company.Classes;

public class Products
{
    //        Определить товар, количество которого больше всего
//        на складе, и напечатать все сведения о нем.
//private Product[] amounts;
//private int current_amounts;
    private Product[] products;
    private int currentProductNumber;
    public Products(int ProductNumber)
    {
      this.products = new Product[ProductNumber];
 currentProductNumber = -1 ;
    }
    public Product findMostExpensiveProduct() {
        Product product1 = products[0];

        for (final Product product : products) {

            if (product.getAmount() > product1.getAmount()) product1 = product;


        }

        return product1;
    }
    public void addProduct(final Product product) {
        if (++currentProductNumber < products.length) {
            products[currentProductNumber] = product;
        }
    }
    public String toString() {
        int count = 0;

        String result = "Products: " + System.lineSeparator();

        for (final Product product : products) {
            result += product + System.lineSeparator();
            count++;
        }


        return result + "Amount of products=" + count;
    }

}
