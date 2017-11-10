package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Book
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-09T10:58:41.434+08:00")

public class Book   {
  @JsonProperty("author")
  private String author = null;

  @JsonProperty("categoryId")
  private Integer categoryId = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  public Book author(String author) {
    this.author = author;
    return this;
  }

   /**
   * 作者
   * @return author
  **/
  @ApiModelProperty(value = "作者")


  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Book categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Get categoryId
   * @return categoryId
  **/
  @ApiModelProperty(value = "")


  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public Book id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Book name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 书名
   * @return name
  **/
  @ApiModelProperty(value = "书名")


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
    return Objects.equals(this.author, book.author) &&
        Objects.equals(this.categoryId, book.categoryId) &&
        Objects.equals(this.id, book.id) &&
        Objects.equals(this.name, book.name);
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

