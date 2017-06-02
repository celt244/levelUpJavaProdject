<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <title>User info</title>
</head>
<body>

<img src="/resources/unknown-person.gif" alt="user-avatar"></img>

<input id="user-avatar" type="file">
<button onclick="uploadFile()">Upload</button>

<script>
    function uploadFile(){
        let file = document.getElementsById("user-avatar").value;

        fetch("http://localhost:8080/user/avatar",
                {
                    headers: new Headers({
                        "Content-Type" : "multipart/form-data"
                    }),
                    method: "post",
                    body : file
                }
        )
                .then(response => response.json())
                .then(function(response) {
                    console.log(response);
                })
                .cath(error => console.error(error))


    }
</script>

</body>
</html>