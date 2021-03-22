public class TestGame {
    public static void main(String[] args) {
        GamePlayer player1 = new GamePlayer();
        player1.setDimension(15, 15);
        player1.setPosition(60, 60);
        System.out.println("Lebarnya "+player1.getWidth()+" Tingginya "+player1.getHeight()+" Posisi Xnya "+player1.getX()+" Posisi Ynya "+player1.getY());
        player1.Run();
        player1.Run(30);

        GamePlayer player2 = new GamePlayer(25, 10, 15, 40);
        System.out.println("Lebarnya "+player2.getWidth()+" Tingginya "+player2.getHeight()+" Posisi Xnya "+player2.getX()+" Posisi Ynya "+player2.getY());
        player2.Run();
        player2.Run(15);

        GameEnemy enemy1 = new GameEnemy();
        enemy1.setDimension(25, 25);
        enemy1.setPosition(60, 60);
        System.out.println("Lebarnya "+enemy1.getWidth()+" Tingginya "+enemy1.getHeight()+" Posisi Xnya "+enemy1.getX()+" Posisi Ynya "+enemy1.getY());
        enemy1.Run();

        GameEnemy enemy2 = new GameEnemy(30, 10, 100, 90);
        System.out.println("Lebarnya "+enemy2.getWidth()+" Tingginya "+enemy2.getHeight()+" Posisi Xnya "+enemy2.getX()+" Posisi Ynya "+enemy2.getY());
    }
}