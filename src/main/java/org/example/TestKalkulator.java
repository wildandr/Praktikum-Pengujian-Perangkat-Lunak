package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestKalkulator {
    private static Kalkulator kalk;
    private static int a;
    private static int b;

    @BeforeAll
    static void setup() {
        System.out.println("BeforeAll: Inisialisasi kelas Kalkulator dan nilai a dan b");
        kalk = new Kalkulator();
        a = 5;
        b = 3;
    }

    @BeforeEach
    void beforeEachTest() {
        System.out.println("BeforeEach: Test dimulai");
    }

    @Test
    void testTambah() {
        System.out.println("Test: Menjalankan testTambah");
        assertEquals(8, kalk.tambah(a, b));
    }

    @Test
    void testKurang() {
        System.out.println("Test: Menjalankan testKurang");
        assertEquals(2, kalk.kurang(a, b));
    }

    @Test
    void testKali() {
        System.out.println("Test: Menjalankan testKali");
        assertEquals(15, kalk.kali(a, b));
    }

    @Test
    void testBagi() {
        System.out.println("Test: Menjalankan testBagi");
        assertEquals(1.6666666666666667, kalk.bagi(a, b));
    }

    @Test
    void testBagiDenganNol() {
        System.out.println("Test: Menjalankan testBagiDenganNol");
        assertThrows(ArithmeticException.class, () -> kalk.bagi(a, 0));
    }

    @AfterEach
    void afterEachTest() {
        System.out.println("AfterEach: Test selesai");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("AfterAll: Membersihkan setelah pengujian");
    }
}
