Feature: Application Login
  
#Scenario for regular expression in feature file
#Scenario1: Home Page default login
#Given  User is on net banking landing page
#When User login into application with username and password
#Then Home page is displayed
#And Cards are displayed


#Scenario for reuse functions with different data 
#Scenario2: Home Page default login
#Given  User is on net banking landing page
#When User login into application with username "rhl6555@gmail.com" and password "9700009142"
#Then Home page displayed was displayed "true"
#And Cards was displayed "true" 


#Scenario: Home Page default login
#Given  User is on net banking landing page
#When User login into application with username "rhl6555" and password "9700009142"
#Then Home page displayed was displayed "false"
#And Cards was displayed "false"


#Scenario for Data Table as Data Driven
#Scenario3: Home Page default login
#Given  User is on net banking landing page
#When User login into application with username and password
#|rhl6555@gmail.com | 9700009142 |
#Then Home page id displayed

#Scenario for parameterization
@RegTest
Scenario Outline: Home Page default login
Given  User is on net banking landing page
When User login into application with <username> and <password>
Then Home page is displayed


Examples:
| username | password |
| rhl6555@gmail.com | 9700009142 |
| rhl6555@gmail.com | 9700009140 |


