public class SingletonPatternDemo{
    public static void main(String[] args){
        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //Singleobject object = new Singleobject();
        //Get the only object available
        SingleObject object = SingleObject.getInstance();
        //show the message
        object.showMessage();
    }
}