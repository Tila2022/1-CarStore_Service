<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>{Данные по 1 машине}</title>
    <link href="style.css" rel="stylesheet" type="text/css">
    <title>Вход в каталог</title>
</head>
<body>
<div id="content" style="width: 800px; margin: 0 auto;">
    <h1>Вход в каталог автомобилей</h1>
    <h2>Введитве ваши данные</h2>
    <foam method="post">
        <label>
            <input type="email" name="email" placeholder="Почта">
        </label>
        <lable>
            <input type="Password" name="password" placeholder="Пароль">
        </lable>
        <input type="submit" value="Вход">
    </foam>
    <br>
    <br>
    <font size="5">
        <a href="http://localhost:8080/Catalog" title="Залетаем">Войти в учётную запись</a>
    </font>
</div>
</body>
</html>