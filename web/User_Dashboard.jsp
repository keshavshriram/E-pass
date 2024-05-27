<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js">
        </script>

        <script type="text/javascript">

        </script>

        <title>E-Pass Registration</title>

        <style type="text/css">
            .abc{
                padding: 5px;
                background: linear-gradient(to left, gold, limegreen);
                color: white;
            }
            #tagline{
                color: #000123;
                margin-top: -15px;
                font-size: 15px;
                font-style: italic;
            }
            .form{
                width: 30%;
                padding: 20px;
                background-color: gold;
                font-family: Arial;
                font-size: 12px;
                float: right;
                margin-top: 10%;
                border-radius: 10px;
            }
            .heading{
                color: limegreen;
                font-family: Arial;
            }
            a{
                color: white;
            }
            a:hover{
                color: #000123;
                text-decoration: none;
            }
            .btn{
                font-size: 18px;
            }
            .well{
                background-color: gold;
                color: white;
                font-size: 20px;
                text-align: center;
                box-shadow: 2px 2px rgba(0,0,0,0.3);
            }
            .well{
                box-shadow: 2px 2px rgba(0,0,0,0.3);
            }
        </style>
    </head>
    <body>

        <%
            String session_username = (String) session.getAttribute("session_username");

            String session_password = (String) session.getAttribute("session_password");
            int session_user_id = (Integer) session.getAttribute("session_uid");

        %>

        <div class="jumbotron abc">
            <h3>E-Pass Traveller</h3>
            <p id="tagline">Govt. Authorised E-Pass Services</p>
            <h3>Welcome <% out.print(session_username);%> For E Travel Pass</h3>
        </div>

        <div class="container">
            <div class="row">
                <div class="col-sm-3">
                    <div class="well">
                        <a href="ApplyForEPass.html">Apply For E Pass</a>
                    </div>
                </div>
                <div class="col-sm-3">
                    <div class="well">
                        <a href="DisplayApprovalPassStatus">E Pass Approval Status</a>
                    </div>
                </div>
                <div class="col-sm-3">
                    <div class="well">
                        <a href="EPassStatus">On Hold</a>
                    </div>
                </div>
                <div class="col-sm-3">
                    <div class="well">
                        <a href="EPassStatus">On Hold</a>
                    </div>
                </div>
            </div>
        </div>

    </body>
</html>