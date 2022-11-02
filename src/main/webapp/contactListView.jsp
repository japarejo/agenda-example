<!--  header -->
<%@include file="includes/header.jsp"%>

<body>
	<h1>Contact Book</h1>

	<div class="container">
	
		<p>${message}</p>
				
		<table id="agenda">
			<tr>
				<th>Name</th>
				<th>Phone number</th>
				<th>Actions</th>
			</tr>

			
				<tr>
					<td>Dummy contact</td>
					<td>XXXXXXXXXXXXXX</td>
					<td><a href=""><img src="./images/edit.png" width="30px"></a> 
						<a href=""><img src="./images/delete.png" width="30px"></a></td>
				</tr>			
		</table>
		<div class="bottom_links">
			<a href="contactEditView.jsp" class="button">New contact</a>
		</div>
	</div>

	<!-- footer -->
	<%@include file="includes/footer.jsp"%>