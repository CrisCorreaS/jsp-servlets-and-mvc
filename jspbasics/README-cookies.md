# Cookies:

Las cookies son pequeños archivos de texto que se envían y almacenan en el navegador del cliente.

Archivos de cookies que existen en este repositorio:

- **cookies-personalize-response.jsp:**
Es un jsp que obtiene la información del form html con el método getParameter() del objeto jsp request, luego crea una cookie (theCookie), le da el tiempo de vida (en segundos) a la cookie con el método setMaxAge() y envía la cookie al navegador con la sentencia: response.addCookie(theCookie). Por último, tiene un enlace a la homepage (cookies-homepage.jsp)
 
- **cookies-homepage.jsp:**
Es un jsp que: 
  - - Establece una variable favLang con un valor predeterminado de "Java". Obtiene las cookies de la solicitud del navegador utilizando request.getCookies(), luego, verifica si se han obtenido cookies en la variable theCookies. Si se han obtenido cookies, el código realiza un bucle for para iterar a través de todas las cookies obtenidas. En cada iteración, se verifica si el nombre de la cookie coincide con "myApp.favoriteLanguage" utilizando tempCookie.getName(). Esto se hace para encontrar la cookie específica que almacena el lenguaje favorito. Si se encuentra la cookie, se asigna el valor de esa cookie a la variable favLang utilizando tempCookie.getValue(). Luego, se sale del bucle utilizando break
  - - Printea diferente información según el lenguaje favorito de cada persona
  - - Tiene un link al form html para establecer el lenguaje por defecto que quiere que se almacene en la cookie, así que puede personalizar la página

- **cookies-personalize-form.html:**
Es un html que tiene un form con un dropdown (<select name="favoriteLanguage">) que es el que guarda los datos en el jsp cookies-personalize-response.jsp
  
