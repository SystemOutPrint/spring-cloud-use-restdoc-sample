package com.ledo;

import com.ledo.controller.EchoController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SampleApplication.class)
public class EchoTest {

    public static final String MSG = "hello world!";

    @Autowired
    private EchoController echoController;

    @Test
    public void testEcho() {
        Assert.assertEquals(MSG, echoController.echo(MSG));
    }

}
