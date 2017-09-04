
package br.senac.tads.dsw.model;





/**
 *
 * @author MAI E GLEBSON
 */

public class Produto{
    
    private String nome;
        
    private int id;
        
    private String descricao;
        
    private float preco;
    
    Produto(){
    
    
    }    
    
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
