Feature: Automate the automation page

  Scenario Outline: Automate the Registeration page
    Given User Enter the "<fname>","<lname>","<add>","<email>","<phone>" and Select the Gender and Hobbies
    When User Enter the "<pass>","<cpass>"
    Then click on the Summit button and check WebTable is in the url

    Examples: 
      | fname   | lname | add     | email         | phone       | pass   | cpass  |
      | karthi  | D     | Chennai | kit@gmail.com |   987654321 |  12345 |  12345 |
      | hjgshjd | S     | mumbai  | ghf@gmail.com | 98543745647 | 123456 | 123456 |
