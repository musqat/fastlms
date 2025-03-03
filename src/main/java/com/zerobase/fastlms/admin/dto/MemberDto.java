package com.zerobase.fastlms.admin.dto;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class MemberDto {

  String userId;
  String userName;
  String phone;
  String password;
  LocalDateTime regDt;

  boolean emailAuthYn;
  LocalDateTime emailAuthDt;
  String emailAuthKey;

  String resetPasswordKey;
  LocalDateTime resetPasswordDt;

  boolean adminYn;
}
