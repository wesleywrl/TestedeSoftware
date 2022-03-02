<div align=center>
  <img src="brasaooficialcolorido.png">
</div>

#### <p style="text-align: center;">Universidade Federal de Goiás</p>
#### <p style="text-align: center;">Instituto de Informática</p>
#### <p style="text-align: center;">Bacharelado em Engenharia de Software</p>
#### <p style="text-align: center;">Teste de Software - 2021/2</p>
#### <p style="text-align: center;">Gilmar Ferreira Arantes</p>
####  <p style="text-align: center;"> Prova P1 - 16/02/2022</p>

Matrícula:201602522
Nome: Wesley Ramos de Lima
<p><font color=green>Nota: 7,6.</font></p>

1. Quanto ao objetivo do Teste de Software, responda as duas questões seguintes:
   1. (**0,5 ponto**) Qual o objetivo primário da atividade de teste de software?

Revelar a presença de defeitos nos nossos software. <font color=green>Certo.</font>

   2. (**0,5 ponto**) O que acontece, quando não se atinge este objetivo primário?

Os software são liberados com defeitos que irão gerar erros e falhas, comprometendo a qualidade do produto. <font color=red>Errado.</font>

2. (**1,0 ponto**) Explique o que é o teste exaustivo e porque sua execução não é possível.

São testes que testariam todas as possibilidades possíveis, ou seja, são testados todos os possíveis dados de entrada. Não é possível ou é inviável pois o número de caminhos pode ser infinitos ou muito grandes. <font color=green>Certo.</font>

3. (**1,0 ponto**) Cite pelo menos duas limitações da Técnica de Teste Funcional e duas da Técnica de Teste Estrutural.

O teste Funcional depende muito de uma boa especificação de requisitos e para encontrar todos os defeitos é preciso o teste exaustivo. Sobre o teste Estrutural as desvantagens são que ele não assegura que o código faz o que os requisitos reais/funcionais pede e o código do teste torna-se dependente do código da aplicação. Além disso, pode não cobrir todos os caminhos. <font color=orange>Parcialmente correto. Nota 0,8.</font>

4. (**1,0 ponto**) Descreva pelo menos um dos quatro níveis de teste constantes da literatura especializada.

Teste de unidade é o que verifica os menores elementos testáveis do software,sendo aplicado a componentes representados no modelo de implementação. Nesse nível, o testador executa o teste na medida em que a unidade é feita. <font color=green>Certo.</font>

5. (**1.0 ponto**)Descreva qual o propósito do critério de teste funcional Particionamento por Classes de Equivlência.

Reduzir o número de caso de teste procurando garantir uma boa cobertura do código. <font color=orange>Parcialmente correto. Nota 0,8.</font>

6. (**1.00 ponto**) Existe algum tipo de hierarquia em relação aos critérios de teste estrutural, todos os nós, todos os arcos e todos os caminhos? Se sim, explique-a, considerando a perspectiva dos níveis de cobertura desejados.

Existe sim. O critério baseado em fluxo de controle, vai de acordo com os comandos e desvios do programa. Utiiza-se dos métodos Todos-nós, Todos-arcos e Todos-caminhos onde é pedido que os comanados, aresta e caminhos sejam executados pelo menos uma vez.
Nível 0 - qualquer valor de cobertura a baixo de 100%;
Nível 1 - 100% de cobertura de comandos - todos-nós;
Nível 2 -100% de cobertura de decisão - todos-arcos;
Nível 3 -100% de cobertura de condições;
Nível 4 -100% de cobertura decisões/condições;
Nível 5 -100% de cobertura de condições múltiplas;
Nível 6 - cobertura de loop;
Nível 7: 100% de cobertura de caminhos - todos-caminhos;
O critério baseado na complexidade que são criados a partir dos requisitos de teste e classificados com o grau de complexidade que possuem. Além desse critério em o baseado em fluxo de dados, que como o nome sugere, utiliza as informações do fluxo de dados do programa para criar os requisitos de teste.

<font color=green>Certo.</font>

7. Considere a especificação, a seguir, de um hipotético programa que objtiva a classificação de um triângulo, a partir dos valores informados para os seus três lados.

   a) Dado um triângulo cujos segmentos medem A, B e C, que são números inteiros positivos na faixa de 0 a 100. Esse triângulo somente existirá se: (A + B < C) ou (A + C < B) ou (B + C < A).
   b) Quanto às medidas dos seus lados o triângulo, poderá ser classicado em:
         • Isósceles = quando possui dois lados com a mesma medida;
         • Escaleno = quando todos os seus lados têm medidas diferentes;
         • Equilátero = quando todos os lados tem a mesma medida;
         • Acutângulo = quando o quadrado de um dos seus lados é menor que a soma do quadrado dois outros dois. (A<sup>2</sup> < B<sup>2</sup> + C<sup>2</sup>).
         • Retângulo: quando o quadrado de um dos seus lados é igual à soma do quadrado dois outros dois. (A<sup>2</sup> = B<sup>2</sup> + C<sup>2</sup>).
         • Obtusângulo: quando o quadrado de um dos seus lados é maior que a soma do quadrado dois outros dois. A<sup>2</sup> > B<sup>2</sup> + C<sup>2</sup>.

7.1 (**2.0 pontos**) Definir uma tabela de decisão para o teste tanto da existência do triângulo, quanto para a definição do seu tipo. Consulte exemplo de tabela de decisão na tarefa 005.

<font color=Orange>Parcialmente correto. Nota 1,0.</font>

7.2 (**2.0 pontos**) Criar os conjunto de casos de teste necessários para a cobertura das combinações constantes da tabela de decisão, seguindo o seguinte padrão:
|CT|Lado A|Lado B|Lado C|Resultado|
|---|---|---|---|---|
| CT1 | 2 | 3  | 6  |Triângulo|
| CT2 | 2 | 6  | 3 |Triângulo|
| CT3 | 6 | 2  | 3 |Triâgulo|
| CT4 | 7 | 10 | 20 | Não é Triângulo|
| CT5 | 7 | 20 | 10 | Não é Triângulo|
| CT6 | 20 | 7 | 10 | Não é Triângulo|
| CT7 | 10 | 10 | 12 |Isósceles|
| CT8 | 12 | 10 | 10 |Isósceles|
| CT9 | 10 | 12 | 10 |Isósceles|
| CT10 | 5 | 7 | 8 |Escaleno|
| CT11 | 4 | 4 | 4 |Equilátero|
| CT12 | 2 | 3  | 6  |Acutâneo|
| CT13 | 10 | 8  | 6  |Retângulo|
| CT14 | 11 | 4  | 8  |Obtusângulo|

<font color=Orange>Parcialmente correto, Os CT1, CT2 e CT3 não são necessários. Nota 1,5.</font>

INSTRUÇÕES:
1. Tipo: Prova individual;
2. Local de Entrega: Plataforma Turing
3. Forma de Entrega: Entregar este arquivo, editado com suas respostas, no formato .md, nominado da seguinte forma: ts2021-2_prova-p1_mat.md, onde mat deverá ser substituído pelo número da sua matrícula.
4. **Entrega diferente da especificada não será avaliada.**
5. Data da Entrega: 22/02/2022, as 23h59min.
6. Critério de Aceitação: arquivo entregue, conforme solicitado.
