package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.example.getter_only_class.Address;


@Accessors(chain = true)

public class Employee {
    private String name;
    private String city;
    private String phone;
    private Address address;



    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getPhone() {
        return phone;
    }

    public Address getAddress() {
        return new Address();
    }
}
