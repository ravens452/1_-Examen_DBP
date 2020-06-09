<span style="color: #000000;"><%@ page language="java" contentType="text/html; charset=ISO-8859-1"
                                       pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Login</title>

</head>

<body>
    <h1>Iniciar Sesion</h1>
    <form action="servlet" name="miFormulario" method="post" onsubmit="return validarFormulario(),comprobar()" >
        <p>
            <label for="CUI">CUI:</label>
            <input type="text" name="cui" id="CUI" maxlength="50" />
        </p>
        <p>
            <label for="pass">Contraseña:</label>
            <input type="password" name="pass" id="pass" maxlength="50" />
        </p>
        <input type="submit" value="Enviar">
    </form>

    <script src="Lab_2.js"></script>
</body>
</html>