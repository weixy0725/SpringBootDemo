/**
 * JavaScript示例
 */
function exampleFun() {
	var name = $("#name").val();
	$.ajax({
		url : "http://10.170.7.26:8080/services/login/loginAuth",
		data : {
			phone : "15652356603",
			password:"888"
		},
		type : "POST",
		dataType : "json",
		success : function(data) {
			if (data.result.code == 0) {
				console.log(data);
				alert("存储成功！");
			} else {
				alert('存储失败！');
			}
		},
		error : function(data) {
			alert('系统错误(INDEXSYS001)，请联系系统管理员');
		}
	});
}