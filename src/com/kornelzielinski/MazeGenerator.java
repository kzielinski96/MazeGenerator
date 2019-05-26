public class MazeGenerator {

    /**
     * Help loop to reduce the code
     *
     * @param val
     *            how many times to perform the loop
     * @param string
     *            what to print in the loop
     */
    public static void helpLoop (int val, String string) {
        for (int i = 0; i < val; i++) {
            System.out.print(string);
        }
    }

    /**
     * Function that prints the maze
     *
     * @param len
     *            length of the maze
     */
    public static void printMaze(int len) {
        String ver = "+----";
        String hor = "|";
        String hall = "     ";

        helpLoop(len, ver);
        System.out.print("+" + "\n");
        helpLoop(len, hall);
        System.out.print(hor + "\n");
        helpLoop(len-1, ver);
        System.out.println("+    +");

        for (int j = 0; j < len-1; j++) {
            helpLoop(len-1, hall);
            System.out.println(hor + "    " + hor);
            helpLoop(len-1,hall);
            System.out.println("+    +");
        }
    }

    public static void main(String[] args) {
        printMaze(7);
    }
}