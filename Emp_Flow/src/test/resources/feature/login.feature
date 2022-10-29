Feature: Apply Jobs in My Jobs Portal

  Scenario: Login Functionality
    Given user Launch The Application
    When click On The Popup button
    And click On The Hinto button
    And user Enter The Username In Username Field
    And user Enter The Password In Password Field
    Then click On The Signin button & Navigate To The Home Screen    
    
  Scenario: Language
    Given user Launch The Application  
    And Click On The Licon button
    And Click On The English button
    And Click On The Aicon button
    And Click On The Tamil button
    And Click On The Nicon button
    And Click On The Hindi button
    And Click On The Gicon button
    And Click On The Telugu button
    And Click On The Uicon button
    And Click On The Kannada button  
    
  Scenario: Change Password
    Given user Launch The Application
    When click On The Icon button
    And click On The Change Password button
    And user Enter The Current Password In Current Password Field
    When click On The Verify button   
    
  Scenario: View Profile
    Given user Launch The Application
    When click On The Icons button
    And click On The View Profile button
    And click On The Edit button
    And user Enter The Company Name In Company Name Field
    And user Enter The Mobile Number In Mobile Number Field
    And user Enter The Website In Website Field
    And user Enter The About In About Field
    And click On The Industry button
    And user Enter The Founded In Founded Field
    And Click On The Company Size button
    And user Enter The Address In Address Field
    And user Enter The Addresss In Addresss Field
    And click On The State button
    And click On The District button
    And click On The City button
    And click On The Document Name button
    And user Enter The Document Number In Document Number Field
    When click On The Update button   
    
  Scenario: Schedule_candidates
    Given user Launch The Application
    When Click On The Candidate button
    And Click On The Apploed Candidate button
    And Click On The Dots button
    And Click On The Schduled button
    And Click On The Date Input button
    And Click On The Date button
    And Click On The Set button
    And Click On The Interviewmode button
    When Click On The Create button
    When Click On The Schedule button
    
  Scenario: Reschedule_candidates
    Given user Launch The Application
    When Click On The Candidates button
    And Click On The Schedule Radio button
    And Click On The Dot button
    When Click On The Rescheduled button
    #When Click On The Reschedule button
    And Click On The Close button
    
  Scenario: HomeScreen
    Given user Launch The Application
    When Click On The Month button
    And Click On The Year button
    And Click On The Post button
    And Click On The Aircraft button
    And Click On The Threedots button
    And Click On The Edits button
    When Click On The Updates button  
    
  Scenario: Roles
    Given user Launch The Application
    When Click On The Roles button
    And Clilck On The Add Roles button
    And user Enter The Firstname In Firstname Field
    And user Enter The Lastname In Lastname Field
    And user Enter The Email In Email Field
    And user Enter The Phone In Phone Field
    And user Enter The Designation in Designation Field
    And Click On The Status button
    And Click On The Activity button
    When Click On The Creates button
    
  Scenario: Logout
    Given user Launch The Application
    When Click On The Loicon button  
    And Click On The Logout button
    
  Scenario: Signup
    Given user Launch The Application
    When click On The Signin button
    When click On The Signup button  
    And user Enter The Signmob in Signmob Field
    And user Enter The Signpass in Signpass Field
    Then Click On The Signupp button 
    #Then Click On The Verifyy button
    
  #Scenario: Manage Jobs 
    #Given user Launch The Application
    #When click On The Manage Jobs button
    #And click On The Post Job button
    #And user Enter The Job Title in Job Title Field
    #And user Enter The Vaccancy in Vaccancy Field
    #And user Enter The Category in Category Field
    
    
  
  
    