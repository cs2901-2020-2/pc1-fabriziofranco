package cs.lab;

import java.util.Observable;

public class Url extends Observable {
    String url;

    public Url(){
    }


    private Boolean checkUrl(String _url){
        return (_url.indexOf("https://utec.zoom.us/rec/share/")==0);
    }

    public void validate(String _description) throws IncorrectFormatException{
        if(checkUrl(_description)){
            url =_description;
            setChanged();
            notifyObservers(url);
        }
        else{
            throw new IncorrectFormatException("Revise su formato");
        }
    }










}
