package me.TurtlesAreHot.CommandAlias;

import jdk.jfr.consumer.RecordedObject;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.config.Configuration;
import net.md_5.bungee.config.ConfigurationProvider;
import net.md_5.bungee.config.YamlConfiguration;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main extends Plugin {

    public static Configuration configuration;
    public static Configuration alias;
    public static File dataFolder;
    @Override
    public void onEnable() {
        dataFolder = getDataFolder();
        try {
            alias = loadAlias();
        } catch (IOException e) {
            e.printStackTrace();
        }
        getProxy().getPluginManager().registerCommand(this, new Reload());
        getProxy().getPluginManager().registerListener(this, new onCommand());
    }

    public Configuration loadAlias() throws IOException {
        if(!getDataFolder().exists()) {
            getDataFolder().mkdir();
        }
        // Since we check if the plugin data folder exists already in loadConfig, we do not need to do so here.
        File ali = new File(getDataFolder(), "commands.yml");

        // Check if the commands.yml file exists.
        if(!ali.exists()) {
            ali.createNewFile();
            FileWriter fw = new FileWriter(ali);
            fw.write("# Command Alias example: creative: '/server creative'");
            fw.flush();
            fw.close();
        }

        return ConfigurationProvider.getProvider(YamlConfiguration.class).load(ali);
    }

    public static boolean getIgnoreCase() {
        return configuration.getBoolean("ignorecase");
    }

    public static String getAlias(String command) {
        return alias.getString(command);
    }




}
