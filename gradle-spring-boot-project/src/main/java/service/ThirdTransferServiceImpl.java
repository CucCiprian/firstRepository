package service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component("service3")
@ConditionalOnBean(TransferServiceImpl.class)
public class ThirdTransferServiceImpl implements TransferService {

    @Override
    public void doSomething() {
        System.out.println("Did a third thing!");
    }
}
