public class Divisione {
    public static double dividi(double dividendo, double divisore) {
	
      try{
        if(divisore==0) {
          if(dividendo>0) return Double.POSITIVE_INFINITY;
          else return Double.NEGATIVE_INFINITY;
        } else {
          double risultato = dividendo/divisore;
          return risultato;
        }
      } catch (Exception e) {
        return 0;
      }
      
    }
}
