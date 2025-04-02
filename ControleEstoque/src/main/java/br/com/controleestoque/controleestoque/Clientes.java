
package br.com.controleestoque.controleestoque;

public class Clientes {
    private int telefone;
    private String nome;
    private boolean identPj;
    private String identificador;
    private String endereco;
    
    //construtor classe tipodeclientes
        public Clientes (String nomedocliente, String endereco, int telefone, String identificador,boolean identPj){
            nome = nomedocliente;
            this.endereco = endereco;
            this.telefone = telefone;
            this.identificador = identificador;
            this.identPj = identPj;
            
        }
        public void atualizar(String nome, String endereco, int telefone){
            this.nome = nome;
            this.telefone = telefone;
            this.endereco = endereco;
                  
        }
    //identificar se é PJ ou PF    
         private boolean verificarPJ(int cont1){
             do{  
                System.out.println("DIGITE 1 PARA PESSOA JURÍDCA ");
                System.out.println("DIGITE 2 PARA PESSOA FISICA");
               
                    if(cont1 == 1){
                         return true;
                    }
                    else
                         return false;
                 
             }while(cont1 > 0 && cont1 < 3);
        
        }
         //metodo para limpar os dados do cliente
         public void excluir(){
             this.nome = null;
             this.telefone = 0;
             this.endereco = null;
             this.identificador = null;
             this.identPj = false;
         }
}
  
    
    

    

