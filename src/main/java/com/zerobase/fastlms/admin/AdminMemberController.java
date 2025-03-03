package com.zerobase.fastlms.admin;

import com.zerobase.fastlms.admin.dto.MemberDto;

import com.zerobase.fastlms.admin.model.MemberParam;
import com.zerobase.fastlms.member.service.MemberService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class AdminMemberController {

  private final MemberService memberService;

  @GetMapping("/admin/member/list.do")
  public String list(Model model, MemberParam parameter) {

    List<MemberDto> members = memberService.list(parameter);
    model.addAttribute("list", members);

    return "admin/member/list";
  }
}
