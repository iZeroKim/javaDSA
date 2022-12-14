package queue;


import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

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

    /**
     * Queue iteration function
     * @param blogQueue
     */
    private static void iterate(Queue<Blog> blogQueue) {
        Iterator iterator = blogQueue.iterator();
        while(iterator.hasNext()){
            Blog currentBlog = ((Blog) iterator.next());
            System.out.println(currentBlog.id + " " + currentBlog.title);
        }
    }
    public static void main(String[] args) {
        System.out.println("Queue Interface\n\n");

        System.out.println("PriorityQueue Queue implementation");

        Queue<Blog> blogQueue = new PriorityQueue<Blog>();
        Blog blog1 = new Blog(1, "See us", "Samuel", "Kimani", 2);
        Blog blog2 = new Blog(2, "See them", "Allan", "Alex", 4);

        blogQueue.add(blog1);
        blogQueue.add(blog2);

        System.out.println("Queue traversal");


        iterate(blogQueue);

        blogQueue.poll();

        System.out.println("Queue after removing element");
        iterate( blogQueue);


    }


}