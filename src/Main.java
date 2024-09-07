import org.w3c.dom.css.Counter;

public class Main {
    public static void main(String[] args) {
        double[] num = {1.0, 2.0, -37.89, 12.34, 76.23, -44.56, 0.12, -98.76, 55.43, 33.33, -11.11, 88.88, 22.22, -66.66, 5.59};
        double sum = 0.0;
        int counter = 0;
        boolean flag = false;
        for (double positive : num) {
            if (positive < 0) {
                flag = true;
            }
            if (positive > 0 && flag) {
                sum += positive;
                counter += 1;
            }


        }

        if (!flag) {
            System.out.println("отрисателных чисел нет");
        } else {
            System.out.println("сумма чисел " + sum);
            System.out.println("количества чисел " + counter);
            System.out.println("среднее арифметическо " + (sum / counter));
        }
    }
}