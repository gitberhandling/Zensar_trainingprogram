public class book {
static int totalbooks;
String title;
String author;
int bookid;
static {
totalbooks=0;
System.out.println("static block executed:totalbooks initialized to 0");
}
{
bookid=totalbooks+1;
totalbooks++;
System.out.println("instance block executed:bookid initialzed to "+bookid);
}
public book(String title,String author){
this.title=title;
this.author=author;
System.out.println("book title="+title);
System.out.println("author="+author);
}
public void displaybookdetails(){
System.out.println("bookid:"+bookid);
System.out.println("title:"+title);
System.out.println("author:"+author);
}
public static void displaytotalbooks(){
System.out.println("total books in library:"+totalbooks);
}
public static void main(String[] args){
book book1=new book("to kill a mockingbird","harper");
book1.displaybookdetails();
System.out.println("-----------------------");
book book2=new book("1984","george orwell");
book2.displaybookdetails();
System.out.println("-----------------------");
book book3=new book("the great gatsby","f. scott");
book3.displaybookdetails();
System.out.println("-----------------------");
book.displaytotalbooks();
}
}
