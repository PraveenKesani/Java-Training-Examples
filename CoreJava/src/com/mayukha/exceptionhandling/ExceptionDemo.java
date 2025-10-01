package com.mayukha.exceptionhandling;

public class ExceptionDemo {
    public static void main(String[] args) {
        int x = 0;
        int y = 10;

        int a = action(x,y);
        System.out.println("a= "+a);

        /*try {
            int a = 10 / 0; // ArithmeticException
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Finally block always executes.");
        }*/
    }

    public static int action(int x, int y) {
        /*if(x == 0) {
            return 0;
        }*/
        int res =0;
        try {
            res = y/x;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        finally {
            System.out.println("finally block ");
        }
        return res;
    }
}
