package io.swagger.api.factories;

import io.swagger.api.V1ApiService;
import io.swagger.api.impl.V1ApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-11-09T10:58:42.375+08:00")
public class V1ApiServiceFactory {

   private final static V1ApiService service = new V1ApiServiceImpl();

   public static V1ApiService getV1Api()
   {
      return service;
   }
}
