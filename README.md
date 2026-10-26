PRACTICA03 :D  Angel Yael De la Cruz Hernandez
Ejercicio 1:


a == b (false): a vive en el String Pool, pero b se creó a la fuerza en el Heap con new, a pesar de que el texto sea el mismo, no estan en la misma direccion de memoria

a == c (true): Java calcula "Ja" + "va" desde que compila el código, se da cuenta de que da "Java" reutiliza el objeto que ya tenía a en el String Pool

a == d (false): Al hacer d += "va", java realiza la concatenación en tiempo de ejecución, por lo que crea un objeto nuevo en memoria

a.equals(d) (true): A equals() no le importa dónde viven los objetos en memoria, solo checa que el texto sea exactamente igual ("Java")

Impresión de a ("Java"): Los String son inmutables, por más que hagas a.concat(" 21"), la variable a no cambia a menos que la reasignes

Impresión de b ("Java 21"): Aquí sí cambia porque guardamos el resultado de concat directamente en b

• Indica qué imprime cada instrucción y qué variables comparten un objeto.
1. false
2. true
3. false
4. true
5. java 
6. java 21

• Explica el papel del String Pool, la diferencia entre == y equals() y qué ocurre con concat().
R= El operador (==) Compara direcciones de memoria, si es que ambas variables apuntan al la misma direccion.
El (equals) Solo compara el contenido, si son exactamente los mismos caracteres no le importa si no estan en la misma direccion de memoria.
Debido a que los Strings son imutables, el concat no altera la cadena sobre la que se invoca.

Ejercicio 2:
• Determina la salida exacta y el contenido tras cada modificación.
R=
1. E-A
2. 3
3. 21
En la primera modificacion queda: AE
En la segunda queda: AxyzE
En la tercera queda: EzyxA
En la cuarta queda: E-A
• Explica por qué delete(1, 4) no significa eliminar cuatro caracteres. Diferencia length() de
capacity().
R=
Porque el rango especificado en los métodos de StringBuilder es inclusivo para el inicio y exclusivo para el final, por tanto elimina los índices 1, 2 y 3, dando un total de 4-1=3 caracteres eliminados, ademas los caracteres de java empiezan desde el 0.

length() representa el número de caracteres almacenados actualmente en el objeto.   
capacity() representa la cantidad total de espacio reservado en memoria asignado internamente para poder almacenar caracteres si necesidad de modificar la estructura

Ejercicio 3:

• Escribe todas las salidas y explica cómo afecta cada modificación a las variables.
R=
1.  mundo
2.  mundo
3. Hola
4. true
5. true
6. false

Explicacion de porque obtenemos esas salidas:
Primero las variables a y b hacen referencia al mismo  objeto porque b copia la referencia de a, y c hace referencia a un objeto diferente que tambien contiene "hola"

La instruccion a.append (" mundo") modifica el objeto compartido por a y b, agregando " mundo" al final, por lo tanto, ambas variables hacen referencia a un objeto cuyo contenido es "Hola mundo"

Despues b.delete(0, 5) elimina los caracteres desde la posición 0 hasta antes de la posición 5, como a y b comparten el mismo objeto, el contenido de ambas pasa a ser " mundo". La variable c no cambia y continúa conteniendo "Hola".

Por eso, las tres primeras instrucciones imprimen: mundo, mundo, Hola.

a == b devuelve true porque ambas variables hacen referencia al mismo objeto

a.equals(b) devuelve true porque ambas referencias apuntan al mismo objeto y, por tanto su contenido es igual

a.equals(c) devuelve false porque a contiene " mundo" y c contiene "Hola".

• Dibuja un esquema de memoria con las variables, los objetos y sus referencias.
(ESTE EJERCICIO ESTA EN UNA FOTO QUE ENVIE DE MI CUADERNO).

Ejercicio 6:

Para la detección de caracteres ya vistos usamos resultado.indexOf(String.valueOf(c)) y si regresa -1, significa que el carácter aún no está en nuestra cadena resultado

Para el numero de recorrido la solución realiza un recorrido principal sobre la cadena de entrada e internamente .indexOf() realiza una búsqueda lineal sobre la longitud de resultado, por lo que en total realiza N-iteraciones principales con búsquedas parciales.  

Ejercicio 7:

Para el caso de buscar vacío:Si buscar es una cadena vacía, el método detecta esta condición al inicio e inmediatamente retorna el texto original sin realizar ninguna sustitución para evitar un ciclo infinito.


Preguntas finales:

1. ¿Por qué los atributos del editor deben ser privados? Poque con el encapsulamiento evitamos que clases externas modifiquen directamente contenido, garantizando que las modificaciones pasen por los métodos de control y validación.

2. ¿Qué diferencia hay entre un método public y uno private? Un método public es accesible desde cualquier clase de cualquier paquete y un método private solo es accesible dentro de la propia clase en la que fue declarado.

3. Si quitas public de un método, ¿qué acceso tiene y puede llamarlo PruebaEditor desde el mismo paquete? Adquiere acceso de paquete default o package-private, sí, PruebaEditor sí podría llamarlo mientras ambas clases pertenezcan exactamente al mismo paquete.

4. ¿En qué se diferencia el acceso de paquete de protected? El acceso de paquete permite la entrada únicamente a clases dentro del mismo paquete y el acceso protected permite la entrada a las clases del mismo paquete y también a todas las subclases hijas, incluso si están en paquetes diferentes. 


