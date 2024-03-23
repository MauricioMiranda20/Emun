# enum

Este é um exemplo de código em Java que define um enum chamado OrdemStates, que representa os possíveis estados de uma ordem de algum sistema.

# Codigo Enum

Um enum em Java é uma forma de definir um tipo de dados que consiste em um conjunto fixo de constantes. Nesse exemplo, OrdemStates define quatro constantes:

DENDING_PAYMENT: Indica que o pagamento está pendente.

PROCESSING: Indica que a ordem está sendo processada.

SHIPPED: Indica que a ordem foi enviada.

DELIVERED: Indica que a ordem foi entregue.

    package entities.enums;

    public enum OrdemStates {
        DENDING_PAYMENT,
        PROCESSING,
        SHIPPED,
        DELIVERED;
    }