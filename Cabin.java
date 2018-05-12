public class Cabin{

   private String model;
   private double length;
   private int numBeds;
   private boolean plumbings;
   
    public Cabin()//def
      {
         String model = " ";
         length = 0;
         numBeds = 0;
         plumbings= true; 
      }
   public Cabin(String str, double dub, int inty,boolean bool)//o
      {
         model = str;
         length = dub;
         numBeds = inty;
         plumbings = bool; 
      }
   public void setModel(String s)
      {
        model = s;
      }
   public String getModel()
      {
         return model;
      }
   public void setLength(double l)
      {
         length = l;
      } 
   public double getLength()
      {
         return length;
      }
   public void setNumBeds(int in)
      {
         numBeds = in;
      }
   public int getNumBeds()
      {
         return numBeds;
      }
    public void setPlumbing(boolean b)
      {
         plumbings = b;
      }
    public boolean getPlumbing()
      {
         return plumbings;
      }

}