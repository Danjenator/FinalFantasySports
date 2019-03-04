package com.finalfantaysports.graphql;

import com.finalfantaysports.graphql.client.FootballClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @Autowired
  FootballClient footballClient;


}
