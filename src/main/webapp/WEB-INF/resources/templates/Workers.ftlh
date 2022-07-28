<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>{Рабочие в магазине}</title>
    <title>Рабочие</title>
</head>
<body>
<div id="content" style="width: 800px; margin: 0 auto;">
    <h1>Добавить работника магазина</h1>
    <form method="post" action="/users">
        <label>Имя:
            <input name="firstName" placeholder="Имя">
        </label>
        <label>Фамилия:
            <input name="lastName" placeholder="Имя">
        </label>
        <input type="submit" value="Добавить">
    </form>
</div>
</body>
</html>