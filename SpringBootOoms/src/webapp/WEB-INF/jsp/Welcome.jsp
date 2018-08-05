<html>
<head>
<title>OnlineOrderManagementSystem</title>
<script type="text/javascript"></script>
<script>
$(function(){
var products[];
$.getJson('products.json',function(data)){
	$.each(data.records,function(i,f)){
		var tblRow="<tr>"+"<td>"+productId+"</td>"+"</tr>"
		$(tblrow).appendTo("#userdata tbody");
	});
});	
});	
</script>
</head>
<body>
<form>
<table id="Products" border=1>
<tr>
<th>ProductId</th>
<th>ProductImage</th>
<th>ProductName</th>
<th>ProductDescription</th>
<th>ProductPrice</th>
<th>ProductQuantity</th>
</tr>
</table>
</form>
</body>
</html>