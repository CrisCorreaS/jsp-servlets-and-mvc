# Contenido de la carpeta "jspbasics"

<ul>
<li> <b>helloworld.jsp:</b>
Es un jsp que printea la hora del servidor con una expresión jsp: <%= new java.util.Date() %></li> </ul>

### Diferencias entre expresión jsp, scriptlet jsp y declaración jsp:
  - **expresion-jsp.jsp:**
Es un jsp para aprender expresiones jsp que son las que van entre **"<%=  ...   %>"** e incorporan una línea sencilla de código java. 

  - **scriptlet-jsp.jsp:**
Es un jsp para aprender scriptlets jsp que son los que van entre **"<%  ...  %>"** e incorporan de una a varias líneas de código java. Para incluír el contenido en la página se usa el método out.println(). En este caso podemos ver un scriptlet jsp con un bucle for

  - **declaration-jsp.jsp:**
Es un jsp para aprender declaraciones jsp que son las que van entre **"<%! ...  %>"** e incorporan un método java, al que luego se llama en el propio jsp (con una expresión jsp o con un scriptlet jsp). En este caso podemos ver una declaración jsp que crea el método makeItLower(), que luego es invocado por una expresión jsp

### Básicos de JSP:
- **calling-clase-java.jsp:**
Es un jsp que llama a una clase java (ClaseJava.java) para utilizar el método "com.git.jspbasics.ClaseJava.makeItLower()" con una expresión jsp. Los métodos de una clase se invocan poniendo el paquete donde va la clase (com.git.jspbasics) + el nombre de la clase (ClaseJava) + el nombre del método (makeItLower())

- **request-object.jsp:**
Es un jsp que utiliza el objeto jsp request. Los objetos básicos de jsp que suelen utilizarse son: 
  - **request:** objeto utilizado en JSP para representar la solicitud del cliente. Proporciona acceso a los parámetros enviados por el cliente, como datos de formularios o valores de URL, y permite almacenar y recuperar atributos relacionados con la solicitud actual.
  - **response:** objeto utilizado en JSP para representar la respuesta que se enviará al cliente. Proporciona métodos para escribir contenido en la respuesta, establecer encabezados HTTP, redirigir a otras páginas y más.
  - **out:** objeto de salida predeterminado en JSP que representa la salida del contenido generado. Puede usarse para escribir contenido en la respuesta del cliente utilizando el método out.print() o out.println().
  - **session:** objeto utilizado en JSP para representar la sesión del usuario. Proporciona un espacio de almacenamiento persistente en el servidor para mantener información específica del usuario a lo largo de varias solicitudes. Se utiliza para almacenar y recuperar atributos relacionados con la sesión actual.
  - **application:** objeto utilizado en JSP para representar el contexto de la aplicación web. Proporciona un espacio de almacenamiento compartido entre todas las solicitudes y sesiones de la aplicación. Se utiliza para almacenar y recuperar atributos globales que deben estar disponibles en toda la aplicación.

- **homepage.jsp:**
Es un jsp que incluye otros archivos con la fórmula *<jsp:include page="..."/>*. En este caso incluye un html (my-header.html) y un jsp (my-footer.jsp)

- **student-form-response.jsp:**
Es un jsp que obtiene los datos intoducidos en un form html (student-form.html). Si el form pone <input type="text" *name="firstName"* />, el jsp para obtener ese parámetro tiene que utilizar la fórmula *${param.firstName}*

- **student-dropdown-form-response.jsp:**
Es un jsp que obtiene los datos intoducidos en un form html (student-dropdown-form.html) con un elemento dropdown (un select con varias opciones). El select comparte el mismo name (<select *name="country"*>) por lo que para obtener ese parámetro se puede utilizar la misma fórmula que en el otro form: *${param.country}*

- **student-radiobutton-response.jsp:**
Es un jsp que obtiene los datos intoducidos en un form html (student-radiobutton-form.html) con un elemento radio button (un input type="radio"). Las etiquetas input comparten el mismo name (<input type="radio" *name="favoriteLanguage"* value="Java" />) por lo que para obtener ese parámetro se puede utilizar la misma fórmula que en el otro form: *${param.favoriteLanguage}*

- **student-checkbox-response.jsp:**
Es un jsp que obtiene los datos intoducidos en un form html (student-checkbox-form.html) con un elemento checkbox (un input type="checkbox"). Las etiquetas input comparten el mismo name (<input type="checkbox" *name="favoriteLanguage"* value="Java" />). Esta vez en el jsp se utiliza un scriptlet jsp que mete con el método request.getParameterValues("favoriteLanguage") los valores en un array de Strings, luego se recorre el array con un bucle forEach y se printean los valores invocando al método println() del objeto jsp out (out.println())

- **to-do-list.jsp:**
Es un jsp que obtiene los datos que se envían en su propio formulario y los pinta para hacer una to-do list. Con este código tenemos varios pasos que dar:
  - **Paso 1:** Crear un form que se apunte a si mismo una vez lo hayamos cubierto y mandado (se hace con el atributo *action="to-do-list.jsp"*  del form)
  - **Paso 2:** Con un scriptlet jsp, añadimos los elementos enviados por el form a nuestra to-do list. 

      *1-* Creamos un array de Strings que meta los valores que nos devuelva el método getAttribute() del objeto jsp session (session.getAttribute()). 

      *2-* Hacemos un if para comprobar si existe la session, si la lista de tareas es nula, significa que es la primera vez que se accede a la página o que la lista no ha sido creada anteriormente; en ese caso, se crea una nueva lista vacía utilizando new ArrayList<String>(). Se almacena esta nueva lista en la sesión del usuario utilizando session.setAttribute("myToDoList", items). Esto asegura que la lista esté disponible para su uso en futuras solicitudes del usuario.

      *3-* Hacemos otro if para verificar si la variable "theItem" no es nula. La variable "theItem" se obtiene a través de la solicitud (request) utilizando el método getParameter() como en el primer paso. Si la variable "theItem" no es nula, significa que se ha enviado un parámetro en el form. En ese caso, el código agrega el valor de "theItem" a la lista "items" utilizando el método add() (items.add("theItem")).
  - **Paso 3:**  Creamos una lista desordenada que dentro tiene un un scriptlet jsp que va printeando, con el método println() del objeto out (out.println()), los datos guardados en el Array con un bucle forEach
