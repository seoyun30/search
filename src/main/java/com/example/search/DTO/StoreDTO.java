//9. Entity를 참고해서 사용할 변수로 구성
package com.example.search.DTO;

import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDateTime;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@ToString @Builder
public class StoreDTO {

    private Integer idx;

    private String storeName;

    private String storeId;

    private String storeChiefId;

    private String storeChief;

    private String storeTel;

    private String storedel;

    private LocalDateTime moddate;
    private LocalDateTime regdate;

    //HTML에서 추가로 받을 변수를 DTO로 함께 받고자 하면 벼수를 추가
    //Controller에서 개별변수로 받아서 사용
    //private String search;

}
//DTO까지 설계가 완료되면 1차 확인(단위테스트)
