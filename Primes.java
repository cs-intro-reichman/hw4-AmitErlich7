

public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean arr[] = new boolean[n+1];
        arr[0] = false;
        arr[1] = false;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = true;
        }
        int counter = 0;
        int index = 2;
        System.out.println("Prime numbers up to " + n + ":");
        while (index < Math.sqrt(n)){
            for (int j = index; j < arr.length; j++){
                if (j % index == 0 && j != index){
                    arr[j] = false;
                }
            }
            index++;
           while(arr[index] == false){
                index++;
            }
        }
        for (int c = 2; c < arr.length; c++){
            if (arr[c] == true) {
                counter++;
                System.out.println(c);
            }
        }
        double precentage = (double)counter / n;
        precentage = precentage*100;
        System.out.println("There are " + counter + " primes between 2 and " + n + " (" + (int)precentage + "% are primes)");

    }
}