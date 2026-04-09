package com.yandex.mobile.ads.impl;

import c9.C2088i;
import c9.C2097r;
import com.yandex.mobile.ads.impl.yg0;
import g0.C4356c;
import ia.C4468d;
import ia.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class wf0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ff0[] f34946a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map<ia.h, Integer> f34947b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f34948c = 0;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private int f34949a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f34950b;

        /* renamed from: c, reason: collision with root package name */
        private final ia.g f34951c;

        /* renamed from: d, reason: collision with root package name */
        public ff0[] f34952d;

        /* renamed from: e, reason: collision with root package name */
        private int f34953e;

        /* renamed from: f, reason: collision with root package name */
        public int f34954f;

        /* renamed from: g, reason: collision with root package name */
        public int f34955g;

        public /* synthetic */ a(yg0.b bVar) {
            this(bVar, 4096);
        }

        private final int a(int i) {
            int i10;
            int i11 = 0;
            if (i > 0) {
                int length = this.f34952d.length;
                while (true) {
                    length--;
                    i10 = this.f34953e;
                    if (length < i10 || i <= 0) {
                        break;
                    }
                    ff0 ff0Var = this.f34952d[length];
                    kotlin.jvm.internal.l.c(ff0Var);
                    int i12 = ff0Var.f27311c;
                    i -= i12;
                    this.f34955g -= i12;
                    this.f34954f--;
                    i11++;
                }
                ff0[] ff0VarArr = this.f34952d;
                int i13 = i10 + 1;
                System.arraycopy(ff0VarArr, i13, ff0VarArr, i13 + i11, this.f34954f);
                this.f34953e += i11;
            }
            return i11;
        }

        private final ia.h b(int i) throws IOException {
            if (i >= 0 && i <= wf0.b().length - 1) {
                return wf0.b()[i].f27309a;
            }
            int length = this.f34953e + 1 + (i - wf0.b().length);
            if (length >= 0) {
                ff0[] ff0VarArr = this.f34952d;
                if (length < ff0VarArr.length) {
                    ff0 ff0Var = ff0VarArr[length];
                    kotlin.jvm.internal.l.c(ff0Var);
                    return ff0Var.f27309a;
                }
            }
            throw new IOException(C4356c.h(i + 1, "Header index too large "));
        }

        public final void c() throws IOException {
            while (!this.f34951c.K()) {
                int iA = t82.a(this.f34951c.readByte());
                if (iA == 128) {
                    throw new IOException("index == 0");
                }
                if ((iA & 128) == 128) {
                    c(a(iA, 127) - 1);
                } else if (iA == 64) {
                    int i = wf0.f34948c;
                    a(new ff0(wf0.a(b()), b()));
                } else if ((iA & 64) == 64) {
                    a(new ff0(b(a(iA, 63) - 1), b()));
                } else if ((iA & 32) == 32) {
                    int iA2 = a(iA, 31);
                    this.f34949a = iA2;
                    if (iA2 < 0 || iA2 > 4096) {
                        throw new IOException(C4356c.h(this.f34949a, "Invalid dynamic table size update "));
                    }
                    int i10 = this.f34955g;
                    if (iA2 < i10) {
                        if (iA2 == 0) {
                            ff0[] ff0VarArr = this.f34952d;
                            C2088i.i(ff0VarArr, null, 0, ff0VarArr.length);
                            this.f34953e = this.f34952d.length - 1;
                            this.f34954f = 0;
                            this.f34955g = 0;
                        } else {
                            a(i10 - iA2);
                        }
                    }
                } else if (iA == 16 || iA == 0) {
                    int i11 = wf0.f34948c;
                    this.f34950b.add(new ff0(wf0.a(b()), b()));
                } else {
                    this.f34950b.add(new ff0(b(a(iA, 15) - 1), b()));
                }
            }
        }

        public a(yg0.b source, int i) {
            kotlin.jvm.internal.l.f(source, "source");
            this.f34949a = i;
            this.f34950b = new ArrayList();
            this.f34951c = ia.q.c(source);
            this.f34952d = new ff0[8];
            this.f34953e = 7;
        }

        public final List<ff0> a() {
            List<ff0> listG0 = C2097r.G0(this.f34950b);
            this.f34950b.clear();
            return listG0;
        }

        private final void a(ff0 ff0Var) {
            this.f34950b.add(ff0Var);
            int i = ff0Var.f27311c;
            int i10 = this.f34949a;
            if (i > i10) {
                ff0[] ff0VarArr = this.f34952d;
                C2088i.i(ff0VarArr, null, 0, ff0VarArr.length);
                this.f34953e = this.f34952d.length - 1;
                this.f34954f = 0;
                this.f34955g = 0;
                return;
            }
            a((this.f34955g + i) - i10);
            int i11 = this.f34954f + 1;
            ff0[] ff0VarArr2 = this.f34952d;
            if (i11 > ff0VarArr2.length) {
                ff0[] ff0VarArr3 = new ff0[ff0VarArr2.length * 2];
                System.arraycopy(ff0VarArr2, 0, ff0VarArr3, ff0VarArr2.length, ff0VarArr2.length);
                this.f34953e = this.f34952d.length - 1;
                this.f34952d = ff0VarArr3;
            }
            int i12 = this.f34953e;
            this.f34953e = i12 - 1;
            this.f34952d[i12] = ff0Var;
            this.f34954f++;
            this.f34955g += i;
        }

        public final ia.h b() throws IOException {
            byte b10 = this.f34951c.readByte();
            byte[] bArr = t82.f33480a;
            int i = b10 & 255;
            boolean z10 = (b10 & 128) == 128;
            long jA = a(i, 127);
            if (z10) {
                C4468d c4468d = new C4468d();
                int i10 = th0.f33589d;
                th0.a(this.f34951c, jA, c4468d);
                return c4468d.g(c4468d.f38643c);
            }
            return this.f34951c.g(jA);
        }

        public final int a(int i, int i10) throws IOException {
            int i11 = i & i10;
            if (i11 < i10) {
                return i11;
            }
            int i12 = 0;
            while (true) {
                byte b10 = this.f34951c.readByte();
                byte[] bArr = t82.f33480a;
                int i13 = b10 & 255;
                if ((b10 & 128) == 0) {
                    return i10 + (i13 << i12);
                }
                i10 += (b10 & 127) << i12;
                i12 += 7;
            }
        }

        private final void c(int i) throws IOException {
            if (i >= 0 && i <= wf0.b().length - 1) {
                this.f34950b.add(wf0.b()[i]);
                return;
            }
            int length = this.f34953e + 1 + (i - wf0.b().length);
            if (length >= 0) {
                ff0[] ff0VarArr = this.f34952d;
                if (length < ff0VarArr.length) {
                    ArrayList arrayList = this.f34950b;
                    ff0 ff0Var = ff0VarArr[length];
                    kotlin.jvm.internal.l.c(ff0Var);
                    arrayList.add(ff0Var);
                    return;
                }
            }
            throw new IOException(C4356c.h(i + 1, "Header index too large "));
        }
    }

    static {
        ff0 ff0Var = new ff0(ff0.i, "");
        ia.h name = ff0.f27306f;
        ff0 ff0Var2 = new ff0(name, "GET");
        kotlin.jvm.internal.l.f(name, "name");
        ia.h hVar = ia.h.f38646e;
        ff0 ff0Var3 = new ff0(name, h.a.c("POST"));
        ia.h name2 = ff0.f27307g;
        ff0 ff0Var4 = new ff0(name2, "/");
        kotlin.jvm.internal.l.f(name2, "name");
        ff0 ff0Var5 = new ff0(name2, h.a.c("/index.html"));
        ia.h name3 = ff0.f27308h;
        ff0 ff0Var6 = new ff0(name3, "http");
        kotlin.jvm.internal.l.f(name3, "name");
        ff0 ff0Var7 = new ff0(name3, h.a.c("https"));
        ia.h name4 = ff0.f27305e;
        ff0 ff0Var8 = new ff0(name4, "200");
        kotlin.jvm.internal.l.f(name4, "name");
        f34946a = new ff0[]{ff0Var, ff0Var2, ff0Var3, ff0Var4, ff0Var5, ff0Var6, ff0Var7, ff0Var8, new ff0(name4, h.a.c("204")), new ff0(name4, h.a.c("206")), new ff0(name4, h.a.c("304")), new ff0(name4, h.a.c("400")), new ff0(name4, h.a.c("404")), new ff0(name4, h.a.c("500")), new ff0(h.a.c("accept-charset"), h.a.c("")), new ff0(h.a.c("accept-encoding"), h.a.c("gzip, deflate")), new ff0(h.a.c("accept-language"), h.a.c("")), new ff0(h.a.c("accept-ranges"), h.a.c("")), new ff0(h.a.c("accept"), h.a.c("")), new ff0(h.a.c("access-control-allow-origin"), h.a.c("")), new ff0(h.a.c("age"), h.a.c("")), new ff0(h.a.c("allow"), h.a.c("")), new ff0(h.a.c("authorization"), h.a.c("")), new ff0(h.a.c("cache-control"), h.a.c("")), new ff0(h.a.c("content-disposition"), h.a.c("")), new ff0(h.a.c("content-encoding"), h.a.c("")), new ff0(h.a.c("content-language"), h.a.c("")), new ff0(h.a.c("content-length"), h.a.c("")), new ff0(h.a.c("content-location"), h.a.c("")), new ff0(h.a.c("content-range"), h.a.c("")), new ff0(h.a.c("content-type"), h.a.c("")), new ff0(h.a.c("cookie"), h.a.c("")), new ff0(h.a.c("date"), h.a.c("")), new ff0(h.a.c("etag"), h.a.c("")), new ff0(h.a.c("expect"), h.a.c("")), new ff0(h.a.c("expires"), h.a.c("")), new ff0(h.a.c("from"), h.a.c("")), new ff0(h.a.c("host"), h.a.c("")), new ff0(h.a.c("if-match"), h.a.c("")), new ff0(h.a.c("if-modified-since"), h.a.c("")), new ff0(h.a.c("if-none-match"), h.a.c("")), new ff0(h.a.c("if-range"), h.a.c("")), new ff0(h.a.c("if-unmodified-since"), h.a.c("")), new ff0(h.a.c("last-modified"), h.a.c("")), new ff0(h.a.c("link"), h.a.c("")), new ff0(h.a.c("location"), h.a.c("")), new ff0(h.a.c("max-forwards"), h.a.c("")), new ff0(h.a.c("proxy-authenticate"), h.a.c("")), new ff0(h.a.c("proxy-authorization"), h.a.c("")), new ff0(h.a.c("range"), h.a.c("")), new ff0(h.a.c("referer"), h.a.c("")), new ff0(h.a.c("refresh"), h.a.c("")), new ff0(h.a.c("retry-after"), h.a.c("")), new ff0(h.a.c("server"), h.a.c("")), new ff0(h.a.c("set-cookie"), h.a.c("")), new ff0(h.a.c("strict-transport-security"), h.a.c("")), new ff0(h.a.c("transfer-encoding"), h.a.c("")), new ff0(h.a.c("user-agent"), h.a.c("")), new ff0(h.a.c("vary"), h.a.c("")), new ff0(h.a.c("via"), h.a.c("")), new ff0(h.a.c("www-authenticate"), h.a.c(""))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            ff0[] ff0VarArr = f34946a;
            if (!linkedHashMap.containsKey(ff0VarArr[i].f27309a)) {
                linkedHashMap.put(ff0VarArr[i].f27309a, Integer.valueOf(i));
            }
        }
        Map<ia.h, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.l.e(mapUnmodifiableMap, "unmodifiableMap(...)");
        f34947b = mapUnmodifiableMap;
    }

    public static ia.h a(ia.h name) throws IOException {
        kotlin.jvm.internal.l.f(name, "name");
        int iC = name.c();
        for (int i = 0; i < iC; i++) {
            byte bF = name.f(i);
            if (65 <= bF && bF < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.j()));
            }
        }
        return name;
    }

    public static ff0[] b() {
        return f34946a;
    }

    public static Map a() {
        return f34947b;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f34956a;

        /* renamed from: b, reason: collision with root package name */
        private final C4468d f34957b;

        /* renamed from: c, reason: collision with root package name */
        private int f34958c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f34959d;

        /* renamed from: e, reason: collision with root package name */
        public int f34960e;

        /* renamed from: f, reason: collision with root package name */
        public ff0[] f34961f;

        /* renamed from: g, reason: collision with root package name */
        private int f34962g;

        /* renamed from: h, reason: collision with root package name */
        public int f34963h;
        public int i;

        public b(int i, boolean z10, C4468d out) {
            kotlin.jvm.internal.l.f(out, "out");
            this.f34956a = z10;
            this.f34957b = out;
            this.f34958c = Integer.MAX_VALUE;
            this.f34960e = i;
            this.f34961f = new ff0[8];
            this.f34962g = 7;
        }

        private final void a(int i) {
            int i10;
            if (i > 0) {
                int length = this.f34961f.length - 1;
                int i11 = 0;
                while (true) {
                    i10 = this.f34962g;
                    if (length < i10 || i <= 0) {
                        break;
                    }
                    ff0 ff0Var = this.f34961f[length];
                    kotlin.jvm.internal.l.c(ff0Var);
                    i -= ff0Var.f27311c;
                    int i12 = this.i;
                    ff0 ff0Var2 = this.f34961f[length];
                    kotlin.jvm.internal.l.c(ff0Var2);
                    this.i = i12 - ff0Var2.f27311c;
                    this.f34963h--;
                    i11++;
                    length--;
                }
                ff0[] ff0VarArr = this.f34961f;
                int i13 = i10 + 1;
                System.arraycopy(ff0VarArr, i13, ff0VarArr, i13 + i11, this.f34963h);
                ff0[] ff0VarArr2 = this.f34961f;
                int i14 = this.f34962g + 1;
                Arrays.fill(ff0VarArr2, i14, i14 + i11, (Object) null);
                this.f34962g += i11;
            }
        }

        public final void b(int i) {
            int iMin = Math.min(i, 16384);
            int i10 = this.f34960e;
            if (i10 == iMin) {
                return;
            }
            if (iMin < i10) {
                this.f34958c = Math.min(this.f34958c, iMin);
            }
            this.f34959d = true;
            this.f34960e = iMin;
            int i11 = this.i;
            if (iMin < i11) {
                if (iMin != 0) {
                    a(i11 - iMin);
                    return;
                }
                ff0[] ff0VarArr = this.f34961f;
                C2088i.i(ff0VarArr, null, 0, ff0VarArr.length);
                this.f34962g = this.f34961f.length - 1;
                this.f34963h = 0;
                this.i = 0;
            }
        }

        public /* synthetic */ b(C4468d c4468d) {
            this(4096, true, c4468d);
        }

        private final void a(ff0 ff0Var) {
            int i = ff0Var.f27311c;
            int i10 = this.f34960e;
            if (i > i10) {
                ff0[] ff0VarArr = this.f34961f;
                C2088i.i(ff0VarArr, null, 0, ff0VarArr.length);
                this.f34962g = this.f34961f.length - 1;
                this.f34963h = 0;
                this.i = 0;
                return;
            }
            a((this.i + i) - i10);
            int i11 = this.f34963h + 1;
            ff0[] ff0VarArr2 = this.f34961f;
            if (i11 > ff0VarArr2.length) {
                ff0[] ff0VarArr3 = new ff0[ff0VarArr2.length * 2];
                System.arraycopy(ff0VarArr2, 0, ff0VarArr3, ff0VarArr2.length, ff0VarArr2.length);
                this.f34962g = this.f34961f.length - 1;
                this.f34961f = ff0VarArr3;
            }
            int i12 = this.f34962g;
            this.f34962g = i12 - 1;
            this.f34961f[i12] = ff0Var;
            this.f34963h++;
            this.i += i;
        }

        public final void a(ia.h data) throws IOException {
            kotlin.jvm.internal.l.f(data, "data");
            if (this.f34956a && th0.a(data) < data.c()) {
                C4468d c4468d = new C4468d();
                th0.a(data, c4468d);
                ia.h hVarG = c4468d.g(c4468d.f38643c);
                a(hVarG.c(), 127, 128);
                this.f34957b.y0(hVarG);
                return;
            }
            a(data.c(), 127, 0);
            this.f34957b.y0(data);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(java.util.ArrayList r14) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 271
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.wf0.b.a(java.util.ArrayList):void");
        }

        public final void a(int i, int i10, int i11) {
            if (i < i10) {
                this.f34957b.C0(i | i11);
                return;
            }
            this.f34957b.C0(i11 | i10);
            int i12 = i - i10;
            while (i12 >= 128) {
                this.f34957b.C0(128 | (i12 & 127));
                i12 >>>= 7;
            }
            this.f34957b.C0(i12);
        }
    }
}
