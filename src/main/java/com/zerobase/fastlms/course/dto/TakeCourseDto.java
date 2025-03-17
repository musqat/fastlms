package com.zerobase.fastlms.course.dto;


import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class TakeCourseDto {

  long id;
  long categoryId;
  String userId;

  long payPrice;
  String status;

  LocalDateTime regdt;

  //Join
  String userName;
  String phone;
  String subject;

  //추가 컬럼
  long totalCount;
  long seq;

  public String getRegDtText(){
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm");
    return regdt != null ? regdt.format(formatter) : "";
  }
}
