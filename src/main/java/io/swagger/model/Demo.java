package io.swagger.model;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-02-23T06:22:27.012Z")
public class Demo  {
  
  private String demoId = null;

  
  /**
   * Data field of demo_id
   **/
  @ApiModelProperty(value = "Data field of demo_id")
  @JsonProperty("demo_id")
  public String getDemoId() {
    return demoId;
  }
  public void setDemoId(String demoId) {
    this.demoId = demoId;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Demo demo = (Demo) o;
    return Objects.equals(demoId, demo.demoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(demoId);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Demo {\n");
    
    sb.append("  demoId: ").append(demoId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
