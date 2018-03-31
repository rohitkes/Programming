/**
    Implement an iterator for an array of elements (like the iterators of set, list or map). 
    Implement next() and hasNext() only.
**/

public class InterviewMain {

    private CustomList<Integer> dataArray = new CustomList<>();
    
    public void initArray() {
        dataArray.add(1);
        dataArray.add(2);
        dataArray.add(3);
        dataArray.add(4);
    }
    
    public void printArray() {
        CustomIterator iter = dataArray.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}


public class CustomList<T> {

    Object<T> list = new Object<T>[10];
    
    public CustomList(int n) {
        list = new Object<T>[n];
    }
    public void add(T i) {
          
          int curr_size = list.size();
          list[curr_size] = i;
          
    }

    public CustomIterator<T> iterator() {
        // TODO
        return new CustomIterator<T>();
    }

    class CustomIterator<T> implements Iterator {
   
       int current_curr = -1;
       public boolean hasNext() {
           current_curr++;
           return list.size() != current_curr;
       }
       
       public T next() {
           return list[current_curr];
       }
    }

}
 