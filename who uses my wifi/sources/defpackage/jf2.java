package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jf2 extends ff2 implements fe2 {
    public sf2 i;
    public String j;
    public boolean k;
    public boolean l;
    public we2 m;
    public long n;
    public long o;

    public static final String o(String str) {
        return "cache:".concat(String.valueOf(j63.d(str, "MD5")));
    }

    public static String p(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        ex0.q(sb, str, "/", canonicalName, ":");
        sb.append(message);
        return sb.toString();
    }

    @Override // defpackage.ff2
    public final void a() {
        sf2 sf2Var = this.i;
        if (sf2Var != null) {
            sf2Var.o = null;
            mc4 mc4Var = sf2Var.l;
            if (mc4Var != null) {
                mc4Var.j.b();
                mc4Var.i.W1(sf2Var);
                mc4 mc4Var2 = sf2Var.l;
                mc4Var2.j.b();
                mc4Var2.i.X1();
                sf2Var.l = null;
                sf2.A.decrementAndGet();
            }
        }
    }

    @Override // defpackage.ff2
    public final boolean b(String str) {
        return d(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [ff2, jf2] */
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
    @Override // defpackage.ff2
    public final boolean d(String str, String[] strArr) throws Throwable {
        ?? r4;
        boolean z;
        ?? r2;
        String str2;
        String str3;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        jf2 jf2Var = this;
        String str4 = str;
        jf2Var.j = str4;
        String strO = o(str4);
        String str5 = " ms";
        String str6 = "Timeout reached. Limit: ";
        boolean z2 = false;
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            sf2 sf2Var = jf2Var.i;
            sf2Var.getClass();
            sf2Var.u(uriArr, ByteBuffer.allocate(0), false);
            ag2 ag2Var = (ag2) jf2Var.h.get();
            if (ag2Var != null) {
                ag2Var.d1(strO, jf2Var);
            }
            hg4.C.k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            iz1 iz1Var = mz1.K;
            tw1 tw1Var = tw1.e;
            long jLongValue = ((Long) tw1Var.c.a(iz1Var)).longValue();
            long jLongValue2 = ((Long) tw1Var.c.a(mz1.J)).longValue() * 1000;
            long jIntValue = ((Integer) tw1Var.c.a(mz1.v)).intValue();
            boolean zBooleanValue = ((Boolean) tw1Var.c.a(mz1.Y1)).booleanValue();
            long j7 = -1;
            while (true) {
                synchronized (this) {
                    try {
                        if (System.currentTimeMillis() - jCurrentTimeMillis > jLongValue2) {
                            String str7 = str6;
                            long j8 = jLongValue2;
                            StringBuilder sb = new StringBuilder(String.valueOf(j8).length() + 27);
                            sb.append(str7);
                            sb.append(j8);
                            sb.append(str5);
                            throw new IOException(sb.toString());
                        }
                        if (jf2Var.k) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (jf2Var.l) {
                            return true;
                        }
                        mc4 mc4Var = jf2Var.i.l;
                        if (!(mc4Var != null ? true : z2)) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long jU1 = mc4Var.U1();
                        if (jU1 > 0) {
                            long jV1 = jf2Var.i.l.V1();
                            if (jV1 != j7) {
                                boolean z3 = jV1 > 0 ? true : z2;
                                if (zBooleanValue) {
                                    try {
                                        sf2 sf2Var2 = jf2Var.i;
                                        j6 = (sf2Var2.x == null || !sf2Var2.x.u) ? sf2Var2.p : 0L;
                                    } catch (Throwable th) {
                                        th = th;
                                        r4 = strO;
                                        z = false;
                                        strO = str4;
                                        r2 = jf2Var;
                                        throw th;
                                    }
                                } else {
                                    j6 = -1;
                                }
                                long jQ = zBooleanValue ? jf2Var.i.q() : -1L;
                                long jR = zBooleanValue ? jf2Var.i.r() : -1L;
                                try {
                                    int i2 = sf2.z.get();
                                    int i3 = sf2.A.get();
                                    wc1 wc1Var = j63.b;
                                    str2 = str5;
                                    str3 = str6;
                                    j4 = jLongValue;
                                    j2 = jIntValue;
                                    j = jLongValue2;
                                    long j9 = jQ;
                                    z = false;
                                    try {
                                        ze2 ze2Var = new ze2(jf2Var, str4, strO, jV1, jU1, j6, j9, jR, z3, i2, i3);
                                        j5 = jV1;
                                        r4 = jU1;
                                        wc1Var.post(ze2Var);
                                        j7 = j5;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r2 = this;
                                        r4 = strO;
                                        strO = str;
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    z = false;
                                    r2 = this;
                                    r4 = strO;
                                    strO = str;
                                    throw th;
                                }
                            } else {
                                str2 = str5;
                                str3 = str6;
                                z = z2;
                                j4 = jLongValue;
                                r4 = jU1;
                                j5 = jV1;
                                j = jLongValue2;
                                j2 = jIntValue;
                            }
                            r2 = (j5 > r4 ? 1 : (j5 == r4 ? 0 : -1));
                            if (r2 >= 0) {
                                jf2Var = this;
                                str4 = str;
                                try {
                                    j63.b.post(new ef2(jf2Var, str4, strO, (long) r4));
                                    return true;
                                } catch (Throwable th4) {
                                    th = th4;
                                    r4 = strO;
                                    strO = str4;
                                    r2 = jf2Var;
                                    throw th;
                                }
                            }
                            try {
                                jf2 jf2Var2 = this;
                                r4 = strO;
                                strO = str;
                                if (jf2Var2.i.p >= j2 && j5 > 0) {
                                    return true;
                                }
                                j3 = j4;
                                r2 = jf2Var2;
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        } else {
                            str2 = str5;
                            str3 = str6;
                            z = z2;
                            j = jLongValue2;
                            j2 = jIntValue;
                            r4 = strO;
                            strO = str4;
                            r2 = jf2Var;
                            j3 = jLongValue;
                        }
                        try {
                            r2.wait(j3);
                        } catch (InterruptedException unused) {
                            throw new IOException("Wait interrupted.");
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        r4 = strO;
                        z = z2;
                    }
                }
                try {
                    throw th;
                } catch (Exception e) {
                    e = e;
                    String message = e.getMessage();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strO).length() + 34 + String.valueOf(message).length());
                    sb2.append("Failed to preload url ");
                    sb2.append(strO);
                    sb2.append(" Exception: ");
                    sb2.append(message);
                    gi2.i0(sb2.toString());
                    hg4.C.h.e("VideoStreamExoPlayerCache.preload", e);
                    r2.a();
                    r2.m(strO, r4, "error", p("error", e));
                    return z;
                }
                jLongValue = j3;
                jf2Var = r2;
                str4 = strO;
                strO = r4;
                jLongValue2 = j;
                jIntValue = j2;
                z2 = z;
                str5 = str2;
                str6 = str3;
            }
        } catch (Exception e2) {
            e = e2;
            r4 = strO;
            z = z2;
            strO = str4;
            r2 = jf2Var;
        }
    }

    @Override // defpackage.ff2
    public final boolean g(String str, String[] strArr, we2 we2Var) {
        this.j = str;
        this.m = we2Var;
        String strO = o(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            sf2 sf2Var = this.i;
            sf2Var.getClass();
            sf2Var.u(uriArr, ByteBuffer.allocate(0), false);
            ag2 ag2Var = (ag2) this.h.get();
            if (ag2Var != null) {
                ag2Var.d1(strO, this);
            }
            hg4.C.k.getClass();
            this.n = System.currentTimeMillis();
            this.o = -1L;
            lf4.l.postDelayed(new fu1(15, this), 0L);
            return true;
        } catch (Exception e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb.append("Failed to preload url ");
            sb.append(str);
            sb.append(" Exception: ");
            sb.append(message);
            gi2.i0(sb.toString());
            hg4.C.h.e("VideoStreamExoPlayerCache.preload", e);
            a();
            m(str, strO, "error", p("error", e));
            return false;
        }
    }

    @Override // defpackage.ff2
    public final void h(int i) {
        mf2 mf2Var = this.i.g;
        synchronized (mf2Var) {
            mf2Var.c = i * 1000;
        }
    }

    @Override // defpackage.ff2
    public final void i(int i) {
        mf2 mf2Var = this.i.g;
        synchronized (mf2Var) {
            mf2Var.b = i * 1000;
        }
    }

    @Override // defpackage.ff2
    public final void j(int i) {
        mf2 mf2Var = this.i.g;
        synchronized (mf2Var) {
            mf2Var.d = i * 1000;
        }
    }

    @Override // defpackage.ff2
    public final void k(int i) {
        mf2 mf2Var = this.i.g;
        synchronized (mf2Var) {
            mf2Var.e = i * 1000;
        }
    }

    @Override // defpackage.ff2
    public final void l() {
        synchronized (this) {
            this.k = true;
            notify();
            a();
        }
        String str = this.j;
        if (str != null) {
            m(this.j, o(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // defpackage.fe2
    public final void t() {
        gi2.i0("Precache onRenderedFirstFrame");
    }

    @Override // defpackage.fe2
    public final void u(IOException iOException) {
        gi2.q0(5);
        hg4.C.h.e("VideoStreamExoPlayerCache.onException", iOException);
    }

    @Override // defpackage.fe2
    public final void v(long j, boolean z) {
        ag2 ag2Var = (ag2) this.h.get();
        if (ag2Var != null) {
            md2.f.execute(new re2(ag2Var, z, j, 1));
        }
    }

    @Override // defpackage.fe2
    public final void x(String str, Exception exc) {
        gi2.q0(5);
        hg4.C.h.e("VideoStreamExoPlayerCache.onError", exc);
    }

    @Override // defpackage.fe2
    public final void f0(int i) {
    }

    @Override // defpackage.fe2
    public final void w(int i, int i2) {
    }
}
