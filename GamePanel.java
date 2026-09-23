

public class GamePanel extends Jpanel {

            private final Board board = Board();

            public GamePanel() [
                setPreferredSize(new Dimension(GameConstants, WIDTH, GameConstants, HEIGHT));

            ]

            @Override 
            protected void paintComponent(Graphics.g) {
                    super.paintComponent(g);

                    Graphics2D g2 = (Graphics2D) g;
                    board.draw(g2);

            }
          

}


