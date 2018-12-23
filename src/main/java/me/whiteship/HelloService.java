package me.whiteship;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getName() {
        return "whiteship";
    }
}
