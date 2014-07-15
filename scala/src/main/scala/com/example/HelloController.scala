package com.example

import org.springframework.web.bind.annotation.{RequestMapping, RestController}

@RestController
class HelloController {
  @RequestMapping
  def hello() = {
    "Hello World!"
  }
}
