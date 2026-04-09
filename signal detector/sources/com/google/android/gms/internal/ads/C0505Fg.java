package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Fg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0505Fg extends AbstractC0454Cg implements InterfaceC1958uK {

    /* renamed from: C, reason: collision with root package name */
    public static final AtomicInteger f8146C = new AtomicInteger(0);

    /* renamed from: d, reason: collision with root package name */
    public String f8147d;

    /* renamed from: e, reason: collision with root package name */
    public final C1272hg f8148e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8149f;

    /* renamed from: g, reason: collision with root package name */
    public final U1.b f8150g;

    /* renamed from: h, reason: collision with root package name */
    public final A0 f8151h;
    public ByteBuffer i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8152j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f8153k;

    /* renamed from: l, reason: collision with root package name */
    public final String f8154l;

    /* renamed from: m, reason: collision with root package name */
    public final int f8155m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8156n;

    public C0505Fg(InterfaceC0828Yg interfaceC0828Yg, C1272hg c1272hg) {
        super(interfaceC0828Yg);
        this.f8148e = c1272hg;
        this.f8150g = new U1.b(5);
        this.f8151h = new A0();
        this.f8153k = new Object();
        String strO = interfaceC0828Yg.o();
        this.f8154l = (String) (strO == null ? LA.f9634a : new UA(strO)).a();
        this.f8155m = interfaceC0828Yg.q();
        f8146C.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0454Cg
    public final void a() {
        f8146C.decrementAndGet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12, types: [com.google.android.gms.internal.ads.pg] */
    /* JADX WARN: Type inference failed for: r27v0, types: [com.google.android.gms.internal.ads.Cg, com.google.android.gms.internal.ads.Fg, com.google.android.gms.internal.ads.uK] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v9, types: [boolean] */
    @Override // com.google.android.gms.internal.ads.AbstractC0454Cg
    public final boolean b(String str) throws IOException {
        String str2;
        ?? r6;
        CG cg;
        long j6;
        String str3 = str;
        this.f8147d = str3;
        String str4 = "error";
        String strConcat = "cache:".concat(String.valueOf(u2.f.d(str3, "MD5")));
        try {
            C1879sw c1879sw = new C1879sw(6);
            String str5 = this.f7635b;
            C1272hg c1272hg = this.f8148e;
            CG cg2 = new CG(str5, c1272hg.f14522d, c1272hg.f14523e, true, c1879sw);
            cg2.c(this);
            if (c1272hg.i) {
                cg2 = new C1702pg(this.f7634a, cg2, this.f8154l, this.f8155m);
            }
            cg2.a(new TE(Uri.parse(str3), 0L, -1L));
            InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) this.f7636c.get();
            if (interfaceC0828Yg != null) {
                interfaceC0828Yg.M0(strConcat, this);
            }
            p2.j.f22785C.f22797k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            E9 e9 = H9.f8703Z;
            C2841s c2841s = C2841s.f23267e;
            long jLongValue = ((Long) c2841s.f23270c.a(e9)).longValue();
            long jLongValue2 = ((Long) c2841s.f23270c.a(H9.f8698Y)).longValue();
            this.i = ByteBuffer.allocate(c1272hg.f14521c);
            byte[] bArr = new byte[8192];
            long j7 = jCurrentTimeMillis;
            while (true) {
                try {
                    int iD = cg2.d(0, Math.min(this.i.remaining(), 8192), bArr);
                    if (iD == -1) {
                        this.f8156n = true;
                        str3 = str;
                        u2.f.f23795b.post(new RunnableC0420Ag((AbstractC0454Cg) this, str3, strConcat, (int) this.f8151h.a(this.i)));
                        return true;
                    }
                    str3 = str;
                    str2 = str4;
                    try {
                        synchronized (this.f8153k) {
                            cg = cg2;
                            try {
                                if (this.f8149f) {
                                    j6 = jCurrentTimeMillis;
                                } else {
                                    j6 = jCurrentTimeMillis;
                                    this.i.put(bArr, 0, iD);
                                }
                            } finally {
                            }
                        }
                        if (this.i.remaining() <= 0) {
                            p();
                            return true;
                        }
                        r6 = this.f8149f;
                        try {
                            if (r6 != 0) {
                                int iLimit = this.i.limit();
                                StringBuilder sb = new StringBuilder(String.valueOf(iLimit).length() + 24);
                                sb.append("Precache abort at ");
                                sb.append(iLimit);
                                sb.append(" bytes");
                                throw new IOException(sb.toString());
                            }
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            if (jCurrentTimeMillis2 - j7 >= jLongValue) {
                                p();
                                j7 = jCurrentTimeMillis2;
                            }
                            if (jCurrentTimeMillis2 - j6 > 1000 * jLongValue2) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(jLongValue2).length() + 29);
                                sb2.append("Timeout exceeded. Limit: ");
                                sb2.append(jLongValue2);
                                sb2.append(" sec");
                                throw new IOException(sb2.toString());
                            }
                            str4 = str2;
                            cg2 = cg;
                            jCurrentTimeMillis = j6;
                        } catch (Exception e6) {
                            e = e6;
                            String canonicalName = e.getClass().getCanonicalName();
                            String message = e.getMessage();
                            String strN = AbstractC1135f5.n(new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(message).length()), canonicalName, ":", message);
                            StringBuilder sb3 = new StringBuilder(strN.length() + String.valueOf(str3).length() + 34);
                            sb3.append("Failed to preload url ");
                            sb3.append(str3);
                            sb3.append(" Exception: ");
                            sb3.append(strN);
                            u2.k.h(sb3.toString());
                            l(str3, strConcat, r6, strN);
                            return false;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        r6 = str2;
                        String canonicalName2 = e.getClass().getCanonicalName();
                        String message2 = e.getMessage();
                        String strN2 = AbstractC1135f5.n(new StringBuilder(String.valueOf(canonicalName2).length() + 1 + String.valueOf(message2).length()), canonicalName2, ":", message2);
                        StringBuilder sb32 = new StringBuilder(strN2.length() + String.valueOf(str3).length() + 34);
                        sb32.append("Failed to preload url ");
                        sb32.append(str3);
                        sb32.append(" Exception: ");
                        sb32.append(strN2);
                        u2.k.h(sb32.toString());
                        l(str3, strConcat, r6, strN2);
                        return false;
                    }
                } catch (Exception e8) {
                    e = e8;
                    str3 = str;
                    str2 = str4;
                    r6 = str2;
                    String canonicalName22 = e.getClass().getCanonicalName();
                    String message22 = e.getMessage();
                    String strN22 = AbstractC1135f5.n(new StringBuilder(String.valueOf(canonicalName22).length() + 1 + String.valueOf(message22).length()), canonicalName22, ":", message22);
                    StringBuilder sb322 = new StringBuilder(strN22.length() + String.valueOf(str3).length() + 34);
                    sb322.append("Failed to preload url ");
                    sb322.append(str3);
                    sb322.append(" Exception: ");
                    sb322.append(strN22);
                    u2.k.h(sb322.toString());
                    l(str3, strConcat, r6, strN22);
                    return false;
                }
            }
        } catch (Exception e10) {
            e = e10;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1958uK
    public final void d(AbstractC2003vB abstractC2003vB, TE te, boolean z6) {
        if (abstractC2003vB instanceof CG) {
            ((ArrayList) this.f8150g.f3691c).add((CG) abstractC2003vB);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0454Cg
    public final void k() {
        this.f8149f = true;
    }

    public final ByteBuffer o() {
        synchronized (this.f8153k) {
            try {
                ByteBuffer byteBuffer = this.i;
                if (byteBuffer != null && !this.f8152j) {
                    byteBuffer.flip();
                    this.f8152j = true;
                }
                this.f8149f = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.i;
    }

    public final void p() {
        U1.b bVar = this.f8150g;
        Iterator it = ((ArrayList) bVar.f3691c).iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((CG) it.next()).h().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                        bVar.f3690b = Math.max(bVar.f3690b, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            it.remove();
        }
        int i = (int) bVar.f3690b;
        int iA = (int) this.f8151h.a(this.i);
        int iPosition = this.i.position();
        int iRound = Math.round((iPosition / i) * iA);
        int i3 = C0641Ng.f10012I.get();
        int i6 = C0641Ng.f10013J.get();
        String str = this.f8147d;
        u2.f.f23795b.post(new RunnableC2187yg(this, str, "cache:".concat(String.valueOf(u2.f.d(str, "MD5"))), iPosition, i, iRound, iA, iRound > 0, i3, i6));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1958uK
    public final void m(TE te, boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1958uK
    public final void g(TE te, boolean z6, int i) {
    }
}
