package com.portestech.user.business.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressDTO {

    private String street;
    private Long number;
    private String complement;
    private String city;
    private String state;
    private String cep;
}
