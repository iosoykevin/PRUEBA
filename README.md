# Proyecto de Mensajería — Sistema MVC con Patrones de Diseño

## Descripción del Proyecto  
Este proyecto implementa un **sistema de compra de productos y gestión de pedidos** basado en la arquitectura **MVC (Modelo–Vista–Controlador)**.  
El sistema permite registrar/ingresar y gestionar distintos tipos de usuarios —**Administrador**, **Cliente** y **Repartidor**—, quienes interactúan entre sí mediante pedidos y envíos.  

El objetivo es **simular una red de mensajería estructurada**, donde:  
- El **Administrador** controla y supervisa el sistema.  
- Los **Clientes** pueden crear pedidos.  
- El **Repartidor** recibe los pedidos asignados y los elimina.  

Todo el flujo está centralizado por un **Mediator**, que gestiona la comunicación y la asignación de tareas entre los distintos usuarios, manteniendo bajo acoplamiento entre clases.  
El sistema aplica principios de **orientación a objetos** y **patrones de diseño** para mantener un código limpio, reutilizable y fácilmente extensible.

---

## Integrantes  
- **Iván David González Ordosgoitia**  
- **Kevin Andrés Martínez Martínez**

---

## Lenguaje y Herramientas  
- **Lenguaje principal:** Java ☕  
- **Entorno de desarrollo:** NetBeans  
- **Control de versiones:** Git y GitHub  
- **Arquitectura:** MVC (Modelo–Vista–Controlador)  
- **Patrones de diseño utilizados:** *Factory Method*, *Mediator*, *Facade*  

---

## Patrones Usados y su Rol en el MVC  

### **Factory Method (Modelo)**  
Define una forma flexible de **crear instancias de los distintos tipos de usuarios** (Administrador, Cliente, Repartidor) sin acoplar directamente la lógica de creación en el código del controlador o la vista.  
Permite agregar nuevos tipos de usuarios sin modificar la lógica principal.  

> **Ejemplo:**  
> `UsuarioFactory` es una clase abstracta que define el método de creación,  
> y `UsuarioConcretoFactory` implementa cómo se crean los usuarios específicos según su tipo.

---

### **Mediator (Services – Comunicación interna)**  
Actúa como un **intermediario central** que gestiona la comunicación entre los distintos objetos del sistema, evitando que se comuniquen directamente entre ellos.  
Esto mejora el mantenimiento y evita dependencias innecesarias.  

> **Ejemplo:**  
> El `Mediator` recibe los pedidos creados por los clientes, los almacena y los asigna automáticamente al **Repartidor único** del sistema.

---

### **Facade (Controlador)**  
Sirve como **punto de acceso simplificado** para todas las operaciones del sistema, ocultando la complejidad interna.  
El `Facade` coordina las interacciones entre la vista y el modelo, haciendo que la interfaz gráfica o consola se comunique de forma ordenada y directa con el núcleo del sistema.  

> **Ejemplo:**  
> `Facade` tiene métodos como `registrarUsuario`, `crearPedido`, `verPedidosAsignados` o `obtenerUsuarios`, que resumen toda la lógica necesaria para cada acción del usuario.

---

## Rol en el MVC  

- **Modelo:**  
  Contiene las clases principales del sistema (`Usuario`, `Cliente`, `Administrador`, `Repartidor`, `Pedido`) y los patrones *Factory Method* y *Mediator* que manejan la lógica interna y la creación de objetos.

- **Vista:**  
  Encargada de mostrar la interfaz o los resultados al usuario (por consola o GUI), y de recibir las acciones del mismo.

- **Controlador:**  
  Contiene el patrón *Facade*, que conecta la vista con el modelo.  
  El controlador interpreta las acciones del usuario y las traduce en operaciones del modelo, manteniendo la separación de responsabilidades.

- **Services:**
  Aquí se encuentran los encargados de la mayor parte de la lógica del código, contiene las clases principales que hacen funcionar la lógica (`Mediator`, `MediatorInterfaz`, `Metodos`).

---

## Funcionamiento Básico del Sistema  

1. El **Administrador** se crea al iniciar el sistema (único).  
2. Los **Clientes** pueden registrarse usando el método `registrarUsuario`.  
3. Los **Clientes** crean pedidos que se envían al **Mediator**.  
4. El **Repartidor** visualiza los pedidos asignados automáticamente.  
5. El **Facade** sirve como intermediario entre la interfaz y la lógica del modelo.  

---

## Conclusión  
Este proyecto demuestra la aplicación práctica de los patrones *Factory Method*, *Mediator* y *Facade* dentro de la arquitectura MVC.  
Cada patrón cumple un propósito específico, mejorando la **modularidad**, la **organización** del código y la **escalabilidad** del sistema.
