<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>
<form action="login" method="post">
<tr><td>${message}</td></tr>
 <tr><td>${sucessMessage}</td></tr>
		
<div class="login-wrap">
	<div class="login-html">
		<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Sign In</label>
		<input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Sign Up</label>
		<div class="login-form">
		
			<div class="sign-in-htm">
				<div class="group">
					<label for="user" class="label">Username</label>
					<input name="username" id="username" type="text" class="input">
				</div>
				<div class="group">
					<label for="pass" class="label">Password</label>
					<input name="password1" id="password1" type="password" class="input" data-type="password">
				</div>
				<div class="group">
					<input id="check"  name="keepSignIn" type="checkbox" class="check" checked>
					<label for="check" ><span class="icon" ></span> Keep me Signed in</label>
				</div>
				<div class="group">
					<input type="submit" class="button" name="submit" value="login">
				</div>
				<div class="hr"></div>
				<div class="foot-lnk">
					<a href="forgotPass.jsp">Forgot Password?</a>
				</div>
			</div>
			<div class="sign-up-htm">
				<div class="group">
					<label for="user" class="label">First Name</label>
					<input id="first_name" name="first_name" type="text" class="input">
				</div>
					<div class="group">
					<label for="user" class="label">Last Name</label>
					<input id="last_name" name="last_name" type="text" class="input">
				</div>
				<div class="group">
					<label for="pass" class="label">Password</label>
					<input id="password" type="password" name="password" class="input" data-type="password">
				</div>
			
				<div class="group">
					<label for="pass" class="label">Address</label>
					<input id="address" type="text" name="address" class="input">
				</div>
				<div class="group">
					<label for="pass" class="label">Contact No</label>
					<input id="contact" type="number" name="contact" class="input">
				</div>
				<div class="group">
					<input type="submit" class="button" name="submit" value="register">
				</div>
				<div class="hr"></div>
				<div class="foot-lnk">
					<label for="tab-1">Already Member?</a>
				</div>
			</div>
		</div>
	</div>
</div>
</form>
</body>
</html>


