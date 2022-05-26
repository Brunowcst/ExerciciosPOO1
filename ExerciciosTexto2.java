

public class ExerciciosTexto2
{



    public ExerciciosTexto2()
    {
        

    }

 
    public void exercicio2_1()
    {   String nome1 = new String("abcdef");

        String nome2 = "ghijklm";

        int tam,comparacao;

        int n1=5,n2=9;
        
        tam = nome1.length();

        comparacao = nome2.compareTo(nome1);

        String copia = nome2.substring(3,nome2.length());

        boolean b1 = nome1.equals("abcdeF");

        boolean b2 = nome1.equalsIgnoreCase("GhijkLm");

        String s1 = nome1 + nome2 + n1 + n2;
    
        String s2 = nome1 + nome2 + (n1 + n2);

    }
    
    // Receber dois inteiros e retorná-los em ordem crescente
    public int[] exercicio2_2(int x, int y){
        int[] resp = new int[2];
        if( x > y){
            return new int[]{y,x};
        }
        else{
            return new int[]{x,y};
        }
            
    }
    
    // Receber três números reais e retorná-los em ordem decrescente
    public int[] exercicio2_3(int x, int y, int z){
    int[] resp = new int[3];
    if(x > y && y > z){
        return new int[]{x,y,z};
    }
    else if(x > y && y < z){
        return new int[]{x,z,y};
    }
    else if(x < y && y < z){
        return new int[]{z,y,x}; 
    }
    else if(y > x && x > z){
        return new int[]{y,x,z};
    }
    else if(y > x && x < z){
        return new int[]{y,z,x};
    }  
    else if(y < x && x < z){
        return new int[]{z,x,y};
    }
    else if(z > x && x > y){
        return new int[]{z,x,y};
    }
    else if(z > x && x < y){
        return new int[]{z,y,x};
    }
    else if(z < x && x < y){
        return new int[]{z,y,x};
    }
    else {
        return new int[]{x,y,z};
    }
    }
    
    // Receber um número real e retornar sua raiz quadrada
   public double exercicio2_4(double x){
    return Math.sqrt(x);
    }
    
    // Receber dois Strings e informar se o primeiro String está contido no segundo (use o método indexOf)
    public int exercicio2_5(String a, String b){
    int indice = a.indexOf(b);
    return indice;
    }
    
     //Receber dois Strings e retorná-los em ordem alfabética (use o método compareTo)
    public String[] exercicio2_6(String a, String b){
        int indice = a.compareToIgnoreCase(b);
        if(indice > 0){
           return new String[]{b,a};
    }
        return new String[]{a,b};
    }
 
    //Receber três Strings e retorná-los em ordem alfabética (use o método compareTo)
    public String[] exercicio2_7(String a, String b, String c){
        if(a.compareTo(b)<0 & a.compareTo(c)<0){
            if(b.compareTo(c)<0) return new String[]{a, b, c};
            return new String[]{a, c, b};
        }else if(b.compareTo(a)<0 & b.compareTo(c)<0){
            if(a.compareTo(c)<0) return new String[]{b, a, c};
            return new String[]{b, c, a};
        }else if(c.compareTo(a)<0 & c.compareTo(b)<0){
            if(a.compareTo(b)<0) return new String[]{c, a, b};
            return new String[]{c, b, a};
        }
    return new String[]{a,b,c};
    }
    
    public String inverter(String s){
        return s.substring(s.indexOf(' ')+1, s.length()) + ", " + s.substring(0, s.indexOf(' '));
    }
    
    // Receber um array de Strings na forma "nome sobrenome" e retornar um array na forma "sobrenome, nome" 
    //(use os métodos indexOf e substring)
    public String[] exercicio2_8(String[] nomes)
    {   
        String[] sobrenomeNome = new String[nomes.length];
        
        for(int i=0; i<nomes.length; i++){
            sobrenomeNome[i] = inverter(nomes[i]);
        }
        
        return sobrenomeNome;
    }
    
    // Receber um array de Strings e modificá-lo de forma que todos os seus
    //itens fiquem com todas as letras maiúsculas (use o método toUpperCase)
    public String[] exercicio2_9(String[] maius){
        for(int i = 0; i<maius.length; i++){
            maius[i] = maius[i].toUpperCase();
        }
        return maius;
    }
    
