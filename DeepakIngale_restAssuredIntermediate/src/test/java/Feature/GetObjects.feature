

Feature: Verify objects API

  
  Scenario: Verify that user are able to get all objects  
    Given To get all object pass prerequisite like header
    When User hit URL to get objects
    Then User should get status code as 200 
    
    
    Scenario: Verify that user should be able to create object 
    Given To create object pass prerequisite like header and body 
    When User hit URL to create object
    Then User get status code as 201
    

   Scenario: Verify that user should be able to update object 
    Given To update object pass prerequisite like header and body 
    When User hit URL to update object
    Then User get status code as 200
    And User should get updated values in responce body 
    
    
    
   Scenario: Verify that user should be able to delete object 
    Given To get all object pass prerequisite like header
    When User hit URL to delete object
    Then User get status code 204
    
    
   
