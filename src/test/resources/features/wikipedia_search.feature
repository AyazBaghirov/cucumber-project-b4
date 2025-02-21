@wiki
Feature: Wikipedia search feature

  Background:
    Given User is on Wikipedia home page


  Scenario: Wikipedia Search Functionality Title Verification

  When User types Steve Jobs in the wiki search box
  And User clicks wiki search button
  Then User sees Steve Jobs is in the wiki title

  Scenario: Wikipedia Search Functionality Header Verification

  When User types Steve Jobs in the wiki search box
  And User clicks wiki search button
  Then User sees Steve Jobs is in the main header

  Scenario: Wikipedia Search Functionality Image Header Verification

  When User types Steve Jobs in the wiki search box
  And User clicks wiki search button
  Then User sees Steve Jobs is in the image header