<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- IMPORTAR ETIQUETAS DE STRUTS Y ETIQUETAS DE JAVA SCRIPT -->
<%@ taglib prefix="s" uri="/struts-tags" %> 
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %> 

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Reporte</title>
</head>
<s:head />
<sx:head />
<body>

	<sx:tabbedpanel id="formAltaReporte">
		<sx:div label="Formulario Alta - Reporte">
			<s:form action="alta.action" method="post">
				<s:textfield key="tipo" label="Tipo" />
				<sx:datetimepicker key="fecha" label="Fecha" displayFormat="dd/MM/yyyy" />
				<s:textarea key="comentario" label="COMENTARIO" />
				<s:submit value="Enviar Datos" />
			</s:form>
		</sx:div>
	</sx:tabbedpanel>

</body>
</html>