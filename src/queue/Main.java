package queue;


class Blog implements Comparable<Blog>{
    int id;
    String title, author, publisher;
    int numOfLines;

    public Blog(int id, String title, String author, String publisher, int numOfLines) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.numOfLines = numOfLines;
    }

    @Override
    public int compareTo(Blog blog) {
        if(this.numOfLines > blog.numOfLines){
            return 1;
        } else if (this.numOfLines > blog.numOfLines){
            return -1;
        }else {
            return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Queue Interface\n\n");

        System.out.println("PriorityQueue Queue implementation");


    }
}
