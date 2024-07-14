// print all negative elements in an array.


class q1{
    public static void main(String[] args) {
        int array[]={3,-8,9,8,-5,-6,-8,-2};
        System.out.println("enter the elements of array");
        for(int i=0;i<array.length;i++)
        {
            if(array[i]<0){
                System.out.println(array[i]+"");
            }
        }
    }
}