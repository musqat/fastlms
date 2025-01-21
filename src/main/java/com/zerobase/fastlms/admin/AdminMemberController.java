package com.zerobase.fastlms.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminMemberController {

  @GetMapping("/admin/member/list.do")
  public String main() {

    return "admin/member/list";
  }
}
