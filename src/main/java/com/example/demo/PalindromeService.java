package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class PalindromeService {
    public boolean isPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return false; // Chuỗi null hoặc rỗng không được coi là đối xứng
        }
        int left = 0, right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
