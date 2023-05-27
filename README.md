# Repositorio de Recopilación de Archivos JSP, Servlets y MVC

¡Bienvenido al repositorio de Recopilación de Archivos JSP, Servlets y el Modelo Vista Controlador (MVC)!

Este repositorio ha sido creado con el propósito de compartir el conocimiento adquirido durante mi curso de Udemy sobre archivos JSP, servlets y el patrón MVC. Aquí encontrarás una recopilación estructurada de ejercicios resueltos y apuntes detallados que te ayudarán a comprender y aplicar estos conceptos en tus proyectos de desarrollo web.

### ¿Por qué este repositorio puede ayudarte?
<ul>
<li> <b>Recopilación estructurada:</b> El repositorio está organizado en carpetas separadas para cada concepto clave, lo que te permitirá encontrar fácilmente la información que necesitas y seguir una progresión lógica en tu aprendizaje.</li>

<li> <b>Ejercicios resueltos:</b> Encontrarás una variedad de ejercicios prácticos que he resuelto durante el curso. Estos ejemplos concretos te brindarán una comprensión más sólida de cómo se aplican los archivos JSP, servlets y el patrón MVC en situaciones reales.</li>

<li> <b>Apuntes y explicaciones claras:</b> Además de los ejercicios resueltos, he compartido apuntes detallados y explicaciones claras sobre cada tema. Estos recursos te ayudarán a comprender los fundamentos de los archivos JSP, servlets y el patrón MVC, así como los conceptos avanzados que puedan surgir en el desarrollo web.</li>

<li> <b>Comunidad y colaboración:</b> Este repositorio no es solo un lugar para compartir conocimientos, sino también un espacio para que interactúes con otros desarrolladores. Puedes plantear preguntas, intercambiar ideas y contribuir con tus propios ejemplos y mejoras. ¡Juntos podemos crear un ambiente de aprendizaje colaborativo!</li> </ul>

### Cómo utilizar este repositorio
<ul>
<li>Explora las carpetas correspondientes a los archivos JSP, servlets y el patrón MVC para acceder a los ejercicios resueltos.</li>
<li>Lee los apuntes y explicaciones proporcionados para obtener una comprensión sólida de los conceptos fundamentales y avanzados.</li>
<li>Si tienes alguna pregunta o sugerencia, no dudes en abrir un problema o enviar una solicitud de extracción. Tu participación es bienvenida.</li> </ul>

### Contribuir
¡Tú también puedes contribuir a este repositorio! Si tienes ejemplos adicionales, mejoras en la documentación o cualquier otro aporte que pueda beneficiar a otros usuarios, ¡no dudes en enviar una solicitud de extracción!

Espero que este repositorio te sea útil en tu camino de aprendizaje y desarrollo web. ¡Disfruta explorando y aplicando tus conocimientos sobre archivos JSP, servlets y el patrón MVC!

Gracias por visitar este repositorio.

Nota: Este repositorio fue creado por Cristina Correa como parte del curso "JSP, Servlets and JDBC for Beginners: Build a Database App" en Udemy. Los materiales aquí compartidos son el resultado de mi aprendizaje personal y mi intención es divulgarlos para el beneficio de la comunidad de desarrolladores.

---
## Ejercicios Resueltos
Existen tres carpetas con ejercicios resueltos: 
<ul>
<li> <b>jspbasics:</b> Aquí tienes todo lo necesario para iniciarte con los jsp, desde un Hello World hasta etiquetas jsp</li>
<li> <b>jsptags:</b> Aquí se encuentran los ejercicios de tags en jsp más complicadas como las jstl</li>
<li> <b>servlets:</b> Aquí están todos ejercicios resueltos de servlets y un ejemplo básico de mvc</li> </ul>



Si nunca has trabajado con un dynamic web project y no entiendes el orden de carpetas, solo tienes que recordar que en por un lado, en la carpeta **src** se encuentran los Servlets y las clases java, y por otro lado, en **WebContent** se encuentran los jsp.
<br/><br/>
### Contenido de la carpeta "jspbasics"

<ul>
<li> <b>helloworld.jsp:</b></li> </ul>
Es un jsp que printea la hora del servidor con una expresión jsp: <%= new java.util.Date() %></li> </ul>

**Diferencias entre expresión jsp, scriptlet jsp y declaración jsp:**
- - **expresion-jsp.jsp:**
Es un jsp para aprender expresiones jsp que son las que van entre **"<%=  ...   %>"** e incorporan una línea sencilla de código java. 

- - **scriptlet-jsp.jsp:**
Es un jsp para aprender scriptlets jsp que son los que van entre **"<%  ...  %>"** e incorporan de una a varias líneas de código java. Para incluír el contenido en la página se usa el método out.println(). En este caso podemos ver un scriptlet jsp con un bucle for

