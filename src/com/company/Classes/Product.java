package com.company.Classes;

public class Product {
    /* Количество
                  Цена
          Год изготовления
          Производитель*/
    private int amount;
    private float price;
    private String manufacturer;
    private int year_of_production;

    public Product(int amount, float price, String manufacturer, int year_of_production) {
        this.setAmount(amount);
        this.setPrice(price);
        this.setManufacturer(manufacturer); ;
        this.setYear_of_production(year_of_production );
    }


    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer.strip();
    }

    public int getYear_of_production() {
        return year_of_production;
    }

    public void setYear_of_production(int year_of_production) {
        this.year_of_production = year_of_production;
    }

    @Override
    public String toString() {
        return "Product{" +
                "amount=" + amount +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                ", year_of_production=" + year_of_production +
                '}';
    }
}
