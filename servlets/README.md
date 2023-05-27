# Contenido de la carpeta "servlets"
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