- - **declaration-jsp.jsp:**
Es un jsp para aprender declaraciones jsp que son las que van entre **"<%! ...  %>"** e incorporan un método java, al que luego se llama en el propio jsp (con una expresión jsp o con un scriptlet jsp). En este caso podemos ver una declaración jsp que crea el método makeItLower(), que luego es invocado por una expresión jsp

**Básicos de JSP:**
- **calling-clase-java.jsp:**
Es un jsp que llama a una clase java (ClaseJava.java) para utilizar el método "com.git.jspbasics.ClaseJava.makeItLower()" con una expresión jsp. Los métodos de una clase se invocan poniendo el paquete donde va la clase (com.git.jspbasics) + el nombre de la clase (ClaseJava) + el nombre del método (makeItLower())

- **request-object.jsp:**
Es un jsp que utiliza el objeto jsp request. Los objetos básicos de jsp que suelen utilizarse son: 
- - **request:** objeto utilizado en JSP para representar la solicitud del cliente. Proporciona acceso a los parámetros enviados por el cliente, como datos de formularios o valores de URL, y permite almacenar y recuperar atributos relacionados con la solicitud actual.
- - **response:** objeto utilizado en JSP para representar la respuesta que se enviará al cliente. Proporciona métodos para escribir contenido en la respuesta, establecer encabezados HTTP, redirigir a otras páginas y más.
- - **out:** objeto de salida predeterminado en JSP que representa la salida del contenido generado. Puede usarse para escribir contenido en la respuesta del cliente utilizando el método out.print() o out.println().
- - **session:** objeto utilizado en JSP para representar la sesión del usuario. Proporciona un espacio de almacenamiento persistente en el servidor para mantener información específica del usuario a lo largo de varias solicitudes. Se utiliza para almacenar y recuperar atributos relacionados con la sesión actual.
- - **application:** objeto utilizado en JSP para representar el contexto de la aplicación web. Proporciona un espacio de almacenamiento compartido entre todas las solicitudes y sesiones de la aplicación. Se utiliza para almacenar y recuperar atributos globales que deben estar disponibles en toda la aplicación.

- **homepage.jsp:**
Es un jsp que incluye otros archivos con la fórmula **<jsp:include page="..."/>**. En este caso incluye un html (my-header.html) y un jsp (my-footer.jsp)

- **student-form-response.jsp:**
Es un jsp que obtiene los datos intoducidos en un form html (student-form.html). Si el form pone <input type="text" **name="firstName"** />, el jsp para obtener ese parámetro tiene que utilizar la fórmula **${param.firstName}**

- **student-dropdown-form-response.jsp:**
Es un jsp que obtiene los datos intoducidos en un form html (student-dropdown-form.html) con un elemento dropdown (un select con varias opciones). El select comparte el mismo name (<select **name="country"**>) por lo que para obtener ese parámetro se puede utilizar la misma fórmula que en el otro form: **${param.country}**

- **student-radiobutton-response.jsp:**
Es un jsp que obtiene los datos intoducidos en un form html (student-radiobutton-form.html) con un elemento radio button (un input type="radio"). Las etiquetas input comparten el mismo name (<input type="radio" **name="favoriteLanguage"** value="Java" />) por lo que para obtener ese parámetro se puede utilizar la misma fórmula que en el otro form: **${param.favoriteLanguage}**

- **student-checkbox-response.jsp:**
Es un jsp que obtiene los datos intoducidos en un form html (student-checkbox-form.html) con un elemento checkbox (un input type="checkbox"). Las etiquetas input comparten el mismo name (<input type="checkbox" **name="favoriteLanguage"** value="Java" />). Esta vez en el jsp se utiliza un scriptlet jsp que mete con el método request.getParameterValues("favoriteLanguage") los valores en un array de Strings, luego se recorre el array con un bucle forEach y se printean los valores invocando al método println() del objeto jsp out (out.println())

- **to-do-list.jsp:**
Es un jsp que obtiene los datos que se envían en su propio formulario y los pinta para hacer una to-do list. Con este código tenemos varios pasos que dar:
- - **Paso 1:** Crear un form que se apunte a si mismo una vez lo hayamos cubierto y mandado (se hace con el atributo **action="to-do-list.jsp"**  del form)
- - **Paso 2:** Con un scriptlet jsp, añadimos los elementos enviados por el form a nuestra to-do list. 

      **1-** Creamos un array de Strings que meta los valores que nos devuelva el método getAttribute() del objeto jsp session (session.getAttribute()). 

      **2-** Hacemos un if para comprobar si existe la session, si la lista de tareas es nula, significa que es la primera vez que se accede a la página o que la lista no ha sido creada anteriormente; en ese caso, se crea una nueva lista vacía utilizando new ArrayList<String>(). Se almacena esta nueva lista en la sesión del usuario utilizando session.setAttribute("myToDoList", items). Esto asegura que la lista esté disponible para su uso en futuras solicitudes del usuario.

      **3-** Hacemos otro if para verificar si la variable "theItem" no es nula. La variable "theItem" se obtiene a través de la solicitud (request) utilizando el método getParameter() como en el primer paso. Si la variable "theItem" no es nula, significa que se ha enviado un parámetro en el form. En ese caso, el código agrega el valor de "theItem" a la lista "items" utilizando el método add() (items.add("theItem")).
