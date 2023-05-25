# jsp-servlets-and-mvc

## Contenido de la carpeta "jspbasics"

- **helloworld.jsp**
Es un jsp que printea la hora del servidor con una expresión jsp: <%= new java.util.Date() %>

**Diferencias entre expresión jsp, scriptlet jsp y declaración jsp:**
- - **expresion-jsp.jsp**
Es un jsp para aprender expresiones jsp que son las que van entre **"<%=  ...   %>"** e incorporan una línea sencilla de código java. 

- - **scriptlet-jsp.jsp**
Es un jsp para aprender scriptlets jsp que son los que van entre **"<%  ...  %>"** e incorporan de una a varias líneas de código java. Para incluír el contenido en la página se usa el método out.println(). En este caso podemos ver un scriptlet jsp con un bucle for

- - **declaration-jsp.jsp**
Es un jsp para aprender declaraciones jsp que son las que van entre **"<%! ...  %>"** e incorporan un método java, al que luego se llama en el propio jsp (con una expresión jsp o con un scriptlet jsp). En este caso podemos ver una declaración jsp que crea el método makeItLower(), que luego es invocado por una expresión jsp

---

## Contenido de la carpeta "servlets"
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
