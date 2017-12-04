package lexermanual;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import static javafx.scene.input.KeyCode.E;
import static javafx.scene.input.KeyCode.T;





/**
 *
 * @author William, Murillo e Tutão "gangster"
 */
public class TabelaDeSimbolos {    
      
    String descricao;
    String nome_token;
    

    static public Tokens Valores(int tipo){
        Tokens aux = new Tokens("Nulo","Nulo"," - ");
            if(tipo == 251){
                aux.setDescricao("fim da linha");
                aux.setNome_token("<EOL>");
                
                

            }
        else if(tipo == 252)
        {
                aux.setDescricao("atribuicao") ;
                aux.setNome_token("<EQUALS>");

        }

        else if(tipo == 253){
                aux.setDescricao("palavra chave")  ;
                aux.setNome_token("<INSERT>")  ;
     
        }
        else if(tipo == 254){
                aux.setDescricao("inicio de expressão") ;
                aux.setNome_token("<OPEN>") ;
      
        }
        else if(tipo == 255){
                aux.setDescricao("fim de expressão") ;
                aux.setNome_token("<CLOSE>") ;
        
        }
        else if(tipo == 256){
                aux.setDescricao("palavra chave") ;
                aux.setNome_token("<WHERE>") ;
      
        } 
        else if(tipo == 257){
                aux.setDescricao("palavra chave") ;
                aux.setNome_token("<UPDATE>") ;
     
        } 
        else if(tipo == 258){
                aux.setDescricao("palavra chave") ;
               aux.setNome_token("<INTO>") ;
       
        } 
        else if(tipo == 259){
                aux.setDescricao("palavra chave") ;
                aux.setNome_token("<SET>") ;
     
        } 
        else if(tipo == 260){
                aux.setDescricao("palavra chave") ;
                aux.setNome_token("<VALUES>") ;
      
        } 
        else if(tipo == 261){
                aux.setDescricao("conjunto de caracteres") ;
                aux.setNome_token("<STRING>") ;
      
        }
        else if(tipo == 262){
                aux.setDescricao("valor numerio") ;
                aux.setNome_token("<NUM>") ;
      
        }
        else if(tipo == 263){
                aux.setDescricao("variavel") ;
                aux.setNome_token("<ID>") ;
      
        }
        else if(tipo == 264){
                aux.setDescricao("mais") ;
                aux.setNome_token("<PLUS>") ;
       
        }
        else if(tipo == 265){
                aux.setDescricao("separação de atributos") ;
                aux.setNome_token("<COMMA>") ;
        
        }
        else
        {
            System.out.println("Tipo de simbolo não presente na tabela");
            aux.setDescricao("Simbolo não presente");
            aux.setNome_token("Nulo");
        }

    return aux;
    
    }
   
}