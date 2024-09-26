Feature: TS01_Login


@Regression @TS01
Scenario Outline: Create deal with two accounts
Given Open browser and enter url 
Then Login to the application as "<username>" and "<password>"
Examples:
      |username|password|
      |mike    |mike    |
 