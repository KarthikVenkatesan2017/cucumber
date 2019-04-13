Feature: City Movies Advanced

Scenario: Get locations 

Given the apis are up and running for "http://cmapi.bananaappscenter.com/"
When a user performs a get request to "api/Location/LocationDetails"
And and perform the request
Then the response code should be 200
And I should be json respose with pairs on the filtered "Msg" node
	| Message	 | Success Location Details |
	| StatusCode | 200					 	|
	| isError	 | False					|
	| isSuccess	 | true						|
	
	 