import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;
public class Main extends ListenerAdapter {
    public static void main(String[] args) throws LoginException {
        JDABuilder builder = new JDABuilder(AccountType.BOT);
        String token = "NjY3MzY1MTIwODE2NTc4NTY2.XiBrxg.1uFxwJLagnRLX_pLoBIiW9OO_78";
        builder.setToken(token);
        builder.addEventListener(new Main());

        builder.buildAsync();

    }
    public void onMessageReceived(MessageReceivedEvent event){
        System.out.println("We recieved a message from " + event.getAuthor() + ": " + event.getMessage().getContentDisplay());
    if (event.getMessage().getContentDisplay().equals("*ping")){
        event.getChannel().sendMessage("PONG").queue();
    }
        if (event.getMessage().getContentDisplay().equals("*tea")){
            event.getChannel().sendMessage("tea sucks especially green tea").queue();
        }
        if (event.getMessage().getContentRaw().startsWith("*help")){
            event.getChannel().sendMessage("current commands include *help, *ping, and *tea").queue();
        }

        
    }

}
