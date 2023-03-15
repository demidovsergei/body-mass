public class BmiService {
    public double Calculate(int weightKG, double heightM) {

        return (int) (weightKG / heightM / heightM);
    }
}
