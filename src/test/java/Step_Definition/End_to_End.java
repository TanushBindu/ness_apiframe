//package Step_Definition;
//
//import static io.restassured.RestAssured.given;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//import org.json.simple.JSONObject;
//import org.junit.Assert;
//
//import Utils.EndPoints;
//import Utils.Resuable_Validation_methods;
//import Utils.Spec_builders;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.restassured.response.Response;
//import pojo.Data;
//import pojo.List_of_User;
//
//public class End_to_End 
//{
//	private Spec_builders a1;
//	private Response res;
//	private List_of_User l1;
//	private List<String>s1 = new ArrayList<String>();
//	private Response res1;
//	@Given("^user enters the base url and contentType$")
//    public Spec_builders user_enters_the_base_url_and_contenttype() throws Throwable 
//	{
//		 a1 = new Spec_builders();
//		 return a1;
//    }
//
//    @When("^user enters the \"([^\"]*)\" endpoint with the GET http request$")
//    public void user_enters_the_something_endpoint_with_the_get_http_request(String strArg1) throws Throwable 
//    {
//    	EndPoints a2 = EndPoints.valueOf(strArg1);
//    	res = given().spec(a1.request_spec_builder()).when().get(a2.getEnd());
//    	l1 = res.as(List_of_User.class);
//    }
//
//    @When("^user enters the \"([^\"]*)\" of POST http request and pass the extracted value$")
//    public void user_enters_the_something_of_post_http_request_and_pass_the_extracted_value(String strArg1) throws Throwable 
//    {
//    	JSONObject js = new JSONObject();
//    	for (String string : s1) 
//    	{
//    		if (string.equals("George")) {
//    			js.put("name",string);
//        		js.put("job","TE");
//        		EndPoints a2 = EndPoints.valueOf(strArg1);
//            	res1 = given().spec(a1.request_spec_builder()).body(js).when().post(a2.getEnd());
//			}
//		}
//    }
//
//    @Then("^user has to extract the name George$")
//    public void user_has_to_extract_the_name_george() throws Throwable 
//    {
//    	List<Data> data = l1.getData();
//    	Iterator<Data> d1 = data.iterator();
//    	for (Data data2 : data) 
//    	{
//    			s1.add(data2.getFirst_name());
//		}		
//    }
//
//    @Then("^user should get 201 status code$")
//    public void user_should_get_201_status_code() throws Throwable 
//    {
//    	System.out.println(res1.asString());
//    	System.out.println(res1.getStatusCode());
//    }
//    
//    @Then("^user should get the name George in the response Body$")
//    public void user_should_get_the_name_george_in_the_response_body() throws Throwable 
//    {
//    	Assert.assertTrue(Resuable_Validation_methods.Chech_value_in_response(res1, "George"));
//    }
//
//}
