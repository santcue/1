package src.exercice17;

import javax.swing.*;

public class Numbers {
        private int start;
        private int end;
        public void showCycle() {
            for (int i = start; i <= end; i++) {
                JOptionPane.showMessageDialog(null, (i));
            }
        }
        public Numbers(int start, int end) {
            this.start = start;
            this.end = end;
        }
}
