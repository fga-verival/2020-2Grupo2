# 2020-2Grupo2

## Junit Gradle Docker

Para executar a suíte de testes rode

`docker-compose run gradle gradle test`

## Exercício de TDD

### Descrição das técnicas solicitadas

#### Falsificação

&emsp;Retorna uma constante para que a barra verde surja.

#### Triangulação

&emsp;A partir de valores já obtidos você "triangula" descobre o comportamento (código) que deveria gerar esses valores dada essas entradas.

### Como triangularizar com parâmetros em frameworks de testes de unitários?

&emsp;Não sabemos, pois não entendemos com a consulta na literatura, fizemos os testes utilizando uma função que recebe os parâmetros de através de CSV.

### Análise crítica sobre o uso das técnicas usadas

#### Facilidades

- Ambiente fácil de configurar
- Sintaxe conhecida de Java, por ser parecida com a de C++ e algumas outras linguagens orientadas à objetos
- Semelhança entre as ferramentas de testes com as ferramentas já conhecidas (Jest, Pytest, RSpec)
- Os testes não requeriram nenhum tipo de asserção mais complexa

#### Dificuldades

- Na nossa visão, a técnica de triangulação não se aplica bem no contexto, pois as fórmulas no gera (rendimento bruto, rendimento líquido e cálculo do valor do imposto de renda) são bem conhecidas e definidas matematicamente.
- Não conseguimos entender a diferença do commit 4 para o commit 5, provavelmente por não termos entendido bem como funciona a triangulação neste caso.

### Referências

> BECK, Kent. “Test-driven development: by example”. Addison-Wesley, .2002
