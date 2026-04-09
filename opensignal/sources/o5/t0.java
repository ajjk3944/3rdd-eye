package o5;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19055a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final int f19056b;

    /* renamed from: c, reason: collision with root package name */
    public long f19057c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f19058d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f19059e;

    /* renamed from: f, reason: collision with root package name */
    public Object f19060f;

    /* renamed from: g, reason: collision with root package name */
    public Object f19061g;

    /* renamed from: h, reason: collision with root package name */
    public Object f19062h;

    public t0(pb.b bVar) {
        this.f19058d = bVar;
        int i10 = ((pb.p) bVar).f20398b;
        this.f19056b = i10;
        this.f19059e = new fb.f(32);
        d5.y0 y0Var = new d5.y0(i10, 0L);
        this.f19060f = y0Var;
        this.f19061g = y0Var;
        this.f19062h = y0Var;
    }

    public static d5.y0 e(d5.y0 y0Var, long j, ByteBuffer byteBuffer, int i10) {
        while (j >= y0Var.f7107g) {
            y0Var = (d5.y0) y0Var.f7110y;
        }
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (y0Var.f7107g - j));
            pb.a aVar = (pb.a) y0Var.f7109x;
            byteBuffer.put(aVar.f20353a, ((int) (j - y0Var.f7106d)) + aVar.f20354b, iMin);
            i10 -= iMin;
            j += iMin;
            if (j == y0Var.f7107g) {
                y0Var = (d5.y0) y0Var.f7110y;
            }
        }
        return y0Var;
    }

    public static d5.y0 f(d5.y0 y0Var, long j, byte[] bArr, int i10) {
        while (j >= y0Var.f7107g) {
            y0Var = (d5.y0) y0Var.f7110y;
        }
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (y0Var.f7107g - j));
            pb.a aVar = (pb.a) y0Var.f7109x;
            System.arraycopy(aVar.f20353a, ((int) (j - y0Var.f7106d)) + aVar.f20354b, bArr, i10 - i11, iMin);
            i11 -= iMin;
            j += iMin;
            if (j == y0Var.f7107g) {
                y0Var = (d5.y0) y0Var.f7110y;
            }
        }
        return y0Var;
    }

    public static io.sentry.android.replay.gestures.c g(io.sentry.android.replay.gestures.c cVar, long j, ByteBuffer byteBuffer, int i10) {
        while (j >= cVar.f11922g) {
            cVar = (io.sentry.android.replay.gestures.c) cVar.f11924x;
        }
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (cVar.f11922g - j));
            r5.a aVar = (r5.a) cVar.f11923r;
            byteBuffer.put(aVar.f21227a, ((int) (j - cVar.f11921d)) + aVar.f21228b, iMin);
            i10 -= iMin;
            j += iMin;
            if (j == cVar.f11922g) {
                cVar = (io.sentry.android.replay.gestures.c) cVar.f11924x;
            }
        }
        return cVar;
    }

    public static io.sentry.android.replay.gestures.c h(io.sentry.android.replay.gestures.c cVar, long j, byte[] bArr, int i10) {
        while (j >= cVar.f11922g) {
            cVar = (io.sentry.android.replay.gestures.c) cVar.f11924x;
        }
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (cVar.f11922g - j));
            r5.a aVar = (r5.a) cVar.f11923r;
            System.arraycopy(aVar.f21227a, ((int) (j - cVar.f11921d)) + aVar.f21228b, bArr, i10 - i11, iMin);
            i11 -= iMin;
            j += iMin;
            if (j == cVar.f11922g) {
                cVar = (io.sentry.android.replay.gestures.c) cVar.f11924x;
            }
        }
        return cVar;
    }

    public static d5.y0 i(d5.y0 y0Var, z9.d dVar, k9.b bVar, fb.f fVar) {
        if (dVar.g(1073741824)) {
            long j = bVar.f14218b;
            int iT = 1;
            fVar.v(1);
            d5.y0 y0VarF = f(y0Var, j, fVar.f8800a, 1);
            long j7 = j + 1;
            byte b2 = fVar.f8800a[0];
            boolean z10 = (b2 & 128) != 0;
            int i10 = b2 & 127;
            tv.b bVar2 = dVar.f26790g;
            byte[] bArr = (byte[]) bVar2.f23029g;
            if (bArr == null) {
                bVar2.f23029g = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            y0Var = f(y0VarF, j7, (byte[]) bVar2.f23029g, i10);
            long j10 = j7 + i10;
            if (z10) {
                fVar.v(2);
                y0Var = f(y0Var, j10, fVar.f8800a, 2);
                j10 += 2;
                iT = fVar.t();
            }
            int[] iArr = (int[]) bVar2.f23027a;
            if (iArr == null || iArr.length < iT) {
                iArr = new int[iT];
            }
            int[] iArr2 = (int[]) bVar2.f23028d;
            if (iArr2 == null || iArr2.length < iT) {
                iArr2 = new int[iT];
            }
            if (z10) {
                int i11 = iT * 6;
                fVar.v(i11);
                y0Var = f(y0Var, j10, fVar.f8800a, i11);
                j10 += i11;
                fVar.y(0);
                for (int i12 = 0; i12 < iT; i12++) {
                    iArr[i12] = fVar.t();
                    iArr2[i12] = fVar.r();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = bVar.f14217a - ((int) (j10 - bVar.f14218b));
            }
            ca.w wVar = (ca.w) bVar.f14219c;
            int i13 = qb.v.f20828a;
            byte[] bArr2 = wVar.f3514b;
            byte[] bArr3 = (byte[]) bVar2.f23029g;
            int i14 = wVar.f3513a;
            int i15 = wVar.f3515c;
            int i16 = wVar.f3516d;
            bVar2.f23027a = iArr;
            bVar2.f23028d = iArr2;
            bVar2.f23029g = bArr3;
            MediaCodec.CryptoInfo cryptoInfo = (MediaCodec.CryptoInfo) bVar2.f23030r;
            cryptoInfo.numSubSamples = iT;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            if (qb.v.f20828a >= 24) {
                q3.a aVar = (q3.a) bVar2.f23031x;
                aVar.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) aVar.f20680g;
                pattern.set(i15, i16);
                ((MediaCodec.CryptoInfo) aVar.f20679d).setPattern(pattern);
            }
            long j11 = bVar.f14218b;
            int i17 = (int) (j10 - j11);
            bVar.f14218b = j11 + i17;
            bVar.f14217a -= i17;
        }
        if (!dVar.g(268435456)) {
            dVar.r(bVar.f14217a);
            return e(y0Var, bVar.f14218b, dVar.f26791r, bVar.f14217a);
        }
        fVar.v(4);
        d5.y0 y0VarF2 = f(y0Var, bVar.f14218b, fVar.f8800a, 4);
        int iR = fVar.r();
        bVar.f14218b += 4;
        bVar.f14217a -= 4;
        dVar.r(iR);
        d5.y0 y0VarE = e(y0VarF2, bVar.f14218b, dVar.f26791r, iR);
        bVar.f14218b += iR;
        int i18 = bVar.f14217a - iR;
        bVar.f14217a = i18;
        ByteBuffer byteBuffer = dVar.B;
        if (byteBuffer == null || byteBuffer.capacity() < i18) {
            dVar.B = ByteBuffer.allocate(i18);
        } else {
            dVar.B.clear();
        }
        return e(y0VarE, bVar.f14218b, dVar.B, bVar.f14217a);
    }

    public static io.sentry.android.replay.gestures.c j(io.sentry.android.replay.gestures.c cVar, c5.g gVar, k9.b bVar, a5.v vVar) {
        if (gVar.g(1073741824)) {
            long j = bVar.f14218b;
            int iY = 1;
            vVar.B(1);
            io.sentry.android.replay.gestures.c cVarH = h(cVar, j, vVar.f165a, 1);
            long j7 = j + 1;
            byte b2 = vVar.f165a[0];
            boolean z10 = (b2 & 128) != 0;
            int i10 = b2 & 127;
            c5.c cVar2 = gVar.f3305g;
            byte[] bArr = cVar2.f3296a;
            if (bArr == null) {
                cVar2.f3296a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            cVar = h(cVarH, j7, cVar2.f3296a, i10);
            long j10 = j7 + i10;
            if (z10) {
                vVar.B(2);
                cVar = h(cVar, j10, vVar.f165a, 2);
                j10 += 2;
                iY = vVar.y();
            }
            int[] iArr = cVar2.f3299d;
            if (iArr == null || iArr.length < iY) {
                iArr = new int[iY];
            }
            int[] iArr2 = cVar2.f3300e;
            if (iArr2 == null || iArr2.length < iY) {
                iArr2 = new int[iY];
            }
            if (z10) {
                int i11 = iY * 6;
                vVar.B(i11);
                cVar = h(cVar, j10, vVar.f165a, i11);
                j10 += i11;
                vVar.E(0);
                for (int i12 = 0; i12 < iY; i12++) {
                    iArr[i12] = vVar.y();
                    iArr2[i12] = vVar.w();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = bVar.f14217a - ((int) (j10 - bVar.f14218b));
            }
            u5.z zVar = (u5.z) bVar.f14219c;
            int i13 = a5.d0.f105a;
            byte[] bArr2 = zVar.f23360b;
            byte[] bArr3 = cVar2.f3296a;
            int i14 = zVar.f23359a;
            int i15 = zVar.f23361c;
            int i16 = zVar.f23362d;
            cVar2.f3301f = iY;
            cVar2.f3299d = iArr;
            cVar2.f3300e = iArr2;
            cVar2.f3297b = bArr2;
            cVar2.f3296a = bArr3;
            cVar2.f3298c = i14;
            cVar2.f3302g = i15;
            cVar2.f3303h = i16;
            MediaCodec.CryptoInfo cryptoInfo = cVar2.f3304i;
            cryptoInfo.numSubSamples = iY;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            if (a5.d0.f105a >= 24) {
                io.sentry.internal.debugmeta.c cVar3 = cVar2.j;
                cVar3.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) cVar3.f12354g;
                pattern.set(i15, i16);
                ((MediaCodec.CryptoInfo) cVar3.f12353d).setPattern(pattern);
            }
            long j11 = bVar.f14218b;
            int i17 = (int) (j10 - j11);
            bVar.f14218b = j11 + i17;
            bVar.f14217a -= i17;
        }
        if (!gVar.g(268435456)) {
            gVar.r(bVar.f14217a);
            return g(cVar, bVar.f14218b, gVar.f3306r, bVar.f14217a);
        }
        vVar.B(4);
        io.sentry.android.replay.gestures.c cVarH2 = h(cVar, bVar.f14218b, vVar.f165a, 4);
        int iW = vVar.w();
        bVar.f14218b += 4;
        bVar.f14217a -= 4;
        gVar.r(iW);
        io.sentry.android.replay.gestures.c cVarG = g(cVarH2, bVar.f14218b, gVar.f3306r, iW);
        bVar.f14218b += iW;
        int i18 = bVar.f14217a - iW;
        bVar.f14217a = i18;
        ByteBuffer byteBuffer = gVar.B;
        if (byteBuffer == null || byteBuffer.capacity() < i18) {
            gVar.B = ByteBuffer.allocate(i18);
        } else {
            gVar.B.clear();
        }
        return g(cVarG, bVar.f14218b, gVar.B, bVar.f14217a);
    }

    public void a(d5.y0 y0Var) {
        if (y0Var.f7108r) {
            d5.y0 y0Var2 = (d5.y0) this.f19062h;
            int i10 = (((int) (y0Var2.f7106d - y0Var.f7106d)) / this.f19056b) + (y0Var2.f7108r ? 1 : 0);
            pb.a[] aVarArr = new pb.a[i10];
            int i11 = 0;
            while (i11 < i10) {
                aVarArr[i11] = (pb.a) y0Var.f7109x;
                y0Var.f7109x = null;
                d5.y0 y0Var3 = (d5.y0) y0Var.f7110y;
                y0Var.f7110y = null;
                i11++;
                y0Var = y0Var3;
            }
            ((pb.p) ((pb.b) this.f19058d)).a(aVarArr);
        }
    }

    public void b(io.sentry.android.replay.gestures.c cVar) {
        if (((r5.a) cVar.f11923r) == null) {
            return;
        }
        r5.e eVar = (r5.e) ((r5.b) this.f19058d);
        synchronized (eVar) {
            io.sentry.android.replay.gestures.c cVar2 = cVar;
            while (cVar2 != null) {
                try {
                    r5.a[] aVarArr = eVar.f21237f;
                    int i10 = eVar.f21236e;
                    eVar.f21236e = i10 + 1;
                    r5.a aVar = (r5.a) cVar2.f11923r;
                    aVar.getClass();
                    aVarArr[i10] = aVar;
                    eVar.f21235d--;
                    cVar2 = (io.sentry.android.replay.gestures.c) cVar2.f11924x;
                    if (cVar2 == null || ((r5.a) cVar2.f11923r) == null) {
                        cVar2 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            eVar.notifyAll();
        }
        cVar.f11923r = null;
        cVar.f11924x = null;
    }

    public final void c(long j) {
        switch (this.f19055a) {
            case 0:
                if (j == -1) {
                    return;
                }
                while (true) {
                    io.sentry.android.replay.gestures.c cVar = (io.sentry.android.replay.gestures.c) this.f19060f;
                    if (j < cVar.f11922g) {
                        if (((io.sentry.android.replay.gestures.c) this.f19061g).f11921d < cVar.f11921d) {
                            this.f19061g = cVar;
                            return;
                        }
                        return;
                    }
                    r5.b bVar = (r5.b) this.f19058d;
                    r5.a aVar = (r5.a) cVar.f11923r;
                    r5.e eVar = (r5.e) bVar;
                    synchronized (eVar) {
                        r5.a[] aVarArr = eVar.f21237f;
                        int i10 = eVar.f21236e;
                        eVar.f21236e = i10 + 1;
                        aVarArr[i10] = aVar;
                        eVar.f21235d--;
                        eVar.notifyAll();
                    }
                    io.sentry.android.replay.gestures.c cVar2 = (io.sentry.android.replay.gestures.c) this.f19060f;
                    cVar2.f11923r = null;
                    io.sentry.android.replay.gestures.c cVar3 = (io.sentry.android.replay.gestures.c) cVar2.f11924x;
                    cVar2.f11924x = null;
                    this.f19060f = cVar3;
                }
            default:
                if (j == -1) {
                    return;
                }
                while (true) {
                    d5.y0 y0Var = (d5.y0) this.f19060f;
                    if (j < y0Var.f7107g) {
                        if (((d5.y0) this.f19061g).f7106d < y0Var.f7106d) {
                            this.f19061g = y0Var;
                            return;
                        }
                        return;
                    }
                    pb.b bVar2 = (pb.b) this.f19058d;
                    pb.a aVar2 = (pb.a) y0Var.f7109x;
                    pb.p pVar = (pb.p) bVar2;
                    synchronized (pVar) {
                        pb.a[] aVarArr2 = pVar.f20399c;
                        aVarArr2[0] = aVar2;
                        pVar.a(aVarArr2);
                    }
                    d5.y0 y0Var2 = (d5.y0) this.f19060f;
                    y0Var2.f7109x = null;
                    d5.y0 y0Var3 = (d5.y0) y0Var2.f7110y;
                    y0Var2.f7110y = null;
                    this.f19060f = y0Var3;
                }
        }
    }

    public final int d(int i10) {
        r5.a aVar;
        pb.a aVar2;
        switch (this.f19055a) {
            case 0:
                io.sentry.android.replay.gestures.c cVar = (io.sentry.android.replay.gestures.c) this.f19062h;
                if (((r5.a) cVar.f11923r) == null) {
                    r5.e eVar = (r5.e) ((r5.b) this.f19058d);
                    synchronized (eVar) {
                        try {
                            int i11 = eVar.f21235d + 1;
                            eVar.f21235d = i11;
                            int i12 = eVar.f21236e;
                            if (i12 > 0) {
                                r5.a[] aVarArr = eVar.f21237f;
                                int i13 = i12 - 1;
                                eVar.f21236e = i13;
                                aVar = aVarArr[i13];
                                aVar.getClass();
                                eVar.f21237f[eVar.f21236e] = null;
                            } else {
                                r5.a aVar3 = new r5.a(0, new byte[eVar.f21233b]);
                                r5.a[] aVarArr2 = eVar.f21237f;
                                if (i11 > aVarArr2.length) {
                                    eVar.f21237f = (r5.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                                }
                                aVar = aVar3;
                            }
                        } finally {
                        }
                    }
                    io.sentry.android.replay.gestures.c cVar2 = new io.sentry.android.replay.gestures.c(this.f19056b, ((io.sentry.android.replay.gestures.c) this.f19062h).f11922g);
                    cVar.f11923r = aVar;
                    cVar.f11924x = cVar2;
                }
                return Math.min(i10, (int) (((io.sentry.android.replay.gestures.c) this.f19062h).f11922g - this.f19057c));
            default:
                d5.y0 y0Var = (d5.y0) this.f19062h;
                if (!y0Var.f7108r) {
                    pb.p pVar = (pb.p) ((pb.b) this.f19058d);
                    synchronized (pVar) {
                        try {
                            pVar.f20401e++;
                            int i14 = pVar.f20402f;
                            if (i14 > 0) {
                                pb.a[] aVarArr3 = pVar.f20403g;
                                int i15 = i14 - 1;
                                pVar.f20402f = i15;
                                aVar2 = aVarArr3[i15];
                                aVar2.getClass();
                                pVar.f20403g[pVar.f20402f] = null;
                            } else {
                                aVar2 = new pb.a(0, new byte[pVar.f20398b]);
                            }
                        } finally {
                        }
                    }
                    d5.y0 y0Var2 = new d5.y0(this.f19056b, ((d5.y0) this.f19062h).f7107g);
                    y0Var.f7109x = aVar2;
                    y0Var.f7110y = y0Var2;
                    y0Var.f7108r = true;
                }
                return Math.min(i10, (int) (((d5.y0) this.f19062h).f7107g - this.f19057c));
        }
    }

    public t0(r5.b bVar) {
        this.f19058d = bVar;
        int i10 = ((r5.e) bVar).f21233b;
        this.f19056b = i10;
        this.f19059e = new a5.v(32);
        io.sentry.android.replay.gestures.c cVar = new io.sentry.android.replay.gestures.c(i10, 0L);
        this.f19060f = cVar;
        this.f19061g = cVar;
        this.f19062h = cVar;
    }
}
