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
        <div class="alert alert-success"><h4>Well done!</h4> You successfully read this important alert message.</div>
        <div class="font-color-gray">
          <p>
            </p><ul class="list-group">
              <li class="list-group-item">
                <h3>เพิ่มโต๊ะ</h3>
              </li>
              <li class="list-group-item">

            <form action="http://119.59.97.10/khruako/viewtable.jsp">


                    หมายเลขโต๊ะ :: 

                <input id="table_name" type="text" name="table_name"></input>
            </br>
          </br>
            จำนวนที่นั่ง ::
                <select id="seat" name="seat">
                <option value="2">2</option>
                <option value="4">4</option>
                <option value="6">6</option>
                <option value="10">10</option>
                <option value="12">12</option>
                </select> 
          </br>
          </br>
                <input class="btn btn-default" type="submit" value="สร้างโต๊ะ" name="submit_table" id="submit_table"></input>
            </form>
              </li>
            </ul>
          <p></p>
        </div>
      </div>
<%@ include file="/footer.jsp" %>