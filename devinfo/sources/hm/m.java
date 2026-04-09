package hm;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m implements w {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f25190a;

    /* renamed from: b, reason: collision with root package name */
    public final y f25191b;

    public m(InputStream inputStream, y yVar) {
        nk.k.e(inputStream, "input");
        this.f25190a = inputStream;
        this.f25191b = yVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f25190a.close();
    }

    @Override // hm.w
    public final long n(e eVar, long j) throws IOException {
        nk.k.e(eVar, "sink");
        try {
            this.f25191b.f();
            r rVarW = eVar.w(1);
            int i4 = this.f25190a.read(rVarW.f25206a, rVarW.f25208c, (int) Math.min(8192L, 8192 - rVarW.f25208c));
            if (i4 != -1) {
                rVarW.f25208c += i4;
                long j8 = i4;
                eVar.f25174b += j8;
                return j8;
            }
            if (rVarW.f25207b != rVarW.f25208c) {
                return -1L;
            }
            eVar.f25173a = rVarW.a();
            s.a(rVarW);
            return -1L;
        } catch (AssertionError e2) {
            if (im.f.a(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // hm.w, hm.u
    public final y timeout() {
        return this.f25191b;
    }

    public final String toString() {
        return "source(" + this.f25190a + ')';
    }
}
