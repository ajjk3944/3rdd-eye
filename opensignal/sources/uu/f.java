package uu;

import br.l;
import cv.g;
import java.io.IOException;

/* loaded from: classes.dex */
public final class f extends a {

    /* renamed from: r, reason: collision with root package name */
    public boolean f23715r;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f23702d) {
            return;
        }
        if (!this.f23715r) {
            b();
        }
        this.f23702d = true;
    }

    @Override // uu.a, cv.f0
    public final long u(g gVar, long j) throws IOException {
        l.e(gVar, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(c7.a.m(j, "byteCount < 0: ").toString());
        }
        if (this.f23702d) {
            throw new IllegalStateException("closed");
        }
        if (this.f23715r) {
            return -1L;
        }
        long jU = super.u(gVar, j);
        if (jU != -1) {
            return jU;
        }
        this.f23715r = true;
        b();
        return -1L;
    }
}
