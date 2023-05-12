<%@ page pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <title>SD17321 - Login Page</title>
</head>
<body>
    <form action="/login" method="POST">
        <div>
            <label>Email</label>
            <input type="email" name="email" />
        </div>
        <div>
            <label>Password</label>
            <input type="password" name="password" />
        </div>
        <div>
            <input type="checkbox" name="remember" />
            <label>Ghi nhớ đăng nhập</label>
        </div>
        <div>
            <button>Login</button>
        </div>
    </form>
</body>
</html>
