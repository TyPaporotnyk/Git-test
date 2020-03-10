package ua.simplecode;

public class BasicMath {
    public int sum(int i, int b){
        return i+b;
    }
    public double sum(double i, double b){
        return i+b;
    }
    public long sum(long i, long b){
        return i+b;
    }

    @Override
    public String toString() {
        return "returns a sum action";
    }
}
