class small_number {
    public static void main(String[] args) {
        int a []={10,20,50,80};
        int small=a[0];
        for(int i=0;i<=a.length-1;i++){
            if(a[i]<small)
            {
                small=a[i];
            }

            }
            System.out.println("smallest number is "+small);
        }
    
}