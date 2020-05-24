public class Main {
    public static void main(String[] args) throws InterruptedException{
        long startTime, finishTime;
        double parPi;
        startTime = System.currentTimeMillis();
        parPi = new MonteCarloPi().getPiParallel();
        finishTime = System.currentTimeMillis() - startTime;
        System.out.println("Time: " + finishTime + "ms");
        System.out.println("Pi: " + parPi);
    }
}
