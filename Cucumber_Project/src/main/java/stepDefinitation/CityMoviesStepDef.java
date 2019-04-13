package stepDefinitation;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class CityMoviesStepDef 
{
	private String url;
	Response response;

	@Given("^the apis are up and running for \"([^\"]*)\"$")
	public void the_apis_are_up_and_running_for(String url) throws Throwable 
	{
		this.url=url;
	   response = given().when().get(url);
	   Assert.assertEquals(200, response.getStatusCode());
	}

	@When("^a user performs a get request to \"([^\"]*)\"$")
	public void a_user_performs_a_get_request_to(String arg1) throws Throwable
	{
			    
	}

	@When("^and perform the request$")
	public void and_perform_the_request() throws Throwable
	{
	   
	}

	@Then("^the response code should be (\\d+)$")
	public void the_response_code_should_be(int arg1) throws Throwable
	{
	   
	}

	@Then("^I should be json respose with pairs on the filtered \"([^\"]*)\" node$")
	public void i_should_be_json_respose_with_pairs_on_the_filtered_node(String arg1, DataTable arg2) throws Throwable 
	{
	  
	}

}
