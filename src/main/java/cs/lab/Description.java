package cs.lab;

import java.util.Observable;

public class Description extends Observable {
    String description;

    public Description() {
    }


    private Boolean checkDescription(String descripcion1){
        //System.out.println(info.matches("\\d{4}-I|II (.*) (ES|EN) (.*), \\d{1}, Semana\\d{2}, (.*), \\d{2}/\\d{2} \\d{2}:\\d{2}-\\d{2}:\\d{2} ( Teoria| Laboratorio)"));
        //Intento fallido

        return (descripcion1.equals("Good Format"));
    }



    public void validate(String descripcion1) throws IncorrectFormatException{
        if(checkDescription(descripcion1)){
            description =descripcion1;
            setChanged();
            notifyObservers(description);
        }
        else{
            throw new IncorrectFormatException("Revise su formato");
        }
    }









}



