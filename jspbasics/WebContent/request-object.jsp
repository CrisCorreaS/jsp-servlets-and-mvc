<html>
  <body>
    <h3>Objeto JSP Request</h3>

    Request user agent: <%= request.getHeader("User-Agent") %>

    <br /><br />

    Request language: <%= request.getLocale() %>

  </body>
</html>
