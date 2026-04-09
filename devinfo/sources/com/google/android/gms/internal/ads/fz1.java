package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fz1 {

    /* renamed from: a, reason: collision with root package name */
    public long f11318a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11319b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11320c;

    /* renamed from: d, reason: collision with root package name */
    public Object f11321d;

    /* renamed from: e, reason: collision with root package name */
    public Object f11322e;

    /* renamed from: f, reason: collision with root package name */
    public Object f11323f;

    public static g5 d(g5 g5Var, rq1 rq1Var, ca.c cVar, sk0 sk0Var) {
        if (rq1Var.h(1073741824)) {
            long j = cVar.f2829b;
            int iL = 1;
            sk0Var.y(1);
            g5 g5VarF = f(g5Var, j, sk0Var.f16446a, 1);
            long j8 = j + 1;
            byte b10 = sk0Var.f16446a[0];
            int i4 = b10 & 128;
            int i10 = b10 & 127;
            bp1 bp1Var = rq1Var.f15734d;
            byte[] bArr = bp1Var.f9756a;
            if (bArr == null) {
                bp1Var.f9756a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z3 = i4 != 0;
            g5Var = f(g5VarF, j8, bp1Var.f9756a, i10);
            long j9 = j8 + i10;
            if (z3) {
                sk0Var.y(2);
                g5Var = f(g5Var, j9, sk0Var.f16446a, 2);
                j9 += 2;
                iL = sk0Var.L();
            }
            int[] iArr = bp1Var.f9759d;
            if (iArr == null || iArr.length < iL) {
                iArr = new int[iL];
            }
            int[] iArr2 = bp1Var.f9760e;
            if (iArr2 == null || iArr2.length < iL) {
                iArr2 = new int[iL];
            }
            if (z3) {
                int i11 = iL * 6;
                sk0Var.y(i11);
                g5Var = f(g5Var, j9, sk0Var.f16446a, i11);
                j9 += i11;
                sk0Var.E(0);
                for (int i12 = 0; i12 < iL; i12++) {
                    iArr[i12] = sk0Var.L();
                    iArr2[i12] = sk0Var.h();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = cVar.f2830c - ((int) (j9 - cVar.f2829b));
            }
            t2 t2Var = (t2) cVar.f2831d;
            String str = bq0.f9768a;
            byte[] bArr2 = t2Var.f16667b;
            byte[] bArr3 = bp1Var.f9756a;
            int i13 = t2Var.f16666a;
            int i14 = t2Var.f16668c;
            int i15 = t2Var.f16669d;
            bp1Var.f9761f = iL;
            bp1Var.f9759d = iArr;
            bp1Var.f9760e = iArr2;
            bp1Var.f9757b = bArr2;
            bp1Var.f9756a = bArr3;
            bp1Var.f9758c = i13;
            bp1Var.g = i14;
            bp1Var.f9762h = i15;
            MediaCodec.CryptoInfo cryptoInfo = bp1Var.f9763i;
            cryptoInfo.numSubSamples = iL;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i13;
            if (Build.VERSION.SDK_INT >= 24) {
                jo1 jo1Var = bp1Var.j;
                jo1Var.getClass();
                jo1Var.a(i14, i15);
            }
            long j10 = cVar.f2829b;
            int i16 = (int) (j9 - j10);
            cVar.f2829b = j10 + i16;
            cVar.f2830c -= i16;
        }
        if (!rq1Var.h(268435456)) {
            rq1Var.j(cVar.f2830c);
            return e(g5Var, cVar.f2829b, rq1Var.f15735e, cVar.f2830c);
        }
        sk0Var.y(4);
        g5 g5VarF2 = f(g5Var, cVar.f2829b, sk0Var.f16446a, 4);
        int iH = sk0Var.h();
        cVar.f2829b += 4;
        cVar.f2830c -= 4;
        rq1Var.j(iH);
        g5 g5VarE = e(g5VarF2, cVar.f2829b, rq1Var.f15735e, iH);
        cVar.f2829b += iH;
        int i17 = cVar.f2830c - iH;
        cVar.f2830c = i17;
        ByteBuffer byteBuffer = rq1Var.f15737h;
        if (byteBuffer == null || byteBuffer.capacity() < i17) {
            rq1Var.f15737h = ByteBuffer.allocate(i17);
        } else {
            rq1Var.f15737h.clear();
        }
        return e(g5VarE, cVar.f2829b, rq1Var.f15737h, cVar.f2830c);
    }

    public static g5 e(g5 g5Var, long j, ByteBuffer byteBuffer, int i4) {
        while (j >= g5Var.f11374b) {
            g5Var = (g5) g5Var.f11376d;
        }
        while (i4 > 0) {
            int iMin = Math.min(i4, (int) (g5Var.f11374b - j));
            h hVar = (h) g5Var.f11375c;
            byte[] bArr = hVar.f11670a;
            long j8 = j - g5Var.f11373a;
            hVar.getClass();
            byteBuffer.put(bArr, (int) j8, iMin);
            i4 -= iMin;
            j += iMin;
            if (j == g5Var.f11374b) {
                g5Var = (g5) g5Var.f11376d;
            }
        }
        return g5Var;
    }

    public static g5 f(g5 g5Var, long j, byte[] bArr, int i4) {
        while (j >= g5Var.f11374b) {
            g5Var = (g5) g5Var.f11376d;
        }
        int i10 = i4;
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (g5Var.f11374b - j));
            h hVar = (h) g5Var.f11375c;
            byte[] bArr2 = hVar.f11670a;
            long j8 = j - g5Var.f11373a;
            hVar.getClass();
            System.arraycopy(bArr2, (int) j8, bArr, i4 - i10, iMin);
            i10 -= iMin;
            j += iMin;
            if (j == g5Var.f11374b) {
                g5Var = (g5) g5Var.f11376d;
            }
        }
        return g5Var;
    }

    public lf.c a() {
        return new lf.c((JSONObject) this.f11319b, (Date) this.f11320c, (JSONArray) this.f11321d, (JSONObject) this.f11322e, this.f11318a, (JSONArray) this.f11323f);
    }

    public void b(long j) {
        g5 g5Var;
        if (j != -1) {
            while (true) {
                g5Var = (g5) this.f11321d;
                if (j < g5Var.f11374b) {
                    break;
                }
                ((i) this.f11319b).g((h) g5Var.f11375c);
                g5 g5Var2 = (g5) this.f11321d;
                g5Var2.f11375c = null;
                g5 g5Var3 = (g5) g5Var2.f11376d;
                g5Var2.f11376d = null;
                this.f11321d = g5Var3;
            }
            if (((g5) this.f11322e).f11373a < g5Var.f11373a) {
                this.f11322e = g5Var;
            }
        }
    }

    public int c(int i4) {
        g5 g5Var = (g5) this.f11323f;
        if (((h) g5Var.f11375c) == null) {
            h hVarB = ((i) this.f11319b).b();
            g5 g5Var2 = new g5(((g5) this.f11323f).f11374b);
            g5Var.f11375c = hVarB;
            g5Var.f11376d = g5Var2;
        }
        return Math.min(i4, (int) (((g5) this.f11323f).f11374b - this.f11318a));
    }
}
