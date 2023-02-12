public class BmiService {

    public int bmiCalc(double height, double weight) {
        double bmiCalculate;
        //double heightDegree = height * height;
        bmiCalculate = weight / Math.pow(height, 2);
        return (int)bmiCalculate;
    }
}
