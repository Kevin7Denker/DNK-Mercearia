package models;

public class ProdutoUnitario extends Produto{
    
    protected String descricao;
    protected int numEstoque, numUnidade;
    protected String tipo;

    //> metodo construtuor
    public ProdutoUnitario(String nome, String descricao, float valor,int numEstoque,int numUnidade,Double minimo, int codigo,String tipo){
     super(nome, codigo,valor,numEstoque,minimo);
     this.numUnidade = numUnidade;
     this.descricao = descricao;
     this.tipo = tipo; 
    }
    
    //> Sets
    
    public void setNumUnidade(int numUnidade){
         this.numUnidade = numUnidade;
    } 
    public void setDescricao(String descricao){
     this.descricao = descricao; 
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    //> Gets
    
    public int getNumUnidade(){
        return numUnidade;
    }
    public String getDescricao(){
     return descricao;  
    }
    public String getTipo(){
        return tipo;
    }
    
    //>To String
    
    @Override
    public String toString() {
       return "nome: "+nome+ " descricao: "+descricao+ " valor: "+valor+ " Numero no estoque: "+numEstoque+ " Numero de Unidade por pacote: "+numUnidade+" codigo: "+codigo;  
    }



}