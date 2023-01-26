## **Lista Simple Doblemente Ligada**

El proyecto contiene las siguientes clases:

* **`DoublyLinkedList`** donde se establece la lógica de la lista simple doblemente ligada.
* **`Node`** contiene la informacion de un nodo.
* **`test`** prueba un ejemplo para observar el funcionamiento de la lista simple doblemente ligada.

### **Tipo de Lista**

A continuación describimos las caracteristicas de una Lista Simple Doblemente Ligada.

**Lista Simple** En la siguiente imagen podemos ver cómo se enlazan los nodos con el Nodo siguiente (Pueden tener un enlace o dos enlaces dependiendo del tipo de Nodo). En una lista simple doblemente ligada el último nodo de la lista siempre apunta a **null**. Como esta lista es doblemente ligada, notaremos que el primer apuntadpr indica al nodo anterior mientras que el segundo apuntador indica el nodo más próximo.

![DoubleSimpleLinkedList1](https://user-images.githubusercontent.com/115047831/214775302-c17933d1-fc43-48e1-993c-f79a874190e9.png)

### **Tipo de Nodo**

**Nodo Doble** Un Nodo doble tiene dos apuntadores, el primero es el nodo previo y apuntará a el nodo que esta antes de él en la lista, el segundo es el nodo siguiente y apuntara al inmediato depués de él.

![Doble](https://user-images.githubusercontent.com/115047831/207787603-10792991-6d67-4c03-953a-11ed90acd389.png)

## Agregar Nodo

**Cuando agregamos un nuevo Nodo siempre se añadira al final de la Lista**

Tenemos la siguiente lista con los siguientes nodos: Nodo 1 (Azul), Nodo 2 (Rosa) y Nodo 3 (Amarillo), si queremos agregar el Nodo 4 (Morado) entonces el apuntador siguiente del Nodo 3 (Amarillo) ahora debera apuntar al Nodo 4 (Morado), mientras que el apuntador previo del Nodo 4 (Morado) debera apuntar al Nodo 3 (Amarillo).

![DoubleSimpleLinkedList2](https://user-images.githubusercontent.com/115047831/214777674-7722afea-26f9-461f-ab03-8be2b5c9d3fb.png)


Ahora que agregamos el Nodo 4 (Morado) debemos saber que la **variable last** esta apuntando al Nodo 4 (Morado) ya que ahora es el último nodo de la lista.

![DoubleSimpleLinkedList3](https://user-images.githubusercontent.com/115047831/214777753-569a43cc-aa92-416f-8f95-576392e4df16.png)


## Eliminar Nodo

**Se elimina un Nodo por su valor númerico, se elimnarán todos los valores con este dígito.**

En el siguiente ejemplo podemos observar que el Nodo 1 (Azul) se repite 4 veces en la lista, el objetivo es eliminar todos los nodos que coinciden con el número 1, independientemente de su posición en la lista deberán ser eliminados. El método **`delete`** se compone de tres partes, si identifica que el Nodo ha eliminar está al inicio de la lista  entonces ejecutará el método **`deleteFirst`** mientras que detecte que el valor sigue al inicio de la lista. Posteriormente buscará el nodo que esta al final de la lista, si coincide con el número a eliminar continuara eliminandolo ejecutando el método **`deleteLast`** hasta que no este al final de la lista. Finalmente buscará el valor númerico del nodo unicamente en el medio de la lista.

![DoubleSimpleLinkedList5](https://user-images.githubusercontent.com/115047831/214781667-32357f9c-43ed-494f-8afc-a88c9d4a10d8.png)

En la siguiente imagen podemos observar que todos los Nodos 1 (Azul) han sido removidos de la lista.

![DoubleSimpleLinkedList6](https://user-images.githubusercontent.com/115047831/214782097-8ad2af5c-c58a-4386-84bf-23a4fe471d08.png)


## Diagrama de clases con UML

> **Nota:** El siguiente diagrama de clases representa la lógica de programación utilizada para construir la **Lista Simple Doblemente Ligada**. La clase **test** no se incluye en el diagrama UML porque solo contiene el método main y únicamente es utilizada para demostrar el funcionamiento de los métodos de la lista.

![UML (1)](https://user-images.githubusercontent.com/115047831/214785925-63fd14fa-d171-416a-9384-bd80b3a1e8fd.png)
