package connection;

import data.Route;

import java.io.Serializable;

public interface Request extends Serializable {
    public String getStringArg();
    public Route getRoute();
    public String getCommandName();
}