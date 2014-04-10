<%@ page contentType="text/html; charset=utf-8" language="java"
	import="java.sql.*" errorPage=""%>	
<jsp:include page="header.jsp" />

<script type="text/javascript">
	$(document).ready(function(){
		$('div.btn-group-vertical[data-toggle-name="TableNo"]').each(function() {
			var name    = $(this).attr('data-toggle-name');
			$(this).find("button.btn").each(function(){
				var allBtn = $(".btnTableNo");
				$(this).on('click', function(){
					allBtn.removeClass('active');
				    $('input[name="' + name + '"]').val($(this).val());
				    if($(this).val() == $('input[name="' + name + '"]').val()) {
						$(this).addClass('active');
					}
				});
		    });
		});
		
		$("#Email").keypress(function(event) {
			if (event.keyCode == 10 || event.keyCode == 13) 
			event.preventDefault();
		});
		
		$("#btnSendEmail").on("click", function(){
			if($("#Email").val() == "") {
				alert("กรุณากรอก Email");
			}
			else if($("#Queue").val() == "") {
				alert("กรุณาระบุคิว");
			}
			else if (!validateEmail($("#Email").val()))
				alert("Email ไม่ถูกต้อง");
			else {
				var tableNo = $("#TableNo").val();
				if (tableNo == "0" || tableNo == "")
					alert("กรุณาเลือกโต๊ะ");
				else {
					$("#frmSendEmail").submit();
				}
			}
		});
	});
	
	function validateEmail(email) { 
	    var re = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
	    return re.test(email);
	}
	function CheckNum(){
		if (event.keyCode < 48 || event.keyCode > 57 || event.keyCode == 8){
		      event.returnValue = false;
	    	}
	}
</script>

<style>
	button.active {
		background: none;
		background-color: #F39C12 !important;
	}
	.btnTableGroup {
		width: 20%;
	}
</style>

<div class="col-md-9">
	<h3>ส่ง Email หาลูกค้า เมื่อถึงคิว</h3>
		<form method="get" class="form-horizontal well col-md-12" action="result.html" role="form" id="frmSendEmail">
			<div class="col-md-9 col-md-offset-1">
				<div class="form-group">
					<div class="col-md-4 text-right">
						<label for="Email">Email :</label>
					</div>
					<div class="col-md-5">
						<input type="text" class="input-sm form-control" name="Email" id="Email" />
					</div>
				</div>
				<div class="form-group">
					<div class="col-md-4 text-right">
						<label for="Queue">Queue :</label>
					</div>
					<div class="col-md-5">
						<input type="text" class="input-sm form-control" name="Queue" id="Queue" maxlength="4" onkeypress="CheckNum()" />
					</div>
				</div>
				<div class="form-group">
					<div class="col-md-4 text-right">
						<label for="TableNo">เบอร์โต๊ะ :</label>
					</div>
					<div class="col-md-8">
						<h5><b>โต๊ะสำหรับ 2 ท่าน</b></h5>
						<div class="btn-group-vertical btnTableGroup" data-toggle-name="TableNo">
							<button type="button" class="btn btn-primary btn-sm btnTableNo" value="2-01" id="b201">2-01</button>
							<button type="button" class="btn btn-primary btn-sm btnTableNo" value="2-02" id="b202">2-02</button>
							<button type="button" class="btn btn-primary btn-sm btnTableNo" value="2-03" id="b203">2-03</button>
							<button type="button" class="btn btn-primary btn-sm btnTableNo" value="2-04" id="b204">2-04</button>
							<button type="button" class="btn btn-primary btn-sm btnTableNo" value="2-05" id="b205">2-05</button>
							<button type="button" class="btn btn-primary btn-sm btnTableNo" value="2-06" id="b206">2-06</button>
							<button type="button" class="btn btn-primary btn-sm btnTableNo" value="2-07" id="b207">2-07</button>
							<button type="button" class="btn btn-primary btn-sm btnTableNo" value="2-08" id="b208">2-08</button>
							<button type="button" class="btn btn-primary btn-sm btnTableNo" value="2-09" id="b209">2-09</button>
							<button type="button" class="btn btn-primary btn-sm btnTableNo" value="2-10" id="b210">2-10</button>
						</div>
						<br>
						<h5><b>โต๊ะสำหรับ 4 ท่าน</b></h5>
						<div class="btn-group-vertical btnTableGroup" data-toggle-name="TableNo">
							<button type="button" class="btn btn-primary btn-sm btnTableNo" value="4-01" id="b401">4-01</button>
							<button type="button" class="btn btn-primary btn-sm btnTableNo" value="4-02" id="b402">4-02</button>
							<button type="button" class="btn btn-primary btn-sm btnTableNo" value="4-03" id="b403">4-03</button>
							<button type="button" class="btn btn-primary btn-sm btnTableNo" value="4-04" id="b404">4-04</button>
						</div>
						<br>
						<h5><b>โต๊ะสำหรับ 10 ท่าน</b></h5>
						<div class="btn-group-vertical btnTableGroup" data-toggle-name="TableNo">
							<button type="button" class="btn btn-primary btn-sm btnTableNo" value="10-01" id="b1001">10-01</button>
							<button type="button" class="btn btn-primary btn-sm btnTableNo" value="10-02" id="b1002">10-02</button>
						</div>
						<input type="hidden" name="TableNo" id="TableNo" value="0" />
					</div>
				</div>
			</div>
			<br>
			<div class="row">
				<button type="button" class="btn btn-primary col-md-offset-4 col-md-4" id="btnSendEmail">SEND EMAIL</button>
			</div>
		</form>
</div>
<jsp:include page="footer.jsp" />