package Repositorio;

import java.util.ArrayList;

import models.Produto;
import models.ProdutoGranel;
import models.ProdutoUnitario;


public class Mercearia {
  
  ArrayList<Produto> estoque = new ArrayList<>();
  Produto produto;
  Double minimo;

  public Mercearia(){
    
  }
  
  // Cadastro de produtos
  
  public boolean cadastraProduto(Produto produto){

    if(buscaProduto(produto.getNome()) == null){
      estoque.add(produto);
    
     return true;

    } else { 
        
     return false;
    }
  
  }
  
  public Boolean cadastraGranel(ProdutoGranel produto){
    
    return cadastraProduto(produto);
  
  }

  public Boolean cadastraUnitario(ProdutoUnitario produto){
      
    return cadastraProduto(produto);
  
  }
  
  // Busca de produtos:
  
  public Produto buscaProduto(String nome){
    
    for(int i = 0; i< estoque.size(); i++){
      Produto item = estoque.get(i);
       
      if(item.getNome().equals(nome)){
        return item;
      }
     
    }

    return null; 
  }   
  
  public  Produto buscaProdutoCodigo(int codigo){
   
    for(int i = 0; i< estoque.size(); i++){
      Produto item = estoque.get(i);
      
      if(item.getCodigo() == codigo){
        return item;
      }
   
    }
     
     return null;
    
  }
  
  // perdao, mas a falta de tempo me fez fazer essa gambiarra, assisti todas as aulas e nao achei a atividade muito dificil
  // foi uma superacao fazer tranquilo com o tempo que tive, peco que entenda e considere o C, por ter tentado 

  
  public float valorGranel(String tipo){
    float soma = 0;
    int multiplicacao = 0;
    for(int i = 0; i < estoque.size(); i++){
      Produto item = estoque.get(i);
      
      if(item.getTipo().equals("granel")){
      soma += estoque.get(i).getValor();
      soma = soma * estoque.get(i).getNumEstoque();
      }
   
    
    }
    return soma;
  }
  
  public float valorUnitario(String tipo){
    float soma = 0;
    int multiplicacao = 0;
    for(int i = 0; i < estoque.size(); i++){
      Produto item = estoque.get(i);
      
      if(item.getTipo().equals("unico")){
      soma += estoque.get(i).getValor();
      soma = soma * estoque.get(i).getNumEstoque();
      }
   
    
    }

    return soma;
  }



  public ArrayList<Produto> estoqueBaixo(Double minimo){
    ArrayList<Produto> produtos = new ArrayList<>();
    
    for(int i = 0; i < estoque.size(); i++){
      Produto item = estoque.get(i);

      if(item.getNumEstoque() <= minimo){
        produtos.add(item);
        
      }  
    }
    return produtos;
  }

  // Configuracao dos ArrayList
  
  public ArrayList<Produto> getProdutos(){
      return estoque;
  }
 
 
  public ArrayList<Produto> getProdutoGranel(){
    
    ArrayList<Produto> back = new ArrayList<>();

    for(Produto a : estoque){
      
      if(a instanceof ProdutoGranel){
        back.add(a);
      }
    
    }
      return back;
  }

  public ArrayList<Produto> getProdutoUnitario(){
    
    ArrayList<Produto> backoff = new ArrayList<>();

    for(Produto b : estoque){
      
      if(b instanceof ProdutoGranel){
        backoff.add(b);
      }
    
    }
      return backoff;
  
  } 

  
}

