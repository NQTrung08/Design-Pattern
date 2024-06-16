# Design Pattern VS SOLID

## Design Pattern

- Design pattern là các giải pháp tổng thể đã được tối ưu hóa, được tái sử dụng cho các vấn đề phổ biến trong thiết kế phần mềm mà chúng ta thường gặp phải hàng ngày.
- Design patterns là một kỹ thuật trong lập trình hướng đối tượng, không phải là ngôn ngữ cụ thể nào cả, nó là một kĩ thuật lập trình.
- Design Pattern giúp bạn giải quyết vấn đề một cách tối ưu nhất, cung cấp cho bạn các giải pháp trong lập trình OOP.
- Design patterns chia thành 3 nhóm:
  - Creational
  - Structural
  - Behavioral

1. Creational (Nhóm khởi tạo)
   1. Singleton
   2. Factory Method
   3. Abstract Factory
   4. Builder
   5. Prototype

   - Các patterns loại này cung cấp giải pháp để tạo ra các đối tượng và che giấu được logic của việc tạo ra nó thay vì tạo ra đối tượng theo cách trực tiếp (sử dụng từ khoá new).
   - Điều này giúp chương trình trở nên mềm dẻo hơn trong việc quyết định đối tượng nào cần được tạo ra trong những tình huống khác nhau.

2. Structural Pattern (Nhóm cấu trúc)
   1. Adapter
   2. Bridge
   3. Composite
   4. Decorator
   5. Facade
   6. Flyweight
   7. Proxy

   - Những patterns loại này liên quan tới class và các thành phần của đối tượng. Nó dùng để thiết lập, định nghĩa quan hệ giữa các đối tượng. Hệ thống càng lớn thì mẫu này càng đóng vai trò quan trọng. Ta có thể dựa vào class diagram để theo dõi mẫu này.

3. Behavioral Pattern (Nhóm hành vi)
   1. Iterpreter
   2. Template Method
   3. Chain of Responsibility
   4. Command
   5. Iterator
   6. Mediator
   7. Memento
   8. Observer
   9. State
   10. Strategy
   11. Visitor

   - Nhóm này liên quan đến các quan hệ hành vi để xử lí các chức năng giữa các đối tượng trong hệ thống.
