$(function () {
		$("input[class='confirm']").click(function(){
			var frm=new FormData(document.getElementById("form-login"));
			$.ajax({
				url:"loginName.action",
				data:frm,
				type:"post",
				dataType:"json",
				processData:false,
			    contentType:false,
			    success:function(res){
			    	 // 后台传过来的数据
					if (res.right=="No") {
						location.href="index.html";
					}else{			
						$("#errhint").text(res.error)
					}
			    }
			})
			
		})
	});