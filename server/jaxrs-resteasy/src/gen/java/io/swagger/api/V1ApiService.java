package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;


import io.swagger.model.Book;
import io.swagger.model.Category;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-11-09T10:58:42.375+08:00")
public abstract class V1ApiService {
      public abstract Response getAllUsingGET(SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response getBookByIdUsingGET(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response getBooksByCategoryUsingGET(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response getUsingGET(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response updateUsingPOST(Integer id,SecurityContext securityContext)
      throws NotFoundException;
}
