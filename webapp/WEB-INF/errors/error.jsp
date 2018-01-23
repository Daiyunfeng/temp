<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>error系统错误</title>
</head>
<body>
	<div style="text-align: center;">
		<table align="center" style="text-align: center; margin-top: 150px;">
			<tr>
			</tr>
			<tr>
				<td style="text-align: center; margin-top: 20px;">访问错误
					<p>${msg}</p>
					<p style="color: #666666; font-family: Tahoma, '宋体'; font-size: 18px; text-align: center;">
						<a href="javascript:history.go(-1);">返回</a>
					</p>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>