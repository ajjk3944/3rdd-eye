package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class if2 extends ff2 implements ws3 {
    public static final AtomicInteger t = new AtomicInteger(0);
    public String i;
    public final je2 j;
    public boolean k;
    public final ue l;
    public final pf1 m;
    public ByteBuffer n;
    public boolean o;
    public final Object p;
    public final String q;
    public final int r;
    public boolean s;

    public if2(ag2 ag2Var, je2 je2Var) {
        super(ag2Var);
        this.j = je2Var;
        this.l = new ue(5);
        this.m = new pf1();
        this.p = new Object();
        String strO = ag2Var.o();
        this.q = (String) (strO == null ? xk3.f : new fl3(strO)).b();
        this.r = ag2Var.q();
        t.incrementAndGet();
    }

    @Override // defpackage.ff2
    public final void a() {
        t.decrementAndGet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12, types: [te2] */
    /* JADX WARN: Type inference failed for: r27v0, types: [ff2, if2, ws3] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v9, types: [boolean] */
    @Override // defpackage.ff2
    public final boolean b(String str) throws IOException {
        String str2;
        ?? r6;
        bl3 bl3Var;
        long j;
        String str3 = str;
        this.i = str3;
        String str4 = "error";
        String strConcat = "cache:".concat(String.valueOf(j63.d(str3, "MD5")));
        try {
            mr2 mr2Var = new mr2(12);
            String str5 = this.g;
            je2 je2Var = this.j;
            bl3 bl3Var2 = new bl3(str5, je2Var.d, je2Var.e, true, mr2Var);
            bl3Var2.b(this);
            if (je2Var.i) {
                bl3Var2 = new te2(this.f, bl3Var2, this.q, this.r);
            }
            bl3Var2.a(new ij3(Uri.parse(str3), 0L, -1L));
            ag2 ag2Var = (ag2) this.h.get();
            if (ag2Var != null) {
                ag2Var.d1(strConcat, this);
            }
            hg4.C.k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            iz1 iz1Var = mz1.K;
            tw1 tw1Var = tw1.e;
            long jLongValue = ((Long) tw1Var.c.a(iz1Var)).longValue();
            long jLongValue2 = ((Long) tw1Var.c.a(mz1.J)).longValue();
            this.n = ByteBuffer.allocate(je2Var.c);
            byte[] bArr = new byte[8192];
            long j2 = jCurrentTimeMillis;
            while (true) {
                try {
                    int iD = bl3Var2.d(bArr, 0, Math.min(this.n.remaining(), 8192));
                    if (iD == -1) {
                        this.s = true;
                        str3 = str;
                        j63.b.post(new ef2((ff2) this, str3, strConcat, (int) this.m.a(this.n)));
                        return true;
                    }
                    str3 = str;
                    str2 = str4;
                    try {
                        synchronized (this.p) {
                            bl3Var = bl3Var2;
                            try {
                                if (this.k) {
                                    j = jCurrentTimeMillis;
                                } else {
                                    j = jCurrentTimeMillis;
                                    this.n.put(bArr, 0, iD);
                                }
                            } finally {
                            }
                        }
                        if (this.n.remaining() <= 0) {
                            o();
                            return true;
                        }
                        r6 = this.k;
                        try {
                            if (r6 != 0) {
                                int iLimit = this.n.limit();
                                StringBuilder sb = new StringBuilder(String.valueOf(iLimit).length() + 24);
                                sb.append("Precache abort at ");
                                sb.append(iLimit);
                                sb.append(" bytes");
                                throw new IOException(sb.toString());
                            }
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            if (jCurrentTimeMillis2 - j2 >= jLongValue) {
                                o();
                                j2 = jCurrentTimeMillis2;
                            }
                            if (jCurrentTimeMillis2 - j > 1000 * jLongValue2) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(jLongValue2).length() + 29);
                                sb2.append("Timeout exceeded. Limit: ");
                                sb2.append(jLongValue2);
                                sb2.append(" sec");
                                throw new IOException(sb2.toString());
                            }
                            str4 = str2;
                            bl3Var2 = bl3Var;
                            jCurrentTimeMillis = j;
                        } catch (Exception e) {
                            e = e;
                            String canonicalName = e.getClass().getCanonicalName();
                            String message = e.getMessage();
                            String strL = ex0.l(new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(message).length()), canonicalName, ":", message);
                            StringBuilder sb3 = new StringBuilder(strL.length() + String.valueOf(str3).length() + 34);
                            sb3.append("Failed to preload url ");
                            sb3.append(str3);
                            sb3.append(" Exception: ");
                            sb3.append(strL);
                            gi2.i0(sb3.toString());
                            m(str3, strConcat, r6, strL);
                            return false;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        r6 = str2;
                        String canonicalName2 = e.getClass().getCanonicalName();
                        String message2 = e.getMessage();
                        String strL2 = ex0.l(new StringBuilder(String.valueOf(canonicalName2).length() + 1 + String.valueOf(message2).length()), canonicalName2, ":", message2);
                        StringBuilder sb32 = new StringBuilder(strL2.length() + String.valueOf(str3).length() + 34);
                        sb32.append("Failed to preload url ");
                        sb32.append(str3);
                        sb32.append(" Exception: ");
                        sb32.append(strL2);
                        gi2.i0(sb32.toString());
                        m(str3, strConcat, r6, strL2);
                        return false;
                    }
                } catch (Exception e3) {
                    e = e3;
                    str3 = str;
                    str2 = str4;
                    r6 = str2;
                    String canonicalName22 = e.getClass().getCanonicalName();
                    String message22 = e.getMessage();
                    String strL22 = ex0.l(new StringBuilder(String.valueOf(canonicalName22).length() + 1 + String.valueOf(message22).length()), canonicalName22, ":", message22);
                    StringBuilder sb322 = new StringBuilder(strL22.length() + String.valueOf(str3).length() + 34);
                    sb322.append("Failed to preload url ");
                    sb322.append(str3);
                    sb322.append(" Exception: ");
                    sb322.append(strL22);
                    gi2.i0(sb322.toString());
                    m(str3, strConcat, r6, strL22);
                    return false;
                }
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    @Override // defpackage.ws3
    public final void e(zd3 zd3Var, ij3 ij3Var, boolean z) {
        if (zd3Var instanceof bl3) {
            ((ArrayList) this.l.h).add((bl3) zd3Var);
        }
    }

    @Override // defpackage.ff2
    public final void l() {
        this.k = true;
    }

    public final void o() {
        ue ueVar = this.l;
        Iterator it = ((ArrayList) ueVar.h).iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((bl3) it.next()).g().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                        ueVar.g = Math.max(ueVar.g, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            it.remove();
        }
        int i = (int) ueVar.g;
        int iA = (int) this.m.a(this.n);
        int iPosition = this.n.position();
        int iRound = Math.round((iPosition / i) * iA);
        int i2 = sf2.z.get();
        int i3 = sf2.A.get();
        String str = this.i;
        j63.b.post(new cf2(this, str, "cache:".concat(String.valueOf(j63.d(str, "MD5"))), iPosition, i, iRound, iA, iRound > 0, i2, i3));
    }

    @Override // defpackage.ws3
    public final void c(ij3 ij3Var, boolean z) {
    }

    @Override // defpackage.ws3
    public final void f(ij3 ij3Var, boolean z, int i) {
    }
}
