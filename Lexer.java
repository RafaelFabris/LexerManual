package lexermanual;

import java.io.IOException;
import static java.time.Clock.system;
import java.util.regex.Matcher;
import java.util.regex.Pattern;





/**
 *
 *  @author William, Murillo e Tutão 
 */
class Tokens{
    
    private String nome_token;
    private String descricao;    
    String valor;
    
    public Tokens(String nome_token, String descricao, String valor)
    {
        this.nome_token = nome_token;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    
    public void setNome_token(String nome_token)
    {
        this.nome_token = nome_token;        
    }
    public void setDescricao(String descricao)
    {
        this.descricao = descricao;        
    }
    
    public String getNome_Token()
    {
        return this.nome_token;
    }
    public String getDescricao()
    {
        return this.descricao;
    }
    
}

public class Lexer{
    
    public Tokens analise(String palavra)
    {
        Tokens token = null;    

        
        if(palavra.equals(";"))
        {
            token = TabelaDeSimbolos.Valores(251);
            token.valor = " - ";
            
        }


        else if(palavra.equals("="))
        {
            token = TabelaDeSimbolos.Valores(252);
            token.valor = " - ";             
        }
          

        else if(palavra.equalsIgnoreCase("INSERT"))
        {
            token = TabelaDeSimbolos.Valores(253);
            token.valor = " - ";                  
        }

        
        else if(palavra.equals("("))
        {
            token = TabelaDeSimbolos.Valores(254);
            token.valor = " - ";                 
        }
            
        
        else if(palavra.equals(")"))
        {
            token = TabelaDeSimbolos.Valores(255);
            token.valor = " - ";              
        }
            
        
        else if(palavra.equalsIgnoreCase("WHERE"))
        {
            token = TabelaDeSimbolos.Valores(256);
            token.valor = " - ";                 
        }
           
        
        else if(palavra.equalsIgnoreCase("UPDATE"))
        {
            token = TabelaDeSimbolos.Valores(257);
            token.valor = " - ";              
        }
           
        else if(palavra.equalsIgnoreCase("INTO"))
        {
            token = TabelaDeSimbolos.Valores(258);
            token.valor = " - ";                 
        }
            
        
        else if(palavra.equalsIgnoreCase("SET"))
        {
            token = TabelaDeSimbolos.Valores(259);
            token.valor = " - ";              
        }
           
        else if(palavra.equalsIgnoreCase("VALUES"))
        {
            token = TabelaDeSimbolos.Valores(260);
            token.valor = " - ";                  
        }
           
        
        else if(palavra.matches("^'{1}.*'$"))
        {
            token = TabelaDeSimbolos.Valores(261);
            token.valor = palavra;              
        }
           
        
        else if(palavra.matches("[+,-]?[0-9]+([\\.][0-9]+)?"))
        {
            token = TabelaDeSimbolos.Valores(262);
            token.valor = palavra;            
        }
        else if(palavra.matches("[a-zA-Z]+\\w*"))
        {
            token = TabelaDeSimbolos.Valores(263);
            token.valor = palavra;               
        }
        else if(palavra.equalsIgnoreCase("+"))
        {
            token = TabelaDeSimbolos.Valores(264);
            token.valor = " - ";             
        }
            
        else if(palavra.equals(","))
        {
            token = TabelaDeSimbolos.Valores(265);
            token.valor = " - ";            
        }
        else
        {
            System.out.println("Simbolo inesxistente: " + palavra);
            System.exit(-1);
            
        }
        

            
            
        return token;    
    }
    
     
    
    
    
    
    
}