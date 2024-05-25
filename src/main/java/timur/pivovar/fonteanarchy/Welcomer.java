package timur.pivovar.fonteanarchy;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import timur.pivovar.fonteanarchy.Event.NewPlayerJoinEvent;

public final class Welcomer extends JavaPlugin {

    public Welcomer instance;
    @Override
    public void onEnable() {
        instance = this;
        registerEvent();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void registerEvent()
    {
        Bukkit.getPluginManager().registerEvents(new NewPlayerJoinEvent(), this);
    }
}
