package com.finalfantaysports.graphql.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient
public interface FootballClient {
  @RequestMapping("/greeting")
  String greeting();
}
