### Báo cáo kiểm thử: Chương trình kiểm tra chuỗi đối xứng (Palindrome)

---

## 1. Mô tả chương trình

Chương trình được xây dựng bằng Java Spring Boot với mục đích kiểm tra xem một chuỗi có phải là chuỗi đối xứng (Palindrome) hay không. 

Nó bao gồm một hàm chính để kiểm tra tính đối xứng của chuỗi, cùng với các hàm kiểm thử đơn vị sử dụng JUnit.

---

## 2. Mô tả code

- **PalindromeService**: Lớp chính chứa hàm kiểm tra chuỗi đối xứng.  
- **PalindromeServiceTest**: Lớp kiểm thử đơn vị sử dụng JUnit để kiểm tra tính đúng đắn của hàm kiểm tra chuỗi đối xứng.

---

## 3. Kế hoạch kiểm thử

- **Test 1**: Kiểm tra chuỗi rỗng.  
  - **Đầu vào**: `""`  
  - **Kết quả mong đợi**: `false`  

- **Test 2**: Kiểm tra chuỗi null.  
  - **Đầu vào**: `null`  
  - **Kết quả mong đợi**: `false`  

- **Test 3**: Kiểm tra chuỗi đối xứng lẻ ký tự.  
  - **Đầu vào**: `"radar"`  
  - **Kết quả mong đợi**: `true`  

- **Test 4**: Kiểm tra chuỗi đối xứng chẵn ký tự.  
  - **Đầu vào**: `"abba"`  
  - **Kết quả mong đợi**: `true`  

- **Test 5**: Kiểm tra chuỗi không đối xứng.  
  - **Đầu vào**: `"hello"`  
  - **Kết quả mong đợi**: `false`  

- **Test 6**: Kiểm tra chuỗi chứa ký tự khoảng trắng.  
  - **Đầu vào**: `"a man a plan a canal panama"`  
  - **Kết quả mong đợi**: `false`  

- **Test 7**: Kiểm tra chuỗi đơn ký tự.  
  - **Đầu vào**: `"a"`  
  - **Kết quả mong đợi**: `true`  

---

## 4. Tổng hợp kết quả kiểm thử

- **Tổng số test case**: 7  
- **Số test case đạt**: 7  
- **Số test case không đạt**: 0  
- **Tỷ lệ thành công**: 100%  

---

## 5. Kết luận

Tất cả các trường hợp kiểm thử đều đạt kết quả như mong đợi.  

Chương trình hoạt động đúng với các trường hợp đầu vào phổ biến, bao gồm: chuỗi rỗng, chuỗi null, chuỗi đối xứng, chuỗi không đối xứng, và chuỗi chứa khoảng trắng.  
![Ảnh chụp màn hình 2025-01-06 212540](https://github.com/user-attachments/assets/7e6ec690-e5c5-42ca-af82-6fa1b0161bfa)
