package br.com.ifsul.core;

import java.math.BigDecimal;

import br.com.ifsul.core.model.Conta;
import br.com.ifsul.core.model.Pessoa;
import br.com.ifsul.core.model.Estado;
/**
 * Hello world!
 *
 ****/
public class App 
{
    public static void main( String[] args ) {
        
        //http:
        Estado est1, est2;
        est1 = new Estado();
        est2 = new Estado();

        est1.setNome("RIO GRANDE DO SUL");
        est1.setSigla("RS");

        est2 = new Estado("Santa Catarina", "SC");
        System.out.println("\n");
        System.out.println("Qual e seu estado: " + est1.getNome());
        System.out.println("SIGLA: " + est1.getSigla());
        System.out.println("\n");
        System.out.println("Qual e seu estado 2: " + est2.getNome());
        System.out.println("Qual e seu estado 2: " + est2.getSigla());
        System.out.println("\n");

        
        //Pessoa pessoa = new Pessoa();
        Conta minhaConta = Conta.createConta("Rodrigo", 1, 171, BigDecimal.ONE);

        
             
        
        //Conta minhaContaDois = new Conta("Rodrigo", 1, 171, BigDecimal.ONE);
        //minhaContaDois.depositar(BigDecimal.valueOf(1000L));

        //System.out.println(minhaContaDois.sacar(BigDecimal.TEN));

        
       // System.out.println("Correntista da conta um: " + minhaConta.correntista);
       // System.out.println("Correntista da conta dois: " + minhaContaDois.correntista);

    }
}
