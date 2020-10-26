public class MetodeOpgaver {
    public static void main(String[] args) {
       // kald metoder med relevante argumenter
      // tildel returværdi til variabel og udskriv result på skærmen
    }

    // Metoden skal returnere kvadratroden af tal
    public static double beregnKvadratrod(double tal) {
        //Brug Math klassens sqrt metode
        return 0.0;
    }

    // Metoden skal returnere det mindste af tal1, tal2
    public static int findMindsteTal(int tal1, int tal2) {
        //Brug Math klassens min metode
        return 0;
    }

    // Metoden skal returnere det største af tal1, tal2
    public static int findStørsteTal(int tal1, int tal2) {
        //Brug Math klassens max metode
        return 0;
    }

    // Metoden skal returnere det største af tal1, tal2 fordoblet
    // Hvis metoden modtager 2, 4 skal returneres værdien 8
    public static int fordoblStørsteTal(int tal1, int tal2) {
        //Brug Math klassen max metode
        return 0;
    }

    // Metoden skal returnere potensen af tal (tal1, opløftet i tal2)
    // Hvis metoden modtager 2, 3 skal returneres værdien 8 (2 * 2 * 2)
    public static double beregnPotens(double tal1, double tal2) {
        //Brug Math klassens pow metode
        return 0;
    }

    // Metoden skal returnere et tilfældigt tal ml. 1 og maxTal
    // Eksempel: Hvis maxTal er 10, skal metoden returnere en værdi ml. 1-10
    public static int genererTilfældigtTalMellem1ogMaxTal(int maxTal) {
        //Brug Random klassen
        return -1;
    }

    // Metoden skal returnere unicodeværdien for et tegn
    // Eksempel: 'A' skal returnere 65
    public static int getUnicode(char c) {
        // Man kan type-caste en char til en int for at få unicoden
        return -1;
    }

    // Metoden skal returnere strengens længde
    // Eksempel: "abc" skal returnere 3
    public static int getLængde(String s) {
        // Brug metoden length() på strengen
        return 0;
    }

    // Metoden skal returnere strengen skrevet med store bogstaver
    // Eksempel: "abc" skal returnere "ABC"
    public static String lavStrengTilStoreBogstaver(String s) {
        // Brug metoden toUpperCase() på strengen
        return "";
    }

    // Metoden skal fjerne evt. blanktegn forrest og bagerst i strengen
    // Eksempel: " abc " skal returnere "abc"
    public static String fjernBlanktegnForrestOgBagerst(String s) {
        // Brug metoden trim på strengen
        return "";
    }

    // Metoden skal tjekke om strengen starter med 'A'
    // Eksempel: "Abc " skal returnere true
    // Eksempel: "abc " skal returnere false
    public static boolean tjekOmStrengStarterMedA(String s) {
        // Brug metoden startsWith på strengen
        return false;
    }

    //Ekstra opgave: Udskriv dags dato
    public static void udskrivDagsDato() {
        // Brug bogens eksempel PrintTime klassen
        // ELLER: brug metoden LocalDate.now()
    }
}

