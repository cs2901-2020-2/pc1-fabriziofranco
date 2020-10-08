package cs.lab;

import java.util.Observable;

public class Url extends Observable {
    String url;

    public Url(){
    }


    private Boolean checkUrl(String _url){
        return (_url.indexOf("https://utec.zoom.us/rec/share/")==0);
    }

    public void validate(String url1) throws IncorrectFormatException{
        if(checkUrl(url1)){
            url =url1;
            setChanged();
            notifyObservers(url);
        }
        else{
            throw new IncorrectFormatException("Revise su formato");
        }
    }










}
