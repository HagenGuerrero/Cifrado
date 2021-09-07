package Dominio;

public class Cesar {

    public char encripta(String caracteres, char caracter, int n) {
        char cifrado = ' ';
        int longitud = caracteres.length()-1;
        
        if(n > longitud){
            n = (int) (n - ((Math.floor(n/longitud))*longitud));
        }
        if(n > 0){
            int position = caracteres.indexOf(caracter);
            int new_position = position + n;
            
            if(new_position > longitud){
                int n2 = (longitud - new_position)*(-1);
                cifrado = caracteres.charAt(n2 - 1);
            }else{
                cifrado = caracteres.charAt(new_position);
            }
        }
        return cifrado;
    }

    public String char_type(String entrada, int n, String abc, String num) {
        String cifrado = "";
        
        for(int i = 0 ; i < entrada.length() ; i++){
            char lcchar = entrada.charAt(i);
            if(abc.indexOf(lcchar) >= 0){
                
                cifrado += encripta(abc, lcchar, n);
                
            }else if(num.indexOf(lcchar) >= 0){
                
                cifrado += encripta(num, lcchar, n);
                
            }else{
                cifrado += " ";
            }
        }
        return cifrado;
    }
}
