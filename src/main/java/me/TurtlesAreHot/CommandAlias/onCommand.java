package me.TurtlesAreHot.CommandAlias;

import net.md_5.bungee.api.event.ChatEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.config.Configuration;
import net.md_5.bungee.config.ConfigurationProvider;
import net.md_5.bungee.config.YamlConfiguration;
import net.md_5.bungee.event.EventHandler;

import java.io.File;

public class onCommand implements Listener {

    @EventHandler
    public void onChat(ChatEvent e) {
        if (e.isCommand()) {
            String message = e.getMessage();
            String cmd = "";
            if (message.contains(" ")) {
                cmd = Main.getAlias(message.substring(1, message.indexOf(" ")));

            } else {
                cmd = Main.getAlias(message.substring(1));
            }

            if (!cmd.equals("")) {
                if (message.contains(" ")) {
                    e.setMessage(cmd + message.substring(message.indexOf(" ")));
                } else {
                    e.setMessage(cmd);
                }
            }
        }
    }
}