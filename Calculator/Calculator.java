package Calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Calculator
{
    static List<Double> readNumbers()
    {
        Scanner numScan = new Scanner(System.in);

        List<Double> res = new ArrayList<>();

        while(numScan.hasNext())
        {
            if (numScan.hasNext("exit")) break;
            res.add(numScan.nextDouble());
        }

        numScan.close();

        return res;
    }

    //Addition method
    static Double addition(Double num1, Double num2)
    {
        return  Double.valueOf(num1 + num2);
    }

    //Subtraction method
    static Double substraction(Double num1, Double num2)
    {
        return num1 - num2;
    }

    //Multiplication method
    static Double multiplication(Double num1, Double num2)
    {
        return num1 * num2;
    }

    //Division method
    static Double division(Double num1, Double num2)
    {

        Double res = 0.00;
        try
        {
            res = num1/num2;
        }
        catch (Exception e){}
        finally{System.out.println("Executed Division Operation");}

        return res;

    }


    public static void main(String [] args)
    {
        List<Double> input_nums_list = Calculator.readNumbers();

        Double num1, num2;

        num1 = input_nums_list.get(0);
        num2 = input_nums_list.get(1);

        System.out.println(Calculator.addition(num1, num2));

    }
}