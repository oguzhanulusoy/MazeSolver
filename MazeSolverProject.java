
public class MazeSolverProject {

    public static void main(String[] args) {
//        int grid = 5;
//        int[][] maze = getMaze(grid);
//
//        Stack path = new Stack();
//        State point = new State(1, 1, 0);
//        path.push(point);
//        maze[1][1] = 2;
//        MazeUtility.plotMaze(maze);
//        MazeUtility.Convert2D(str);

        MazeGenerator map = new MazeGenerator(20, 20); // haritayı oluşturur
        int[][] mapp = getMaze(10);
        mapp[8][6] = 2; // O nun başlangıç konumunu belirlr
        // ikinci kolon 0+girilen sayı = şeklinde çalışır. yatayda konum belirler.
        // ilk kolon 0+girilen sayı = şeklinde çalışır dikeyde konum belirler.
        MazeUtility.plotMaze(mapp); // haritayı çizer
//            String str = "O";
//            MazeUtility.Convert2D(str);

        // To do: Use the path stack to navigate in the maze and 
        // find a way to [2*grid-1, 2*grid-1] coordinates
    }

    public void solution(State point, int[][] maze) {

        State temp = point;
// initial position:
        int[][] north = {{0}, {1}}; // (x,y) -> (x, y-1)
        int[][] east = {{1}, {2}}; // (x,y) -> (x+1, y)
        int[][] south = {{2}, {1}}; // (x,y) -> (x, y+1)
        int[][] west = {{1}, {0}}; // (x, y) -> (x-1, y)

        // bu nedir aq
        int[][] temp_maze
                = {{1, 1, 1},
                {1, 0, 1},
                {1, 1, 0},
                {0, 1, 1}};

        State row = point;
        State column = point;
        Stack path = new Stack();

        while (temp.next.coor == null) {
            for (int i = 0; i < maze.length; i++) {
                if (row == null) {
                    path.push(row);
                    System.out.println("O");
                    row = row.next;
                }
                for (int j = 0; j < maze[0].length; j++) {
                    if (column == null) {
                        path.push(column);
                        System.out.println("O");
                        column = column.next;
                    }
                }
            }
        }

    }

    public static int[][] getMaze(int grid) {
        MazeGenerator maze = new MazeGenerator(grid);
        String str = maze.toString();

        int[][] maze2D = MazeUtility.Convert2D(str);
        return maze2D;
    }
}
