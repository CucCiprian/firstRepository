package service;

import org.springframework.stereotype.Component;

@Component("service2")
public class AnotherTransferServiceImpl implements TransferService {

    @Override
    public void doSomething() {
        System.out.println("Did something else!");
    }
}
