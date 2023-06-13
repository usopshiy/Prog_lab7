package connection;

import java.io.Closeable;

public interface SenderReciever extends Closeable {
    public final int BUFFER_SIZE = 4096;
}
