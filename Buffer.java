package lexermanual;



import java.io.IOException;
import java.util.ArrayList;




/**
 *
 * @author William, Murillo e Tutão 
 */
public class Buffer {

    int pos = 0;
    final String EOL = ";";
    ArrayList<String> palavras = new ArrayList<String>();
    
    public String Buffer(String codObjt, int pos){

        String aux = "";
        char lookAhead  = ' ';
        for(int i = pos;i<codObjt.length() ;i++){
            
            aux += codObjt.charAt(i);
            
            
            if (aux.contains(EOL)) {
                
             
                if(i != codObjt.length()-1)
                {
                    this.pos++;
                this.Buffer(codObjt, this.pos);
                
                
                }
                palavras.add(aux);
                return aux ;
            }
            else{
                lookAhead = codObjt.charAt(i+1);
            
            }
             if (lookAhead == ' ')
            {
                this.pos = i + 2;
                
                this.Buffer(codObjt, this.pos);
                palavras.add(aux);                
                return aux;
                
                              
            }
            else if (lookAhead == ';' || lookAhead == ')' || lookAhead == ',' || lookAhead == '(' )
            {
                this.pos = i+1;
                this.Buffer(codObjt, this.pos);                
                palavras.add(aux);                
                return aux ;
                
                              
            }
            else if (aux.contains("(") || aux.contains(","))
            {
                this.pos = i+1;
                this.Buffer(codObjt, this.pos);                
                palavras.add(aux);                
                return aux ;
                
                              
            }

            
    }
    return "ERROR";
    
    }
    
}