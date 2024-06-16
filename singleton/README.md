# Single Pattern

- Single Pattern là một design pattern mà
  - Đảm bảo rằng 1 class chỉ có duy nhất 1 instance
  - Và cung cấp 1 cách global để truy cập tới instance đó

## Tại sao cần dùng Singleton?

- Hầu hết các đối tượng trong một ứng dụng đều chịu trách nhiệm cho công việc của chúng và truy xuất dữ liệu tự lưu trữ (self-contained data) và các tham chiếu trong phạm vi được đưa ra của chúng

- TUY nhiên, có nhiều đối tượng có thêm những nhiệm vụ và có ảnh hưởng rộng hơn, chẳng hạn như quản lý các nguồn tài nguyên bị giới hạn hoặc theo dõi toàn bộ trạng thái của hệ thống.
- Ví dụ có thể có rất nhiều máy in trong hệ thống nhưng chỉ có thể tồn tại duy nhất một Sprinter Spooler (Phần quản lý máy in)
- ![minh họa](image.png)

1. `Kiểm soát truy cập tới tài nguyên dùng chung`:
   1. Singleton cho phép `kiểm soát truy cập` tới tài nguyên dùng chung như `cơ sở dữ liệu`, `file cấu hình`, `hay kết nối mạng`.
   2. Khi chỉ có một `instance` của class quản lý tài nguyên, dễ dàng hơn trong việc quản lý và đảm bảo tính nhất quán.
2. `Tiết kiệm tài nguyên`: 
   1. Bằng cách giới hạn số lượng thể hiện của 1 lớp giúp tiết kiệm tài nguyên
   2. đặc biệt quan trọng đối với các tài nguyên đắt đỏ như kết nối `cơ sở dữ liệu` hay kết nối mạng.
3. Đảm bảo `global state` **duy nhất**
   1. Singleton đảm bảo rằng tất cả các phần của ứng dụng sử dụng cùng một thể hiện của lớp, do đó duy trì một trạng thái toàn cục duy nhất. Điều này quan trọng đối với các lớp quản lý global state như cấu hình hệ thống.

## Làm thế nào để implement Singleton Pattern

1. Làm sao để 1 class chỉ có thể có duy nhất 1 instance

   - Private constructor của class đó để đảm bảo rằng class lớp khác không thể truy cập vào constructor và tạo ra instance mới
   - Tạo một biến private static là thể hiện của class đó để đảm bảo rằng nó là duy nhất và chỉ được tạo ra trong class đó thôi.

2. Làm sao để có thể cung cấp một cách global để truy cấp tới instance đó. Trả lời?

   - Tạo một public static menthod trả về instance vừa khởi tạo bên trên, đây là cách duy nhất để các class khác có thể truy cập vào instance của class này

  ```Java
    public class LazyInitializedSingleton {

      private static LazyInitializedSingleton instance;

      private LazyInitializedSingleton(){}

      public static LazyInitializedSingleton getInstance(){
          if(instance == null){
              instance = new LazyInitializedSingleton();
          }
          return instance;
          }
  }

  ```
