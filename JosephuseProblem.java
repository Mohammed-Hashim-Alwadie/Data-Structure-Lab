package H.W4;

/**
 * Created by MBH on 25/02/22.
 */
public class JosephuseProblem {
    CicleQueue<Integer> cicleQueue = new CicleQueue<>();

    public void Circle(int K, int L) {
        for (int i = 1; i <= K; i++) {
            cicleQueue.enqueue(i);
        }


        while (cicleQueue.size() > 1) {
            for (int i = 1; i <= L; i++) {
                if (i == L) {
                    System.out.println(cicleQueue.dequeue());
                    break;
                }
                cicleQueue.rotet();
            }

        }
        System.out.println("Size "+cicleQueue.size());
        System.out.println("First "+cicleQueue.first());


    }

}

