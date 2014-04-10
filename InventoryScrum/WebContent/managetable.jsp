<%@ include file="/header.jsp" %>
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