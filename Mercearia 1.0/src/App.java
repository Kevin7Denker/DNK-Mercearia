import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Repositorio.Mercearia;
import models.Produto;
import models.ProdutoGranel;
import models.ProdutoUnitario;

public class App {   
  
  private static void showMenu(){
    System.out.println("\n[1]Cadastrar Produto Granel:");
    System.out.println("[2]Cadastrar Produto Unitario:");
    System.out.println("[3]Buscar Produto");
    System.out.println("[4]Visualizar valor produtos Granel");
    System.out.println("[5]Visualizar valor produtos Unitario");
    System.out.println("[6]Visualizar os produtos com estoque baixo");
    System.out.println("[7]Visualizar todos os produtos cadastrados");
    System.out.println("[0]Sair\n\n");
  }



  public static void main(String[] args){
    
    // variavies
    String nome , descricao ;
    int numEstoque, i = 0, numUnidade , kg, metro, codigo;
    float valor  ; 
    Produto produto;
    ProdutoGranel granel;
    ProdutoUnitario unidade;
    Double minimo;
    
    Mercearia mercearia = new Mercearia();
    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    ArrayList<Produto> estoque = new ArrayList<>();
   
    showMenu();
    int x = scan.nextInt();
    scan.nextLine();
    
   while(x >= 1 && x <= 7){
      switch(x){
     
        case(1): 
  
        System.out.println("@ Inicio do cadastro @");
           
        System.out.println();  
          
        System.out.println("Digite o Nome do Produto");
            nome = scan.nextLine();
          
        System.out.println("Digite a descricao do Produto");
            descricao = scan.nextLine();
          
        System.out.println("Digite o Valor do Produto");    
            valor = scan.nextFloat();
          
        System.out.println("Digite o Numero de Produtos que irao para o Estoque");
            numEstoque = scan.nextInt();
          
        System.out.println("Digite o peso em Quilos(Se sua unidade de medida nao for quilos apenas digite 0): ");
            kg = scan.nextInt();

        System.out.println("Digite a medida em Metros(Se sua unidade de medida nao for metros apenas digite 0): ");
            metro = scan.nextInt();    
        
        codigo = random.nextInt(100);  

        System.out.println("O codigo do produto :"+codigo);
         String tipo = "granel";  
         minimo = 5.0;
         granel= new ProdutoGranel(nome, descricao, valor, numEstoque,kg,metro,minimo,codigo,tipo);  
           
          mercearia.cadastraGranel(granel);
          System.out.println(); 
          System.out.println("Cadastro Concluido");
          System.out.println();System.out.println();
                 
       
         break; 
       case(2):

        System.out.println("@ Inicio do cadastro @");
           
        System.out.println();  
          
        System.out.println("Digite o Nome do Produto");
            nome = scan.nextLine();
          
        System.out.println("Digite a descricao do Produto");
            descricao = scan.nextLine();
          
        System.out.println("Digite o Valor do Produto");    
            valor = scan.nextFloat();
          
        System.out.println("Digite o Numero de Produtos que irao para o Estoque");
            numEstoque = scan.nextInt();
          
        System.out.println("Digite o Numero de Unidades Totais No Pacote");
            numUnidade= scan.nextInt();
            
        codigo = random.nextInt(100);

        System.out.println("O codigo do produto eh:"+codigo+"");
        tipo = "unico";    
        minimo = 5.0;  
        unidade = new ProdutoUnitario(nome, descricao, valor, numEstoque,numUnidade,minimo,codigo,tipo);  
           
        mercearia.cadastraUnitario(unidade);
          System.out.println(); 
          System.out.println("Cadastro Concluido");
          System.out.println();System.out.println();
           
          
          
        break;       
        case(3):
         
          System.out.println("[1] Busca Por Nome   [2] Busca Por codigo");
          int o = scan.nextInt();
        
          if(o == 1){
          scan.nextLine();
          System.out.println("Digite o nome do produto");
          nome = scan.nextLine();
   
          produto = mercearia.buscaProduto(nome);
                 
          if(produto != null){
            System.out.println("Produto Encontrado");
            System.out.println(produto.toString());
            System.out.println();System.out.println();
          } else{
            System.out.println("Produto nao foi encontrado");
          }
        } else if( o == 2){
           
           System.out.println("Digite o Codigo");
           codigo = scan.nextInt();
          
           produto = mercearia.buscaProdutoCodigo(codigo);

          if(produto != null){
            System.out.println("Produto Encontrado");
            System.out.println(produto.toString());
            System.out.println();System.out.println();
          } else{
            System.out.println("Produto nao foi encontrado");
          }

        }
         
         break;
       case(4):
       
        tipo = "granel";
        System.out.println("Valor: "+mercearia.valorGranel(tipo));

        break;
        
       case(5):
        
        tipo = "unico";
        System.out.println("Valor: "+mercearia.valorUnitario(tipo));
        
        break;
        case(6):
        
        System.out.println("PRODUTOS:");

        minimo = 5.0;

        for(i = 0; i < mercearia.estoqueBaixo(minimo).size(); i++){
          System.out.println("-> nome: "+mercearia.estoqueBaixo(minimo).get(i).getNome()+"  codigo: "+mercearia.estoqueBaixo(minimo).get(i).getCodigo());
            
        }
         
        break;
      
        case(7):
         System.out.println("_Contas_");
         System.out.println(mercearia.getProdutos()); 
         System.out.println();
         break;
    
      }
      
      showMenu();
      x = scan.nextInt();
      scan.nextLine(); 
    } 

      
  }
}
