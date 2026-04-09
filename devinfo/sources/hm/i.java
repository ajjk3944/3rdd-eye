package hm;

import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class i implements w {

    /* renamed from: a, reason: collision with root package name */
    public final w f25179a;

    public i(w wVar) {
        nk.k.e(wVar, "delegate");
        this.f25179a = wVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f25179a.close();
    }

    @Override // hm.w, hm.u
    public final y timeout() {
        return this.f25179a.timeout();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f25179a + ')';
    }
}
