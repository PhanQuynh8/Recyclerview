package com.example.recycleview_buoi5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MyAdapter.OnItemClickListener {

    private RecyclerView recyclerView;
    private MyAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);

        adapter = new MyAdapter(getItemList(), this);
        recyclerView.setAdapter(adapter);

    }

    private List<MyItem> getItemList() {
        List<MyItem> itemList = new ArrayList<>();

        MyItem myItem1 = new MyItem(R.drawable.chientranhhoabinh, "Chiến tranh và hòa bình", "Chiến tranh và hòa bình (tiếng Nga: Война и мир) là một tiểu thuyết của Lev Nikolayevich Tolstoy, được xuất bản rải rác trong giai đoạn 1865–1869. Tác phẩm được xem là thành tựu văn học xuất sắc nhất của Tolstoy, cũng như một tác phẩm kinh điển của văn học thế giới"
                + "\n"+
                "Tiểu thuyết Chiến tranh và hòa bình được Lev Tolstoy khởi thảo vào năm 1863 và gửi in tại nhà Russki Vestnik từ năm 1865 đến năm 1869 thì hoàn thành, không kể nhiều năm tiếp theo liên tục được chính tác giả sửa chữa trong các lần tái bản. Người ta thống kê được chừng 10.000 bản nháp mà Lev Tolstoy dùng để sửa chữa tác phẩm của mình.");
        MyItem myItem2 = new MyItem(R.drawable.gietconchimnhai, "Giết con chim nhại", "Giết con chim nhại (nguyên tác tiếng Anh: To Kill a Mockingbird) là cuốn tiểu thuyết của Harper Lee;" +
                " đây là cuốn tiểu thuyết rất được yêu chuộng, thuộc loại bán chạy nhất thế giới với hơn 10 triệu bản. Cuốn tiểu thuyết được xuất bản vào năm 1960 và đã giành được giải Pulitzer cho tác phẩm hư cấu năm 1961. Nội dung tiểu thuyết dựa vào cuộc đời của nhiều bạn bè và họ hàng tác giả, nhưng tên nhân vật đã được thay đổi.\n" +
                "\n" +
                "Giết con chim nhại lấy bối cảnh Alabama, một tiểu bang miền Nam rất nặng thành kiến phân biệt chủng tộc và được viết trong thời gian mà phong trào đấu tranh của những người da màu, nhất là của Martin Luther King, Jr., đang lan rộng tới tầm cỡ quốc gia." +"\n" +
                "Rõ nhất là vụ Tẩy chay xe buýt ở Mongomery, Alabama; kéo dài từ tháng 12 năm 1955 đến tháng 12 năm 1956, với kết quả là một phán quyết của Tối cao pháp viện tuyên bố các luật phân cách chỗ ngồi trên xe buýt theo màu da được áp dụng ở Montgomery và cả Alabama là vi hiến. Nên không ngạc nhiên gì khi chủ đề lớn của tác phẩm là vấn đề phân biệt chủng tộc.");
        MyItem myItem3 = new MyItem(R.drawable.tiengchimhot, "Tiếng chim hót trong bụi mận gai", "Tiểu thuyết \"Tiếng chim hót trong bụi mận gai\" của nữ văn sĩ Colleen McCullough, ngay khi vừa xuất bản (1977) đã được dịch ra nhiều thứ tiếng và được xếp ngang hàng với tác phẩm văn học kinh điển \"Cuốn theo chiều gió\"\n" +
                "\n" +
                "Nhưng ít ai biết được rằng, thời điểm tác phẩm ra đời, viết văn chỉ là nghề tay trái của Colleen McCollough, nhân viên y tế là nghề chính của bà.\n" +
                "\n" +
                "Năm 1974, bà viết tiểu thuyết đầu tay nhưng không có tiếng tăm. \"Tiếng chim hót trong bụi mận gai\" được thai nghén trong ngót 4 năm, rồi đầu mùa hè năm 1975, bà bắt tay vào viết một mạch trong 10 tháng. Suốt thời gian ấy, bà vẫn túi bụi công việc ở bệnh viện, chỉ viết tác phẩm vào ban đêm và ngày chủ nhật.");
        MyItem myItem4 = new MyItem(R.drawable.khonggiadinh, "Không gia đình", "Không gia đình (tiếng Pháp: Sans famille), còn được dịch là Vô gia đình, có thể được xem là tiểu thuyết nổi tiếng nhất của nhà văn Pháp Hector Malot, được xuất bản năm 1878. Tác phẩm đã nhận được giải thưởng của Viện Hàn lâm Văn học Pháp."
                +"\n"+
                "Tác phẩm phác họa nhiều nhân vật, dù quan trọng nhiều hay ít, đã giúp đỡ cậu bé Rémi trên hành trình của cậu cũng như trong cuộc sống của cậu, đặc biệt là đi tìm gia đình thật của cậu.");
        MyItem myItem5 = new MyItem(R.drawable.nhungnguoikhonkho, "Những người khốn khổ", "Những người khốn khổ (Tiếng Pháp: Les Misérables) là tiểu thuyết của văn hào Pháp Victor Hugo, được xuất bản năm 1862. Tác phẩm được đánh giá là một trong những tiểu thuyết nổi tiếng nhất của nền văn học thế giới thế kỷ 19." +
                "\n"+
                "Những người khốn khổ là câu chuyện về xã hội nước Pháp trong khoảng hơn 20 năm đầu thế kỷ 19 kể từ thời điểm Napoléon I lên ngôi và vài thập niên sau đó. Nhân vật chính của tiểu thuyết là Jean Valjean, một cựu tù khổ sai tìm cách chuộc lại những lỗi lầm đã gây ra thời trai trẻ. " +
                "\n"+
                "Bộ tiểu thuyết không chỉ nói tới bản chất của cái tốt, cái xấu, của luật pháp, mà tác phẩm còn là cuốn bách khoa thư đồ sộ về lịch sử, kiến trúc của Paris, nền chính trị, triết lý, luật pháp, công lý, tín ngưỡng của nước Pháp nửa đầu thế kỷ 19. Chính nhà văn Victor Hugo cũng đã viết cho người biên tập rằng: \"Tôi có niềm tin rằng đây sẽ là một trong những tác phẩm đỉnh cao, nếu không nói là tác phẩm lớn nhất, trong sự nghiệp cầm bút của mình\"");
        MyItem myItem6 = new MyItem(R.drawable.suoinguon, "Suối nguồn", "Suối nguồn (tiếng Anh: The Fountainhead) là một tiểu thuyết xuất bản năm 1943 của nhà văn nữ Ayn Rand. Đây là tác phẩm thành công đại chúng đầu tiên của bà." +
                "\n" +
                "Nhân vật chính của tác phẩm, Howard Roark, là một kiến trúc sư trẻ theo chủ nghĩa cá nhân, quyết chọn cho mình con đường tranh đấu dù đầy chông gai hơn là phải đem đam mê và quan điểm của mình ra để thỏa hiệp. Tác phẩm theo dấu hành trình của anh trên con đường hoạt động kiến trúc theo trường phái hiện đại, trường phái mà anh cho là ưu việt hơn so với lối kiến trúc truyền thống mà hầu hết tất cả mọi người tôn thờ.");

        itemList.add(myItem1);
        itemList.add(myItem2);
        itemList.add(myItem3);
        itemList.add(myItem4);
        itemList.add(myItem5);
        itemList.add(myItem6);

        return itemList;
    }

    public void onItemClick(MyItem myItem) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("item", myItem.getText());
        startActivity(intent);
    }

}