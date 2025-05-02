public class AboutMe {
    public static void main(String[] args) {
        //inicializar una variable (del tipo que veas conveniente) para cada uno de los
        // siguentes datos: nombre, edad, país, lenguaje de programación, horas, pasatiempo,
        // lugar y reemplaza en el texto de impresión, la variable que corresponda.

        String name = "May";
        int age = 38;
        String country = "Venezuela";
        String programmingLanguage = "Java";
        int hours = 7;
        String hobby = "watch tv";
        String place = "Valencia";


        //Reemplaza <name> y <age> concatenando el String con las variables creadas. 
        System.out.println("Mi nombre es" + " " + name + "," + " " + "tengo" + " "+ age + " " + "años y soy de" + " " + country +".");

        //Reemplaza <programmingLanguage> y <hours> concatenando el String con las variables creadas. 
        System.out.println("Estoy estudiando" + " " + programmingLanguage + " " + "y practico" + " " + hours + " " + "horas al día" + ".");

        //Reemplaza <hobby> y <place> concatenando el String con las variables creadas.
        System.out.println("Mi pasatiempo favorito es" + " " + hobby + " " + "y lo practico en" + " " + place);
    }
}
