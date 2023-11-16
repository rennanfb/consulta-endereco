package br.com.alura.modelos;

public class Endereco {
    private int cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String uf;
    private int ddd;

    public Endereco(int cep, int ddd,String cidade,String uf, String bairro, String logradouro) {
        this.cep = cep;
        this.ddd = ddd;
        this.cidade = cidade;
        this.uf = uf;
        this.bairro = bairro;
        this.logradouro = logradouro;
    }

    public Endereco(EnderecoApi enderecoApi) {
        String cepSemHifen = enderecoApi.cep().replace("-", "");
        this.cep = Integer.parseInt(cepSemHifen);
        this.ddd = Integer.parseInt(enderecoApi.ddd());
        this.cidade = enderecoApi.localidade();
        this.uf = enderecoApi.uf();
        this.bairro = enderecoApi.bairro();
        this.logradouro = enderecoApi.logradouro();

    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    public int getDdd() {
        return ddd;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "- Cidade: " + cidade + "," + " Bairro: " + bairro + "," + " Logradouro: " + logradouro;

    }
}

