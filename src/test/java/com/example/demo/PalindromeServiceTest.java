package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeServiceTest {
    private PalindromeService palindromeService;

    @BeforeEach
    public void setUp() {
        palindromeService = new PalindromeService();
    }

    @Test
    public void testEmptyString() {
        assertFalse(palindromeService.isPalindrome(""));
    }

    @Test
    public void testNullString() {
        assertFalse(palindromeService.isPalindrome(null));
    }

    @Test
    public void testSingleCharacterString() {
        assertTrue(palindromeService.isPalindrome("a"));
    }

    @Test
    public void testPalindromeEvenLength() {
        assertTrue(palindromeService.isPalindrome("abba"));
    }

    @Test
    public void testPalindromeOddLength() {
        assertTrue(palindromeService.isPalindrome("radar"));
    }

    @Test
    public void testNonPalindrome() {
        assertFalse(palindromeService.isPalindrome("hello"));
    }

    @Test
    public void testPalindromeWithSpaces() {
        assertFalse(palindromeService.isPalindrome("a man a plan a canal panama"));
    }
}