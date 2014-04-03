PixelNotes
==========

###Background
PixelNotes reads a given input of an image in 'jpg' format and outputs a textfile of the altered compositional matrix.
This matrix can then be interpreted as input notes for a Max MSP composition.

Please read the following chart to understand the mathematical relationship between tones:

| Semitone      | Ratio |       | Interval |
| ------------- | ------------- | ------------------ |
| 0 | 1:1 | unison |
| 1 | 16:15 | minor semitone |
| 2 | 9:8	| major second |
| 3 | 6:5 | minor third |
| 4 | 5:4 | major third |
| 5 | 4:3 | perfect fourth |
| 6 | 45:32 | diatonic tritone |
| 7 | 3:2 | perfect fifth |
| 8 | 8:5 |  minor sixth|
| 9 | 5:3 | major sixth |
| 10 | 9:5 | minor seventh |
| 11 | 15:8 | major seventh |
| 12 | 12:1 | octave |


###Future Updates
PixelNotes will be made compatible to interpret an image in various ways.
Each interpretation will be given its own class in Java. 
From this, we will be able to create classes that compose in particular states of emotion.
For example:

1. A class for Happy, Sad, Scared, Relaxed, Motivated ect.. This will influence more variables (tempo, tone, rhythm, dynamics)
2. Relating the color wheel to the Circle of Fifths
3. **We also need to find a way to understand the whole image rather than its individual colors.** Future expansion may include the ability for cluster detection.
