class  Bookclass{
    String title;
    String Creator;
    String Publisher;
    int Year;
    Bookclass(String Book_title,String Book_creator,String Book_publisher,int Book_year){
        title=Book_title;
        Creator=Book_creator;
        Publisher=Book_publisher;
        Year=Book_year;
    }
    public void get_bookid(){
        System.out.print("Judul    :"+title+"\nPengara  :"+Creator+"\nPenerbit :"+Publisher+"\nTahun    :"+Year);
    }
}

public class Book{
    public static void main(String[] args){
        Bookclass getbook= new Bookclass("Pemrograman Berbasis Objek","Indrajani","Elex Media Komputindo",2007);
        getbook.get_bookid();
        System.out.println("\n\n");


        Bookclass getbook2=new Bookclass("Dasar Pemrograman Java","Abdul Kadir","Andi Offset",2004);
        getbook2.get_bookid();
    }
}