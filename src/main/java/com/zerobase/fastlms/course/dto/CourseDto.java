package com.zerobase.fastlms.course.dto;


import com.zerobase.fastlms.course.entity.Course;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CourseDto {

  Long id;
  long categoryId;
  String imagePath;
  String keyword;
  String subject;
  String summary;
  String contents;
  long price;
  long salePrice;
  LocalDate saleEndDt;
  LocalDateTime regDt; //등록일
  LocalDateTime udtDt; //수정일

  //추가 컬럼
  long totalCount;
  long seq;

  public static CourseDto of(Course course) {

    return CourseDto.builder()
        .id(course.getId())
        .categoryId(course.getCategoryId())
        .imagePath(course.getImagePath())
        .keyword(course.getKeyword())
        .subject(course.getSubject())
        .summary(course.getSummary())
        .contents(course.getContents())
        .price(course.getPrice())
        .salePrice(course.getSalePrice())
        .saleEndDt(course.getSaleEndDt())
        .regDt(course.getRegDt())
        .udtDt(course.getUdtDt())
        .build();
  }
}
