package com.jzo2o.api.customer;

import com.jzo2o.api.customer.dto.response.AddressBookResDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @className: AddressBookApi
 * @description: TODO 类描述
 * @author: angelee
 * @date: 2024/8/8
 **/
@FeignClient(contextId = "customer", value = "jzo2o-customer", path = "/customer/inner/address-book")
public interface AddressBookApi {
    @GetMapping("/{id}")
    AddressBookResDTO detail(@PathVariable("id") Long id);
    @GetMapping("/getByUserIdAndCity")
    List<AddressBookResDTO> getByUserIdAndCity(@RequestParam("userId") Long userId, @RequestParam("city") String city);
}
