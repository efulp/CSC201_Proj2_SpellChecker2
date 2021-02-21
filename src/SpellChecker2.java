/**
 * This program checks the spelling of a text file, where the dictionary
 * and text-file are command line arguments (in that order). Improved to
 * use self-organized doubly-linked lists.
 *
 * Usage:
 *   java SpellChecker2 [-c|-t|-s] dictionary.txt text_file.txt
 *
 * @author Nirre Pluf {@literal <pluf@wfu.edu>}
 * @version 0.2, Jan. 21, 2021
 */

class SpellChecker2 {
    /**
     * main method, where the magic starts...
     *
     * @param args String[], management, dictionary, then text file
     */
    public static void main(String[] args) {
        WCLinkedList dictionary = null;  // list of dictionary words
        WCLinkedList misspelled = null;  // list of misspelled words
        WCLinkedList unique = null;      // list of unique words

        /* assuming arguments are correct, but you should not... */
        if(args[0].equals("-t")) {
            dictionary = new TWCLinkedList();
            misspelled = new TWCLinkedList();
            unique = new TWCLinkedList();
        }

        /* place interesting code here, hear? */

    }
}
