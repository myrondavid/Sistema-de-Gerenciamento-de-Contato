package sistemacontato;

/**
 *
 * @author Alexandra Miguel Raibolt da Silva
 */
public abstract class Contato {
    /* Atributos */
    private String nome;
    private String email;

    /* Métodos Especiais */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}