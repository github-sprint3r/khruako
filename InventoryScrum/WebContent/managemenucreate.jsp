<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page contentType="text/html; charset=utf-8" language="java"
	import="java.sql.*" errorPage=""%>
<jsp:include page="header.jsp" />

<!-- CONTIANER CONTENT -->
      <div class="col-sm-8">

        <!-- ALERT -->
        <div class="alert alert-success"><h4>Well done!</h4> You successfully read this important alert message.</div>

        <!-- CONTENT -->
        <div class="font-color-gray">
          <p>
            <ul class="list-group">
              <li class="list-group-item">
                <h3>การจัดการเมนู</h3>
              </li>
              <li class="list-group-item">
                <form role="form">
                  <div class="form-group">
                    <label for="nameTh">ชื่อเมนู (TH)</label>
                    <input type="text" class="form-control" id="nameTh" placeholder="Menu Name EN">
                  </div>
                  <div class="form-group">
                    <label for="nameEn">ชื่อเมนู (EN)</label>
                    <input type="text" class="form-control" id="nameEn" placeholder="Menu Name EN">
                  </div>
                  <div class="form-group">
                    <label for="price">ราคา</label>
                    <input type="number" id="price">
                  </div>
                  <div class="checkbox">
                    <label>
                      <input type="checkbox"> Check me out
                    </label>
                  </div>
                  <button type="submit" class="btn btn-default">Submit</button>
                </form>
              </li>
            </ul>
          </p>
        </div>
      </div> <!-- END CONTIANER CONTENT -->

<jsp:include page="footer.jsp" />

