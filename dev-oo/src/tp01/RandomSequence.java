public class RandomSequence {
    public static void main(int nbElt, int maxVal, String type){
        if(type == "INTEGER") {
            for(int i=0; i<nbElt; i++) {
                System.out.println((int)(Math.random()*maxVal));
            }
        } else {
            for(int i=0; i<nbElt; i++) {
                System.out.println(Math.random()*maxVal);
            }
        }
    }
}
