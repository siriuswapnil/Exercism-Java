public class Twofer {
    public String twofer(String name) {
        String expected;
        if(name == null){
            expected = "One for you, one for me.";
        }
        else if(name == ""){
            expected =  "One for , one for me.";
        }
        else{
            expected =  "One for "+name+", one for me.";     
        }
        return expected;     
        }
}
