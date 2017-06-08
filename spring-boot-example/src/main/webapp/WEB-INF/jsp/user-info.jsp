<<<<<<< HEAD
<%--
  Created by IntelliJ IDEA.
  User: aleksandr
  Date: 02.06.17
  Time: 12:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
html>
<head>
  <title>User info</title>
</head>
<body>


<img src="/resources/photo_not_available.png" alt="User avatar">
=======
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <title>User info</title>
</head>
<body>

<img src="/resources/unknown-person.gif" alt="user-avatar"></img>
>>>>>>> 09a3f37df822c7995da72fbfd94d291b77db942c

<input id="user-avatar" type="file">
<button onclick="uploadFile()">Upload</button>

<script>
<<<<<<< HEAD

  function uploadFile() {
    var input = document.querySelector('input[type="file"]');

    var data = new FormData();
    data.append('file', input.files[0]);

    console.log("send document with size:" + input.files[0].size + "b to server");
    fetch('http://localhost:8080/user/avatar', {
      method: 'POST',
      body: data
    })
        .then(response => console.log(response))
  .catch(error => console.error(error));


//    let file = document.getElementById("user-avatar").files[0];
//
//    fetch("http://localhost:8080/user/avatar",
//          {
//            headers: new Headers({
//              "Content-Type": "multipart/form-data"
//            }),
//            method: "post",
//            body: file
//          }
//    )
//        .then(response => response.json())
//  .then(function(response) {
//      console.log(response);
//    })
//       .catch(error => console.error(error))

  }
</script>

</body>
</html>
=======
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
>>>>>>> 09a3f37df822c7995da72fbfd94d291b77db942c
