var id=UrlParm.parm("bid");
var va = new Vue({
	el : '#test',
	data : {
		book :{},
	},
	mounted:function(){ 
		this.$http.get('http://localhost:8070/detail.action',{params:{bid:id},}
				).then(function(res) {
					this.book = res.data
					console.log(this.book);
				},function() {
					console.log('请求失败处理');
				}
				);
		} ,
		
	});
