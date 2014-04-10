<%@ page contentType="text/html; charset=utf-8" language="java"
	import="java.sql.*" errorPage=""%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Khruako</title>

    <!-- Bootstrap -->
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="bootstrap/css/khruako.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
  </head>
  <body>

    <!-- NAVBAR -->
    <nav class="navbar navbar-default bg-white" role="navigation">
      <div class="container-fluid">
        <!-- BRAND -->
        <div class="navbar-header">
          <a class="navbar-brand" href="#">Khruako</a>
        </div>
      </div>
    </nav>

    <!-- Container -->
    <div class="container">

      <!-- SIDE BAR -->
      <div class="col-sm-3">

        <!-- ACCOUNT -->
        <div class="sidebar-account font-color-gray">
            <img class="center-block img-rounded" src="http://img1.wikia.nocookie.net/__cb20110511030604/mioakiyama/images/b/b7/-animepaper.net-avatar-standard-anime-k-on!-k-on!-avatar-192685-mayuuki-preview-38c5801f.jpg" height="75" width="75">
            <h2 class="text-center">Name</h2>
        </div>

        <!-- MENU -->
        <div class="btn-group-vertical btn-block sidebar-menu">
          <button type="button" class="btn btn-default font-color-gray" onclick="location.href='notify.jsp'"> แจ้งคิวว่าง
            <span class="glyphicon glyphicon-chevron-right pull-right"></span>
          </button>
          <button type="button" class="btn btn-default font-color-gray" onclick="location.href='availabletable.jsp'"> โทรจองโต๊ะ
            <span class="glyphicon glyphicon-chevron-right pull-right"></span>
          </button>
          <button type="button" class="btn btn-default font-color-gray"> การจัดการโต๊ะ
            <span class="glyphicon glyphicon-chevron-right pull-right"></span>
          </button>
          <button type="button" class="btn btn-default font-color-gray"> การจัดการเมนู
            <span class="glyphicon glyphicon-chevron-right pull-right" onclick="location.href='managemenu.jsp'"></span>
          </button>
          <button type="button" class="btn btn-default font-color-gray"> Inventory
            <span class="glyphicon glyphicon-chevron-right pull-right"></span>
          </button>
        </div>

        <!-- FOOTER -->
        <div class="sidebar-footer font-color-gray bg-white">
          © 2557 ครัวกู ของกู
        </div>

      </div>

    <!-- CONTENT -->
      <div class="col-sm-8">
        <div class="font-color-gray">
          <p>
            </p><ul class="list-group">
              <li class="list-group-item">
                <h3>การจัดการโต๊ะ</h3>
              </li>
              <li class="list-group-item">
                <label>โต๊ะขนาด 2 ที่นั่ง</label>
                <ul>
                  <li>2-1</li>
                  <li>2-2</li>
                  <li>2-3</li>
                  <li>2-4</li>
                  <li>2-5</li>
                  <li>2-6</li>
                  <li>2-7</li>
                  <li>2-8</li>
                  <li>2-9</li>
                  <li>2-10</li>
                </ul>
              </li>
              <li class="list-group-item">
                <label>โต๊ะขนาด 4 ที่นั่ง</label>
                <ul>
                  <li>4-1</li>
                  <li>4-2</li>
                  <li>4-3</li>
                  <li>4-4</li>
                  <li>4-5</li>
                </ul>
              </li>
              <li class="list-group-item">
                <label>โต๊ะขนาด 6 ที่นั่ง</label>
              </li>
              <li class="list-group-item">
                <label>โต๊ะขนาด 8 ที่นั่ง</label>
              </li>
              <li class="list-group-item">
                <label>โต๊ะขนาด 10 ที่นั่ง</label>
                <ul>
                  <li>10-1</li>
                  <li>10-2</li>
                </ul>
              </li>
              <li class="list-group-item">
                <label>โต๊ะขนาด 12 ที่นั่ง</label>
              </li>
            </ul>
          <p></p>
        </div>
      </div>
</div>
<%@ page contentType="text/html; charset=utf-8" language="java"
	import="java.sql.*" errorPage=""%>

  </body>
</html>