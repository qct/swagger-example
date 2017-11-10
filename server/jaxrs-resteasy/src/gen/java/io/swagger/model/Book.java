package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-11-09T10:58:42.375+08:00")
public class Book   {
  
  private String author = null;
  private Integer categoryId = null;
  private Integer id = null;
  private String name = null;

  /**
   * 作者
   **/
  
  @ApiModelProperty(value = "作者")
  @JsonProperty("author")
  public String getAuthor() {
    return author;
  }
  public void setAuthor(String author) {
    this.author = author;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("categoryId")
  public Integer getCategoryId() {
    return categoryId;
  }
  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * 书名
   **/
  
  @ApiModelProperty(value = "书名")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Book book = (Book) o;
    return Objects.equals(author, book.author) &&
        Objects.equals(categoryId, book.categoryId) &&
        Objects.equals(id, book.id) &&
        Objects.equals(name, book.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, categoryId, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Book {\n");
    
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

