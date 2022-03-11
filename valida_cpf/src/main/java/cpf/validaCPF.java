package cpf;



public class validaCPF {

    public boolean validaTamanho(String cpf){
        boolean result = true;
        //valida se a quantidade de dígitos informados é menor que 3 ou maior de 11
        if(cpf.length() < 3 || cpf.length() > 11){
            System.out.println("A quantidade de dígitos de um cpf não pode ser inferior e 3 e superior a 11.");
            result = false;
        }

        return result;
    }

    public boolean somenteDigitos(String cpf){
        boolean result = true;
        //validar se existe algum caracter que não seja dígito
        for(int i = 0; i < cpf.length(); i++){
            if(!Character.isDigit(cpf.charAt(i))){
                System.out.println("O número do CPF deve ser composto apenas por dígitos.");
                result = false;
            }
        }
        return result;
    }

    public void preencheZero(int quantidadeZeros, int[] numerosCpf){
        //preenche com zeros à esquerda para completar a quantidade de 11 dígitos
        if(quantidadeZeros > 0){
            for(int i = 0; i < quantidadeZeros; i++){
                numerosCpf[i] = 0;
            }
        }
    }

    public void stringToInt(String cpf, int quantidadeZeros, int[] numerosCpf){
        int j = 0;
        for(int i = quantidadeZeros; i < 11; i++){
            numerosCpf[i] = Integer.parseInt(cpf.substring(j,j+1));
            j++;
        }
    }

    public boolean todosNumerosIguais(int[] numerosCpf){
        boolean result = true;
        //valida se todos os números são iguais
        if(numerosCpf[0] == numerosCpf[1] &&
                numerosCpf[1] == numerosCpf[2] &&
                numerosCpf[2] == numerosCpf[3] &&
                numerosCpf[3] == numerosCpf[4] &&
                numerosCpf[4] == numerosCpf[5] &&
                numerosCpf[5] == numerosCpf[6] &&
                numerosCpf[6] == numerosCpf[7] &&
                numerosCpf[7] == numerosCpf[8] &&
                numerosCpf[8] == numerosCpf[9] &&
                numerosCpf[9] == numerosCpf[10]){
            result = false;
        }
        return result;
    }

    //calculo do primeiro dígito
    public int calculaPrimeiroDigito(int[] numerosCpf){
        int soma = 0;
        for(int i = 0; i < numerosCpf.length-2; i++){
            soma += numerosCpf[i] * (10-i);
        }

        int restoDivisaoPrimeiroDigito = (soma%11);

        int primeiroDigito = 0;
        if(restoDivisaoPrimeiroDigito < 2){
            primeiroDigito = 0;
        }else{
            primeiroDigito = 11 - restoDivisaoPrimeiroDigito;
        }

        return primeiroDigito;
    }

    //Cálculo do segundo dígito
    public int calculaSegundoDigito(int[] numerosCpf){
        int soma = 0;
        for(int i = 0; i < numerosCpf.length-1; i++){
            soma += numerosCpf[i] * (11-i);
        }

        int restoDivisaoSegundoDigito = (soma%11);

        int segundoDigito = 0;
        if(restoDivisaoSegundoDigito < 2){
            segundoDigito = 0;
        }else{
            segundoDigito = 11 - restoDivisaoSegundoDigito;
        }

        return segundoDigito;
    }


    public boolean isCPF(String cpf){
        boolean result = false;
        int[] numerosCpf = new int[11];
        int quantidadeZeros = 11 - cpf.length();


        if(validaTamanho(cpf)){
            if(somenteDigitos(cpf)){
                preencheZero(quantidadeZeros,numerosCpf);
                stringToInt(cpf, quantidadeZeros, numerosCpf);
                if(todosNumerosIguais(numerosCpf)){
                    int primeiroDigito = calculaPrimeiroDigito(numerosCpf);
                    int segundoDigito = calculaSegundoDigito(numerosCpf);
                    result = (primeiroDigito == numerosCpf[9]) && (segundoDigito ==  numerosCpf[10]);
                }
            }

        }

        return result;
    }

    public static void main(String args[]){

       System.out.print(new validaCPF().isCPF("191"));

    }


}
