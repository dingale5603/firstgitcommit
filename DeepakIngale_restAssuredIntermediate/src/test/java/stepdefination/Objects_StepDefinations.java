package stepdefination;

import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import junit.framework.*;

import static io.restassured.RestAssured.*;

import java.io.IOException;

import POJO.Objects;
import Resources.BodydataPrepare;
import Resources.Util;

public class Objects_StepDefinations {
    Response response;
    Objects object= new Objects();
   String  ExpectedName;
	@Given("To get all object pass prerequisite like header")
	public void to_get_all_object_pass_prerequisite_like_header() throws IOException {
		given().spec(Util.requestSpec());
	}

	@When("User hit URL to get objects")
	public void user_hit_url_to_get_objects() {
	    response=when().get("/objects"); 
	}

	@Then("User should get status code as {int}")
	public void user_should_get_status_code_as(Integer int1) {
	    response.then().assertThat().statusCode(200);
	}

	@Given("To create object pass prerequisite like header and body")
	public void to_create_object_pass_prerequisite_like_header_and_body() throws IOException {
		given().body(BodydataPrepare.ObjectBodydata()).spec(Util.requestSpec());
	}

	@When("User hit URL to create object")
	public void user_hit_url_to_create_object() {
	   when().post("/objets");
	}

	@SuppressWarnings("deprecation")
	@Then("User get status code as {int}")
	public void user_get_status_code_as(Integer statusCode) {
	    response.then().assertThat().statusCode(201);
	    Assert.assertEquals(response.getStatusCode(), 201);
	}

	@Given("To update object pass prerequisite like header and body")
	public void to_update_object_pass_prerequisite_like_header_and_body() throws IOException {
		given().body(BodydataPrepare.UpdatedBodydata()).spec(Util.requestSpec());
	    
	}

	@When("User hit URL to update object")
	public void user_hit_url_to_update_object() {
		when().put("/objets");
	}
	

	@SuppressWarnings("deprecation")
	@Then("User should get updated values in responce body")
	public void user_should_get_updated_values_in_responce_body() {
	    String ResInString = response.then().extract().response().asString();
	    JsonPath js= new JsonPath(ResInString);
	     String UpdatedName = js.get("Name").toString();
	     Assert.assertEquals(UpdatedName, object.getName().toString());
	}

	@When("User hit URL to delete object")
	public void user_hit_url_to_delete_object() {
	    given().delete("/objets/7");
	}

	@SuppressWarnings("deprecation")
	@Then("User get status code {int}")
	public void user_get_status_code(Integer int1) {
		Assert.assertEquals(response.getStatusCode(), 404);
	}

	
}
