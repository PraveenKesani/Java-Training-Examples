package com.mayukha.inheritence;

abstract class Tax {
    public abstract void getFederalTax(int salary);
}

public class Taxaction extends Tax{
    public void getFederalTax(int salary){
        System.out.println("Taxaction-Federal Tax calculated");
    }
}

class CaliforniaTaxation extends Taxaction{
    public void getStateTax(int salary){
        System.out.println("-CaliforniaTaxation-State Tax calculated :int :"+salary);
    }

    public void getStateTax(float salary){
        System.out.println("CaliforniaTaxation-State Tax calculated : float");
    }

    public void getStateTax(String salary){
        System.out.println("CaliforniaTaxation-State Tax calculated: string");
    }

    public void getStateTax(int salary, boolean isNative){
        System.out.println("State Tax calculated: int boolean");
    }

    public void getStateTax(int salary, int additionalIncome){
        System.out.println("State Tax calculated: int int");
    }

}

class TexasTaxation extends CaliforniaTaxation {
    public void getStateTax(int salary){
        System.out.println("TexasTaxation-State Tax calculated :int :"+salary);
    }

    public void getStateTax(float salary){
        System.out.println("TexasTaxation-State Tax calculated : float");
    }

    public void getStateTax(String salary){
        System.out.println("TexasTaxation-State Tax calculated: string");
    }

}


class Test {
    int a=10;
    static int b=20;
    public static void main(String [] args){
        int c=30;
        CaliforniaTaxation californiaTaxation = new CaliforniaTaxation();
        System.out.println(californiaTaxation.toString());
        californiaTaxation.getFederalTax(1000);
        californiaTaxation.getStateTax('a');
        new CaliforniaTaxation().getStateTax('a');

        System.out.println("-----------------------------");

        TexasTaxation texasTaxation = new TexasTaxation();
        System.out.println(texasTaxation.toString());
        texasTaxation.getFederalTax(1000);
        texasTaxation.getStateTax('a');

        System.out.println("-----------------------------");


        System.out.println(c);
        System.out.println(b);
        Test test = new Test();
        System.out.println(test.a);





        /*Taxaction taxaction = new CaliforniaTaxation();
        System.out.println(taxaction.toString());
        *//*taxaction.getFederalTax(1000);
        taxaction.get*/
    }

}
