/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ELCOT
 */
public class BMICalc {
    public static double BMI(String h,String w){
        double height=Double.parseDouble(h);
        int weight=Integer.parseInt(w);
        double bmi=weight/(height*height);
        return bmi;
    }
}
