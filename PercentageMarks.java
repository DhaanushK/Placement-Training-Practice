public class PercentageMarks {
    public static void main(String[] args) {
        int a = 90;
        int b = 80;
        int c = 65;
        int d = 71;
        int e = 50;

        int sum = a+b+c+d+e;
        float average = (float) sum / 500;
        int percentage = (int) ((float)average*100);
        System.out.println("Total Marks: "+sum);
        System.out.println("Percentage: " + percentage);
    }
}
