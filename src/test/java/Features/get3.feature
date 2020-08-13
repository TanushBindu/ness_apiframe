Feature: Performing GET & POST operation1

  Scenario: POST operation validation forCreate Single User endpoint
    Given user enter the base url and content type
     When user enters the "Create_Single_user" of POST http request and pass the json body
     Then user should get 201 as status code
  
 