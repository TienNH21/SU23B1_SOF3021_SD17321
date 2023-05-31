<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>SD17321 - CRUD Cua Hang</title>
    <%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
</head>
<body>
    <sf:form method="post" action="${ action }" modelAttribute="ch">
        <div>
            <label>Mã</label>
            <sf:input path="ma" />
            <div>
                <small><sf:errors path="ma" /></small>
            </div>
        </div>
        <div>
            <label>Tên</label>
            <sf:input path="ten" />
            <sf:errors path="ten" />
        </div>
        <div>
            <label>Địa Chỉ</label>
            <sf:input path="diaChi" />
        </div>
        <div>
            <label>Thành Phố</label>
            <sf:input path="thanhPho" />
        </div>
        <div>
            <label>Quốc gia</label>
            <sf:input path="quocGia" />
        </div>
        <div>
            <button>Thêm mới</button>
        </div>

    </sf:form>
</body>
</html>