package com.company.yostane.gaming.resources;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.company.yostane.gaming.ejb.StockGuitarBean;
import com.company.yostane.gaming.model.StockGuitar;

@Path("amangousse")
public class GuitarResource {

  @Inject
  StockGuitarBean stockGuitarBean;

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Response get() {
    return Response.ok(stockGuitarBean.getStockGuitars()).build();
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public Response post(StockGuitar guitar) {
    stockGuitarBean.addStockGuitar(guitar);
    return Response.ok().build();
  }

  @DELETE
  @Path("{name}")
  public Response delete(@PathParam("name") String name) {
    stockGuitarBean.deleteStockGuitarByName(name);
    return Response.ok().build();
  }

}