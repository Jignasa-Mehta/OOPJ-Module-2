class Exercise {
    public static void main(String[] args)
    {
        // Unboxing
      /* String s1="false";
       String s2="223.56f";
       String s3="1235.897";
       boolean b=Boolean.parseBoolean(s1);
       float n1=Float.parseFloat(s2);
       double n2=Double.parseDouble(s3);
       System.out.println(b); 
       System.out.println(n1);
       System.out.println(n2); */

       //Boxing
       int a=25;
       float b=45.54f;
       double d=234.67;
       String s1=String.valueOf(a);
       String s2=String.valueOf(b);
       String s3=String.valueOf(d);
       System.out.println(s1); 
       System.out.println(s2);
       System.out.println(s3);
}
}