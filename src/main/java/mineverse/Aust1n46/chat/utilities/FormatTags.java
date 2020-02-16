package mineverse.Aust1n46.chat.utilities;

import me.clip.placeholderapi.PlaceholderAPI;
import mineverse.Aust1n46.chat.MineverseChat;
import mineverse.Aust1n46.chat.channel.ChatChannel;
import mineverse.Aust1n46.chat.channel.ChatChannelInfo;
import org.bukkit.entity.Player;


//This class formats the chat by replacing format place holders with their data.
public class FormatTags {

    public static String ChatFormat(String format, Player p, MineverseChat plugin, ChatChannelInfo cc, ChatChannel channel, boolean json) {
        return PlaceholderAPI.setBracketPlaceholders(p, Format.FormatStringAll(format));
    }
	
}