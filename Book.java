import java.util.*;

class Library {
      int bookId;
      String bookname;
      String authorName;

      Library(int bookId,String bookname,String authorName){
       this.bookId = bookId;
       this.bookname= bookname;
       this.authorName= authorName;
      }
}


class Book{
      public static void main(String... jfh){
    
        ArrayList<Library> obj = new ArrayList<>(); // obj of the arryList class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Information :");
        int size = sc.nextInt();
        for(int i=0; i<size; i++){
           System.out.print("Enter the Book Information :");
           int id = sc.nextInt();
           String bookname =sc.next();
           String  authorname =sc.next();
           obj.add(new Library(id, bookname, authorname));
        }

         Iterator<Library> it = obj.iterator();
        while (it.hasNext()) {
            Library lib = it.next();
            System.out.println("[ Book ID: " + lib.bookId + ", Book Name: " + lib.bookname + ", Author Name: " + lib.authorName+ " ]");
        }

      }
}
