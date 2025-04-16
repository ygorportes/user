package com.portestech.user.business.converter;

import com.portestech.user.business.dto.AddressDTO;
import com.portestech.user.business.dto.PhoneDTO;
import com.portestech.user.business.dto.UserDTO;
import com.portestech.user.infrastructure.entity.Address;
import com.portestech.user.infrastructure.entity.Phone;
import com.portestech.user.infrastructure.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserConverter {

    public User toUser(UserDTO userDTO) {
        return User.builder()
                .name(userDTO.getName())
                .email(userDTO.getEmail())
                .password(userDTO.getPassword())
                .addresses(toListAddress(userDTO.getAddresses()))
                .phones(toListPhone(userDTO.getPhones()))
                .build();
    }

    public List<Address> toListAddress(List<AddressDTO> addressDTOS) {
        return addressDTOS.stream().map(this::toAddress).toList();
    }

    public Address toAddress(AddressDTO addressDTO) {
        return Address.builder()
                .street(addressDTO.getStreet())
                .number(addressDTO.getNumber())
                .city(addressDTO.getCity())
                .complement(addressDTO.getComplement())
                .cep(addressDTO.getCep())
                .state(addressDTO.getState())
                .build();
    }

    public List<Phone> toListPhone(List<PhoneDTO> phoneDTOS) {
        return phoneDTOS.stream().map(this::toPhone).toList();
    }

    public Phone toPhone(PhoneDTO phoneDTO) {
        return Phone.builder()
                .number(phoneDTO.getNumber())
                .ddd(phoneDTO.getDdd())
                .build();
    }

    public UserDTO toUserDTO(User user) {
        return UserDTO.builder()
                .name(user.getName())
                .email(user.getEmail())
                .password(user.getPassword())
                .addresses(toListAddressDTO(user.getAddresses()))
                .phones(toListPhoneDTO(user.getPhones()))
                .build();
    }

    public List<AddressDTO> toListAddressDTO(List<Address> address) {
        return address.stream().map(this::toAddressDTO).toList();
    }

    public AddressDTO toAddressDTO(Address address) {
        return AddressDTO.builder()
                .street(address.getStreet())
                .number(address.getNumber())
                .city(address.getCity())
                .complement(address.getComplement())
                .cep(address.getCep())
                .state(address.getState())
                .build();
    }

    public List<PhoneDTO> toListPhoneDTO(List<Phone> phone) {
        return phone.stream().map(this::toPhoneDTO).toList();
    }

    public PhoneDTO toPhoneDTO(Phone phone) {
        return PhoneDTO.builder()
                .number(phone.getNumber())
                .ddd(phone.getDdd())
                .build();
    }

}
