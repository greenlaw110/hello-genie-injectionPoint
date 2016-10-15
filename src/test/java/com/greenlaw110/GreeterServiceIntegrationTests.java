package com.greenlaw110;


import org.junit.Assert;
import org.junit.Test;

import javax.inject.Inject;

@org.junit.runner.RunWith(GenieRunner.class)
public class GreeterServiceIntegrationTests extends Assert {

    @Inject
    private GreeterService greeterService;

    @Inject
    private FarewellerService farewellerService;

    @Test
    public void sayHello_whenGivenDuke_thenReturnsHelloWorldDuke() {
        // Given
        String caller = "Duke";

        // When
        String greeting = greeterService.sayHello(caller);

        // Then
        assertEquals("Hej Verden, Duke", greeting);
    }


    @Test
    public void sayBye_whenGivenDuke_thenReturnsByeWorldDuke() {
        // Given
        String caller = "Duke";

        // When
        String farewell = farewellerService.sayBye(caller);

        // Then
        assertEquals("Bye World, Duke", farewell);
    }
}