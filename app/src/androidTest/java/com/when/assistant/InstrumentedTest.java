package com.when.assistant;

import android.content.Context;
import android.content.res.AssetManager;

import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class InstrumentedTest {
    private Context context;

    @Test
    public void testSomething() {
        context = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertNotNull(context);
        System.out.println("heihei");
        AssetManager assets = context.getAssets();
        //assets.list("");
        System.out.println("hehe");
    }

}
