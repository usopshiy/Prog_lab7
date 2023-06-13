
import exceptions.ConnectionException;
import exceptions.InvalidDataException;
import connection.Client;


import static utils.ConsoleColors.*;


public class Main {

    public static void main(String[] args) {
        System.out.print("\t\t\t\t Lab5 v0.1\n");
        System.out.print(PURPLE_BOLD_BRIGHT + """
                  _____     ____    _    _   _______   ______    _____\s
                 |  __ \\   / __ \\  | |  | | |__   __| |  ____|  / ____|
                 | |__) | | |  | | | |  | |    | |    | |__    | (___ \s
                 |  _  /  | |  | | | |  | |    | |    |  __|    \\___ \\\s
                 | | \\ \\  | |__| | | |__| |    | |    | |____   ____) |
                 |_|  \\_\\  \\____/   \\____/     |_|    |______| |_____/\s
                """ + RESET);
        System.out.println("\t    by Egor Dashkevich aka usopshiy");
        String addr = "";
        int port = 0;
        try {
            if (args.length != 2) throw new InvalidDataException("no address passed by arguments");
            addr = args[0];
            try {
                port = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                throw new ConnectionException("Invalid port");
            }
            Client client = new Client(addr, port);
            client.start();
        } catch (InvalidDataException | ConnectionException e) {
            System.out.print(e.getMessage());
        }
    }
}