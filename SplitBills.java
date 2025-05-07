public class SplitBills {
    public static void main(String[] args) {

        //Crea dos variables, la primera que contenga el total de la cuenta que será 7 EUR y
        // la segunda que contenga el número de personas a dividir (esta variable deberá ser de
        // tipo int) que serán 2 personas.
        int totalBill = 7;
        int person = 2;

        //Haz la operación aritmética para devolver la cantidad a pagar por persona y almacénala
        // dentro de una variable (del tipo que veas conveniente).
        double totalPerPerson = (double)totalBill/ person;

        //Imprime el resultado (deberá devolverte 3.5)
        System.out.println(totalPerPerson);
    }
}
