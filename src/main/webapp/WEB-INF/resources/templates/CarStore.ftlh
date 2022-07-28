<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>{Данные по 1 машине}</title>
    <link href="style.css" rel="stylesheet" type="text/css">
</head>
<body>
<div id="content" style="width: 800px; margin: 0 auto;">
    <h1>Подробная информация по авто</h1>
    <font size="5">
        <a href="http://localhost:8080/Catalog" title="Вернуться в общий каталог">Вернуться в главный каталог</a>
    </font>
    <h2>Фото авто</h2>
    <#list car as car>
    <img src=${car.img} align="top" vspace="10"
         border="3" alt="">
    </#list>
    <h2>Общие данные о машине</h2>
    <font size="5">
        <#list car as car>
            <th>Номер машины</th>
            <tr>${car.carId}</tr>
            <br>
            <th>Производитель</th>
            <tr>${car.manufacturer}</tr>
            <br>
            <th>Модель</th>
            <tr>${car.model}</tr>
            <br>
            <th>Пробег</th>
            <tr>${car.mileage}</tr>
            <th> км</th>
            <br>
            <th>Цена</th>
            <tr>${car.price}</tr>
            <th> рублей</th>
            <br>
            <th>Год</th>
            <tr>
                <#setting number_format="####">
                ${car.year}
            </tr>
            <br>
        </#list>
    </font>
    <h2>Характеристики машины</h2>
    <font size="5">
        <#list specifications as specifications>
            <th>Данные по</th>
            <tr>${specifications.indicatorNumbers}</tr>
            <th> машине</th>
            <br>
            <th>Цвет -</th>
            <tr>${specifications.colour}</tr>
            <br>
            <th>Двигатель -</th>
            <tr>${specifications.engine}</tr>
            <th> л</th>
            <br>
            <th>Мощность -</th>
            <tr>${specifications.power}</tr>
            <th> л.с.</th>
            <br>
            <th>Коробка передач -</th>
            <tr>${specifications.transmission}</tr>
            <br>
            <th>Привод -</th>
            <tr>${specifications.drive}</tr>
            <br>
            <th>Подвестка -</th>
            <tr>${specifications.pendant}</tr>
            <br>
            <th>Комплектация -</th>
            <tr>${specifications.kit}</tr>
        </#list>
    </font>
</div>
</body>
</html>