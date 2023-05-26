# Repositorio de Recopilación de Archivos JSP, Servlets y MVC

¡Bienvenido al repositorio de Recopilación de Archivos JSP, Servlets y el Modelo Vista Controlador (MVC)!

Este repositorio ha sido creado con el propósito de compartir el conocimiento adquirido durante mi curso de Udemy sobre archivos JSP, servlets y el patrón MVC. Aquí encontrarás una recopilación estructurada de ejercicios resueltos y apuntes detallados que te ayudarán a comprender y aplicar estos conceptos en tus proyectos de desarrollo web.

### ¿Por qué este repositorio puede ayudarte?
- **Recopilación estructurada:** El repositorio está organizado en carpetas separadas para cada concepto clave, lo que te permitirá encontrar fácilmente la información que necesitas y seguir una progresión lógica en tu aprendizaje.

- **Ejercicios resueltos:** Encontrarás una variedad de ejercicios prácticos que he resuelto durante el curso. Estos ejemplos concretos te brindarán una comprensión más sólida de cómo se aplican los archivos JSP, servlets y el patrón MVC en situaciones reales.

- **Apuntes y explicaciones claras:** Además de los ejercicios resueltos, he compartido apuntes detallados y explicaciones claras sobre cada tema. Estos recursos te ayudarán a comprender los fundamentos de los archivos JSP, servlets y el patrón MVC, así como los conceptos avanzados que puedan surgir en el desarrollo web.

- **Comunidad y colaboración:** Este repositorio no es solo un lugar para compartir conocimientos, sino también un espacio para que interactúes con otros desarrolladores. Puedes plantear preguntas, intercambiar ideas y contribuir con tus propios ejemplos y mejoras. ¡Juntos podemos crear un ambiente de aprendizaje colaborativo!

### Cómo utilizar este repositorio
- Explora las carpetas correspondientes a los archivos JSP, servlets y el patrón MVC para acceder a los ejercicios resueltos.
- Lee los apuntes y explicaciones proporcionados para obtener una comprensión sólida de los conceptos fundamentales y avanzados.
- Si tienes alguna pregunta o sugerencia, no dudes en abrir un problema o enviar una solicitud de extracción. Tu participación es bienvenida.

### Contribuir
¡Tú también puedes contribuir a este repositorio! Si tienes ejemplos adicionales, mejoras en la documentación o cualquier otro aporte que pueda beneficiar a otros usuarios, ¡no dudes en enviar una solicitud de extracción!

Espero que este repositorio te sea útil en tu camino de aprendizaje y desarrollo web. ¡Disfruta explorando y aplicando tus conocimientos sobre archivos JSP, servlets y el patrón MVC!

Gracias por visitar este repositorio.

Nota: Este repositorio fue creado por Cristina Correa como parte del curso "JSP, Servlets and JDBC for Beginners: Build a Database App" en Udemy. Los materiales aquí compartidos son el resultado de mi aprendizaje personal y mi intención es divulgarlos para el beneficio de la comunidad de desarrolladores.

---
## Ejercicios Resueltos
Existen tres carpetas con ejercicios resueltos: 
- **jspbasics:** Aquí tienes todo lo necesario para iniciarte con los jsp, desde un Hello World hasta etiquetas jsp
- **jsptags:** Aquí se encuentran los ejercicios de tags en jsp más complicadas como las jstl
- **servlets:** Aquí están todos ejercicios resueltos de servlets y un ejemplo básico de mvc



Si nunca has trabajado con un dynamic web project y no entiendes el orden de carpetas, solo tienes que recordar que en por un lado, en la carpeta **src** se encuentran los Servlets y las clases java, y por otro lado, en **WebContent** se encuentran los jsp.
<br/><br/>
### Contenido de la carpeta "jspbasics"

- **helloworld.jsp**
Es un jsp que printea la hora del servidor con una expresión jsp: <%= new java.util.Date() %>

**Diferencias entre expresión jsp, scriptlet jsp y declaración jsp:**
- - **expresion-jsp.jsp**
Es un jsp para aprender expresiones jsp que son las que van entre **"<%=  ...   %>"** e incorporan una línea sencilla de código java. 

- - **scriptlet-jsp.jsp**
Es un jsp para aprender scriptlets jsp que son los que van entre **"<%  ...  %>"** e incorporan de una a varias líneas de código java. Para incluír el contenido en la página se usa el método out.println(). En este caso podemos ver un scriptlet jsp con un bucle for

