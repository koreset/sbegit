Feature: Card Delivery Preference: Branch Delivery
  Description:
  As a user
  I want to select my preferred method to receive the card at my branch
  So that I can collect it from the particular branch that suits me

  @BranchCardDelivery
  Scenario Outline: Select branch as delivery option


    #Background steps to be added
    When User selects BUSINESS BUNDLE One option
    #And User agrees to Business Bundle terms and conditions
#    And User clicks on Business Bundle Next button

#    #User is on Business Accounts screen
#    And User clicks on Register button for Sole director or sole trader option
#
#    #User is on Are you a Nedbank Client question page
#    And User clicks on Yes button for Are you a Nedbank client question
#
#    #User is on application fast track screen
#    And User is on Application fast track screen
#    And User captures Nedbank ID "<Username>" username on application fast track screen
#    And User captures Nedbank ID "<Password>" password on application fast track screen
#    Then User clicks on Application fast track Login button
#
#    #User is on Director's personal details screen
#    When User clicks on Director's personal details screen Next button
#
#    #User is on Company details screen
#    When User selects "Company(Pty(LTD))" company option
#    #And User selects Yes for option of using personal name as business trading name
#    And User captures "<Number>" Business Registration Number
#    Then User clicks on Company details Next button
#
#    #User is on Business Details screen (Tell us about your business)
#    And User selects "<Date>" Date of incorporation
#    And User captures "<Telephone>" Business telephone number
#    And User selects "March" Financial year end
#    And User selects "Estate Agency" Economic sector
#    And User captures "<Expected revenue>" Expected revenue
#    And User selects "Dividends" for income question
#    #And User selects Yes for tax obligation question
#    #And User captures "<Country>" Country of tax obligation
#    #And User selects checkbox for shareholder declaration
#    And User clicks Next button for Business Details screen
#
#    #User is on Business Address screen
#    When User clicks on Yes button for residential address
#    And User clicks on Yes button for postal address
#    Then User clicks on Next button for Business Address screen
#
#    #User is on Authorised signatory of juristic person screen
#    #When User captures "<Name>" Name of juristic person
#    #When User captures "<Surname>" Surname of juristic person
#    Then User clicks Next button on Authorised signatory of juristic screen
#
#    #To be confirmed (Configure or Card Details screen and Customize, Signatory or Card Details side panel)
#    Given User is on Customize screen
#    #When User selects checkbox to confirm that product information is understood
#    When User sets card limit
#    And User selects optional extras
#    And User selects account value adds
#    #And User confirms account monthly fee
#    #And User accepts offer
#    Then User clicks on Customize Next button
#
#    Given User is on Card Delivery screen
#    When User selects Collection option
#    #Script for dynamic method to allow selection of any branch by name
#    And User captures "<Sandton>" as a branch of choice for collection
#    And User selects a checkbox for relationship banker
#    Then User clicks on Next button for Card Delivery
#    #Where does the user land after clicking Next button

    Examples:
      |Username   |Password|Number     |Date        |Telephone |Expected revenue|Name    |Surname|Branch |
      |MARCELO123 |Password123!  |CK12352345 |2           |011789346 |5000000         |Thabiso |Ditabe |Sandton|

