$(function() {
	$('#userTableId').bootstrapTable({
	    url: '/selectAll',        // 表格数据来源
	    columns: [{
	        field: 'id',
	        title: '编号'
	    }, {
	        field: 'name',
	        title: '姓名'
	    }, {
	        field: 'age',
	        title: '年龄'
	    },{
	        field: 'email',
	        title: '邮箱'
	    },{
	        field: 'operator',
	        title: '操作',
	        align: 'center',
	        valign: 'middle',
	        formatter: "operateFormatter"
	    }]
	});
})

function operateFormatter(value, row, index) {
	return '<a href="/editUser?id='+row.id+'" title="修改">修改</a>&nbsp;&nbsp;<a href="/deleteUserById?id='+row.id+'" title="删除">删除</a>';
}

