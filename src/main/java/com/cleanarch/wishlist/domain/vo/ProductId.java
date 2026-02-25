package com.cleanarch.wishlist.domain.vo;



public record ProductId(String value) {

    public ProductId {


        //o valor do produtoID nao pode ser nulo ou estar vazio
        if(value == null || value.isBlank()){

            throw new IllegalArgumentException("ProductId cannot be null or blank");

            }
        }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;           // se é o mesmo objeto, já é igual

        //se for nulo ou nao apontar para um objeto do tipo ProductId nao e equals
        if (o == null || !(o instanceof ProductId)) {

            return false;
        }

        ProductId other = (ProductId) o;


        return value.equals(other.value());

    }

    @Override
    public String toString(){

        return value;
    }

//        if (this == o) {
//
//            return true;
//        }

        //se isso tudo não for verdadeiro retorne falso
        //pattern matching do Java 16
        //olha se "o" aponta para um objeto do tipo ProductId e captura o value dele
        // em value1 tal como:
        //ProductId other = (ProductId) o;
        //String value1 = other.value();
        //Em records, o metodo value() funciona como o getter do campo,
        // mas com uma sintaxe simplificada .value()
        //Aqui você verifica se o objeto não é um ProductId, e se não for, já retorna false.
        //logo retorna false pois nao faz sentido comparar valores
        // se o objeto não for do tipo certo.
        //return value.equals(value1);
        //value → é o value do objeto atual (this.value).
        //
        //value1 → é o value do outro objeto (o) extraido pelo pattern matching.
        //
        //equals compara se os IDs são iguais.
        //Em java <=15 pode ser feito assim:
        //if (!(o instanceof ProductId)) {
        //    return false;
        //}
        //ProductId other = (ProductId) o;
        //return value.equals(other.value());
        //Java verifica se "o" é do tipo ProductId.
        //
        //Se for, ele cria a variável value1 automaticamente contendo o.value().


        //if (!(o instanceof ProductId(String value1))) {
        //    return false;
        //}
        //return value.equals(value1);
        //
        //Se o instanceof for falso → retornamos false imediatamente, value1 nem existe.
        //
        //Se for verdadeiro → value1 foi inicializado e está disponível na linha
        // seguinte, onde você faz:
        //
        //return value.equals(value1);
        //
        //Isso é chamado de “pattern variable scope” do Java: a variável value1 só existe quando
        // a condição do instanceof garante que o tipo é correto.

        //Em versões antigas (antes do pattern matching), se você declarasse
        // uma variável dentro de um if, ela sumiria fora do bloco:
        //if (condicao) {
        //    String x = "teste";
        //}
        //System.out.println(x); // x não existe aqui

        //No pattern matching do Java:
//        value1 é **automágicamente “promovida” para o escopo
//        do bloco que garante que instanceof seja verdadeiro.
//
//        No caso do equals, como o return vem imediatamente após o if,
//        o compilador trata value1 como disponível após o teste do instanceof,
//        dentro do mesmo metodo.
//
//         Ou seja, value1 continua acessível depois do if,
//         porque o bloco do if garante que o é do tipo certo.

//        if(! (o instanceof ProductId(String value1))) {
//
//            return false;
//        }
//
//        return value.equals(value1);
//




}
