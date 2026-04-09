package yl;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class z implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f37785f = Logger.getLogger(h.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final hm.f f37786a;

    /* renamed from: b, reason: collision with root package name */
    public final hm.e f37787b;

    /* renamed from: c, reason: collision with root package name */
    public int f37788c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f37789d;

    /* renamed from: e, reason: collision with root package name */
    public final f f37790e;

    public z(hm.p pVar) {
        nk.k.e(pVar, "sink");
        this.f37786a = pVar;
        hm.e eVar = new hm.e();
        this.f37787b = eVar;
        this.f37788c = Http2.INITIAL_MAX_FRAME_SIZE;
        this.f37790e = new f(eVar);
    }

    public final void A(int i4, long j) {
        synchronized (this) {
            try {
                if (this.f37789d) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = f37785f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(h.c(i4, 4, j, false));
                }
                g(i4, 4, 8, 0);
                this.f37786a.writeInt((int) j);
                this.f37786a.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(c0 c0Var) {
        nk.k.e(c0Var, "peerSettings");
        synchronized (this) {
            try {
                if (this.f37789d) {
                    throw new IOException("closed");
                }
                int i4 = this.f37788c;
                int i10 = c0Var.f37673a;
                if ((i10 & 32) != 0) {
                    i4 = c0Var.f37674b[5];
                }
                this.f37788c = i4;
                if (((i10 & 2) != 0 ? c0Var.f37674b[1] : -1) != -1) {
                    f fVar = this.f37790e;
                    int i11 = (i10 & 2) != 0 ? c0Var.f37674b[1] : -1;
                    fVar.getClass();
                    int iMin = Math.min(i11, Http2.INITIAL_MAX_FRAME_SIZE);
                    int i12 = fVar.f37693d;
                    if (i12 != iMin) {
                        if (iMin < i12) {
                            fVar.f37691b = Math.min(fVar.f37691b, iMin);
                        }
                        fVar.f37692c = true;
                        fVar.f37693d = iMin;
                        int i13 = fVar.f37696h;
                        if (iMin < i13) {
                            if (iMin == 0) {
                                d[] dVarArr = fVar.f37694e;
                                zj.m.U(0, dVarArr.length, null, dVarArr);
                                fVar.f37695f = fVar.f37694e.length - 1;
                                fVar.g = 0;
                                fVar.f37696h = 0;
                            } else {
                                fVar.a(i13 - iMin);
                            }
                        }
                    }
                }
                g(0, 0, 4, 1);
                this.f37786a.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f37789d = true;
            this.f37786a.close();
        }
    }

    public final void e(boolean z3, int i4, hm.e eVar, int i10) {
        synchronized (this) {
            if (this.f37789d) {
                throw new IOException("closed");
            }
            g(i4, i10, 0, z3 ? 1 : 0);
            if (i10 > 0) {
                hm.f fVar = this.f37786a;
                nk.k.b(eVar);
                fVar.Q(eVar, i10);
            }
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.f37789d) {
                throw new IOException("closed");
            }
            this.f37786a.flush();
        }
    }

    public final void g(int i4, int i10, int i11, int i12) {
        if (i11 != 8) {
            Level level = Level.FINE;
            Logger logger = f37785f;
            if (logger.isLoggable(level)) {
                logger.fine(h.b(false, i4, i10, i11, i12));
            }
        }
        if (i10 > this.f37788c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f37788c + ": " + i10).toString());
        }
        if ((Integer.MIN_VALUE & i4) != 0) {
            throw new IllegalArgumentException(je.u.r(i4, "reserved bit set: ").toString());
        }
        byte[] bArr = sl.f.f33832a;
        hm.f fVar = this.f37786a;
        nk.k.e(fVar, "<this>");
        fVar.writeByte((i10 >>> 16) & 255);
        fVar.writeByte((i10 >>> 8) & 255);
        fVar.writeByte(i10 & 255);
        fVar.writeByte(i11 & 255);
        fVar.writeByte(i12 & 255);
        fVar.writeInt(i4 & Integer.MAX_VALUE);
    }

    public final void m(int i4, b bVar, byte[] bArr) {
        synchronized (this) {
            if (this.f37789d) {
                throw new IOException("closed");
            }
            if (bVar.f37670a == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            g(0, bArr.length + 8, 7, 0);
            this.f37786a.writeInt(i4);
            this.f37786a.writeInt(bVar.f37670a);
            if (bArr.length != 0) {
                this.f37786a.write(bArr);
            }
            this.f37786a.flush();
        }
    }

    public final void p(boolean z3, int i4, ArrayList arrayList) {
        synchronized (this) {
            if (this.f37789d) {
                throw new IOException("closed");
            }
            this.f37790e.d(arrayList);
            long j = this.f37787b.f25174b;
            long jMin = Math.min(this.f37788c, j);
            int i10 = j == jMin ? 4 : 0;
            if (z3) {
                i10 |= 1;
            }
            g(i4, (int) jMin, 1, i10);
            this.f37786a.Q(this.f37787b, jMin);
            if (j > jMin) {
                long j8 = j - jMin;
                while (j8 > 0) {
                    long jMin2 = Math.min(this.f37788c, j8);
                    j8 -= jMin2;
                    g(i4, (int) jMin2, 9, j8 == 0 ? 4 : 0);
                    this.f37786a.Q(this.f37787b, jMin2);
                }
            }
        }
    }

    public final void v(boolean z3, int i4, int i10) {
        synchronized (this) {
            if (this.f37789d) {
                throw new IOException("closed");
            }
            g(0, 8, 6, z3 ? 1 : 0);
            this.f37786a.writeInt(i4);
            this.f37786a.writeInt(i10);
            this.f37786a.flush();
        }
    }

    public final void w(int i4, b bVar) {
        synchronized (this) {
            if (this.f37789d) {
                throw new IOException("closed");
            }
            if (bVar.f37670a == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            g(i4, 4, 3, 0);
            this.f37786a.writeInt(bVar.f37670a);
            this.f37786a.flush();
        }
    }

    public final void y(c0 c0Var) {
        nk.k.e(c0Var, "settings");
        synchronized (this) {
            try {
                if (this.f37789d) {
                    throw new IOException("closed");
                }
                g(0, Integer.bitCount(c0Var.f37673a) * 6, 4, 0);
                for (int i4 = 0; i4 < 10; i4++) {
                    boolean z3 = true;
                    if (((1 << i4) & c0Var.f37673a) == 0) {
                        z3 = false;
                    }
                    if (z3) {
                        this.f37786a.writeShort(i4);
                        this.f37786a.writeInt(c0Var.f37674b[i4]);
                    }
                }
                this.f37786a.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
