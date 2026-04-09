package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class yy extends uy implements tx {

    /* renamed from: d, reason: collision with root package name */
    public fz f18927d;

    /* renamed from: e, reason: collision with root package name */
    public String f18928e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18929f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public my f18930h;

    /* renamed from: i, reason: collision with root package name */
    public long f18931i;
    public long j;

    public static final String t(String str) {
        return "cache:".concat(String.valueOf(za.d.d(str, "MD5")));
    }

    public static String u(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        je.u.B(sb2, str, "/", canonicalName, ":");
        sb2.append(message);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.uy
    public final void a() {
        fz fzVar = this.f18927d;
        if (fzVar != null) {
            fzVar.j = null;
            ou1 ou1Var = fzVar.g;
            if (ou1Var != null) {
                ou1Var.f14807d.d();
                ou1Var.f14806c.x1(fzVar);
                ou1 ou1Var2 = fzVar.g;
                ou1Var2.f14807d.d();
                ou1Var2.f14806c.y1();
                fzVar.g = null;
                fz.f11293v.decrementAndGet();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.uy
    public final boolean b(String str) {
        return c(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.uy, com.google.android.gms.internal.ads.yy] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [long] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // com.google.android.gms.internal.ads.uy
    public final boolean c(String str, String[] strArr) throws Throwable {
        ?? r42;
        boolean z3;
        ?? r22;
        String str2;
        String str3;
        long j;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        yy yyVar = this;
        String str4 = str;
        yyVar.f18928e = str4;
        String strT = t(str4);
        String str5 = " ms";
        String str6 = "Timeout reached. Limit: ";
        boolean z10 = false;
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i4 = 0; i4 < strArr.length; i4++) {
                uriArr[i4] = Uri.parse(strArr[i4]);
            }
            fz fzVar = yyVar.f18927d;
            fzVar.getClass();
            fzVar.t(uriArr, ByteBuffer.allocate(0), false);
            qz qzVar = (qz) yyVar.f17383c.get();
            if (qzVar != null) {
                qzVar.B0(strT, yyVar);
            }
            ua.j.C.f35267k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            pk pkVar = sk.Z;
            va.s sVar = va.s.f36163e;
            long jLongValue = ((Long) sVar.f36166c.a(pkVar)).longValue();
            long jLongValue2 = ((Long) sVar.f36166c.a(sk.Y)).longValue() * 1000;
            long jIntValue = ((Integer) sVar.f36166c.a(sk.f16376w)).intValue();
            boolean zBooleanValue = ((Boolean) sVar.f36166c.a(sk.f16237n2)).booleanValue();
            long j13 = -1;
            while (true) {
                synchronized (this) {
                    try {
                        if (System.currentTimeMillis() - jCurrentTimeMillis > jLongValue2) {
                            String str7 = str6;
                            long j14 = jLongValue2;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(j14).length() + 27);
                            sb2.append(str7);
                            sb2.append(j14);
                            sb2.append(str5);
                            throw new IOException(sb2.toString());
                        }
                        if (yyVar.f18929f) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (yyVar.g) {
                            return true;
                        }
                        ou1 ou1Var = yyVar.f18927d.g;
                        if (!(ou1Var != null ? true : z10)) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long jV1 = ou1Var.v1();
                        if (jV1 > 0) {
                            long jW1 = yyVar.f18927d.g.w1();
                            if (jW1 != j13) {
                                boolean z11 = jW1 > 0 ? true : z10;
                                if (zBooleanValue) {
                                    try {
                                        fz fzVar2 = yyVar.f18927d;
                                        j12 = (fzVar2.f11310s == null || !fzVar2.f11310s.f10272p) ? fzVar2.f11302k : 0L;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r42 = strT;
                                        z3 = false;
                                        strT = str4;
                                        r22 = yyVar;
                                        throw th;
                                    }
                                } else {
                                    j12 = -1;
                                }
                                long jP = zBooleanValue ? yyVar.f18927d.p() : -1L;
                                long jQ = zBooleanValue ? yyVar.f18927d.q() : -1L;
                                try {
                                    int i10 = fz.f11292u.get();
                                    int i11 = fz.f11293v.get();
                                    ac.k kVar = za.d.f38136b;
                                    str2 = str5;
                                    str3 = str6;
                                    j10 = jLongValue;
                                    j8 = jIntValue;
                                    j = jLongValue2;
                                    long j15 = jP;
                                    z3 = false;
                                    try {
                                        py pyVar = new py(yyVar, str4, strT, jW1, jV1, j12, j15, jQ, z11, i10, i11);
                                        j11 = jW1;
                                        r42 = jV1;
                                        kVar.post(pyVar);
                                        j13 = j11;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        r22 = this;
                                        r42 = strT;
                                        strT = str;
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    z3 = false;
                                    r22 = this;
                                    r42 = strT;
                                    strT = str;
                                    throw th;
                                }
                            } else {
                                str2 = str5;
                                str3 = str6;
                                z3 = z10;
                                j10 = jLongValue;
                                r42 = jV1;
                                j11 = jW1;
                                j = jLongValue2;
                                j8 = jIntValue;
                            }
                            r22 = (j11 > r42 ? 1 : (j11 == r42 ? 0 : -1));
                            if (r22 >= 0) {
                                yyVar = this;
                                str4 = str;
                                try {
                                    za.d.f38136b.post(new sy(yyVar, str4, strT, (long) r42));
                                    return true;
                                } catch (Throwable th5) {
                                    th = th5;
                                    r42 = strT;
                                    strT = str4;
                                    r22 = yyVar;
                                    throw th;
                                }
                            }
                            try {
                                yy yyVar2 = this;
                                r42 = strT;
                                strT = str;
                                if (yyVar2.f18927d.f11302k >= j8 && j11 > 0) {
                                    return true;
                                }
                                j9 = j10;
                                r22 = yyVar2;
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        } else {
                            str2 = str5;
                            str3 = str6;
                            z3 = z10;
                            j = jLongValue2;
                            j8 = jIntValue;
                            r42 = strT;
                            strT = str4;
                            r22 = yyVar;
                            j9 = jLongValue;
                        }
                        try {
                            r22.wait(j9);
                        } catch (InterruptedException unused) {
                            throw new IOException("Wait interrupted.");
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        r42 = strT;
                        z3 = z10;
                    }
                }
                try {
                    throw th;
                } catch (Exception e2) {
                    e = e2;
                    String message = e.getMessage();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(strT).length() + 34 + String.valueOf(message).length());
                    sb3.append("Failed to preload url ");
                    sb3.append(strT);
                    sb3.append(" Exception: ");
                    sb3.append(message);
                    za.i.h(sb3.toString());
                    ua.j.C.f35265h.g("VideoStreamExoPlayerCache.preload", e);
                    r22.a();
                    r22.r(strT, r42, "error", u("error", e));
                    return z3;
                }
                jLongValue = j9;
                yyVar = r22;
                str4 = strT;
                strT = r42;
                jLongValue2 = j;
                jIntValue = j8;
                z10 = z3;
                str5 = str2;
                str6 = str3;
            }
        } catch (Exception e10) {
            e = e10;
            r42 = strT;
            z3 = z10;
            strT = str4;
            r22 = yyVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.uy
    public final boolean e(String str, String[] strArr, my myVar) {
        this.f18928e = str;
        this.f18930h = myVar;
        String strT = t(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i4 = 0; i4 < strArr.length; i4++) {
                uriArr[i4] = Uri.parse(strArr[i4]);
            }
            fz fzVar = this.f18927d;
            fzVar.getClass();
            fzVar.t(uriArr, ByteBuffer.allocate(0), false);
            qz qzVar = (qz) this.f17383c.get();
            if (qzVar != null) {
                qzVar.B0(strT, this);
            }
            ua.j.C.f35267k.getClass();
            this.f18931i = System.currentTimeMillis();
            this.j = -1L;
            ya.f0.f37440l.postDelayed(new s(21, this), 0L);
            return true;
        } catch (Exception e2) {
            String message = e2.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb2.append("Failed to preload url ");
            sb2.append(str);
            sb2.append(" Exception: ");
            sb2.append(message);
            za.i.h(sb2.toString());
            ua.j.C.f35265h.g("VideoStreamExoPlayerCache.preload", e2);
            a();
            r(str, strT, "error", u("error", e2));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.uy
    public final void f(int i4) {
        bz bzVar = this.f18927d.f11295b;
        synchronized (bzVar) {
            bzVar.f9857c = i4 * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.uy
    public final void h(int i4) {
        bz bzVar = this.f18927d.f11295b;
        synchronized (bzVar) {
            bzVar.f9856b = i4 * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.tx
    public final void i() {
        za.i.h("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.tx
    public final void j(long j, boolean z3) {
        qz qzVar = (qz) this.f17383c.get();
        if (qzVar != null) {
            fx.f11279f.execute(new fy(qzVar, z3, j, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.tx
    public final void l(String str, Exception exc) {
        za.i.i("Precache error", exc);
        ua.j.C.f35265h.g("VideoStreamExoPlayerCache.onError", exc);
    }

    @Override // com.google.android.gms.internal.ads.tx
    public final void m(IOException iOException) {
        za.i.i("Precache exception", iOException);
        ua.j.C.f35265h.g("VideoStreamExoPlayerCache.onException", iOException);
    }

    @Override // com.google.android.gms.internal.ads.uy
    public final void o(int i4) {
        bz bzVar = this.f18927d.f11295b;
        synchronized (bzVar) {
            bzVar.f9858d = i4 * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.uy
    public final void p(int i4) {
        bz bzVar = this.f18927d.f11295b;
        synchronized (bzVar) {
            bzVar.f9859e = i4 * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.uy
    public final void q() {
        synchronized (this) {
            this.f18929f = true;
            notify();
            a();
        }
        String str = this.f18928e;
        if (str != null) {
            r(this.f18928e, t(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.tx
    public final void F(int i4) {
    }

    @Override // com.google.android.gms.internal.ads.tx
    public final void k(int i4, int i10) {
    }
}
