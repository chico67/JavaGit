public class Boxpackage {
    String servicetype;
    double priority;
    double standard;
    double TwoDay;
    double weight;

    Boxpackage (double p, double s, double td) {
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

    public void checkWeight() {
        if (weight >= 1)
            System.out.print("eligible for weight");
        else  
            return;

    }
}