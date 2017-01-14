public class Grain
{
   private String name;
   private double ppg;
   private double lovi;
   
   public Grain(String grainName, double gravity, double color)
   {
      name = grainName;
      ppg = gravity;
      lovi = color;
   }
   
   public String getName()
   {
      return name;
   }
   
   public double getPPG()
   {
      return ppg;
   }
   
   public double getLovi()
   {
      return lovi;
   }
}