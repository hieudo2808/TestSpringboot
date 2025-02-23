docker run -e "ACCEPT_EULA=Y" -e "MSSQL_SA_PASSWORD=KyThuatPhanMem@123" -p 1444:1433 --name sqlsrv --hostname sqlsrv -d mcr.microsoft.com/mssql/server:2022-latest
Thông tin: Mật khẩu: KyThuatPhanMem@123
username: sa
Phiên bản CSDL: MSSQL Server 2022
Ánh xạ: Cổng 1444 trên máy -> Cổng 1433 trên docker
Server name đăng nhập: localhost,1444

Vế cấu trúc thư mục:
JPA giống như một cây cầu giữa Java và cơ sở dữ liệu. Hãy tưởng tượng JPA là một chú phiên dịch viên giúp Java hiểu và giao tiếp với cơ sở dữ liệu. Khi chúng ta muốn lưu trữ hay lấy dữ liệu từ cơ sở dữ liệu, JPA sẽ dịch các yêu cầu của Java thành ngôn ngữ mà cơ sở dữ liệu có thể hiểu và ngược lại -> không cần viết mã lệnh SQL phức tạp mà chỉ cần làm việc với các đối tượng Java.

RestController giống như một nhân viên giao dịch trong ngân hàng. Nó sẽ nhận các yêu cầu từ người dùng và sau đó thực hiện các hành động cần thiết. Khi có ai đó gọi đến ứng dụng của bạn qua mạng internet, RestController sẽ xử lý yêu cầu này và trả về câu trả lời. Nhờ RestController, người dùng có thể tương tác với hệ thống qua các phương thức GET, POST, PUT, và DELETE.

Repository giống như một cuốn sổ tay giúp bạn quản lý việc lưu trữ và tìm kiếm thông tin. Nó là nơi mà bạn có thể ghi nhớ các lệnh để làm việc với dữ liệu. 
Trước khi làm việc với dữ liệu, hẳn là ta sẽ cần bước xử lý dữ liệu đó. Service đóng vai trò xử lý logic nghiệp vụ của ứng dụng. Ví dụ, nếu bạn có quy tắc đặc biệt khi thêm người dùng mới (kiểm tra xem email có hợp lệ hay không), thì Service sẽ chịu trách nhiệm xử lý điều đó trước khi gửi dữ liệu cho Repository.
Liên quan đến Repository, DTO là một mô hình đối tượng trong lập trình được sử dụng để truyền dữ liệu giữa các lớp hoặc các tầng của ứng dụng, đặc biệt là giữa client (giao diện người dùng) và server (hệ thống xử lý). Mục tiêu chính của DTO là đóng gói dữ liệu và giảm bớt thông tin không cần thiết khi trao đổi dữ liệu, giúp cho quá trình truyền tải dữ liệu trở nên hiệu quả hơn.

Entity giống như một chiếc hộp chứa thông tin. Nếu bạn nghĩ về bảng trong cơ sở dữ liệu, mỗi Entity sẽ tương ứng với một hàng trong bảng đó. Entity giúp bạn tổ chức và lưu trữ thông tin trong Java như một đối tượng, và nó sẽ được lưu trữ tương ứng trong cơ sở dữ liệu. Ví dụ, nếu bạn có bảng User trong cơ sở dữ liệu với các cột là name và email, thì User trong Java là một Entity có các thuộc tính name và email.

=>
JPA giúp chúng ta không phải viết lệnh SQL phức tạp, làm việc với dữ liệu dễ hơn thông qua các đối tượng Java.
RestController giúp ứng dụng của bạn nhận và xử lý các yêu cầu từ internet, cho phép người dùng tương tác với hệ thống.
Repository giúp bạn quản lý và tìm kiếm dữ liệu một cách dễ dàng mà không cần phải tự viết các lệnh phức tạp.
Entity giúp bạn lưu trữ dữ liệu trong các đối tượng Java và làm việc với dữ liệu dễ hơn khi truyền qua lại giữa Java và cơ sở dữ liệu.

Lưu ý khi sử dung Postman:
Trong Courses có các trường có _ ở dưới, ví dụ như course_id. Khi ta dụng postman để kiểm tra API, ta phải sử dụng nó dưới dạng courseId (Xóa _, ký tự ngay sau đó sẽ in hoa)

Cách hủy port nếu có xung đột:
B1: Tìm UID thông qua port:
netstat -ano | findstr: <Port>
VD: netstat -ano | findstr :1433
B2: Xóa PID tương ứng:
taskkill /PID <PID> /F
VD: taskkill /PID 95142 /F