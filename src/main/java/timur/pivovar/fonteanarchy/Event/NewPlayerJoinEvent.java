package timur.pivovar.fonteanarchy.Event;

import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class NewPlayerJoinEvent implements Listener
{
    @EventHandler
    public void onJoin(PlayerJoinEvent e)
    {
        Player player = e.getPlayer();
        if (!player.hasPlayedBefore())
        {
            e.joinMessage(Component.text(player.getName() + " впервые зашел на сервер!"));
        }
    }
}