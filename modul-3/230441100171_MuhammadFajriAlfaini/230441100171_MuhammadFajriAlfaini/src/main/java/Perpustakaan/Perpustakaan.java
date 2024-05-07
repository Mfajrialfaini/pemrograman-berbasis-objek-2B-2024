package Perpustakaan;

import java.util.ArrayList;

public class Perpustakaan {
    //Merupakan sebuah ArrayList yang akan menyimpan semua item yang ada di perpustakaan. 
    //Setiap elemen dalam ArrayList ini merupakan objek dari kelas Item.
    ArrayList<Item> listItems = new ArrayList<>();

    public void tambahItem(Item item) {
    //untuk menambahkan item baru ke dalam perpustakaan. Metode ini menerima objek Item 
    //sebagai parameter dan menambahkannya ke dalam ArrayList listItems.
        listItems.add(item);
    }

    public void tampilSemuaItem() {
        for (Item item : listItems) {
            item.display();
        }
    }
}
