public class Main {
    public static void main(String[] args) {
        // 4. Popis prázdnin (min 5 vět)
        String prazdniny = """
                byl jsem v turecku.
                ucil jsem se.
                chodil sjem an brigadu.
                byl jsem s kamaradam an slovensku na 3 dny.
                spal jsem.
                """;
        System.out.println(prazdniny);

        // 5. Osobní údaje
        String jmeno = "kec ondrej";
        String bydliste = "borsice 735";
        int vek = 17;
        String telefon = "5454646";
        String email = "kec.ondrej@gmail.com";

        System.out.printf("Jméno: %s%nBydliště: %s%nVěk: %d%nTelefon: %s%nEmail: %s%n",
                jmeno, bydliste, vek, telefon, email);
    }
}