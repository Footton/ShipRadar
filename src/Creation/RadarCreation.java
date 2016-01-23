package Creation;

import java.io.File;
import java.util.HashSet;

import org.bukkit.plugin.java.JavaPlugin;





public class RadarCreation extends JavaPlugin {
	
	public void onEnable(){
		// Register PlayerListener
		getPluginLoader().registerEvents(new PlayerListener(), this);
		
		HashSet<NewRadar> currentRadars = new HashSet<NewRadar>();
		
		Commands executor = new Commands();
		this.getCommand("shipradar").setExecutor(executor);
		

	}
	


	private void saveDefaultConfig() {
		// TODO Auto-generated method stub
		
	}



	private Object getCommand(String string) {
		// TODO Auto-generated method stub
		return null;
	}



	private Object getConfig() {
		// TODO Auto-generated method stub
		return null;
	}



	private Object getServer() {
		// TODO Auto-generated method stub
		return null;
	}



	public void onDisable(){
		Object currentRadars;
		for(NewRadar radar : currentRadars){
			radar.destroy();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
