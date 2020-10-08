package cs.lab;

import java.util.Observable;

public class Description extends Observable {
    String description;

    public Description() {
    }


    private Boolean checkDescription(String _descripcion){
        /// TODO
        return true;
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



