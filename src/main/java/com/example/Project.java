package com.example;

import com.birdbrain.Finch;

public class Project{
    public static void main(String[] args) {
        //instantiate the bird
        Finch bird = new Finch();


//create a 1d array of music notes to be played 
int[] notes = {
62, 63, 64, 72, 62, 72, 62, 72,
72, 74, 75, 76, 72, 74, 76, 71, 74, 72
};
//these are the rest notes in the song that we play
double[] pauses = {
0.3, 0.3, 0.3, 0.6, 0.3, 0.6, 0.3, 1.5,
0.3, 0.3, 0.3, 0.3, 0.3, 0.3, 0.7, 0.3, 0.6
};
//this starts the bird to rotate and spin while playing the song
bird.setTurn("L", 180, 200);
bird.setMotors(30, 30);
bird.pause(1);
bird.setMotors(-30, 30);
bird.pause(2);

//this flashes the colors before the music starts playing. we basically just put random RGB values and looped them
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

// Loop through the notes array to play each note
for (int i = 0; i < notes.length; i++) {
    // The bird object plays a note from the notes array
    // notes[i][0] represents the midi value and notes[i][3] represents the duration
    bird.playNote(notes[i][0], notes[i][3]);

    // Check if there is a pause in the pauses array
    if (i < pauses.length) {
        // If a pause exists, the bird object pauses for the specified duration
        bird.pause(pauses[i]);
    }
}

bird.setTail("all", 100, 0, 100); // Pink tail flash

       
bird.pause(0.4);

//end the bird 
        bird.stop();
        bird.disconnect();
    }

}