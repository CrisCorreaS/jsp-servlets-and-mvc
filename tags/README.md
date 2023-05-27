# Contenido de la carpeta tags

En esta carpeta puedes ver ejemplos de ejercicios utilizando tags como las JSTL (JSP Standard Tag Library). Estas JSTL son un conjunto común de etiquetas que ha creado Orecle y que se pueden utilizar en cualquier proyecto. Se dividen en cinco campos/bibliotecas diferentes:
- **Core (c):** Son las más comunes y se utilizan para manejar variables, condicionales, bucles, etc. Existen 15 etiquetas core, pero aquí vamos a ver las principales:

  - **catch:** para manejar excepciones
  - **choose:** es un condicional que se utiliza como un switch con las etiquetas **when** y **otherwise**
  - **if:** es un condicional que se utiliza como una sentencia simple if/else. Se sigue cumpliendo que sea boolean la sentencia del if, y para que sea false hay que poner un not en " test="${**not** ...}" "
  - **import:** para recuperar URLs absolutas o relativas
  - **forEach:** es un bucle que sirve para iteral colecciones de valores
  - **forTokens:** es un bucle que sirve para iteral colecciones de tokens
  - **out:** para mostrar la salida de datos
  - **otherwise:** se utiliza con la tag **choose** para hacer la función de un case o un else
  - **param:** añade un parámetro a la URL
  - **redirect:** redirecciona el navegador a una nueva URL
  - **remove:** elimina una variable
  - **set:** asigna el valor de una expresión jsp a una variable
  - **url:** define una url con parámetros query
  - **when:** se usa con when cuando una condición es verdadera

- **Messages Formatting Internationalization (i18n) (fmt):** Se utilizan para manejar la internacionalización de una web y su formateo

- **Functions (fn):** Se utilizan para manipular Strings y obtener tamaños de colecciones

- **XML:** Se utilizan para analizar y extablecer datos XML

- **SQL:** Se utilizan para acceder a una base de datos. Estas etiquetas, en general, son consideradas una mala práctica y por eso no aparecerán en los apuntes. En la industria se dice que son buenas para hacer prototipos pero no para las aplicaciones de producción del mundo real.

---
## Ejercicios con tags:
- **core-jstl-test.jsp:**
Es un jsp que utiliza una etiqueta jstl core set para invocar una variable (**stuff**) que tiene el valor de una expresión jsp (**<%= new java.util.Date() %>**) y que luego se invoca a esta variable más adelante con la fórmula: **${stuff}**

- **core-jstl-foreach-simple.jsp:**
Es un jsp que primero crea un scriptlet jsp para guardar una serie de Strings en un Array de Strings y luego se le asigna el nombre del Array (**myCities**) con el método setAttribute() del objeto pageContext (pageContext.setAttribute()).Después, se utiliza una etiqueta jstl core forEach para iterar los valores de myCities (<c:forEach var="tempCity" items="${myCities}">) y luego sacarlos por pantalla

- **core-jstl-foreach-student.jsp:**
Es un jsp que importa la clase java **Student.java** y en un scriptlet jsp crea una lista de objetos de Students, luego va añadiendo al ArrayList (con el método add()) varios estudiantes y por último con pageContext.setAttribute() les da el nombre "myStudents". En el código html creamos una tabla que contiene una etiqueta jstl core forEach para iterar los valores de myStudents y devolver cada uno de sus atributos (firstName, lastName y goldCustomer).

- **core-jstl-if-student.jsp:**
Es un jsp que coge el código anterior pero dentro de la tag jstl core forEach ponen dos tags jstl core if para que, si el estudiante es un gold Customer (<c:if test="${tempStudent.goldCustomer}"></c:if>), se pinte "Special Discount", y si no es un gold Customer (<c:if test="${*not* tempStudent.goldCustomer}"></c:if>), solo se ponga un guión

- **core-jstl-choose-student.jsp:**
Es un jsp que imita lo que hace el código anterior con el if, pero esta vez utilizando una tag choose que tiene una tag when para referirse a cuando se cumpla lo de ser un gold Customer y una etiqueta otherwise para referirse a cuando no se cumple

- **function-jstl-test.jsp:**
Es un jsp que con una tag jstl core le da al nombre "data" un valor String ("metodoLongitud") al que luego, con tres tags jstl function, utilizamos los métodos: 
  - **length()** y el nombre de la variable (*${fn:length(data)}*) para que nos de la longitud de la palabra (en este caso "metodoLongitud" tiene 14 caracteres)
  - **toUpperCase()** y el nombre de la variable (*${fn:toUpperCase(data)}*) para que nos pase la palabra en mayúsculas (en este caso "METODOLONGITUD")
  - **startsWith()** con el nombre de la variable y del principio de la frase que queremos comprobar (*${fn:startsWith(data,"met")}*) para que nos devuelva true si es cierto o false si no (en este caso nos devuelve true porque "metodoLongitud" si que empieza por "met")

- **function-jstl-split-join-test.jsp:**
Es un jsp que con una tag jstl core set le da al nombre "data" un valor String ("Madrid,Miami,Mumbai,Manila") al que luego, con dos tags jstl function, utilizamos los métodos: 
  - **split()** con el nombre de la variable y el símbolo por el que se quiere cortar el String inicial (*${fn:split(data, ',')}*), cada valor se guarda en un array (citiesArray) y luego con una etiqueta jstl core forEach se iteran los valores del array para que se printeen
  - **join()** con el nombre de la variable que en este caso es el array anterior y el símbolo por el que se quiere unir a cada valor del array (*${fn:join(citiesArray, ';')}"*), todos los valores se guardan en un único String unidos por ese símbolo (en este caso "Madrid;Miami;Mumbai;Manila"). Luego este String es pintado por pantalla

- **i18n-jstl-messages-test.jsp**
Es un jsp que:
<ol> <li> Con una tag jstl core set le pide el locale (lenguaje por preferencia) al usuario y si no, pone el que está por defecto como mylabels.properties </li>
  <li> Con una etiqueta jslt de i19n, se pide establece el locale (<fmt:setLocale value="${theLocale}" />)</li>
  <li> Se importan los .properties (**mylabels.properties, mylabels_de_DE.properties y mylabels_es_ES.properties**) con una tag jslt de internacionalización y el método setBundle()</li> 
  <li> Se crean unos enlaces para cambiar el idioma de la página y por último en el html se hace referencia a las diferentes variables de los .properties con una etiqueta fmt y el método message(). </li></ol>

Para hacer referencia al valor "label.firstname" del .properties, se utilizaría la referencia fmt: <fmt:message key="label.firstname" />
