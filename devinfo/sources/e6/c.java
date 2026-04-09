package e6;

import java.io.Closeable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public interface c extends Closeable {
    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z3);

    a z();
}
