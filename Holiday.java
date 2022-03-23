/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holiday;

/**
 *
 * @author VC
 */
class HolidayClass {

    private String name;
    private int day;
    private String month;

    HolidayClass(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public String getMonth() {

        return this.month;
    }

    public int getDate() {
        return this.day;
    }

}

public class Holiday {

    /**
     * @param args the command line arguments
     */
    public static boolean inSameMonth(String Mon1, String Mon2) {
        if (Integer.parseInt(Mon1) == Integer.parseInt(Mon2)) {
            return true;
        } else {
            return false;
        }
    }

    public static double avgDate(HolidayClass arr[]) {
        int avg = 0;

        for (int i = 0; i < arr.length; i++) {
            avg += arr[i].getDate();
        }
        int length = arr.length;

        double val = avg / length;
        return val;
    }

    public static void main(String[] args) {

        HolidayClass h1 = new HolidayClass("Diwali", 24, "10");
        HolidayClass h2 = new HolidayClass("Independence Day", 15, "08");

        HolidayClass holiarr[] = {h1, h2};

        System.out.println("Months are different:" + " " + inSameMonth(h1.getMonth(), h2.getMonth()));
        System.out.println("Avg of all dates in Holiday is:" + " " + avgDate(holiarr));

    }

}
