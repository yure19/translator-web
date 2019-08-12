<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
</head>
<body>
<form:form method="POST" action="${pageContext.request.contextPath}/" modelAttribute="input">
    <table>
        <tr>
            <td><form:label path="source">Source:</form:label></td>
            <td><form:input path="source"/></td>
        </tr>
        <tr>
            <td><form:label path="target">Target:</form:label></td>
            <td><form:input path="target"/></td>
        </tr>
        <tr>
            <td><form:label path="esPhrase">EsPhrase:</form:label></td>
            <td><form:input path="esPhrase"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Translate"/></td>
        </tr>
        <tr>
            <td><h4>Translated to English: ${enPhrase}</h4></td>
        </tr>

    </table>
</form:form>
</body>
</html>
