Feature: TS01_Deal_TwoAccounts


@Regression @TS01
Scenario Outline: Create deal with two accounts
Given Open browser and enter url 
Then Login to the application as "deal_maker"
Examples:
      |TcId|
      |TS01|
 