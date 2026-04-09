package vu;

import cv.f0;
import cv.h0;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class t implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final cv.i f24042a;

    /* renamed from: d, reason: collision with root package name */
    public int f24043d;

    /* renamed from: g, reason: collision with root package name */
    public int f24044g;

    /* renamed from: r, reason: collision with root package name */
    public int f24045r;

    /* renamed from: x, reason: collision with root package name */
    public int f24046x;

    /* renamed from: y, reason: collision with root package name */
    public int f24047y;

    public t(cv.i iVar) {
        br.l.e(iVar, "source");
        this.f24042a = iVar;
    }

    @Override // cv.f0
    public final h0 g() {
        return this.f24042a.g();
    }

    @Override // cv.f0
    public final long u(cv.g gVar, long j) throws IOException {
        int i10;
        int i11;
        br.l.e(gVar, "sink");
        do {
            int i12 = this.f24046x;
            cv.i iVar = this.f24042a;
            if (i12 == 0) {
                iVar.skip(this.f24047y);
                this.f24047y = 0;
                if ((this.f24044g & 4) == 0) {
                    i10 = this.f24045r;
                    int iS = pu.b.s(iVar);
                    this.f24046x = iS;
                    this.f24043d = iS;
                    int i13 = iVar.readByte() & 255;
                    this.f24044g = iVar.readByte() & 255;
                    Logger logger = u.f24048r;
                    if (logger.isLoggable(Level.FINE)) {
                        cv.j jVar = h.f24004a;
                        logger.fine(h.a(true, this.f24045r, this.f24043d, i13, this.f24044g));
                    }
                    i11 = iVar.readInt() & Integer.MAX_VALUE;
                    this.f24045r = i11;
                    if (i13 != 9) {
                        throw new IOException(i13 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jU = iVar.u(gVar, Math.min(j, i12));
                if (jU != -1) {
                    this.f24046x -= (int) jU;
                    return jU;
                }
            }
            return -1L;
        } while (i11 == i10);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
