package me.TurtlesAreHot.CommandAlias;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.config.ConfigurationProvider;
import net.md_5.bungee.config.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class Reload extends Command {

    public Reload() {
        super("careload");
    }

    public void execute(CommandSender sender, String[] args) {
        if(sender.hasPermission("commandalias.reload")) {
            try {
                Main.alias = ConfigurationProvider.getProvider(YamlConfiguration.class).load(new File(Main.dataFolder, "commands.yml"));
                sender.sendMessage(new TextComponent("[CommandAlias] Reloaded commands.yml!"));
            }
            catch(IOException e) {
                e.printStackTrace();
                sender.sendMessage(new TextComponent("[CommandAlias] An error has occured."));
            }
        }
        else {
            sender.sendMessage(new TextComponent("[CommandAlias] No permissions for this command."));
        }
    }
}
