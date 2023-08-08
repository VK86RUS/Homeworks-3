package ru.qamid66;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    @Test
    public void testPost() {
        PosterManager manager = new PosterManager();

        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFilm1() {
        PosterManager manager = new PosterManager();

        manager.addMovie("Film 1");

        String[] actual = manager.findAll();
        String[] expected = {"Film 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFilm2() {
        PosterManager manager = new PosterManager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");

        String[] actual = manager.findAll();
        String[] expected = {"Film 1", "Film 2"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFilmDown() {
        PosterManager manager = new PosterManager();

        manager.findLast("Film 4");
        manager.findLast("Film 3");
        manager.findLast("Film 2");
        manager.findLast("Film 1");

        String[] actual = manager.findLast();
        String[] expected = {"Film 4", "Film 3", "Film 2", "Film 1"};
        Assertions.assertArrayEquals(expected, actual);
    }
}
