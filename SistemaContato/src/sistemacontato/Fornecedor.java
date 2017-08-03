package sistemacontato;

/**
 *
 * @author Alexandra Miguel Raibolt da Silva
 */
public class Fornecedor extends Contato {
    /* Atributos */
    private String CNPJ;
    private String telefoneFixo;
    private String FAX;

    /* Métodos Especiais */
    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    public String getFAX() {
        return FAX;
    }

    public void setFAX(String FAX) {
        this.FAX = FAX;
    }

}