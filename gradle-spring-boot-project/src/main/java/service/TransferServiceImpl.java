package service;

import org.springframework.stereotype.Component;

@Component("service1")
public class TransferServiceImpl implements TransferService {

    @Override
    public void doSomething() {
        System.out.println("Did something!");
    }
}
