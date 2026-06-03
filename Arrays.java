public class Arrays {
    public static void main(String[]args){
        //primitive array means using primitive  datatypes in array
        int [] marks ={90,95,85,68,77};
        int size = marks.length;
        for(int i=0; i<size;i++){
            System.out.print(marks[i]+" ");
            System.out.println();
        }
        //non-primitive datatypes
        String []name ={"Shubham","sahil","Ram","Aditya"};
        for(int i=0;i<name.length;i++){
            System.out.println(name[i]+" ");
        }

    }
}
