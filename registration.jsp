<%-- 
    Document   : index
    Created on : Sep 9, 2023, 9:55:48 AM
    Author     : Kapil Arya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <!-- <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/fontawesome.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
       --> 
       <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <link href="css/bootstrap.css" type="text/css" rel="stylesheet"/>
        <link rel="stylesheet" href="css/footer.css" type="text/css">
        <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    
        <script src="js/bootstrap.bundle.js"></script>
        <title>Online Examination System</title>
    </head>
    <body>
        <div class="container">
            
            <jsp:include page="header.jsp"/>
            
            
            
            
            
                <div class="row mt-2">
                    <div class="col-sm-4" style="min-height: 600px; background-color: aqua;"></div>
                    <div class="col-sm-8" style="min-height: 600px; background-color: aliceblue;">
                        
                        
                        <h2 style="text-align: center; color:blue; ">Student Registration</h2>
                        
                        <form action="controller.jsp" class="form-group" method="post">
                            <input type="hidden" name="page" value="registration">
                            <table class="table table-bordered" style="margin:auto; width:80%" >
                                
                                <tr>
                                   
                                    <td>Enter Roll no</td>
                                    
                                    <td>
                                        <input type="number"name="rollno" class="form-control" >
                                    </td>
                                    
                                                                           
                                   
                                    
                                </tr>
                                
                                <tr>
                                    <td>
                                        Enter Name
                                    </td>
                                    <td>
                                        <input type="text" name="name" class="form-control">
                                    </td>
                                </tr>
                                
                                <tr>
                                    <td>
                                        Enter Your Father Name
                                        
                                    </td>
                                    <td>
                                        <input type="text" name="fname" class="form-control">
                                    </td>
                                    
                                </tr>
                                
                                <tr>
                                    <td>
                                        Enter Your Mother Name
                                    </td>
                                    <td>
                                        <input type="text" name="mname" class="form-control">
                                    </td>
                                    
                                </tr>
                                
                                <tr>
                                    <td>
                                        Select Gender
                                    </td>
                                    <td>
                                        <input type="radio" name="gender" value="Male" class="form-check-input">Male
                                        <input type="radio" name="gender" value="Female" class="form-check-input">Female
                                    </td>
                                    
                                </tr>
                                <tr>
                                    <td>
                                       Enter Address 
                                    </td>
                                    <td>
                                        <textarea name="address" class="form-control"></textarea>
                                    </td>
                                </tr>
                                
                                <tr>
                                    <td>
                                     Select Program   
                                    </td>
                                    <td>
                                        <select name="program" class="form-control">
                                            <option selected>--Select Program--</option>
                                            <option value="B.Tech.">B.tech.</option>
                                            <option value="M.Tech.">M.Tech.</option>
                                            <option value="Diploma">Diploma</option>
                                        </select>
                                    </td>
                                </tr>
                                
                                <tr>
                                    <td>
                                        Select  Branch
                                    </td>
                                    <td>
                                        <select name="branch" class="form-control">
                                            <option selected>--Select Branch--</option>
                                            <option value="CS">CS</option>
                                            <option value="IT">IT</option>
                                            <option value="EC">EC</option>
                                            <option value="EE">EE</option>
                                        </select>
                                    </td>
                                </tr>
                                
                                <tr>
                                    <td>
                                        Select Year
                                    </td>
                                    <td>
                                        <select name="year" class="form-control">
                                            <option selected>--select year--</option>
                                            <option value="First Year">First Year</option>
                                            <option value="Second Year">Second Year</option>
                                            <option value="Third Year">Third Year</option>
                                            <option value="Final Year">Final Year</option>
                                        </select>
                                    </td>
                                </tr>
                                
                                <tr>
                                    <td>
                                        Enter Contact no
                                    </td>
                                    <td>
                                        <input type="number" name="contactno" class="form-control">
                                    </td>
                                </tr>
                                
                                <tr>
                                    <td>
                                        Enter email address
                                    </td>
                                    <td>
                                        <input type="text" name="emailaddress" class="form-control">
                                    </td>
                                </tr>
                                
                                
                                <tr>
                                    <td>
                                        Enter Password
                                    </td>
                                    <td>
                                        <input type="password" name="password" class="form-control">
                                    </td>
                                </tr>
                                
                                <tr>
                                    <td>
                                        Re-enter Password
                                    </td>
                                    <td>
                                        <input type="password" name="confirmpassword" class="form-control">
                                    </td>
                                </tr>
                                
                                <tr>
                                    <td>
                                        
                                    </td>
                                    <td>
                                        <button type="submit" class="btn btn-success ">Register</button>
                                    </td>
>                                </tr>
                                
                                
                            </table>
                            
                            
                        </form>
                        
                    </div>
                </div><!--end of row-->
               
           
                
                
                
                <jsp:include page="footer.jsp"/>      
           
        </div><!--end of container-->
        
        
    </body>
</html>
