package o7;

import java.io.Closeable;

/* loaded from: classes.dex */
public interface b extends Closeable {
    a F();

    a I();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z10);
}
