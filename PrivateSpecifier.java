class Data{

        private String name;
        public void set(String n){
        name=n;
        }
        public void get()
        {
           System.out.println(name);
        }
}
public class Main{
    public static void main(String[] main)
    {
        Data d=new Data();
        d.set("Kshitij Marotkar");
            d.get();
    }
}
