
package statistics.matcher;

import statistics.Player;

public class All implements Matcher {

    @Override
    public boolean matches(Player p) {
        return Player.class == p.getClass();
    }
    
}
