public class Additionalweight {
    String servicetype;
    double priority;
    double standard;
    double TwoDay;

    Additionalweight ( double p, double s, double td) {
        priority = p;
        standard = s;
        TwoDay = td;
    }
    public double getPriority() {
        return priority;
    }

    public double getStandard() {
        return standard;
    }
    public double getTwoDay() {
        return TwoDay;
    }
}
