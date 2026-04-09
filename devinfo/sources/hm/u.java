package hm;

import java.io.Closeable;
import java.io.Flushable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public interface u extends Closeable, Flushable {
    void Q(e eVar, long j);

    void close();

    @Override // java.io.Flushable
    void flush();

    y timeout();
}
