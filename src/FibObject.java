import java.util.ArrayList;

    public class FibObject implements FibonacciLike, Runnable {

        Object[] objects = new Object[100];

        //Field for knowing where to put next
        //Field for knowing where to get next
        //Field for knowing if there is space to put into
        // Fields
        ArrayList<Integer> Sequence;
        int amountofNumbersInSequence = 0;
        int number1 = 0;
        int number2 = 0;

        boolean calculateDone;

        public FibObject(int amountofNumbersInSequence, int number1, int number2) {
            this.amountofNumbersInSequence = amountofNumbersInSequence;
            this.number1 = number1;
            this.number2 = number2;
            Sequence = new ArrayList();
        }

        public void calculate() {
            Sequence.add(number1);
            Sequence.add(number2);
            for (int i = amountofNumbersInSequence - 2; i >= 0; i = i - 1) {
                int x = number2 + number1;
                Sequence.add(x);
                number1 = number2;
                number2 = x;

            }

            calculateDone = true;
            System.out.println(Thread.currentThread().getName() + " is done");

        }

        public boolean Print() {
            if (calculateDone) {
                for (Integer num : Sequence) {
                    System.out.print(num + " ");
                }
                System.out.println("");
                return true;
            }
            return false;
        }

        @Override
        public void run() {
            calculate();
        }
        public boolean put(Object obj) {
            return false;
        }
        public Object get() {
            return null;
        }
        }