- - **declaration-jsp.jsp**
Es un jsp para aprender declaraciones jsp que son las que van entre **"<%! ...  %>"** e incorporan un método java, al que luego se llama en el propio jsp (con una expresión jsp o con un scriptlet jsp). En este caso podemos ver una declaración jsp que crea el método makeItLower(), que luego es invocado por una expresión jsp

**Básicos de JSP:**
- **calling-clase-java.jsp**
Es un jsp que llama a una clase java (ClaseJava.java) para utilizar el método "com.git.jspbasics.ClaseJava.makeItLower()" con una expresión jsp. Los métodos de una clase se invocan poniendo el paquete donde va la clase (com.git.jspbasics) + el nombre de la clase (ClaseJava) + el nombre del método (makeItLower())

- **request-object.jsp**
Es un jsp que utiliza el objeto jsp request. Los objetos básicos de jsp que suelen utilizarse son: 
- - **request:** objeto utilizado en JSP para representar la solicitud del cliente. Proporciona acceso a los parámetros enviados por el cliente, como datos de formularios o valores de URL, y permite almacenar y recuperar atributos relacionados con la solicitud actual.
- - **response:** objeto utilizado en JSP para representar la respuesta que se enviará al cliente. Proporciona métodos para escribir contenido en la respuesta, establecer encabezados HTTP, redirigir a otras páginas y más.
- - **out:** objeto de salida predeterminado en JSP que representa la salida del contenido generado. Puede usarse para escribir contenido en la respuesta del cliente utilizando el método out.print() o out.println().
- - **session:** objeto utilizado en JSP para representar la sesión del usuario. Proporciona un espacio de almacenamiento persistente en el servidor para mantener información específica del usuario a lo largo de varias solicitudes. Se utiliza para almacenar y recuperar atributos relacionados con la sesión actual.
- - **application:** objeto utilizado en JSP para representar el contexto de la aplicación web. Proporciona un espacio de almacenamiento compartido entre todas las solicitudes y sesiones de la aplicación. Se utiliza para almacenar y recuperar atributos globales que deben estar disponibles en toda la aplicación.

- **homepage.jsp**
Es un jsp que incluye otros archivos con la fórmula **<jsp:include page="..."/>**. En este caso incluye un html (my-header.html) y un jsp (my-footer.jsp)

- **student-form-response.jsp**
Es un jsp que obtiene los datos intoducidos en un form html (student-form.html). Si el form pone <input type="text" **name="firstName"** />, el jsp para obtener ese parámetro tiene que utilizar la fórmula **${param.firstName}**

<br/><br/>
### Contenido de la carpeta "servlets"
- **HelloWorldServlet.java**
Es un servlet de inicio donde se pinta por pantalla la fecha y hora actuales

- **StudentsServlet**
Es un servlet que es invocado por un JSP (**student-form.jsp**) a través del atributo "action" de su etiqueta formulario. El JSP crea un formulario que cuando se cubre y envía, los datos cubiertos llegan al servlet y se imprimen por pantalla con el método request.getParameter(). JSP invoca a un Servlet con el atributo "action" de su etiqueta form

- **DatosArrayServlet.java**
Es un servlet que guarda en una Array de Strings unos nombres e invoca a un jsp (**view_students.jsp**) que los pinta por pantalla. Servlet invoca a un JSP

- **ParamContextServlet.java**
Es un servlet que utiliza los parámetros de contexto del web.xml con el método context.getInitParameter(). Servlet invoca los parámetros de contexto del web.xml

**Contenido de la subcarpeta MVC**
- **Student.java**
Es una clase de java llamada Students con varios atributos y sus correspondientes getters y setters y un constructor

- **StudentDataUtil.java**
Es una clase de java llamada StudentsDataUtil que sirve como **modelo** en el mvc. Devuelve una lista de objetos de estudiantes cuando un servlet la llame.

- **MvcServlet.java**
Es un servlet que sirve como **controlador** en el mvc. Primero coge una lista de los estudiantes, la pasa al request object con el método request.setAttribute() con el nombre "student-list", obtiene el request dispacher con el método request.getRequestDispatcher() apuntando hacia el jsp (view_students_two.jsp) y manda la información al jsp con el método dispatcher.forward().

- - **view_students_two.jsp**
Es un jsp que sirve como **vista** que imprime por pantalla en una tabla, los datos de los estudiantes que le envía el servlet (MvcServlet.java)

- - **index.html**
Es un html que tiene un enlace que conecta con el Servlet para así, poder evitar ejecutar el Servlet directamente. Es una página simple con una etiqueta de enlace que nos redirige a la página web de nuestro Servlet
