package cv;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes.dex */
public interface d0 extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void d0(g gVar, long j);

    void flush();

    h0 g();
}
