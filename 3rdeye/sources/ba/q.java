package ba;

import ba.d;
import c9.C2088i;
import g0.C4356c;
import ia.C4468d;
import ia.v;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* compiled from: Http2Writer.kt */
/* loaded from: classes3.dex */
public final class q implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f18247g = Logger.getLogger(e.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public final v f18248b;

    /* renamed from: c, reason: collision with root package name */
    public final C4468d f18249c;

    /* renamed from: d, reason: collision with root package name */
    public int f18250d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18251e;

    /* renamed from: f, reason: collision with root package name */
    public final d.b f18252f;

    public q(v sink) {
        kotlin.jvm.internal.l.f(sink, "sink");
        this.f18248b = sink;
        C4468d c4468d = new C4468d();
        this.f18249c = c4468d;
        this.f18250d = 16384;
        this.f18252f = new d.b(c4468d);
    }

    public final synchronized void A(t settings) throws IOException {
        try {
            kotlin.jvm.internal.l.f(settings, "settings");
            if (this.f18251e) {
                throw new IOException("closed");
            }
            d(0, Integer.bitCount(settings.f18260a) * 6, 4, 0);
            int i = 0;
            while (i < 10) {
                boolean z10 = true;
                if (((1 << i) & settings.f18260a) == 0) {
                    z10 = false;
                }
                if (z10) {
                    this.f18248b.j(i != 4 ? i != 7 ? i : 4 : 3);
                    this.f18248b.m(settings.f18261b[i]);
                }
                i++;
            }
            this.f18248b.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void B(int i, long j4) throws IOException {
        if (this.f18251e) {
            throw new IOException("closed");
        }
        if (j4 == 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j4).toString());
        }
        d(i, 4, 8, 0);
        this.f18248b.m((int) j4);
        this.f18248b.flush();
    }

    public final synchronized void a(t peerSettings) throws IOException {
        try {
            kotlin.jvm.internal.l.f(peerSettings, "peerSettings");
            if (this.f18251e) {
                throw new IOException("closed");
            }
            int i = this.f18250d;
            int i10 = peerSettings.f18260a;
            if ((i10 & 32) != 0) {
                i = peerSettings.f18261b[5];
            }
            this.f18250d = i;
            if (((i10 & 2) != 0 ? peerSettings.f18261b[1] : -1) != -1) {
                d.b bVar = this.f18252f;
                int i11 = (i10 & 2) != 0 ? peerSettings.f18261b[1] : -1;
                bVar.getClass();
                int iMin = Math.min(i11, 16384);
                int i12 = bVar.f18133d;
                if (i12 != iMin) {
                    if (iMin < i12) {
                        bVar.f18131b = Math.min(bVar.f18131b, iMin);
                    }
                    bVar.f18132c = true;
                    bVar.f18133d = iMin;
                    int i13 = bVar.f18137h;
                    if (iMin < i13) {
                        if (iMin == 0) {
                            c[] cVarArr = bVar.f18134e;
                            C2088i.i(cVarArr, null, 0, cVarArr.length);
                            bVar.f18135f = bVar.f18134e.length - 1;
                            bVar.f18136g = 0;
                            bVar.f18137h = 0;
                        } else {
                            bVar.a(i13 - iMin);
                        }
                    }
                }
            }
            d(0, 0, 4, 1);
            this.f18248b.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(boolean z10, int i, C4468d c4468d, int i10) throws IOException {
        if (this.f18251e) {
            throw new IOException("closed");
        }
        d(i, i10, 0, z10 ? 1 : 0);
        if (i10 > 0) {
            kotlin.jvm.internal.l.c(c4468d);
            this.f18248b.write(c4468d, i10);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.f18251e = true;
        this.f18248b.close();
    }

    public final void d(int i, int i10, int i11, int i12) throws IOException {
        Level level = Level.FINE;
        Logger logger = f18247g;
        if (logger.isLoggable(level)) {
            e.f18138a.getClass();
            logger.fine(e.a(false, i, i10, i11, i12));
        }
        if (i10 > this.f18250d) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f18250d + ": " + i10).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(C4356c.h(i, "reserved bit set: ").toString());
        }
        byte[] bArr = V9.b.f13053a;
        v vVar = this.f18248b;
        kotlin.jvm.internal.l.f(vVar, "<this>");
        vVar.L((i10 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        vVar.L((i10 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        vVar.L(i10 & KotlinVersion.MAX_COMPONENT_VALUE);
        vVar.L(i11 & KotlinVersion.MAX_COMPONENT_VALUE);
        vVar.L(i12 & KotlinVersion.MAX_COMPONENT_VALUE);
        vVar.m(i & Integer.MAX_VALUE);
    }

    public final synchronized void e(int i, b errorCode, byte[] bArr) throws IOException {
        kotlin.jvm.internal.l.f(errorCode, "errorCode");
        if (this.f18251e) {
            throw new IOException("closed");
        }
        if (errorCode.getHttpCode() == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        d(0, bArr.length + 8, 7, 0);
        this.f18248b.m(i);
        this.f18248b.m(errorCode.getHttpCode());
        if (bArr.length != 0) {
            this.f18248b.t0(bArr);
        }
        this.f18248b.flush();
    }

    public final synchronized void flush() throws IOException {
        if (this.f18251e) {
            throw new IOException("closed");
        }
        this.f18248b.flush();
    }

    public final synchronized void k(int i, ArrayList arrayList, boolean z10) throws IOException {
        if (this.f18251e) {
            throw new IOException("closed");
        }
        this.f18252f.d(arrayList);
        long j4 = this.f18249c.f38643c;
        long jMin = Math.min(this.f18250d, j4);
        int i10 = j4 == jMin ? 4 : 0;
        if (z10) {
            i10 |= 1;
        }
        d(i, (int) jMin, 1, i10);
        this.f18248b.write(this.f18249c, jMin);
        if (j4 > jMin) {
            long j10 = j4 - jMin;
            while (j10 > 0) {
                long jMin2 = Math.min(this.f18250d, j10);
                j10 -= jMin2;
                d(i, (int) jMin2, 9, j10 == 0 ? 4 : 0);
                this.f18248b.write(this.f18249c, jMin2);
            }
        }
    }

    public final synchronized void l(int i, int i10, boolean z10) throws IOException {
        if (this.f18251e) {
            throw new IOException("closed");
        }
        d(0, 8, 6, z10 ? 1 : 0);
        this.f18248b.m(i);
        this.f18248b.m(i10);
        this.f18248b.flush();
    }

    public final synchronized void n(int i, b errorCode) throws IOException {
        kotlin.jvm.internal.l.f(errorCode, "errorCode");
        if (this.f18251e) {
            throw new IOException("closed");
        }
        if (errorCode.getHttpCode() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        d(i, 4, 3, 0);
        this.f18248b.m(errorCode.getHttpCode());
        this.f18248b.flush();
    }
}
