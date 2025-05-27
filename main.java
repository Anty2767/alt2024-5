import java.io.*;

class Main{
    public static void main(String args[]){
        double dato1=leggiDouble("inserisci 1^ numero");
        double dato2=leggiDouble("inserisci 2^ numero");
    }


    public static String decimaleInBinario(int numero) {
        if (numero == 0) {
            return "0";
        }

        StringBuilder binario = new StringBuilder();

        while (numero > 0) {
            int resto = numero % 2;
            binario.insert(0, resto); // Inserisce il bit all'inizio della stringa
            numero = numero / 2;
        }

        return binario.toString();
    }
    public static String convertiInOttale(int numero) {
        // Usa il metodo Integer.toOctalString per ottenere la rappresentazione ottale
        return Integer.toOctalString(numero);
    }
    public static String convertiInEsadecimale(int numero) {
        return Integer.toHexString(numero).toUpperCase();
    }
    public static double leggiDouble(String domanda){//leggi intero POSITIVO
    double numeroInserito = 0;
    boolean conversione=false;//flag che controlla che la conversione sia corretta
    do{
      try{
        numeroInserito=Double.parseDouble(leggiStringa(domanda));
        conversione=true;
      }catch(ArithmeticException e){
        System.out.println("devi inserire un numero! "+e+"\n");
      }catch(Exception e){
        System.out.println("errore nella conversione "+e+"\n");
      }
    }while(!conversione);
    return numeroInserito;
  }

/**
   * Legge una stringa da input.
   *
   * @param domanda La domanda da visualizzare.
   * @return La stringa inserita.
   */
  public static String leggiStringa(String domanda) {//leggi STRINGA
    BufferedReader k=new BufferedReader (new InputStreamReader(System.in));
    boolean corretto=false; //flag che controlla che l'input sia corretto
    String risposta = "";
    do{
      try{
        System.out.println(domanda);
        risposta = k.readLine();
        corretto=true;
      }catch(IOException e){
        System.out.println("errore nell'acquisizione del dato!\n");
      }catch(Exception e){
        System.out.println("errore "+e+"\n");
      }
    }while(!corretto);
    return risposta;
  }  
}