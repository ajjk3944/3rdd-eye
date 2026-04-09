package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.nio.ByteBuffer;
import q2.C2841s;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.Gg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0522Gg extends AbstractC0454Cg implements InterfaceC1000cg {

    /* renamed from: d, reason: collision with root package name */
    public C0641Ng f8411d;

    /* renamed from: e, reason: collision with root package name */
    public String f8412e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8413f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8414g;

    /* renamed from: h, reason: collision with root package name */
    public C1971ug f8415h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public long f8416j;

    public static final String o(String str) {
        return "cache:".concat(String.valueOf(u2.f.d(str, "MD5")));
    }

    public static String p(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        A.f.w(sb, str, "/", canonicalName, ":");
        sb.append(message);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1000cg
    public final void U(int i) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0454Cg
    public final void a() {
        C0641Ng c0641Ng = this.f8411d;
        if (c0641Ng != null) {
            c0641Ng.f10028j = null;
            C2232zO c2232zO = c0641Ng.f10026g;
            if (c2232zO != null) {
                c2232zO.f17873d.d();
                c2232zO.f17872c.J1(c0641Ng);
                C2232zO c2232zO2 = c0641Ng.f10026g;
                c2232zO2.f17873d.d();
                c2232zO2.f17872c.L1();
                c0641Ng.f10026g = null;
                C0641Ng.f10013J.decrementAndGet();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0454Cg
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
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.Cg, com.google.android.gms.internal.ads.Gg] */
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
    @Override // com.google.android.gms.internal.ads.AbstractC0454Cg
    public final boolean c(String str, String[] strArr) throws Throwable {
        ?? r42;
        boolean z6;
        ?? r22;
        String str2;
        String str3;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        C0522Gg c0522Gg = this;
        String str4 = str;
        c0522Gg.f8412e = str4;
        String strO = o(str4);
        String str5 = " ms";
        String str6 = "Timeout reached. Limit: ";
        boolean z7 = false;
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            C0641Ng c0641Ng = c0522Gg.f8411d;
            c0641Ng.getClass();
            c0641Ng.u(uriArr, ByteBuffer.allocate(0), false);
            InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) c0522Gg.f7636c.get();
            if (interfaceC0828Yg != null) {
                interfaceC0828Yg.M0(strO, c0522Gg);
            }
            p2.j.f22785C.f22797k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            E9 e9 = H9.f8703Z;
            C2841s c2841s = C2841s.f23267e;
            long jLongValue = ((Long) c2841s.f23270c.a(e9)).longValue();
            long jLongValue2 = ((Long) c2841s.f23270c.a(H9.f8698Y)).longValue() * 1000;
            long jIntValue = ((Integer) c2841s.f23270c.a(H9.f8847w)).intValue();
            boolean zBooleanValue = ((Boolean) c2841s.f23270c.a(H9.f8792n2)).booleanValue();
            long j12 = -1;
            while (true) {
                synchronized (this) {
                    try {
                        if (System.currentTimeMillis() - jCurrentTimeMillis > jLongValue2) {
                            String str7 = str6;
                            long j13 = jLongValue2;
                            StringBuilder sb = new StringBuilder(String.valueOf(j13).length() + 27);
                            sb.append(str7);
                            sb.append(j13);
                            sb.append(str5);
                            throw new IOException(sb.toString());
                        }
                        if (c0522Gg.f8413f) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (c0522Gg.f8414g) {
                            return true;
                        }
                        C2232zO c2232zO = c0522Gg.f8411d.f10026g;
                        if (!(c2232zO != null ? true : z7)) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long jH1 = c2232zO.H1();
                        if (jH1 > 0) {
                            long jI1 = c0522Gg.f8411d.f10026g.I1();
                            if (jI1 != j12) {
                                boolean z8 = jI1 > 0 ? true : z7;
                                if (zBooleanValue) {
                                    try {
                                        C0641Ng c0641Ng2 = c0522Gg.f8411d;
                                        j11 = (c0641Ng2.f10018G == null || !c0641Ng2.f10018G.f9498D) ? c0641Ng2.f10029k : 0L;
                                    } catch (Throwable th) {
                                        th = th;
                                        r42 = strO;
                                        z6 = false;
                                        strO = str4;
                                        r22 = c0522Gg;
                                        throw th;
                                    }
                                } else {
                                    j11 = -1;
                                }
                                long jQ = zBooleanValue ? c0522Gg.f8411d.q() : -1L;
                                long jR = zBooleanValue ? c0522Gg.f8411d.r() : -1L;
                                try {
                                    int i3 = C0641Ng.f10012I.get();
                                    int i6 = C0641Ng.f10013J.get();
                                    W2.e eVar = u2.f.f23795b;
                                    str2 = str5;
                                    str3 = str6;
                                    j9 = jLongValue;
                                    j7 = jIntValue;
                                    j6 = jLongValue2;
                                    long j14 = jQ;
                                    z6 = false;
                                    try {
                                        RunnableC2133xg runnableC2133xg = new RunnableC2133xg(c0522Gg, str4, strO, jI1, jH1, j11, j14, jR, z8, i3, i6);
                                        j10 = jI1;
                                        r42 = jH1;
                                        eVar.post(runnableC2133xg);
                                        j12 = j10;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r22 = this;
                                        r42 = strO;
                                        strO = str;
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    z6 = false;
                                    r22 = this;
                                    r42 = strO;
                                    strO = str;
                                    throw th;
                                }
                            } else {
                                str2 = str5;
                                str3 = str6;
                                z6 = z7;
                                j9 = jLongValue;
                                r42 = jH1;
                                j10 = jI1;
                                j6 = jLongValue2;
                                j7 = jIntValue;
                            }
                            r22 = (j10 > r42 ? 1 : (j10 == r42 ? 0 : -1));
                            if (r22 >= 0) {
                                c0522Gg = this;
                                str4 = str;
                                try {
                                    u2.f.f23795b.post(new RunnableC0420Ag(c0522Gg, str4, strO, (long) r42));
                                    return true;
                                } catch (Throwable th4) {
                                    th = th4;
                                    r42 = strO;
                                    strO = str4;
                                    r22 = c0522Gg;
                                    throw th;
                                }
                            }
                            try {
                                C0522Gg c0522Gg2 = this;
                                r42 = strO;
                                strO = str;
                                if (c0522Gg2.f8411d.f10029k >= j7 && j10 > 0) {
                                    return true;
                                }
                                j8 = j9;
                                r22 = c0522Gg2;
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        } else {
                            str2 = str5;
                            str3 = str6;
                            z6 = z7;
                            j6 = jLongValue2;
                            j7 = jIntValue;
                            r42 = strO;
                            strO = str4;
                            r22 = c0522Gg;
                            j8 = jLongValue;
                        }
                        try {
                            r22.wait(j8);
                        } catch (InterruptedException unused) {
                            throw new IOException("Wait interrupted.");
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        r42 = strO;
                        z6 = z7;
                    }
                }
                try {
                    throw th;
                } catch (Exception e6) {
                    e = e6;
                    String message = e.getMessage();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strO).length() + 34 + String.valueOf(message).length());
                    sb2.append("Failed to preload url ");
                    sb2.append(strO);
                    sb2.append(" Exception: ");
                    sb2.append(message);
                    u2.k.h(sb2.toString());
                    p2.j.f22785C.f22795h.g("VideoStreamExoPlayerCache.preload", e);
                    r22.a();
                    r22.l(strO, r42, "error", p("error", e));
                    return z6;
                }
                jLongValue = j8;
                c0522Gg = r22;
                str4 = strO;
                strO = r42;
                jLongValue2 = j6;
                jIntValue = j7;
                z7 = z6;
                str5 = str2;
                str6 = str3;
            }
        } catch (Exception e7) {
            e = e7;
            r42 = strO;
            z6 = z7;
            strO = str4;
            r22 = c0522Gg;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0454Cg
    public final boolean e(String str, String[] strArr, C1971ug c1971ug) {
        this.f8412e = str;
        this.f8415h = c1971ug;
        String strO = o(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            C0641Ng c0641Ng = this.f8411d;
            c0641Ng.getClass();
            c0641Ng.u(uriArr, ByteBuffer.allocate(0), false);
            InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) this.f7636c.get();
            if (interfaceC0828Yg != null) {
                interfaceC0828Yg.M0(strO, this);
            }
            p2.j.f22785C.f22797k.getClass();
            this.i = System.currentTimeMillis();
            this.f8416j = -1L;
            C2911G.f23576l.postDelayed(new RunnableC1883t(22, this), 0L);
            return true;
        } catch (Exception e6) {
            String message = e6.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb.append("Failed to preload url ");
            sb.append(str);
            sb.append(" Exception: ");
            sb.append(message);
            u2.k.h(sb.toString());
            p2.j.f22785C.f22795h.g("VideoStreamExoPlayerCache.preload", e6);
            a();
            l(str, strO, "error", p("error", e6));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0454Cg
    public final void f(int i) {
        C0573Jg c0573Jg = this.f8411d.f10021b;
        synchronized (c0573Jg) {
            c0573Jg.f9328c = i * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0454Cg
    public final void h(int i) {
        C0573Jg c0573Jg = this.f8411d.f10021b;
        synchronized (c0573Jg) {
            c0573Jg.f9327b = i * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0454Cg
    public final void i(int i) {
        C0573Jg c0573Jg = this.f8411d.f10021b;
        synchronized (c0573Jg) {
            c0573Jg.f9329d = i * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0454Cg
    public final void j(int i) {
        C0573Jg c0573Jg = this.f8411d.f10021b;
        synchronized (c0573Jg) {
            c0573Jg.f9330e = i * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0454Cg
    public final void k() {
        synchronized (this) {
            this.f8413f = true;
            notify();
            a();
        }
        String str = this.f8412e;
        if (str != null) {
            l(this.f8412e, o(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1000cg
    public final void t() {
        u2.k.h("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1000cg
    public final void u(long j6, boolean z6) {
        InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) this.f7636c.get();
        if (interfaceC0828Yg != null) {
            AbstractC0640Nf.f10010f.execute(new RunnableC1594ng(interfaceC0828Yg, z6, j6, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1000cg
    public final void v(int i, int i3) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1000cg
    public final void w(String str, Exception exc) {
        u2.k.i("Precache error", exc);
        p2.j.f22785C.f22795h.g("VideoStreamExoPlayerCache.onError", exc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1000cg
    public final void x(IOException iOException) {
        u2.k.i("Precache exception", iOException);
        p2.j.f22785C.f22795h.g("VideoStreamExoPlayerCache.onException", iOException);
    }
}
