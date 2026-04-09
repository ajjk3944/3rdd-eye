package com.applovin.shadow.okio;

import java.io.Closeable;
import mk.c;
import nk.k;
import wd.b;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final /* synthetic */ class Okio__OkioKt {
    public static final Sink blackhole() {
        return new BlackholeSink();
    }

    public static final BufferedSource buffer(Source source) {
        k.e(source, "<this>");
        return new RealBufferedSource(source);
    }

    public static final <T extends Closeable, R> R use(T t10, c cVar) throws Throwable {
        R r10;
        k.e(cVar, "block");
        Throwable th2 = null;
        try {
            r10 = (R) cVar.invoke(t10);
            if (t10 != null) {
                try {
                    t10.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
        } catch (Throwable th4) {
            if (t10 != null) {
                try {
                    t10.close();
                } catch (Throwable th5) {
                    b.a(th4, th5);
                }
            }
            th2 = th4;
            r10 = null;
        }
        if (th2 != null) {
            throw th2;
        }
        k.b(r10);
        return r10;
    }

    public static final BufferedSink buffer(Sink sink) {
        k.e(sink, "<this>");
        return new RealBufferedSink(sink);
    }
}
