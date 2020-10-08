package cs.lab;
import java.util.Observable;
import java.util.Scanner;
import java.util.logging.Logger;



public class Validator extends Observable {
    Description description;
    Sujeto descriptionObserver,urlObserver;
    Url url;
    static final Logger logger = Logger.getLogger(Validator.class.getName());
    public Validator(){
        description = new Description();
        url = new Url();

        descriptionObserver = new Sujeto();
        urlObserver = new Sujeto();

        description.addObserver(descriptionObserver);
        url.addObserver(urlObserver);
    }

    public void nextClass(String _description,String _url) throws IncorrectFormatException{
        description.validate(_description);
        url.validate(_url);
    }


    public static void main(String[] args) {
        String nombre;
        logger.info("Bienvenido a RegistroApp, ingrese a su nombre:");
        Scanner input = new Scanner(System.in);
        nombre=input.nextLine();
        logger.info("Acceso concedido, Profesor "+input);
        Validator profesor= new Validator();
    }
}
