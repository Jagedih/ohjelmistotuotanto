
package ohtuesimerkki;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;

public class StatisticsTest {
    Reader readerStub = new Reader() {
 
        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<>();
 
            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri",   "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));
 
            return players;
        }
    };
 
    Statistics stats;

    @Before
    public void setUp(){
        // luodaan Statistics-olio joka käyttää "stubia"
        stats = new Statistics(readerStub);
    }
    @Test
    public void findsPlayers(){
        assertEquals(true, stats.search("Semenko").getName().equals("Semenko"));
        assertEquals(true, stats.search("Lemieux").getName().equals("Lemieux"));
        assertEquals(true, stats.search("Kurri").getName().equals("Kurri"));
        assertEquals(true, stats.search("Yzerman").getName().equals("Yzerman"));
        assertEquals(true, stats.search("Gretzky").getName().equals("Gretzky"));
        assertEquals(null, stats.search("Jonne"));
        
    }
    @Test
    public void findsPlayersInTeam(){
        List<Player> teamPlayers = stats.team("EMD");
        for(Player player : teamPlayers){
            assertEquals(true, player.getTeam().equals("EDM"));
        }
    }
    @Test
    public void returnsCorrectAmountOfTopScorers(){
        assertEquals(3, stats.topScorers(2).size());
        
    }
    @Test
    public void returnsCorrectOrderOfTopScorers(){
        List<Player> scorerList = stats.topScorers(3);
        assertEquals(true, scorerList.get(0).getName().equals("Gretzky"));
        assertEquals(true, scorerList.get(1).getName().equals("Lemieux"));
        assertEquals(true, scorerList.get(2).getName().equals("Yzerman"));  
    }
    
    
}
