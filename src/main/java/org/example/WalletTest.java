package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class WalletTest {
    private Wallet wallet;

    @BeforeAll
    public static void beforeAllTests() {
        // Code to run once before all tests start
        // E.g., setting up a database connection or initializing shared resources
        System.out.println("Starting Wallet tests...");
    }

    @BeforeEach
    public void setUp() {
        // Code to run before each test
        wallet = new Wallet("John Doe");
        System.out.println("Set up for test");
    }

    @Test
    public void testAddAndWithdrawCash() {
        wallet.addCash(1000);
        assertTrue(wallet.withdrawCash(500), "Withdrawal of 500 should be successful");
        assertEquals(500, wallet.getCash(), "Balance should be 500 after withdrawal");

        assertFalse(wallet.withdrawCash(1000), "Withdrawal of 1000 should fail due to insufficient balance");
    }

    @Test
    public void testAddAndRemoveCard() {
        wallet.addCard("Visa");
        wallet.addCard("MasterCard");
        assertTrue(wallet.removeCard("Visa"), "Removing Visa card should be successful");
        assertFalse(wallet.getCards().contains("Visa"), "Visa should not be in the list");
        assertTrue(wallet.getCards().contains("MasterCard"), "MasterCard should be in the list");

        assertFalse(wallet.removeCard("American Express"), "Removing a non-existing card should fail");
    }

    @Test
    public void testDuplicateCard() {
        wallet.addCard("Visa");
        wallet.addCard("Visa");
        assertEquals(1, wallet.getCards().size(), "Duplicate card addition should be prevented");
    }

    @Test
    public void testSetName() {
        wallet.setName("Jane Doe");
        assertEquals("Jane Doe", wallet.getName(), "The name should be updated to Jane Doe");
    }

    @AfterEach
    public void tearDown() {
        // Code to run after each test
        // E.g., resetting states, nullifying objects
        System.out.println("Cleaning up after test");
    }

    @AfterAll
    public static void afterAllTests() {
        // Code to run once after all tests have finished
        // E.g., closing a database connection or releasing shared resources
        System.out.println("All Wallet tests completed.");
    }
}
