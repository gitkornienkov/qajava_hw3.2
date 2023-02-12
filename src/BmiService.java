public class BmiService {

    public int bmiCalc(double height, double weight) {
        double bmiCalculate;
        double heightDegree = height * height;
        bmiCalculate = weight / heightDegree;
        return (int)bmiCalculate;
    }
}
