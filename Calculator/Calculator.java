package Calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class InputReader
{
    static List<Point> twoPointParser(String line)
    {
        List<Point> res = new ArrayList<>();
        int brack_open, brack_closed = 0;

        String delims = ":";
        StringBuilder resString = new StringBuilder();
        String [] lines = line.split(delims), split_coords = new String[]{};


        split_coords = lines[1].split("\\) \\(");

        for(String coor: split_coords)
        {
            String[] nums = coor.replaceAll("[\\(]|[ ]|[\\)]", "").split(",");
            
            Double x = Double.parseDouble(nums[0]);
            Double y = Double.parseDouble(nums[1]);

            res.add(new Point(x, y));
            System.out.println(x);
        }
        
        System.out.println(resString.toString());
        return res;
    }

    static String read2pointCoordinates()
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        
        try
        {
            line = reader.readLine();
        }
        catch(Exception e)
        {
            System.out.println("ERROR with input coordinates");
        };

        //Can add a terminating loop later
        return line;
    }
}

class CoordinatePlaneFormula
{
    static Double distanceFormula(Double x1, Double x2, Double y1, Double y2)
    {
        return Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1), 2));
    }
    
}

class Point 
{
    private Double x;
    private Double y;
    
    protected Point(Double x , Double y)
    {
        this.x = x;
        this.y = y;
    }

    public Double getX()
    {
        return x;
    }

    public Double getY()
    {
        return y;
    }

    protected void setX(Double x)
    {
        this.x = x;
    }

    protected void setY(Double y)
    {
        this.y = y;
    }

}

class Calculator {

    static List<Double> readNumbers() {
        Scanner numScan = new Scanner(System.in);

        List<Double> res = new ArrayList<>();

        while (numScan.hasNext()) {
            if (numScan.hasNext("exit"))
                break;
            res.add(numScan.nextDouble());
        }

        numScan.close();
        print(9.0);
        return res;
    }

    static void print(Double result) {
        System.out.println(result);
    }

    // Addition method
    static Double addition(Double num1, Double num2) {
        return Double.valueOf(num1 + num2);
    }

    // Subtraction method
    static Double substraction(Double num1, Double num2) {
        return num1 - num2;
    }

    // Multiplication method
    static Double multiplication(Double num1, Double num2) {
        return num1 * num2;
    }

    // Division method
    static Double division(Double num1, Double num2) {

        Double res = 0.00;
        try {
            res = num1 / num2;
        } catch (Exception e) {
        } finally {
            System.out.println("Executed Division Operation");
        }

        return res;

    }

    public static void main(String [] args)
    {
        // List<Double> input_nums_list = readNumbers();

        Double num1 = 0.0, num2 = 0.0;
        
        String line = InputReader.read2pointCoordinates();
        
        List<Point> twoPoints = InputReader.twoPointParser(line);

        System.out.println(CoordinatePlaneFormula.distanceFormula(twoPoints.get(0).getX(), twoPoints.get(1).getX(), twoPoints.get(0).getY(), twoPoints.get(1).getY()));

        try
        {
            // num1 = input_nums_list.get(0);
            // num2 = input_nums_list.get(1);
        }

        catch(Exception e)
        {
            System.out.println("Caught Exception");
        }
        finally
        {
            System.out.print("Finally Executed");
        }


        System.out.println(addition(num1, num2));

    }
}