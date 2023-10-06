class Data{

        private String name;
        public void getname(){
         return   this.name;
        }
        public void setname(String name)
        {
            this.name =name;
        }
}
public class Main{
    public static void main(String[] main)
    {
        Data d=new Data();
        d.name ="JAVA";
        System.out.println(d.getname());
    }
}