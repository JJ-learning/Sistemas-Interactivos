
package multiapp;

/**
 *
 * @author Juan José Méndez Torrero
 */
public class MailVariables {
    public String fromMailText;
    public String toMailText;
    public String conceptText;
    public String textText;
    
    public String getFromText(){
        return fromMailText;
    }
    
    public String getToText(){
        return toMailText;
    }
    
    public String getConceptText(){
        return conceptText;
    }
    
    public String gettextText(){
        return textText;
    }
    
    public void setFromText(String fromtext){
        this.fromMailText = fromtext;
    }
    
    public void setToText(String to){
        this.toMailText = to;
    }
    
    public void setConceptText(String concept){
        this.conceptText = concept;
    }
    
    public void settextText(String text){
        this.textText = text;
    }
    
}
