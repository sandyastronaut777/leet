import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
      convertTemperature(celsius);
    }

    
    public static double[] convertTemperature(double celsius) {
        double kelvin =0.00, fehrenheit =0.00;
        kelvin = celsius + 273.15;
        fehrenheit = celsius * 1.80 + 32.00 ;

       double result[] = {kelvin, fehrenheit};
        return result;
    }
}
