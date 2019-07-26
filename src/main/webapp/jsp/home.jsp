<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
 <link href="" rel="stylesheet">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>

         <div style="margin-top:30px ;" class="container">
             <nav style="color : white ; " class="navbar navbar-expand-lg navbar-light border border-secondary rounded  ">
               <a style="margin-left:30px ; font-family: 'Times New Roman', Times, serif ; " class="navbar-brand" href="/">CODEFORCES </a>
               <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
                 <span class="navbar-toggler-icon"></span>
               </button>
               <div class="collapse navbar-collapse" id="navbarText">
                 <ul class="navbar-nav ml-auto mt-2 mt-lg-0">
                   <li class="nav-item">
                     <form class="form-inline" action="/profile">
                           <input style="margin-top:10px ;" class="form-control mr-sm-2" type="text" name="id" placeholder="Search">
                           <button style="margin-top:10px ;" class="btn btn-outline-dark" type="submit">Profile</button>
                      </form>
                   </li>
                 </ul>

               </div>
             </nav>
         </div>

      <div style=" margin-top: 50px ; text-align : center ;" class="container border border-secondary rounded ">
             <h2 style="color: gold ;margin-top: 20px ;">Upcoming Contest</h2>
             <table class="table table-striped">
               <thead>
                 <tr>
                     <th>Id</th>
                     <th>Name</th>
                     <th>Type</th>
                     <th>Duration(hr)</th>
                     <th>Date</th>

                 </tr>
               </thead>
               <tbody>
                    < c:forEach var="codeforce" items="${codeforces}">
                        <c:if test="${codeforce.phase == 'BEFORE'}">
                            <tr>
                                <td>${codeforce.id}</td>
                                <td>${codeforce.name}</td>
                              	<td>${codeforce.type}</td>
                              	<td>${codeforce.duration}</td>
                              	<td>${codeforce.date}</td>
                            </tr>
                        </c:if>
                    </c:forEach >
               </tbody>
             </table>
         </div>


	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>