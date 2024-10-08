<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">
    <link rel="stylesheet" href="css/login.css">
  <!--   --> 
<body style="background-color: antiquewhite">
<%@ include file="../frontincludes/epicerNavbar.jsp" %>
    <div class="container">
<div class="forms">
<div class="form loign">
<span class="title">Login</span>
<form action="userlogin" method="post">
    <div class="inputfeild">
        <input type="text" name="account" id="account" value="${account}" required>
        <i class="uil uil-envelope-alt icon"></i>
    </div>
    <span id="sp1" class="msg"></span>
     <span class="msg">${msga.getMessage()}</span><br>
    <div class="inputfeild">
        <input type="password" name="password" id="password" value="${pasword}" required>
        <i class="uil uil-padlock"></i>
        <i class="uil uil-eye-slash showhidepw"></i>
    </div>
     <span class="msg">${msgp.getMessage()}</span><br>
    <span id="sp2" class="msg"></span>
    <div class="checkboxtext">
        <div class="checkboxcontent">
            <input type="checkbox" id="logcheck">
            <label for="logcheck" class="text">Remember Me</label>
        </div>
        <a fref="#" class="text">Forget Password?</a>
    </div>
    <div class="inputfeild button">
        <input type="submit" value="Login Now">
    </div>
</form>
<div class="loginsignup">
    <span class="text">Not A Member</span>
    <a href="form" class="text signuptext">Sign Up Now</a>
</div>
<div class="loginsignup">
    <span class="text" ><form action="forgetpassword" name="forgetpassword" method="post"><a href="javascript:document.forgetpassword.submit();" class="text signuptext" style="color:blue;font-weight:bold">忘記密碼</a></span>
</div>
</div>
</div>
</div>
<script src="js/jquery-3.6.0.js"></script>
<script src="js/login.js"></script>
</body>
</html>