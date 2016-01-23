package Creation;

import java.io.File;
import java.util.HashSet;

import org.bukkit.plugin.java.JavaPlugin;





public class RadarCreation extends JavaPlugin {
	
	final List<NewRadar> CURRENT_RADARS = new ArrayList<NewRadar>();
	
	public void onEnable(){
		// Register PlayerListener
		//registerEvents is giving me error
		getPluginLoader().registerEvents(new PlayerListener(), this);
		Commands executor = new Commands();
		//setExecutor is giving me error
		this.getCommand("shipradar").setExecutor(executor);
		

	}

	public void onDisable(){
		for(NewRadar radar : CURRENT_RADARS){
			radar.destroy();
		}
	}

}