    // Receber um array de Strings e retornar um array com os mesmos Strings
    //mas com todas as letras maiúsculas (use o método toUpperCase)
    public String[] exercicio2_10(String[] maius){
        String[] maius2 = new String[maius.length];
        
        for(int i = 0; i<maius.length; i++){
            maius2[i] = maius[i].toUpperCase();
        }
        return maius2;
    }
    // Receber um vetor de inteiros. Percorrer o vetor com um comando for. A cada repetição, troque o elemento corrente com o que estiver
    //uma posição à frente sempre que o elemento da frente for menor que o elemento corrente. 
    public int[] exercicio2_11(int[] v){
        int aux;
        for(int i = 0; i < v.length-1; i++){
            if(v[i] > v[i+1]){
            aux = v[i+1];
            v[i+1] = v[i];
            v[i] = aux;
            }
        }
        return v;
    }
    //Adapte o exercício anterior de forma que as trocas sejam efetuadas e, além disso, o método retorne a quantidade
    //de trocas realizadas. 
     public int exercicio2_12(int[] v){
        int aux;
        int soma = 0;
        for(int i = 0; i < v.length-1; i++){
            if(v[i] > v[i+1]){
            aux = v[i+1];
            v[i+1] = v[i];
            v[i] = aux;
            soma++;
            }
        }
        return soma;
    }
    
    // Adapte o exercício anterior para que funcione com um vetor de Strings e faça as trocas sempre que um String for
    //lexicograficamente maior que o String que está à sua frente no vetor. Lembre de retornar o número de trocas.
       public int exercicio2_13(String[] v){
        String aux;
        int soma = 0;
        for(int i = 0; i < v.length-1; i++){
            if(v[i].compareTo(v[i+1])>0){
            aux = v[i+1];
            v[i+1] = v[i];
            v[i] = aux;
            soma++;
            }
        }
        return soma;
    }
    
     //(Desafio) Receber um vetor de inteiros e modificá-lo para que fique em ordem decrescente. Dica de amigo: se você usar o método do
     //exercício 2.12 e a quantidade de trocas retornada for 0 (zero), o vetor estará ordenado. É possível chamar um método de dentro de
     //outro, assim como em qualquer linguagem de programação que você já estudou.
    public int[] exercicio2_14(int[] v){
        for(int i = 1; i < v.length; i++){
            for(int j = 0; j < i; j++){
                if(v[i] > v[j]){
                int aux = v[i];
                v[i] = v[j];
                v[j] = aux;
                }
            }
        } 
        return v;
    }
    
    // (Desafio) Receber um vetor de Strings e modificá-lo para que fique ordem alfabética. Dica de amigo: veja a dica de amigo da
    //questão anterior.
    public String[] exercicio2_15(String[] ord){
        String aux;
        for(int i = 1; i < ord.length; i++){
            for(int j = 0; j < i; j++){
            if(ord[i].compareTo(ord[j])<0){
                aux = ord[j];
                ord[j] = ord[i];
                ord[i] = aux;
            }
        }
    }
    return ord;
    }
    
    // (Desafio) Receber um vetor de Strings na forma "nome sobrenome" e modificá-lo para que fique ordenado alfabeticamente por
    //sobrenome. Por exemplo: se o vetor {"robert plant", "ian gillan", "neil young"} for passado como parâmetro, após a execução
    //do método, o conteúdo do vetor deve ser {"ian gillan", "robert plant",  "neil young"}. Sem dicas, se vire sozinho.
    public String[] exercicio2_16(String[] palav){
        for (int i = 1; i < palav.length; i++) {
            for (int j = 0; j < i; j++) {
                if((palav[i].substring(palav[i].indexOf(" ")+1,palav[i].indexOf(" ")+2)).compareTo(palav[j].substring(palav[j].indexOf(" ")+1,palav[j].indexOf(" ")+2)) < 0){
                    String temp = palav[i];
                    palav[i] = palav[j];
                    palav[j] = temp;
                }
            }
        }
        return palav;
    }
    
    // (Desafio) Receber um vetor de Strings na forma "nome sobrenome" e modificá-lo para que fique ordenado alfabeticamente por
    //sobrenome e com a forma dos strings alterada para "sobrenome, nome".  Por exemplo: se o vetor 
    //{"robert plant", "ian gillan", "neil young"} for passado como parâmetro, após a execução do método, o conteúdo do vetor deve ser 
    // {"gillan, ian", "plant, robert",  "young, neil"}
     public String[] exercicio2_17(String[] palav){
        palav = exercicio2_16(palav);
        for (int i = 0; i < palav.length; i++) {
            int aux = palav[i].indexOf(" ");
            palav[i] = palav[i].substring(aux+1, palav[i].length()) + ", " + (palav[i].substring(0,aux));
        }
    return palav;
    }
}
 
    
    


