package ADT.T6;

public class MyStack {
    private Student[] s;
    int size;
    int top= 0;

    public MyStack(int size) {
        //open MyStack and size the array of MyStack that have lenght = size
        s = new Student[size];
        this.size = size;

    }
    
    public void push(Student s) {
        //add the new object but it'ill be on top of stack
        this.s[top] = s;
        //when add new object on top, the top number will plus one
        top++;
    }
    public void pop(){
        //the top one will be 'pop' out
        System.out.println("Now pop out the "+s[top-1].name+","+s[top-1].age);
        this.s[top] = null;
        top--;
        
    }
    public void peek(){
        //need to use.name and .age with s[i] too, Otherwies it's will show location of the object instead of name and age
        System.out.println("Top of the stack is : "+s[top-1].name+","+s[top-1].age+" At index "+ (top-1));
    }
    public boolean isEmpty(){
        int count = 0;
        for(int i = 0; i < s.length ; i++){
            if(s[i] == null){
                count++;
            }
        }
        return count == s.length;
    }
    //this one if "all" of the array fulfill with student object will return false
    public boolean isFull(){
        int count = 0;
        for(int i = 0; i < s.length ; i++){
            if(s[i] != null){
                count++;
            }
        }
        return count == s.length;
    }
    public void search(String fname){
        //error when it detected that another array that create didn't have a value(it's null) 
        //so i decided to use top-1 to keep it not to error
        //and if you want you can write the System out "For the "+size-(top-1)+" isn't have a student yet.>>"
        for(int i = 0; i <= top-1 ; i++){
            if(s[i].name == fname){
                System.out.println("Search successful");
                System.out.println(s[i].name+","+s[i].age+" At index :"+i);
                //>>right here
                break;
            }else {
                System.out.println("We couldn't find your name.");
            }
        }
    }
    //Checking all element in stack, just make sure the object is in the array
    public void show(){
        System.out.println("================[All in stack]================");
        for(int i = 0; i <= top-1 ;i++){
            System.out.println(s[i].name+" At index :"+i);
        }
        System.out.println("==============================================");
    }
    public static void main(String args[]){
        MyStack ad= new MyStack(10);
        ad.push(new Student("Supachok",18));
        ad.push(new Student("Boi", 20));
        System.out.println();
        ad.peek();
        System.out.println("Is this stack empty : "+ad.isEmpty());
        System.out.println("Is this stack full : "+ad.isFull());
        ad.show();
        ad.search("Supachok");
        ad.pop();
        ad.show();
        
        

    }
    
    
}
