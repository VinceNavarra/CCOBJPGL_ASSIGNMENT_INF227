public class App {
  
    static boolean iwillReview = true;
    static boolean iwillNotFail = true;

    public static void main(String[] args) throws Exception {   

        App myApp = new App();

        // precondition
        assert iwillReview == true: "bugsh bagsak";

        // postcondition
        assert iwillNotFail == false: "bagsak ako ma";

    }

    void Study(){
        
        iwillNotFail = false;
    }


}
