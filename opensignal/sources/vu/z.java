package vu;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class z implements Closeable {

    /* renamed from: y, reason: collision with root package name */
    public static final Logger f24075y = Logger.getLogger(h.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final cv.h f24076a;

    /* renamed from: d, reason: collision with root package name */
    public final cv.g f24077d;

    /* renamed from: g, reason: collision with root package name */
    public int f24078g;

    /* renamed from: r, reason: collision with root package name */
    public boolean f24079r;

    /* renamed from: x, reason: collision with root package name */
    public final f f24080x;

    public z(cv.y yVar) {
        br.l.e(yVar, "sink");
        this.f24076a = yVar;
        cv.g gVar = new cv.g();
        this.f24077d = gVar;
        this.f24078g = 16384;
        this.f24080x = new f(gVar);
    }

    public final synchronized void G(int i10, long j) {
        if (this.f24079r) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        h(i10, 4, 8, 0);
        this.f24076a.writeInt((int) j);
        this.f24076a.flush();
    }

    public final synchronized void b(c0 c0Var) {
        try {
            br.l.e(c0Var, "peerSettings");
            if (this.f24079r) {
                throw new IOException("closed");
            }
            int i10 = this.f24078g;
            int i11 = c0Var.f23975a;
            if ((i11 & 32) != 0) {
                i10 = c0Var.f23976b[5];
            }
            this.f24078g = i10;
            if (((i11 & 2) != 0 ? c0Var.f23976b[1] : -1) != -1) {
                f fVar = this.f24080x;
                int i12 = (i11 & 2) != 0 ? c0Var.f23976b[1] : -1;
                fVar.getClass();
                int iMin = Math.min(i12, 16384);
                int i13 = fVar.f23997d;
                if (i13 != iMin) {
                    if (iMin < i13) {
                        fVar.f23995b = Math.min(fVar.f23995b, iMin);
                    }
                    fVar.f23996c = true;
                    fVar.f23997d = iMin;
                    int i14 = fVar.f24001h;
                    if (iMin < i14) {
                        if (iMin == 0) {
                            d[] dVarArr = fVar.f23998e;
                            mq.l.i0(dVarArr, 0, dVarArr.length);
                            fVar.f23999f = fVar.f23998e.length - 1;
                            fVar.f24000g = 0;
                            fVar.f24001h = 0;
                        } else {
                            fVar.a(i14 - iMin);
                        }
                    }
                }
            }
            h(0, 0, 4, 1);
            this.f24076a.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f24079r = true;
        this.f24076a.close();
    }

    public final synchronized void f(boolean z10, int i10, cv.g gVar, int i11) {
        if (this.f24079r) {
            throw new IOException("closed");
        }
        h(i10, i11, 0, z10 ? 1 : 0);
        if (i11 > 0) {
            cv.h hVar = this.f24076a;
            br.l.b(gVar);
            hVar.d0(gVar, i11);
        }
    }

    public final synchronized void flush() {
        if (this.f24079r) {
            throw new IOException("closed");
        }
        this.f24076a.flush();
    }

    public final void h(int i10, int i11, int i12, int i13) {
        Level level = Level.FINE;
        Logger logger = f24075y;
        if (logger.isLoggable(level)) {
            logger.fine(h.a(false, i10, i11, i12, i13));
        }
        if (i11 > this.f24078g) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f24078g + ": " + i11).toString());
        }
        if ((Integer.MIN_VALUE & i10) != 0) {
            throw new IllegalArgumentException(h0.b.h(i10, "reserved bit set: ").toString());
        }
        byte[] bArr = pu.b.f20645a;
        cv.h hVar = this.f24076a;
        br.l.e(hVar, "<this>");
        hVar.writeByte((i11 >>> 16) & 255);
        hVar.writeByte((i11 >>> 8) & 255);
        hVar.writeByte(i11 & 255);
        hVar.writeByte(i12 & 255);
        hVar.writeByte(i13 & 255);
        hVar.writeInt(i10 & Integer.MAX_VALUE);
    }

    public final synchronized void i(int i10, c cVar, byte[] bArr) {
        br.l.e(cVar, "errorCode");
        if (this.f24079r) {
            throw new IOException("closed");
        }
        if (cVar.getHttpCode() == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        h(0, bArr.length + 8, 7, 0);
        this.f24076a.writeInt(i10);
        this.f24076a.writeInt(cVar.getHttpCode());
        if (bArr.length != 0) {
            this.f24076a.write(bArr);
        }
        this.f24076a.flush();
    }

    public final synchronized void q(boolean z10, int i10, ArrayList arrayList) {
        if (this.f24079r) {
            throw new IOException("closed");
        }
        this.f24080x.d(arrayList);
        long j = this.f24077d.f6706d;
        long jMin = Math.min(this.f24078g, j);
        int i11 = j == jMin ? 4 : 0;
        if (z10) {
            i11 |= 1;
        }
        h(i10, (int) jMin, 1, i11);
        this.f24076a.d0(this.f24077d, jMin);
        if (j > jMin) {
            long j7 = j - jMin;
            while (j7 > 0) {
                long jMin2 = Math.min(this.f24078g, j7);
                j7 -= jMin2;
                h(i10, (int) jMin2, 9, j7 == 0 ? 4 : 0);
                this.f24076a.d0(this.f24077d, jMin2);
            }
        }
    }

    public final synchronized void w(int i10, boolean z10, int i11) {
        if (this.f24079r) {
            throw new IOException("closed");
        }
        h(0, 8, 6, z10 ? 1 : 0);
        this.f24076a.writeInt(i10);
        this.f24076a.writeInt(i11);
        this.f24076a.flush();
    }

    public final synchronized void y(int i10, c cVar) {
        br.l.e(cVar, "errorCode");
        if (this.f24079r) {
            throw new IOException("closed");
        }
        if (cVar.getHttpCode() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        h(i10, 4, 3, 0);
        this.f24076a.writeInt(cVar.getHttpCode());
        this.f24076a.flush();
    }
}
