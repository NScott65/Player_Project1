public class Main {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player("Noah", 34, -78, 32);
        Player player3 = new Player("Noah2", 24,-65,65,87,2);
        System.out.println(player1.toString());
        System.out.println();
        System.out.println(player2.toString());
        System.out.println();
        System.out.println(player3.toString());
    }
}