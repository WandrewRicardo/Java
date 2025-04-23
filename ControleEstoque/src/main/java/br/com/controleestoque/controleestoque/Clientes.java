package br.com.controleestoque.controledeestoquetest;
public class TiposDeCliente {
    private String telefone;
    private String nome;
    private boolean identPj;
    private String identificador;//pode ser cpf ou cnpj
    private String email;
    private String identificadorApenasNumeros;
   //construtores classe tipodeclientes
        public TiposDeCliente(String nome, String email, String telefone, String identificador,boolean identPj){
            this.nome = nome;
            this.email = email;
            this.telefone = telefone;
            this.identificador = identificador;
            this.identPj = identPj;
            
        } 
        public TiposDeCliente(){
            
        }
        
    //getters 

        public String getTelefone() {
            return telefone;
        }

        public String getNome() {
            return nome;
        }

        public String getIdentificador() {
            return identificador;
        }

        public String getEmail() {
            return email;
        }
        
    //setters
        public void atualizarInformacoes(String nome, String email, String telefone) {
            this.nome = nome;
            this.email = email;
            this.telefone = telefone;
        }
    // setters individuais

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    // delete objeto
        public void deleteObjeto(){
            nome = null;
            telefone = null;
            identificador = null;
            email = null;
            identPj = false;
            System.gc(); //sistema de coleta de lixo
        }
    public String identificadorTipoDocumento(String identificador){
        //Remove todos os caracteres que não são números 
        String identificadorApenasNumeros = identificador.replaceAll("\\D", "");
        //Verificador se è CPF OU CNPJ
        if (identificadorApenasNumeros.length() == 11){
            return "CPF";
        }
        else if (identificadorApenasNumeros.length() == 14){
            return "CNPJ";
        }
        else{
            return "Número Inválido";
        }
    
    
    
    
    }  
}
