package part3;

abstract class instrument{
    abstract void play();
    String what(){
        return "Instrument is ";
    }
    abstract void adjust();
}

class wind extends instrument{
    void play(){
        System.out.println("Wind instrument played");
    }
    String what(){
        String s1 = super.what();
        String s2 = "flute";
        return s1+s2;
    }
    void adjust(){
        System.out.println("Instrument tuned Properly");
    }
}
class precussioin extends instrument{
    void play(){
        System.out.println("precussioin instrument played");
    }
    String what(){
        String s1 = super.what();
        String s2 = "timpani";
        return s1+s2;
    }
    void adjust(){
        System.out.println("Instrument tuned Properly");
    }
}

class stringed extends instrument{
    void play(){
        System.out.println("Wind instrument played");
    }
    String what(){
        String s1 = super.what();
        String s2 = "guitar";
        return s1+s2;
    }
    void adjust(){
        System.out.println("Instrument tuned Properly");
    }
}

class woodWind extends wind{
    void play(){
        System.out.println("Wind instrument played");
    }
    String what(){
        String s1 = super.what();
        String s2 = "Woodwind";
        return s1+s2;
    }
}
class brass extends wind{
    void play(){
        System.out.println("brass instrument played");
    }
    String what(){
        String s1 = super.what();
        String s2 = "Brass";
        return s1+s2;
    }
}
public class pra3_1{
    public static void main(String[] args) {
        wind ob = new wind();
        ob.play();
        String str = ob.what();
        System.out.println(str);
        ob.adjust();
    }
}