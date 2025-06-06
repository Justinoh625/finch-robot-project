package com.example;

import com.birdbrain.Finch;

public class Project{
    public static void main(String[] args) {
        Finch bird = new Finch();



int[] notes = {
62, 63, 64, 72, 62, 72, 62, 72,
72, 74, 75, 76, 72, 74, 76, 71, 74, 72
};

double[] pauses = {
0.3, 0.3, 0.3, 0.6, 0.3, 0.6, 0.3, 1.5,
0.3, 0.3, 0.3, 0.3, 0.3, 0.3, 0.7, 0.3, 0.6
};

bird.setTurn("L", 180, 200);
bird.setMotors(30, 30);
bird.pause(1);
bird.setMotors(-30, 30);
bird.pause(2);

for (int i = 0; i < 2; i++) {
bird.setTail("all", 34, 62, 70);
bird.pause(0.4);
bird.setTail("all", 9, 15, 19);
bird.pause(0.4);
bird.setTail("all", 74, 7, 62);
bird.pause(0.4);
bird.setTail("all", 100, 62, 92);
bird.pause(0.4);
}


for (int i = 0; i < notes.length; i++) {
bird.playNote(notes[i], 0.3);
if (i < pauses.length) {
bird.pause(pauses[i]);
}
}

bird.setTail("all", 100, 0, 100); // Pink tail flash

       
bird.pause(0.4);


        bird.stop();
        bird.disconnect();
    }

}