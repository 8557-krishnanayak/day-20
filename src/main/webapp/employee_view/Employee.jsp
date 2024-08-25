<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<section>
	<%= request.getAttribute("list") %>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Dept</th>
		</tr>
		<c:forEach items="${list}" var="employee">
			<tr>
				<td>
					${employee.empId}
				</td>
				<td>
					${employee.name}
				</td>
				<td>
					<c:out value="${employee.dept}">default / dept</c:out>
				</td>
			</tr>
		</c:forEach>
	</table>
</section>
