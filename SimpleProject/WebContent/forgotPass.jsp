<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="css/style.css" />

</head>
<body> 
 <div class="form-gap"></div>
<div class="container">
	<div class="row">
		<div class="col-md-4 col-md-offset-4">
            <div class="panel panel-default">
              <div class="panel-body">
                <div class="text-center">
                  <h3><i class="fa fa-lock fa-4x"></i></h3>
                  <h2 class="text-center">Forgot Password?</h2>
                  <p>You can reset your password here.</p>
                  <p>${failuerMessage}</p>
                  <div class="panel-body">
    
                    <form id="register-form" role="form" autocomplete="off" class="form" action="login" method="post">
    
                   <div class="form-group">
                        <div class="input-group">
                          <span class="input-group-addon"><i class="fa fa-phone fa-1.6x"></i></span>
                          <input id="phoneNo" name="phoneNo" placeholder="phone no" class="form-control"  type="number" required>
                        </div>
                      </div>
                      <div class="form-group">
                        <div class="input-group">
                          <span class="input-group-addon"><i class="fa fa-lock fa-1.6x"></i></span>
                          <input id="rpassword" name="rpassword" placeholder="password" class="form-control"  type="password" required>
                        </div>
                      </div>
                      <div class="form-group">
                        <input  class="btn btn-lg btn-primary btn-block" name="submit" value="Reset Password" type="submit">
                      </div>
                      
                    
                    </form>
    
                  </div>
                </div>
              </div>
            </div>
          </div>
	</div>
</div>




</body>
</html>