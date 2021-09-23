<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/9/23 0023
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.4.1.js"></script>
    <script>

        $(function () {
            $("#btn").click(function () {
                /**
                 *$.post(url,数据(可以省略),success)
                 */
                $.post("${pageContext.request.contextPath}/a2", function (data) {
                    let html = "";
                    for (let i = 0; i < data.length; i++) {
                        html += "<tr>" +
                            "<td>" + data[i].name + "</td>" +
                            "<td>" + data[i].age + "</td>" +
                            "<td>" + data[i].sex + "</td>" +
                            "</tr>"
                    }
                    $("#context").html(html);
                })
            })
        })

    </script>
</head>
<body>
<input type="button" value="加载数据" id="btn">
<table>
    <tr>
        <td>姓名</td>
        <td>年龄</td>
        <td>性别</td>
    </tr>
    <tbody id="context">
    <%--数据在后台--%>
    </tbody>
</table>

</body>
</html>
