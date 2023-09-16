package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheesePrice;
    private int toppingPrice;
    private int paperBagPrice;
    private boolean isExtraCheese;
    private boolean isExtraTopping;
    private boolean isPaperBag;
    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
            this.toppingPrice = 70;
        }else{
            this.price = 400;
            this.toppingPrice = 120;
        }
        this.cheesePrice = 80;
        this.paperBagPrice = 20;
        bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isExtraCheese==false){
            isExtraCheese = true;
            price = price + cheesePrice;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isExtraTopping==false){
            isExtraTopping = true;
            price += toppingPrice;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isPaperBag==false){
            isPaperBag = true;
            price = price + paperBagPrice;
        }
    }

    public String getBill(){
        if(isBillGenerated){
            return bill;
        }
        // your code goes here
        isBillGenerated = true;
        if(isExtraCheese)
            bill = bill + "Extra Cheese Added: "+cheesePrice+"\n";
        if(isExtraTopping)
            bill = bill + "Extra Toppings Added: "+toppingPrice+"\n";
        if(isPaperBag)
            bill = bill + "Paperbag Added: "+paperBagPrice+"\n";
        bill = bill + "Total Price: "+price+"\n";

        return this.bill;
    }
}
