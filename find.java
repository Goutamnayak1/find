class find{
    int a = 35;
    int b = 10;
    int max = 0;
    int min = 0;
    int sum = 0;
    double avg = 0;

    public void minmax() {
        max = b;
        min = a;
        if (max < a) {
            max = a;
        }
        else {
            max = b;
        }
        System.out.println("Max: " + max);

        if (min > b) {
            min = b;
        }
        else {
            min = a;
        }
        System.out.println("Min: " + min);
    }
    void sum() {
        sum = a + b;
        System.out.println("Sum: " + sum);
    }
    void avg() {
        avg = (double) sum / 2;
        System.out.println("Avg: " + avg);
    }
    public static void main(String[] args) {
        find f = new find();
        f.minmax();
        f.sum();
        f.avg();
    }
}