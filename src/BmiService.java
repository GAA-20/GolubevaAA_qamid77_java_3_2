public class BmiService {
    int calculate(double heightMetres, double weightKG) {
        double bmi = weightKG / (heightMetres * heightMetres);
        return (int) bmi;
    }
}
