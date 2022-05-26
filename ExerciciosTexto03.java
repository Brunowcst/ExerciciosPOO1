import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Toolkit;


public class ExerciciosTexto03
{


    public ExerciciosTexto03()
    {

    }

    //Obter a data atual do sistema e retorná-la na forma de String.
    public String sexercicio3_1()
    { Date dataAtual = new Date();
        return ""+dataAtual;

    }
    
    //Receber uma data (como String) no formato dd/mm/aaaa e retornar a mesma
    //data(como String) no formato "<dia da semana>, <dia> de <nome do mês> de
    //<ano>
    public String exercicio3_2(String data) throws java.text.ParseException {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        Date dataForm = formatador.parse(data);
        SimpleDateFormat formatador2 = new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' yyyy,");
        String dataFormatada = formatador2.format(dataForm);
        return dataFormatada;
       
    }
    
     //Receber um caminho de diretório como parâmetro e retornar um vetor com todos os itens do diretório. Dica: objetos da classe File
     //podem ser usados para realizar operações sobre diretórios, entre várias outras coisas. Analise a documentação da classe File para
     //saber além do que já foi descrito no conteúdo deste texto.
    public String[] exercicio3_3(String caminho){
    File diretorioTemp = new File(caminho);
    String[] conteudoDire = diretorioTemp.list();
    return conteudoDire;
    }
    
    // Receber um caminho de diretório como parâmetro e retornar um vetor com todos os itens do diretório. Cada item do vetor retornado
    //deve estar precedido por "[A]", caso seja arquivo, e "D", caso seja diretório. Retorne um valor nulo caso o String recebido como
    //parâmetro não corresponda a um diretório existente no disco. Mais uma vez, você precisará de um objeto da classe File para fazer o
    //trabalho sujo para você.
    
    public String[] exercicio3_4(String caminho){
    File dirTemp = new File(caminho);
    String[] files = dirTemp.list();
    for(int i=0; i < files.length; i++){
        if(new File(dirTemp.getPath(),files[i]).isDirectory()){
        files[i] = "[D]" + files[i];
        }else files[i] = "[A]" + files[i];
    }
    return files;
    }
    
    // Receber um caminho para um arquivo como parâmetro e deletar o arquivo. 
    public boolean exercicio3_5(String caminho, String nomeArquivoParaExcluir){
    File arqui = new File(caminho,nomeArquivoParaExcluir);
    arqui.delete();
    return true;
    }
    
    // (Desafio) Escreva um programa que mostre uma janela com dois menus - Arquivo e Editar. Dica: você deverá utilizar objetos das
    //classes JFrame, JMenuBar e JMenu). 
    public void exercicio3_6(){
        JFrame janela = new JFrame();
        janela.setSize(650, 500);
        
        JMenuBar menuBar = new JMenuBar();
        janela.setJMenuBar(menuBar);
        menuBar.add(new JMenu("Arquivo"));
        menuBar.add(new JMenu("Editar"));
        
        janela.setVisible(true);
    }
    
    // (Desafio) Escreva um método que receba como parâmetro um String representando um caminho para um arquivo executável e execute
    //tal arquivo. Dica: pesquise no google "java como executar programas externos" (SEM as aspas) e seja feliz (você pode ter que escrever
    //código que não vai entender bem - a ideia aqui é que você desenrole a solução independentemente de entender o que está acontecendo.
    //Acredite, isso lhe será muito útil em sua vida de programador) 
    public void exercicio3_7(String caminho) throws java.io.IOException {
      Runtime.getRuntime().exec(caminho);
    }    
    
    //(Desafio) Escreva um método que receba o caminho de um arquivo de texto (txt) e abra o arquivo no bloco de notas (notepad no
    //windows ou qualquer gedit no Ubuntu). Dica: você vai precisar apenas da solução da questão anterior e de um real a mais de esperteza.
     public void exercicio3_8(String caminho) throws java.io.IOException {
      Runtime.getRuntime().exec("notepad "+caminho);
    }   
    
    // (Desafio) Faça um método que mostre uma Janela (vazia) do tamanho da tela. O programa deve funcionar em monitores com diferentes
    //resoluções. Dica de professor: a classe ToolKit pode prover o tamanho da tela. Dica de MÃE: pesquise "como criar uma janela tela
    //cheia em java" (sem aspas, pelo amor de Deus) e seja feliz.
    public void exercicio3_9(){
        JFrame janela = new JFrame();
        janela.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        janela.setVisible(true);
    }
    
    // Receber duas datas como parâmetro e retornar a mais recente
    public String exercicio3_10(String data1, String data2) throws java.text.ParseException{
        
        Date dataAtual = new Date();
        Date dat1 = new SimpleDateFormat("dd/MM/yyyy").parse(data1);
        Date dat2 = new SimpleDateFormat("dd/MM/yyyy").parse(data2);
       
        if((dat1.compareTo(dataAtual)>=0 && dat1.compareTo(dat2)<0) || ((dat1.compareTo(dataAtual)<0) && dat1.compareTo(dat2)>0)){
        return data1;
        }
        return data2;
        }
    // (Desafio) Receber um array de Dates e modificar o array de forma que fique em ordem cronológica. Dica: use o método compareTo da
    //  classe Date
    public String[] exercicio3_11(String[] datas) throws java.text.ParseException{{
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dat1,dat2;
        String aux;

        for(int i = 1; i < datas.length;i++){
            dat2 = formato.parse(datas[i]);
            for(int j = 0; j < i;j++){
                dat2 = formato.parse(datas[j]);
                if(dat2.compareTo(dat2)>0){
                    aux = datas[i];
                    datas[i] = datas[j];
                    datas[j] = aux;
                }
            }
        }
        return datas;
    }
    }
    
    //Receber uma data, na forma de String, no formato dd/mm/aaaa, e retornar o dia da semana referente à data.
       public String exercicio3_12(String data) throws java.text.ParseException {
    SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    Date dataForm = formatador.parse(data);
    SimpleDateFormat formatador2 = new SimpleDateFormat("EEEE");
    String dataFormatada = formatador2.format(dataForm);
    return dataFormatada;
    }
}


