package yl;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t implements hm.w {

    /* renamed from: a, reason: collision with root package name */
    public final hm.g f37753a;

    /* renamed from: b, reason: collision with root package name */
    public int f37754b;

    /* renamed from: c, reason: collision with root package name */
    public int f37755c;

    /* renamed from: d, reason: collision with root package name */
    public int f37756d;

    /* renamed from: e, reason: collision with root package name */
    public int f37757e;

    /* renamed from: f, reason: collision with root package name */
    public int f37758f;

    public t(hm.g gVar) {
        nk.k.e(gVar, "source");
        this.f37753a = gVar;
    }

    @Override // hm.w
    public final long n(hm.e eVar, long j) throws IOException {
        int i4;
        int i10;
        nk.k.e(eVar, "sink");
        do {
            int i11 = this.f37757e;
            hm.g gVar = this.f37753a;
            if (i11 == 0) {
                gVar.skip(this.f37758f);
                this.f37758f = 0;
                if ((this.f37755c & 4) == 0) {
                    i4 = this.f37756d;
                    int iL = sl.f.l(gVar);
                    this.f37757e = iL;
                    this.f37754b = iL;
                    int i12 = gVar.readByte() & 255;
                    this.f37755c = gVar.readByte() & 255;
                    Logger logger = u.f37759d;
                    if (logger.isLoggable(Level.FINE)) {
                        hm.h hVar = h.f37699a;
                        logger.fine(h.b(true, this.f37756d, this.f37754b, i12, this.f37755c));
                    }
                    i10 = gVar.readInt() & Integer.MAX_VALUE;
                    this.f37756d = i10;
                    if (i12 != 9) {
                        throw new IOException(i12 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jN = gVar.n(eVar, Math.min(8192L, i11));
                if (jN != -1) {
                    this.f37757e -= (int) jN;
                    return jN;
                }
            }
            return -1L;
        } while (i10 == i4);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // hm.w, hm.u
    public final hm.y timeout() {
        return this.f37753a.timeout();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
