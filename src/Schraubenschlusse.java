public class Schraubenschlusse {
    private int left;
    private int right;

    Schraubenschlusse(int left, int right){
        this.left=left;
        this.right=right;
    }

    int _left(){
       return left--;
    }

    int _right(){
        return right--;
    }

    int returnLeft(){
        return left++;
    }

    int returnRight(){
        return right++;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }
}
