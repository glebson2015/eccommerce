
package br.senac.tads.dsw.model;
import br.senac.tads.dsw.annotation.Columm;
import br.senac.tads.dsw.annotation.Table;


/**
 *
 * @author MAI E GLEBSON
 */
@Table(name = "produto")
public class Produto{
    @Columm(name = "nome")
    private String nome;
    
    @Columm(name = "id")
    private int id;
    
    @Columm(name = "descricao")
    private String descricao;
    
    @Columm(name = "preco")
    private float preco;
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
}
