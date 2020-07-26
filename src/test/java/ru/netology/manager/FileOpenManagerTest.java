package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class FileOpenManagerTest {
    private FileOpenManager manager = new FileOpenManager();

    @BeforeEach
    void setUp(){
        manager.register(".html", "GoogleChrome");
        manager.register(".jpg", "Photoshop");
        manager.register(".py", "Python");
        manager.register(".txt", "notepad++");
        manager.register(".mp4", "Video");

    }

    @Test
    void shouldShowAllApp(){

        assertArrayEquals(Arrays.asList( "GoogleChrome", "notepad++", "Photoshop",  "Python"  ,"Video" ).toArray(), manager.showAllApps().toArray());

    }
    @Test
    void shouldShowNameApp(){

        assertEquals("Python" , manager.getNameOfApp(".py"));

    }
    @Test
    void shouldDeleteApp(){

        manager.deleteApp(".JPG");
        assertArrayEquals(Arrays.asList( "GoogleChrome", "notepad++", "Python"  ,"Video" ).toArray(), manager.showAllApps().toArray());

    }
    @Test
    void shouldShowAllExtensions(){

        assertArrayEquals(Arrays.asList( ".html", ".txt", ".jpg", ".mp4"  ,".py" ).toArray(), manager.showAllExtensions().toArray());

    }



}