<html>
<head>
    <title>Login Page - JSP</title>
</head>
    <body>
        Welcome to the Login Page!
        <pre>${errorMessage}</pre>
        <form method="POST">
            Name: <input type="text" name="name">
            Password: <input type="password" name="password">
            <input type="submit">
        </form>
    </body>
</html>