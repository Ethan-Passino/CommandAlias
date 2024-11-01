# 🔄 CommandAlias Plugin

## 📝 Overview
**CommandAlias** is a custom Minecraft BungeeCord plugin that allows server administrators to define aliases for in-game commands. This plugin enables flexible command customization, making it easier for players to access server commands with simpler or alternative syntax.

## ✨ Features
- 🖊️ **Custom command aliasing** through an easy-to-edit configuration file.
- 🔄 **Simple reload command** to apply configuration changes without restarting the server.
- ⚡ **Lightweight** and easy to integrate into any BungeeCord server.

## 🛠️ Requirements
- 🖥️ **Minecraft Server**: BungeeCord
- ☕ **Java 8 or higher**

## 📥 Installation
1. 🔗 Download the latest version of the plugin's `.jar` file.
2. 📂 Place the `.jar` file into your BungeeCord server's `/plugins/` folder.
3. ▶️ Start or restart the server to generate the default configuration file.
4. ✏️ Edit the configuration file (`config.yml`) to define custom aliases for commands.

## ⚡ Commands
- `/careload` - 🔄 Reloads the command alias configuration.

## 🛠️ Configuration
The configuration file (`config.yml`) allows you to define custom aliases for in-game commands. Here's an example of what your configuration might look like:

```yaml
aliases:
  shout: /broadcast
  hi: /greet
  rules: /serverrules
