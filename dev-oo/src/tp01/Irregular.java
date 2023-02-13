public class Irregular {
    int[][] content;
    public Irregular(int[][] content){
        this.content = content;
    }
    public void randomFilling(){
        for(int i=0; i<content.length; i++) {
            for(int j=0; j<content[i].length; j++) {
                content[i][j] = (int)(Math.random()*10);
            }
        }
    }
    public void display(){
        for(int i=0; i<content.length; i++) {
            for(int j=0; j<content[i].length; j++) {
                System.out.print(content[i][j]);
                System.out.print(" ");
            }
            System.out.println();
            System.out.println();
        }
    }
}