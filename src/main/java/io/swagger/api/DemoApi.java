package io.swagger.api;

import io.swagger.model.*;

import io.swagger.model.Demo;
import io.swagger.model.Error;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
import io.swagger.annotations.AuthorizationScope;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/demo", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/demo", description = "the demo API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-02-23T06:22:27.012Z")
public class DemoApi {
  

  @ApiOperation(value = "demo Type", notes = "This endponits for get the specified demo resource", response = Demo.class, responseContainer = "List")
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "An array of demo"),
    @ApiResponse(code = 200, message = "Unexpected error") })
  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    
    method = RequestMethod.GET)
  public ResponseEntity<List<Demo>> demoGet()
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<List<Demo>>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "demo Type", notes = "This endponits for create a new demo resource", response = Demo.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "description about created resource of demo"),
    @ApiResponse(code = 200, message = "Unexpected error") })
  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    
    method = RequestMethod.POST)
  public ResponseEntity<Demo> demoPost()
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Demo>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "demo Type", notes = "This endponits for get the specified demo resource", response = Demo.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "description about created resource of demo"),
    @ApiResponse(code = 200, message = "Unexpected error") })
  @RequestMapping(value = "/{demo_id}", 
    produces = { "application/json" }, 
    
    method = RequestMethod.GET)
  public ResponseEntity<Demo> demoDemoIdGet(
@ApiParam(value = "Fetch resource id of the demo",required=true ) @PathVariable("demoId") String demoId

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Demo>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "demo Type", notes = "This endponits for update the specified demo resource", response = Demo.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "description about updated resource of demo"),
    @ApiResponse(code = 200, message = "Unexpected error") })
  @RequestMapping(value = "/{demo_id}", 
    produces = { "application/json" }, 
    
    method = RequestMethod.PUT)
  public ResponseEntity<Demo> demoDemoIdPut(
@ApiParam(value = "Update resource id of the demo",required=true ) @PathVariable("demoId") String demoId

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Demo>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "demo Type", notes = "This endponits for delete the specified demo resource", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 204, message = "Resource deleted"),
    @ApiResponse(code = 200, message = "Unexpected error") })
  @RequestMapping(value = "/{demo_id}", 
    produces = { "application/json" }, 
    
    method = RequestMethod.DELETE)
  public ResponseEntity<Void> demoDemoIdDelete(
@ApiParam(value = "Delete resource id of the demo",required=true ) @PathVariable("demoId") String demoId

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Void>(HttpStatus.OK);
  }

  
}
