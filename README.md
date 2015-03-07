# JTCC

**JTCC** is a Java library to tokenize Thai text into a list of TCCs. The rules
used to determine TCCs' boundaries are implemented as grammar using [ANTLR](http://www.antlr.org/).

A compiled jar can be found [here](http://wittawat.com/software/JTCC-0.1.zip).


## What is TCC ?

TCC or *Thai Character Cluster* (proposed in [Character Cluster Based Thai Information Retrieval](http://portal.acm.org/citation.cfm?id=355225 ) is a group of inseparable Thai characters. This
inseparability derives from Thai writing system which is independent of any
context. As a result, TCC can be determined by a simple list of rules
describing e.g., what characters need to follow/precede other characters. 


## TCC Examples 

 * Input: ฉันฝากขวดขี้ผึ้งใส่ถุงให้เศรษฐี
 * Output TCCs: ฉัน|ฝา|ก|ข|ว|ด|ขี้|ผึ้|ง|ใส่|ถุ|ง|ให้|เศ|ร|ษ|ฐี|

 * Input: สะช้ะมาบ้ากิถิ้บีดี้ขึงทึ่งรือขื่อกุตุ้บสูตู่เละเส๊ะเขเป้
 * Output TCCs: สะ|ช้ะ|มา|บ้า|กิ|ถิ้|บี|ดี้|ขึ|ง|ทึ่|ง|รือ|ขื่อ|กุ|ตุ้|บ|สู|ตู่|เละ|เส๊ะ|เข|เป้|

Note that we only put the delimiter at the end of each TCC. 

## Applications of TCCs 
The TCC itself has no use to the end users. TCC is mostly used in a bigger
natural language processing system by acting as the first step of processing
input text. An obvious merit of TCC is that it can be used to eliminate
impossible word boundary positions in the running text. 

## Program Usage 

Calling JTCC from the command line is as simple as calling a normal executable
JAR file. Command-line JTCC has 3 modes.
 * Tokenize input from stdin
 * Tokenize the content in a file
 * Tokenize the string passed as a command line argument

General usage format is 

    java -jar JTCC-x.x <mode_keyword> [argument] 

Replace x.x with the version of JTCC in use.

### Tokenize input from stdin

Examples:

    echo "Some input here" | java -jar JTCC-x.x.jar stdin

This tokenizes the input passed from stdin and outputs to the default stdout
(screen). 

### Tokenize a content file=

Examples:

    java -jar JTCC-x.x.jar file C:/thaitext.txt

This tokenizes the content at the path C:/thaitext.txt, and outputs to the screen. 

### Tokenize specified input string=

Examples:

    java -jar JTCC.jar content "ตรงนี้เป็นเนื้อหาที่ต้องการตัด TCC. Content to tokenize into TCCs here." 

This tokenizes whatever string coming after the keyword "content" and outputs to the screen.

## Note 
JTCC is not a mature project nor does it provide a standard way of grouping
inseparable Thai characters. 

The term _inseparable_ is, in fact, ambiguous in some cases. For example, given
an input "ถุงให้", by relying on the original definition of TCC, the output TCCs
should be "ถุ|ง|ให้|". However, some might argue that the delimiter after "ถุ" can
be removed without much effort to make it as "ถุง|ให้|". One method to do so
might be to look ahead one more character. In this case, it is "ใ". Since "ใ"
cannot be grouped with "ง" (i.e.,/ it is impossible to have "งใ"), so it might
be tempting to group "ง" to the previous TCC, thus forming "ถุง".

I agree that this argument makes sense. But, be reminded that the goal of this
project is to create a library capable of tokenizing an input text into TCCs.
The mentioned idea above seems to go beyond TCC (probably to syllable level).
Therefore, we will stick with the global context-independent TCC tokenizing
rules for now. At least, the mentioned look-ahead strategy will not be
implemented in the near future.

## License 
![GPL v3](http://www.gnu.org/graphics/gplv3-127x51.png "GPL v3")

    JTCC is a Java package for tokenizing Thai text into a list of TCCs.
    Copyright (C) 2010 Wittawat Jitkrittum

    L1-LSMI is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see http://www.gnu.org/licenses/.
