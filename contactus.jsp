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
                        
                        <h2 style="text-align: center; color:blue;">Enquiry Form</h2>
                        <form action="controller.jsp" class="form-group" method="post">
                            <input type="hidden" name="page" value="contactus">
                            <table class="table">
                                <tr>
                                    <td>Enter Name</td>
                                    <td><input type="text" name="name" class="form-control"></td>
                                </tr>
                                
                                
                                <tr>
                                    <td>Enter Gender</td>
                                    <td>
                                    <input type="radio" name="gender" class="form-check-input" value="Male">Male
                                    <input type="radio" name="gender" class="form-check-input" value="Female">Female
                                    </td>
                                </tr>
                                
                                <tr>
                                    <td>Enter Address</td>
                                    <td><textarea name="address" class="form-control"></textarea></td>
                                </tr>
                                <tr>
                                    <td>
                                        Enter Contact No
                        
                                    </td>
                                    <td>
                                        <input type="number" name="contactno" class="form-control">
                                    </td>
                                    
                                </tr>
                                
                                
                                <tr>
                                    <td>
                                        Enter Email Address
                        
                                    </td>
                                    <td>
                                        <input type="text" name="emailaddress" class="form-control">
                                    </td>
                                    
                                </tr>
                                
                                <tr>
                                    <td>
                                        Enter enquiry Text
                        
                                    </td>
                                    <td>
                                        <textarea name="enquirytext" class="form-control"></textarea>
                                    </td>
                                    
                                </tr>
                                
                                <tr>
                                    
                                    <td></td>
                                    <td>
                                        <button class="btn btn-success">Submit</button>
                                    </td>
                                </tr>
                                
                                
                            </table>
                            
                            
                        </form>
                        
                    </div>
                </div><!--end of row-->
               
           
                
                
                
                <jsp:include page="footer.jsp"/>      
           
        </div><!--end of container-->
        
        
    </body>
</html>
