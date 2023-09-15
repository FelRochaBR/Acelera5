
package encapsularDados;

public class Usuario {
    private String login;
    private String senha;
    private String nome,sobreNome,dataNascimento;
    
    public Usuario(String login, String senha,String nome,String sobreNome,String dataNascimento){
        this.login = login;
        this.senha = senha;
        this.nome=nome;
        this.sobreNome=sobreNome;
        this.dataNascimento=dataNascimento;
    }
    
    public void setLogin(String login){
        this.login = login;
    }
    
    public String getLogin(){
        return login;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public String getSenha(){
        return senha;
    }
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sobreNome
     */
    public String getSobreNome() {
        return sobreNome;
    }

    /**
     * @param sobreNome the sobreNome to set
     */
    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    /**
     * @return the dataNascimento
     */
    public String getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
   
}

    
