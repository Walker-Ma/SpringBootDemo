$(function() {
	var id = getParameterByName("id");
	if(!id) {
		return;
	}
	$.ajax({
		url : "/findUserById",
		type : "post",
		data : {
			id : id
		},
		dataType : "json",
		success : function(result) {
			$("[name=id]").val(result.id);
			$("[name=name]").val(result.name);
			$("[name=age]").val(result.age);
			$("[name=email]").val(result.email);
		}
	});
})

/**
 * 从URL中获取参数值
 * 
 * @param name
 *            参数名称
 * @returns 参数值
 */
function getParameterByName(name) {
	var match = RegExp('[?&]' + name + '=([^&]*)').exec(window.location.search);
	return match && decodeURIComponent(match[1].replace(/\+/g, ' '));
}
