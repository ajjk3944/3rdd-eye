package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.applovin.shadow.okio.Segment;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xy extends uy implements hm1 {

    /* renamed from: o, reason: collision with root package name */
    public static final AtomicInteger f18563o = new AtomicInteger(0);

    /* renamed from: d, reason: collision with root package name */
    public String f18564d;

    /* renamed from: e, reason: collision with root package name */
    public final yx f18565e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18566f;
    public final androidx.recyclerview.widget.d g;

    /* renamed from: h, reason: collision with root package name */
    public final c2 f18567h;

    /* renamed from: i, reason: collision with root package name */
    public ByteBuffer f18568i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f18569k;

    /* renamed from: l, reason: collision with root package name */
    public final String f18570l;

    /* renamed from: m, reason: collision with root package name */
    public final int f18571m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18572n;

    public xy(qz qzVar, yx yxVar) {
        super(qzVar);
        this.f18565e = yxVar;
        this.g = new androidx.recyclerview.widget.d(4);
        this.f18567h = new c2();
        this.f18569k = new Object();
        String strG1 = qzVar.G1();
        this.f18570l = (String) (strG1 == null ? x21.f18283a : new g31(strG1)).a();
        this.f18571m = qzVar.I1();
        f18563o.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.uy
    public final void a() {
        f18563o.decrementAndGet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12, types: [com.google.android.gms.internal.ads.hy] */
    /* JADX WARN: Type inference failed for: r27v0, types: [com.google.android.gms.internal.ads.hm1, com.google.android.gms.internal.ads.uy, com.google.android.gms.internal.ads.xy] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v9, types: [boolean] */
    @Override // com.google.android.gms.internal.ads.uy
    public final boolean b(String str) throws IOException {
        String str2;
        ?? r62;
        pe1 pe1Var;
        long j;
        String str3 = str;
        this.f18564d = str3;
        String str4 = "error";
        String strConcat = "cache:".concat(String.valueOf(za.d.d(str3, "MD5")));
        try {
            ce1 ce1Var = new ce1();
            String str5 = this.f17382b;
            yx yxVar = this.f18565e;
            pe1 pe1Var2 = new pe1(str5, yxVar.f18916d, yxVar.f18917e, true, ce1Var);
            pe1Var2.b(this);
            if (yxVar.f18920i) {
                pe1Var2 = new hy(this.f17381a, pe1Var2, this.f18570l, this.f18571m);
            }
            pe1Var2.a(new gb1(Uri.parse(str3), 0L, -1L));
            qz qzVar = (qz) this.f17383c.get();
            if (qzVar != null) {
                qzVar.B0(strConcat, this);
            }
            ua.j.C.f35267k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            pk pkVar = sk.Z;
            va.s sVar = va.s.f36163e;
            long jLongValue = ((Long) sVar.f36166c.a(pkVar)).longValue();
            long jLongValue2 = ((Long) sVar.f36166c.a(sk.Y)).longValue();
            this.f18568i = ByteBuffer.allocate(yxVar.f18915c);
            byte[] bArr = new byte[Segment.SIZE];
            long j8 = jCurrentTimeMillis;
            while (true) {
                try {
                    int iD = pe1Var2.d(0, Math.min(this.f18568i.remaining(), Segment.SIZE), bArr);
                    if (iD == -1) {
                        this.f18572n = true;
                        str3 = str;
                        za.d.f38136b.post(new sy((uy) this, str3, strConcat, (int) this.f18567h.a(this.f18568i)));
                        return true;
                    }
                    str3 = str;
                    str2 = str4;
                    try {
                        synchronized (this.f18569k) {
                            pe1Var = pe1Var2;
                            try {
                                if (this.f18566f) {
                                    j = jCurrentTimeMillis;
                                } else {
                                    j = jCurrentTimeMillis;
                                    this.f18568i.put(bArr, 0, iD);
                                }
                            } finally {
                            }
                        }
                        if (this.f18568i.remaining() <= 0) {
                            u();
                            return true;
                        }
                        r62 = this.f18566f;
                        try {
                            if (r62 != 0) {
                                int iLimit = this.f18568i.limit();
                                StringBuilder sb2 = new StringBuilder(String.valueOf(iLimit).length() + 24);
                                sb2.append("Precache abort at ");
                                sb2.append(iLimit);
                                sb2.append(" bytes");
                                throw new IOException(sb2.toString());
                            }
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            if (jCurrentTimeMillis2 - j8 >= jLongValue) {
                                u();
                                j8 = jCurrentTimeMillis2;
                            }
                            if (jCurrentTimeMillis2 - j > 1000 * jLongValue2) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(jLongValue2).length() + 29);
                                sb3.append("Timeout exceeded. Limit: ");
                                sb3.append(jLongValue2);
                                sb3.append(" sec");
                                throw new IOException(sb3.toString());
                            }
                            str4 = str2;
                            pe1Var2 = pe1Var;
                            jCurrentTimeMillis = j;
                        } catch (Exception e2) {
                            e = e2;
                            String canonicalName = e.getClass().getCanonicalName();
                            String message = e.getMessage();
                            String strM = r5.c.m(new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(message).length()), canonicalName, ":", message);
                            StringBuilder sb4 = new StringBuilder(strM.length() + String.valueOf(str3).length() + 34);
                            sb4.append("Failed to preload url ");
                            sb4.append(str3);
                            sb4.append(" Exception: ");
                            sb4.append(strM);
                            za.i.h(sb4.toString());
                            r(str3, strConcat, r62, strM);
                            return false;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        r62 = str2;
                        String canonicalName2 = e.getClass().getCanonicalName();
                        String message2 = e.getMessage();
                        String strM2 = r5.c.m(new StringBuilder(String.valueOf(canonicalName2).length() + 1 + String.valueOf(message2).length()), canonicalName2, ":", message2);
                        StringBuilder sb42 = new StringBuilder(strM2.length() + String.valueOf(str3).length() + 34);
                        sb42.append("Failed to preload url ");
                        sb42.append(str3);
                        sb42.append(" Exception: ");
                        sb42.append(strM2);
                        za.i.h(sb42.toString());
                        r(str3, strConcat, r62, strM2);
                        return false;
                    }
                } catch (Exception e11) {
                    e = e11;
                    str3 = str;
                    str2 = str4;
                    r62 = str2;
                    String canonicalName22 = e.getClass().getCanonicalName();
                    String message22 = e.getMessage();
                    String strM22 = r5.c.m(new StringBuilder(String.valueOf(canonicalName22).length() + 1 + String.valueOf(message22).length()), canonicalName22, ":", message22);
                    StringBuilder sb422 = new StringBuilder(strM22.length() + String.valueOf(str3).length() + 34);
                    sb422.append("Failed to preload url ");
                    sb422.append(str3);
                    sb422.append(" Exception: ");
                    sb422.append(strM22);
                    za.i.h(sb422.toString());
                    r(str3, strConcat, r62, strM22);
                    return false;
                }
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    @Override // com.google.android.gms.internal.ads.hm1
    public final void d(h41 h41Var, gb1 gb1Var, boolean z3) {
        if (h41Var instanceof pe1) {
            ((ArrayList) this.g.f1324c).add((pe1) h41Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.uy
    public final void q() {
        this.f18566f = true;
    }

    public final ByteBuffer t() {
        synchronized (this.f18569k) {
            try {
                ByteBuffer byteBuffer = this.f18568i;
                if (byteBuffer != null && !this.j) {
                    byteBuffer.flip();
                    this.j = true;
                }
                this.f18566f = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f18568i;
    }

    public final void u() {
        androidx.recyclerview.widget.d dVar = this.g;
        Iterator it = ((ArrayList) dVar.f1324c).iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((pe1) it.next()).A1().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                        dVar.f1323b = Math.max(dVar.f1323b, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            it.remove();
        }
        int i4 = (int) dVar.f1323b;
        int iA = (int) this.f18567h.a(this.f18568i);
        int iPosition = this.f18568i.position();
        int iRound = Math.round((iPosition / i4) * iA);
        int i10 = fz.f11292u.get();
        int i11 = fz.f11293v.get();
        String str = this.f18564d;
        za.d.f38136b.post(new qy(this, str, "cache:".concat(String.valueOf(za.d.d(str, "MD5"))), iPosition, i4, iRound, iA, iRound > 0, i10, i11));
    }

    @Override // com.google.android.gms.internal.ads.hm1
    public final void n(gb1 gb1Var, boolean z3) {
    }

    @Override // com.google.android.gms.internal.ads.hm1
    public final void g(gb1 gb1Var, boolean z3, int i4) {
    }
}
