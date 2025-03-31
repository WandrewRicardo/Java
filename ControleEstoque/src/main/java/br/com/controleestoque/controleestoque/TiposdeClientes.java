
package br.com.controleestoque.controleestoque;

public class TiposdeClientes {
    private int telefone;
    private String nome;
    private boolean PJ;
    private int ident;
    private String endereco;
    //construtor classe tipodeclientes
        public TiposdeClientes(String nomedocliente){
            nome = nomedocliente;
        }
        public void cadastrar(String enderecocad, int telefonecad, int identcad){
            telefone = telefonecad;
            endereco = enderecocad;
            ident = identcad;         
        }
    //identificar se é PJ ou PF    
         private boolean verificarPJ(int cont1){
             System.out.println("DIGITE 1 PARA PESSOA JURÍDCA ");
             System.out.println("DIGITE 2 PARA PESSOA FISICA");
             do{  
                 if(cont1 == 1){
                     return true;
                 }
                 else
                     return false;
                 
             }while(cont1 > 0 && cont1 < 3);
        
}
}
  
    
    

    

