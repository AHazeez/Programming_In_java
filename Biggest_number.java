class biggest{
    public static void main(String[] args) {
        int a []={10,20,50,80};
        int big=a[0];
        for(int i=0;i<=a.length-1;i++){
            if(a[i]>big)
            {
                big=a[i];
            }

            }
            System.out.println("biggest number is "+big);
        }
    
}