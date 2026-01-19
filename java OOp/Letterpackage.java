public class Letterpackage{
  double priority;
  double standard;
  int units;

   Letterpackage (double p, double s) {
    priority = p;
    standard = s;
  }
  public double getPriority() {
    return priority;
  }

  public double getStandard() {
    return standard;
  }

  public void checkLetterpackage() {
    if (units > 8)
        System.out.print("the service is not applicable. ");
  }

}
 