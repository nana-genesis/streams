# Tarefa - Streams com Lambda

Filtrar mulheres de uma lista usando **Stream API** e **Lambda Expressions**.

## Como funciona

1. Ler entrada: `Ana-F,Joao-M,Maria-F`
2. Split por vírgula
3. Filtrar apenas quem tem `-F` usando lambda
4. Imprimir resultado

## Código principal

java
List<String> mulheres = lista.stream()
    .filter(pessoa -> pessoa.split("-")[1].equalsIgnoreCase("F"))
    .collect(Collectors.toList());

    xemplo de execução
text
=== FILTRAR MULHERES COM STREAM E LAMBDA ===

Digite os dados: Ana-F,Joao-M,Maria-F,Pedro-M,Carla-F

=== RESULTADO ===

📋 Lista completa (5 pessoas):
  - Ana-F
  - Joao-M
  - Maria-F
  - Pedro-M
  - Carla-F

👩 Lista de MULHERES (3 pessoas):
  - Ana
  - Maria
  - Carla

## Conceitos usados
stream() - cria fluxo de dados

filter() - filtra elementos (recebe lambda)

collect() - recolhe o resultado

forEach() - itera com lambda
