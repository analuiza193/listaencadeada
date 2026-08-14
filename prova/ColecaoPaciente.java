public class ColecaoPaciente {
    Paciente [] paciente = new Paciente[5];
    int quant = 0;

    public void cadastrarPaciente(Paciente p){
        paciente[quant] = p;
        quant ++;

    }

    public void listarPaciente(){
        for (int cont= 0; cont <quant; cont++){
            System.out.println(paciente[cont]);
        }
    }

    public void procurarPacientePorPosicao(int posicao){
        return ;
    }
        
    public void cadastrarPacientePorPosicao(Paciente p, int posicao){
        paciente[posicao] = p;
    }

    public void removerPacientePorPosicao(int posicao){
        for(int cont = posicao; cont < quant-1; cont ++){
            paciente[cont]= paciente[cont + 1];


        }
        quant++;
    }

    public int quantidadeDePacienteCadastrado(){
        return quant;
    }

    public void aumentarVetor(){
        Paciente[]novo= new Paciente[paciente.length + 5];
        for(int cont = 0; cont< quant; cont++){
             novo[cont]= paciente[cont];
        }
        paciente = novo;
    }

    public void ordenarPorNome(){
        for(int i = 0; i < quant - 1; i++){
            for(int j = i + 1; j < quant; j++){
                if (paciente[i].getNome().compareTo(paciente[j].getNome())>0){
                    Paciente ij= paciente[i];  
                    paciente[i]= paciente[j];
                    paciente[j]= ij;                      
                }
            }
        }
    }

    public double calcularMediaDeIdade(){
        double soma = 0;

        for(int cont = 0; cont < quant; cont++){
            soma = soma + paciente[cont].getIdade();
        }
        return (double) soma/ quant;
    }
}
