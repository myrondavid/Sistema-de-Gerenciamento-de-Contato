package sistemacontato;

/**
 *
 * @author Alexandra Miguel Raibolt da Silva
 */
public class PessoaFisica extends Cliente {
    /* Atributos */
    private String CPF;

    /* Métodos Especiais */
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

}