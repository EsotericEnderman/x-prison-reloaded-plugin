package dev.drawethree.ultraprisoncore.gems.commands;

import com.google.common.collect.ImmutableList;
import dev.drawethree.ultraprisoncore.gems.managers.CommandManager;
import dev.drawethree.ultraprisoncore.utils.player.PlayerUtils;
import org.bukkit.command.CommandSender;

public class GemsHelpCommand extends GemsCommand {

	private static final String COMMAND_NAME = "help";
	private static final String[] COMMAND_ALIASES = {"?"};

	public GemsHelpCommand(CommandManager commandManager) {
		super(commandManager, COMMAND_NAME, COMMAND_ALIASES);
	}

	@Override
	public boolean execute(CommandSender sender, ImmutableList<String> args) {
		if (args.isEmpty()) {
			PlayerUtils.sendMessage(sender, "&e&m-------&f&m-------&e&m--------&f&m--------&e&m--------&f&m-------&e&m-------");
			PlayerUtils.sendMessage(sender, "&e&lGEMS HELP MENU ");
			PlayerUtils.sendMessage(sender, "&e&m-------&f&m-------&e&m--------&f&m--------&e&m--------&f&m-------&e&m-------");
			for (GemsCommand command : this.commandManager.getAll()) {
				if (command.canExecute(sender)) {
					PlayerUtils.sendMessage(sender, "&e" + command.getUsage());
				}
			}
			PlayerUtils.sendMessage(sender, "&e&m-------&f&m-------&e&m--------&f&m--------&e&m--------&f&m-------&e&m-------");
			return true;
		}
		return false;
	}

	@Override
	public boolean canExecute(CommandSender sender) {
		return true;
	}

	@Override
	public String getUsage() {
		return "/gems help - Displays all available commands.";
	}
}
