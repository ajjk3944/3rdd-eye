package ia;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* compiled from: Sink.kt */
/* loaded from: classes3.dex */
public interface A extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;

    D timeout();

    void write(C4468d c4468d, long j4) throws IOException;
}
