package gradle.spring.boot.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("object")
public class SomeObject {

    @Autowired
    private Dummy dummy1;

    @Autowired
    private Dummy dummy2;


    public SomeObject(){
//        System.out.println(dummy1.toString());
    }

    public void showDummy(){
        System.out.println("This is "+this.dummy1.getString()+"!");
    }

    public void setDummy(Dummy d){
        this.dummy1=d;
    }
}
