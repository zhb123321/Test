var va = new Vue({
	el : '#test',
	data : {
		pages : {},
		user:{}
	},
    filters: {
        formatDate(time) {
        var date = new Date(time);
        return formatDate(date, 'yyyy-MM-dd');
       }
    },
	mounted:function(){ 
		this.$http.get('http://localhost:8070/index.action').then(
				function(res) {
					this.pages = res.data
					this.user=res.data.user
					console.log(this.pages)
				}, function() {
					console.log('请求失败处理');
				}
				);
		} ,
		
	});
