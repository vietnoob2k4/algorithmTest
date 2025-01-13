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

## 6.Báo cáo kiểm thử - Mức độ bao phủ mã nguồn bằng JaCoCo

### Tổng quan
Quá trình kiểm thử được thực hiện trên gói mã nguồn `com.example.demo` bằng cách sử dụng công cụ JaCoCo. Kết quả kiểm thử cho thấy mức độ bao phủ của mã nguồn đạt 100% đối với tất cả các chỉ số: dòng lệnh (lines), nhánh (branches), và phương pháp (methods).

### Kết quả kiểm thử

| Chỉ số       | Tổng số | Số bị bỏ sót | Mức độ bao phủ (%) |
|--------------|---------|--------------|--------------------|
| Instructions | 42      | 0            | 100%               |
| Branches     | 8       | 0            | 100%               |
| Lines        | 13      | 0            | 100%               |
| Methods      | 4       | 0            | 100%               |
| Classes      | 2       | 0            | 100%               |

### Chi tiết theo gói

| Gói (Package)     | Instructions (%) | Branches (%) | Lines (%) | Methods (%) | Classes (%) |
|-------------------|------------------|--------------|-----------|-------------|-------------|
| `com.example.demo` | 100%             | 100%         | 100%      | 100%        | 100%        |

### Nhận xét

#### Bao phủ Instructions (Chỉ dẫn):
Tất cả 42 chỉ dẫn (instructions) trong gói `com.example.demo` đã được kiểm thử đầy đủ, không có chỉ dẫn nào bị bỏ sót.

#### Bao phủ Branches (Nhánh):
Tất cả 8 nhánh logic trong mã nguồn đã được bao phủ. Điều này có nghĩa là tất cả các câu lệnh điều kiện và luồng thực thi đều được kiểm thử.

#### Bao phủ Lines (Dòng lệnh):
Tổng cộng 13 dòng mã đã được kiểm tra với 100% bao phủ. Đây là một kết quả rất tốt.

#### Bao phủ Methods (Phương pháp):
Tất cả 4 phương pháp trong gói `com.example.demo` đã được kiểm tra, không có phương pháp nào bị bỏ sót.

#### Bao phủ Classes (Lớp):
Có 2 lớp trong gói `com.example.demo`, và cả hai lớp đều được kiểm thử đầy đủ.

### Đánh giá
Kết quả kiểm thử cho thấy mức độ bao phủ mã nguồn là tối ưu, đạt 100% trên tất cả các chỉ số. Điều này thể hiện rằng các trường hợp kiểm thử đã được thiết kế hiệu quả và bao quát toàn bộ mã nguồn trong phạm vi kiểm thử.

### Khuyến nghị
- Tiếp tục duy trì chất lượng kiểm thử với mức độ bao phủ cao như hiện tại.
- Đảm bảo rằng mọi thay đổi hoặc bổ sung trong mã nguồn được kiểm thử tương tự để duy trì mức độ bao phủ này.
![Ảnh chụp màn hình 2025-01-07 213641](https://github.com/user-attachments/assets/e7393f81-2b4d-47c9-8904-e6b35edc20bd)
### Link ChatGpt:
- https://chatgpt.com/c/677be512-a408-800d-a6fc-de168218921a
### Link ChatGpt chấm điểm:
- https://chatgpt.com/c/6783d940-a72c-800d-9c94-b2d7fbbde0e2
