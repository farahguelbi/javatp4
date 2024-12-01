import java.util.Arrays;
import java.util.List;
public class mot_dict{
    private String mot;
    private String definition;

String getMot(){
    return mot;
}
String getDefinition(){
    return definition;
}
 void setDefinition ( String def ){
    this.definition=def;
}
void setMot(String a ){
    this.mot=a;
}
boolean synonyme (String a, String autredef){
    if (mot.compareToIgnoreCase(a)==0 &&  this.definition.compareToIgnoreCase(autredef)==0);
      return true;

}}
