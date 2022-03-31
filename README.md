# Type-Cricket-Java

## Description: <br>
Fun application made using MVC model as a part of the OOADJ course at PES University. Swing GUI was used for front-end and PostgreSQL was used as the database.

## How to run this application?
+ Firstly create a database and name it _typecricket_.
+ Now create a new table in this database using the below command:<br>

  > create table results(<br>
    > date varchar primary key, <br>
    > result varchar);<br>
  
+ In the **Model.java** file, change the database name in the _writeToDataBase()_ function.
+ Make sure the JDBC jar file is in the same directory as the _App.java_ file.
+ To run the application, use the below command:<br>

  > javac App.java<br>
  > java -cp "<_Full path of the jar file_>;<_Full path of the current directory_>" App<br>

## Features of the applications:
+ You have been put into bowl first. Skittle out the opponent and become the hero by winning the match. Everything depends on you! No pressure :)
+ In case you don't want to bowl or have been bowling for a while, you can choose to bat by changing the innings. But this would mean that you have up and The computer felt bad for you and accepted to declare. :P
+ There are 3 results: _WIN_, _LOSE_ and _DRAW_.
+ Whenever a result is achieved, a record of the _date_ and _result_ is added to the _results_ table in the _typecricket_ database.

## Screenshots:
Here are a few screenshots. All of the screenshots can be viewed in the [Screenshots](https://github.com/archit-sagar/Type-Cricket-Java/tree/main/Screenshots) folder.

![Setup](https://github.com/archit-sagar/Type-Cricket-Java/blob/main/Screenshots/setup.jpg)<br><br>
![Change Innings](https://github.com/archit-sagar/Type-Cricket-Java/blob/main/Screenshots/changeinningsout.jpg)<br><br>
![Player Won](https://github.com/archit-sagar/Type-Cricket-Java/blob/main/Screenshots/playerwon.jpg)<br>
