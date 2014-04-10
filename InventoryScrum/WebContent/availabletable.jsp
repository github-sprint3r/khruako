<%@page import="javax.management.modelmbean.RequiredModelMBean"%>
<%@page import="com.reserve.database.model.TableData"%>
<%@page import="java.util.ArrayList"%>
<%@ include file="header.jsp"%>

<!-- CONTENT -->
<div class="col-sm-8">
	<div class="alert alert-success">
		<h4>Well done!</h4>
		You successfully read this important alert message.
	</div>
	<div class="font-color-gray">
		<p>
		<ul class="list-group">
			<li class="list-group-item">
				<h3>จองทางโทรศัพท์</h3>

			</li>
			<li class="list-group-item">
				<button id="reserve-button-1" type="button"
					class="btn btn-default btn-lg pull-right reserve-button">
					<a id="get_table" href="./GetAvailableTable">โชว์โต๊ะว่าง</a>
				</button>
			</li>
			<li>
		<%
				ArrayList<TableData> tableList = (ArrayList<TableData>)request.getAttribute("table_list");
				if(tableList != null) {
					 for(TableData table : tableList) {
			%>
			<div class="panel panel-default">
				<div class="panel-body">
					<div class="col-xs-8" style="font-size: 20px;">โต๊ะ <%=table.getNumber() %></div>
					<div class="col-xs-4">
						<button id="reserve-button-<%=table.getId() %>" type="button"
							class="btn btn-default btn-lg pull-right reserve-button" onclick="reserveTable(<%=table.getId() %>,2)">
							<span class="glyphicon glyphicon-glass"></span>จอง
						</button>
					</div>
				</div>
			</div>
			<%
					}
				}
			%>
			</li>
		</ul>
		</p>
	</div>
</div>

<script type="text/javascript">
	function reserveTable(tableId, amount) {
		$('.reserve-button').post('./ReserveTable', {dining_table_id: tableId, amount: amount});
	}
</script>


<%@ include file="footer.jsp"%>