PixelNotes
==========

###Background
PixelNotes reads a given input of an image in 'jpg' format and outputs a textfile of the altered compositional matrix.
This matrix can then be interpreted as input notes for a Max MSP composition.

Please read the following chart to understand the mathematical relationship between tones:
| Semitone      | Ratio         |
| ------------- | ------------- |
| 0             | 1:1           |
| 1             | 16:15         |
| 2             | 9:8	          |
| 3             | 6:5           |
| 4             | 5:4           |
| 5             | 4:3           |
| 6             | 45:32         |
| 7             | 3:2           |
| 8             | 8:5           |
| 9             | 5:3           |
| 10            | 9:5           |
| 11            | 15:8          |
| 12            | 12:1          |

| Left align | Right align | Center align |
|:-----------|------------:|:------------:|
| This       |        This |     This     
| column     |      column |    column    
| will       |        will |     will     
| be         |          be |      be      
| left       |       right |    center    
| aligned    |     aligned |   aligned

| First Header  | Second Header |
| ------------- | ------------- |
| Content Cell  | Content Cell  |
| Content Cell  | Content Cell  |

Semitone	Ratio	Interval	Natural	Half Step
0	1:1	unison	480	0
1	16:15	minor semitone	512	16:15
2	9:8	major second	540	135:128
3	6:5	minor third	576	16:15
4	5:4	major third	600	25:24
5	4:3	perfect fourth	640	16:15
6	45:32	diatonic tritone	675	135:128
7	3:2	perfect fifth	720	16:15
8	8:5	minor sixth	768	16:15
9	5:3	major sixth	800	25:24
10	9:5	minor seventh	864	27:25
11	15:8	major seventh	900	25:24
12	2:1	octave	960	16:15

###Future Updates
PixelNotes will be made compatible to interpret an image in various ways.
Each interpretation will be given its own class in Java. 
From this, we will be able to create classes that compose in particular states of emotion.
For example:

1. A class for Happy, Sad, Scared, Relaxed, Motivated ect.. This will influence more variables (tempo, tone, rhythm, dynamics)
2. Relating the color wheel to the Circle of Fifths
3. **We also need to find a way to understand the whole image rather than its individual colors.** Future expansion may include the ability for cluster detection.
