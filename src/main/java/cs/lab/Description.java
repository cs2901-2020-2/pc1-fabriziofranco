package cs.lab;

import java.util.Observable;

public class Description extends Observable {
    String description;

    public Description() {
    }


    private Boolean checkDescription(String _descripcion){
        //System.out.println(info.matches("\\d{4}-I|II (.*) (ES|EN) (.*), \\d{1}, Semana\\d{2}, (.*), \\d{2}/\\d{2} \\d{2}:\\d{2}-\\d{2}:\\d{2} ( Teoria| Laboratorio)"));
        //Intento fallido

        return (_descripcion.equals("Good Format"));
    }



    public void validate(String _description) throws IncorrectFormatException{
        if(checkDescription(_description)){
            description =_description;
            setChanged();
            notifyObservers(description);
        }
        else{
            throw new IncorrectFormatException("Revise su formato");
        }
    }









}



