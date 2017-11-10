package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.V1ApiService;
import io.swagger.api.factories.V1ApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Book;
import io.swagger.model.Category;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/v1")


@io.swagger.annotations.Api(description = "the v1 API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-11-09T10:58:42.375+08:00")
public class V1Api  {
   private final V1ApiService delegate = V1ApiServiceFactory.getV1Api();

    @GET
    @Path("/category/")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "获取全部分类", notes = "", response = Category.class, responseContainer = "List", tags={ "category-api", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Category.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Category.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = Category.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Category.class, responseContainer = "List") })
    public Response getAllUsingGET(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAllUsingGET(securityContext);
    }
    @GET
    @Path("/book/{id}")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "根据ID获取书籍", notes = "", response = Book.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "api_key")
    }, tags={ "book-api", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Book.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Book.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = Book.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Book.class) })
    public Response getBookByIdUsingGET( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getBookByIdUsingGET(id,securityContext);
    }
    @GET
    @Path("/book/getByCategoryId")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "根据分类获取书籍", notes = "", response = Book.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "api_key")
    }, tags={ "book-api", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Book.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Book.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = Book.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Book.class, responseContainer = "List") })
    public Response getBooksByCategoryUsingGET( @NotNull  @QueryParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getBooksByCategoryUsingGET(id,securityContext);
    }
    @GET
    @Path("/category/{id}")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "根据ID获取分类", notes = "", response = Category.class, tags={ "category-api", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Category.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Category.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = Category.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Category.class) })
    public Response getUsingGET( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getUsingGET(id,securityContext);
    }
    @POST
    @Path("/book/update")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "更新书籍", notes = "", response = Boolean.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "api_key")
    }, tags={ "book-api", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Created", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Boolean.class) })
    public Response updateUsingPOST(@ApiParam(value = "id" ) Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateUsingPOST(id,securityContext);
    }
}
