public class Kage {
  public static void main(String[] args) {

    int antal = 1;
    int æg = 4*antal;
    int sukkerGram = 300*antal;
    int mælkGram = 200*antal;
    int smørGram = 50*antal;
    int hvedemelGram = 250*antal;
    int bagepulverTsk = 3*antal;
    int vaniljesukkerTsk = 1*antal;

    int smørToppingGram = 100*antal;
    int kokosmelGram = 150*antal;
    int brunFarin = 225*antal;
    int mælkToppingGram = 50*antal;

    String gram = " g";
    String dL = " dl";
    String tsk = " tsk";

    int tskTilGram = bagepulverTsk*3+vaniljesukkerTsk*3;
    int gramIngredienser = sukkerGram+smørGram+smørToppingGram+kokosmelGram+brunFarin+tskTilGram+mælkToppingGram+mælkGram;
    int procent = gramIngredienser/10;

        int kcalÆg = 83*æg;
        int kcalSukker = 4*sukkerGram;
        int kcalMælk = 1*mælkGram;
        int kcalSmør = 7*smørGram;
        int kcalHvedemel = 3*hvedemelGram;
        int kcalBagepulver = 2*(15*antal);
        int kcalVaniljesukker = 4*(4*antal);

        int kcalSmørTopping = 7*smørToppingGram;
        int kcalKokosmelTopping = 7*kokosmelGram;
        int kcalBrunFarinTopping = 4*brunFarin;
        int kcalMælkTopping = 1*mælkToppingGram;
        int kcalIAlt = (kcalÆg)+(kcalSukker)+(kcalMælk)+(kcalSmør)+(kcalHvedemel)+(kcalBagepulver)+(kcalVaniljesukker)+(kcalSmørTopping)+(kcalKokosmelTopping)+(kcalBrunFarinTopping)+(kcalMælkTopping);

        double proteinÆg = 7.4*æg;
        double proteinSukker = 0.0*sukkerGram;
        double proteinMælk = (3.5*mælkGram)/100;
        double proteinSmør = (0.5*smørGram)/100;
        double proteinHvedemel = (9.6*hvedemelGram)/100;
        double proteinBagepulver = (5.0/100)*antal;
        double proteinVaniljesukker = 0.0*antal;

        double proteinSmørTopping = (0.5*smørToppingGram)/100;
        double proteinKokosmelTopping = (6.4*kokosmelGram)/100;
        double proteinBrunFarinTopping = 0.0*antal;
        double proteinMælkTopping = (3.5*mælkToppingGram)/100;
        double proteinIAlt = proteinÆg+proteinSukker+proteinMælk+proteinSmør+proteinHvedemel+proteinBagepulver+proteinVaniljesukker+proteinSmørTopping+proteinKokosmelTopping+proteinBrunFarinTopping+proteinMælkTopping;

        int ægPris = 23;
        int sukkerPris = 12;
        int mælkPris = 10;
        int smørPris = 15;
        int hvedemelPris = 19;
        int bagepulverPris = 15;
        int vaniljesukkerPris = 10;

        int smørToppingPris = 15;
        int kokosmelToppingPris = 14;
        int brunFarinToppingPris = 18;
        int mælkToppingPris = 11;

        double ægPrisD = ((ægPris / 10.0) * æg);
        double sukkerPrisD = ((sukkerPris / 1000.0) * sukkerGram);
        double mælkPrisD = ((mælkPris / 1000.0) * mælkGram);
        double smørPrisD = ((smørPris / 250.0) * smørGram);
        double hvedemelPrisD = ((hvedemelPris / 1000.0) * hvedemelGram);
        double bagepulverPrisD = ((bagepulverPris / 100.0) * 15);
        double vaniljesukkerPrisD = ((vaniljesukkerPris / 100.0) * 4);

        double smørToppingPrisD = ((smørToppingPris / 250.0) * smørToppingGram);
        double kokosmelToppingPrisD = ((kokosmelToppingPris / 500.0) * kokosmelGram);
        double brunFarinToppingPrisD = ((brunFarinToppingPris / 100.0) * brunFarin);
        double mælkToppingPrisD = ((mælkToppingPris / 1000.0) * mælkToppingGram);

        double prisIAlt = ægPrisD+sukkerPrisD+mælkPrisD+smørPrisD+hvedemelPrisD+bagepulverPrisD+vaniljesukkerPrisD+smørToppingPrisD+kokosmelToppingPrisD+brunFarinToppingPrisD+mælkToppingPrisD;

      System.out.println(antal+" Drømmekage(r):");
      System.out.println("Æg "+æg+" - kcal: "+kcalÆg+" - protein: "+proteinÆg+gram);
      System.out.println("Sukker "+sukkerGram+gram+" - kcal: "+kcalSukker+" - protein: "+proteinSukker+gram);
      System.out.println("Mælk "+mælkGram+dL+" - kcal: "+kcalMælk+" - protein: "+proteinMælk+gram);
      System.out.println("Smør "+smørGram+gram+" - kcal: "+kcalSmør+" - protein: "+proteinSmør+gram);
      System.out.println("Hvedemel "+hvedemelGram+gram+" - kcal: "+kcalHvedemel+" - protein: "+proteinHvedemel+gram);
      System.out.println("Bagepulver "+bagepulverTsk+tsk+" - kcal: "+kcalBagepulver+" - protein: "+proteinBagepulver+gram);
      System.out.println("Vaniljesukker "+vaniljesukkerTsk+tsk+" - kcal: "+kcalVaniljesukker+" - protein: "+proteinVaniljesukker+gram);
      System.out.println(" ");
      System.out.println("Topping:");
      System.out.println("Smør "+smørToppingGram+gram+" - kcal: "+kcalSmørTopping+" - protein: "+proteinSmørTopping+gram);
      System.out.println("Kokosmel "+kokosmelGram+gram+" - kcal: "+kcalKokosmelTopping+" - protein: "+proteinKokosmelTopping+gram);
      System.out.println("Brun farin "+brunFarin+gram+" - kcal: "+kcalBrunFarinTopping+" - protein: "+proteinBrunFarinTopping+gram);
      System.out.println("Mælk "+mælkToppingGram+dL+" - kcal: "+kcalMælkTopping+" - protein: "+proteinMælkTopping+gram);
      System.out.println(" ");
      System.out.println("Vægt af alle ingredienser: "+gramIngredienser+gram);
      System.out.println("Vægt når kagerne er bagt "+(gramIngredienser-procent)+gram);
      System.out.println(" ");
      System.out.println("Kcal i alt: "+kcalIAlt);
      System.out.println("Protein i alt: "+proteinIAlt+gram);
      System.out.println("Pris I alt: "+prisIAlt+" kr.");
   }
}