- - **Paso 3:**  Creamos una lista desordenada que dentro tiene un un scriptlet jsp que va printeando, con el método println() del objeto out (out.println()), los datos guardados en el Array con un bucle forEach

**Cookies:**

Las cookies son pequeños archivos de texto que se envían y almacenan en el navegador del cliente.
- **cookies-personalize-form.html:**
Es un html que tiene un form con un dropdown (<select name="favoriteLanguage">) que es el que guarda los datos en el jsp cookies-personalize-response.jsp (<form action="cookies-personalize-response.jsp">)

<ul>
<li> <b>cookies-personalize-response.jsp:</b>
Es un jsp que obtiene la información del form html con el método getParameter() del objeto jsp request, luego crea una cookie (theCookie), le da el tiempo de vida (en segundos) a la cookie con el método setMaxAge() y envía la cookie al navegador con la sentencia: response.addCookie(theCookie). Por último, tiene un enlace a la homepage (cookies-homepage.jsp)</li>
 
<li> <b>cookies-homepage.jsp:</b>
Es un jsp que: 
  <ul><li> Establece una variable favLang con un valor predeterminado de "Java". Obtiene las cookies de la solicitud del navegador utilizando request.getCookies(), luego, verifica si se han obtenido cookies en la variable theCookies. Si se han obtenido cookies, el código realiza un bucle for para iterar a través de todas las cookies obtenidas. En cada iteración, se verifica si el nombre de la cookie coincide con "myApp.favoriteLanguage" utilizando tempCookie.getName(). Esto se hace para encontrar la cookie específica que almacena el lenguaje favorito. Si se encuentra la cookie, se asigna el valor de esa cookie a la variable favLang utilizando tempCookie.getValue(). Luego, se sale del bucle utilizando break. </li>
  <li>Printea diferente información según el lenguaje favorito de cada persona </li>
  <li>Tiene un link al form html para establecer el lenguaje por defecto que quiere que se almacene en la cookie, así que puede personalizar la página
  </li></ul>


<br/><br/>
### Contenido de la carpeta "servlets"
<ul>
<li> <b>HelloWorldServlet.java:</b>
Es un servlet de inicio donde se pinta por pantalla la fecha y hora actuales</li>

<li> <b>StudentsServlet:</b>
Es un servlet que es invocado por un JSP (<b>student-form.jsp</b>) a través del atributo "action" de su etiqueta formulario. El JSP crea un formulario que cuando se cubre y envía, los datos cubiertos llegan al servlet y se imprimen por pantalla con el método request.getParameter(). JSP invoca a un Servlet con el atributo "action" de su etiqueta form</li>

<li> <b>DatosArrayServlet.java:</b>
Es un servlet que guarda en una Array de Strings unos nombres e invoca a un jsp (<b>view_students.jsp</b>) que los pinta por pantalla. Servlet invoca a un JSP</li>

<li> <b>ParamContextServlet.java:</b>
Es un servlet que utiliza los parámetros de contexto del web.xml con el método context.getInitParameter(). Servlet invoca los parámetros de contexto del web.xml</li></ul>

<b>Contenido de la subcarpeta MVC</b>
<ul>
<li> <b>Student.java:</b>
Es una clase de java llamada Students con varios atributos y sus correspondientes getters y setters y un constructor</li>

<li> <b>StudentDataUtil.java:</b>
Es una clase de java llamada StudentsDataUtil que sirve como **modelo** en el mvc. Devuelve una lista de objetos de estudiantes cuando un servlet la llame.</li>

<li> <b>MvcServlet.java:</b>
Es un servlet que sirve como <b>controlador</b> en el mvc. Primero coge una lista de los estudiantes, la pasa al request object con el método request.setAttribute() con el nombre "student-list", obtiene el request dispacher con el método request.getRequestDispatcher() apuntando hacia el jsp (view_students_two.jsp) y manda la información al jsp con el método dispatcher.forward().</li>

<ul>
<li> <b>view_students_two.jsp:</b>
Es un jsp que sirve como <b>vista</b> que imprime por pantalla en una tabla, los datos de los estudiantes que le envía el servlet (MvcServlet.java)</li>

<li> <b>index.html:</b>
Es un html que tiene un enlace que conecta con el Servlet para así, poder evitar ejecutar el Servlet directamente. Es una página simple con una etiqueta de enlace que nos redirige a la página web de nuestro Servlet</li></ul>
</li></ul>
