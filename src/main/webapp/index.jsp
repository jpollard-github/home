<%@page import="java.time.LocalDate"%>
<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<!DOCTYPE html>
<html>
    <head>
        <title>jason-pollard.com | Home</title>
        <link rel="stylesheet" type="text/css" href="css/index.css" />
        <link rel="shortcut icon" href="img/favicon.ico" />
    </head>
    <body>
        <main id="container">
            <header id="header">Welcome to jason-pollard.com!</header>
            <div id="content">
                <section>
                    <a href="blog">Blog</a>
                    <a href="youtube">Youtube Channel</a>
                    <a href="book">Java Book</a>
                    <a href="about">About Me</a> 
                </section>
                <section>
                    <a href="https://twitter.com/8Junky" target="_blank">
                        <img class="small" alt="Twitters" src="img/Twitter_Social_Icon_Circle_Color.png" />
                        Twitter</a>
                </section>
                <section>
                    &COPY;&nbsp;Jason Pollard&nbsp;<%=LocalDate.now().getYear()%>
                </section>
            </div>
        </main>
    </body>
</html>
