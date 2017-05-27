SasHelloWorld
====================

Es un ejemplo con ANTLR4 y maven
Tenemos dos gramáticas para ver como se comportaba.

Básicamente tenemos cada una de las gramáticas en un paquete con las clases que las usan.
Al ejecutar la compilación, maven buscará las gramáticas (g4) y generará las clases lexer y parser así como otras en generated-sources.


Para ejecutarlo lanzaremos: mvn compile exec:java -Dexec.mainClass="com.sas.one.GramarOne" o mvn compile exec:java -Dexec.mainClass="com.sas.two.GramarTwo"


