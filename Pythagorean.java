class Pythagorean {

    public static void main (String[] args) {
        for (int a = 1; a <= 1000; a++) {
            for (int b = 1; b <= 1000; b++) {
                double c = (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
                if (a+b+c == 1000) {
                    System.out.print("A = " + a + ", B = " + b + ", C = " + c);
                    System.out.print("A x B x C" + (a * b * c));
                }
            }
        }
    }
}