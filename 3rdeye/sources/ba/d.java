package ba;

import ba.o;
import ba.r;
import c9.C2088i;
import ia.C4468d;
import ia.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinVersion;

/* compiled from: Hpack.kt */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final c[] f18121a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map<ia.h, Integer> f18122b;

    /* compiled from: Hpack.kt */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public final w f18125c;

        /* renamed from: f, reason: collision with root package name */
        public int f18128f;

        /* renamed from: g, reason: collision with root package name */
        public int f18129g;

        /* renamed from: a, reason: collision with root package name */
        public int f18123a = 4096;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f18124b = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public c[] f18126d = new c[8];

        /* renamed from: e, reason: collision with root package name */
        public int f18127e = 7;

        public a(o.b bVar) {
            this.f18125c = ia.q.c(bVar);
        }

        public final int a(int i) {
            int i10;
            int i11 = 0;
            if (i > 0) {
                int length = this.f18126d.length;
                while (true) {
                    length--;
                    i10 = this.f18127e;
                    if (length < i10 || i <= 0) {
                        break;
                    }
                    c cVar = this.f18126d[length];
                    kotlin.jvm.internal.l.c(cVar);
                    int i12 = cVar.f18120c;
                    i -= i12;
                    this.f18129g -= i12;
                    this.f18128f--;
                    i11++;
                }
                c[] cVarArr = this.f18126d;
                System.arraycopy(cVarArr, i10 + 1, cVarArr, i10 + 1 + i11, this.f18128f);
                this.f18127e += i11;
            }
            return i11;
        }

        public final ia.h b(int i) throws IOException {
            if (i >= 0) {
                c[] cVarArr = d.f18121a;
                if (i <= cVarArr.length - 1) {
                    return cVarArr[i].f18118a;
                }
            }
            int length = this.f18127e + 1 + (i - d.f18121a.length);
            if (length >= 0) {
                c[] cVarArr2 = this.f18126d;
                if (length < cVarArr2.length) {
                    c cVar = cVarArr2[length];
                    kotlin.jvm.internal.l.c(cVar);
                    return cVar.f18118a;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        public final void c(c cVar) {
            this.f18124b.add(cVar);
            int i = this.f18123a;
            int i10 = cVar.f18120c;
            if (i10 > i) {
                c[] cVarArr = this.f18126d;
                C2088i.i(cVarArr, null, 0, cVarArr.length);
                this.f18127e = this.f18126d.length - 1;
                this.f18128f = 0;
                this.f18129g = 0;
                return;
            }
            a((this.f18129g + i10) - i);
            int i11 = this.f18128f + 1;
            c[] cVarArr2 = this.f18126d;
            if (i11 > cVarArr2.length) {
                c[] cVarArr3 = new c[cVarArr2.length * 2];
                System.arraycopy(cVarArr2, 0, cVarArr3, cVarArr2.length, cVarArr2.length);
                this.f18127e = this.f18126d.length - 1;
                this.f18126d = cVarArr3;
            }
            int i12 = this.f18127e;
            this.f18127e = i12 - 1;
            this.f18126d[i12] = cVar;
            this.f18128f++;
            this.f18129g += i10;
        }

        public final ia.h d() throws IOException {
            int i;
            w source = this.f18125c;
            byte b10 = source.readByte();
            byte[] bArr = V9.b.f13053a;
            int i10 = b10 & 255;
            int i11 = 0;
            boolean z10 = (b10 & 128) == 128;
            long jE = e(i10, 127);
            if (!z10) {
                return source.g(jE);
            }
            C4468d c4468d = new C4468d();
            int[] iArr = r.f18253a;
            kotlin.jvm.internal.l.f(source, "source");
            r.a aVar = r.f18255c;
            r.a aVar2 = aVar;
            int i12 = 0;
            for (long j4 = 0; j4 < jE; j4++) {
                byte b11 = source.readByte();
                byte[] bArr2 = V9.b.f13053a;
                i11 = (i11 << 8) | (b11 & 255);
                i12 += 8;
                while (i12 >= 8) {
                    int i13 = (i11 >>> (i12 - 8)) & KotlinVersion.MAX_COMPONENT_VALUE;
                    r.a[] aVarArr = aVar2.f18256a;
                    kotlin.jvm.internal.l.c(aVarArr);
                    aVar2 = aVarArr[i13];
                    kotlin.jvm.internal.l.c(aVar2);
                    if (aVar2.f18256a == null) {
                        c4468d.C0(aVar2.f18257b);
                        i12 -= aVar2.f18258c;
                        aVar2 = aVar;
                    } else {
                        i12 -= 8;
                    }
                }
            }
            while (i12 > 0) {
                int i14 = (i11 << (8 - i12)) & KotlinVersion.MAX_COMPONENT_VALUE;
                r.a[] aVarArr2 = aVar2.f18256a;
                kotlin.jvm.internal.l.c(aVarArr2);
                r.a aVar3 = aVarArr2[i14];
                kotlin.jvm.internal.l.c(aVar3);
                if (aVar3.f18256a != null || (i = aVar3.f18258c) > i12) {
                    break;
                }
                c4468d.C0(aVar3.f18257b);
                i12 -= i;
                aVar2 = aVar;
            }
            return c4468d.g(c4468d.f38643c);
        }

        public final int e(int i, int i10) throws IOException {
            int i11 = i & i10;
            if (i11 < i10) {
                return i11;
            }
            int i12 = 0;
            while (true) {
                byte b10 = this.f18125c.readByte();
                byte[] bArr = V9.b.f13053a;
                int i13 = b10 & 255;
                if ((b10 & 128) == 0) {
                    return i10 + (i13 << i12);
                }
                i10 += (b10 & 127) << i12;
                i12 += 7;
            }
        }
    }

    /* compiled from: Hpack.kt */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final C4468d f18130a;

        /* renamed from: c, reason: collision with root package name */
        public boolean f18132c;

        /* renamed from: g, reason: collision with root package name */
        public int f18136g;

        /* renamed from: h, reason: collision with root package name */
        public int f18137h;

        /* renamed from: b, reason: collision with root package name */
        public int f18131b = Integer.MAX_VALUE;

        /* renamed from: d, reason: collision with root package name */
        public int f18133d = 4096;

        /* renamed from: e, reason: collision with root package name */
        public c[] f18134e = new c[8];

        /* renamed from: f, reason: collision with root package name */
        public int f18135f = 7;

        public b(C4468d c4468d) {
            this.f18130a = c4468d;
        }

        public final void a(int i) {
            int i10;
            if (i > 0) {
                int length = this.f18134e.length - 1;
                int i11 = 0;
                while (true) {
                    i10 = this.f18135f;
                    if (length < i10 || i <= 0) {
                        break;
                    }
                    c cVar = this.f18134e[length];
                    kotlin.jvm.internal.l.c(cVar);
                    i -= cVar.f18120c;
                    int i12 = this.f18137h;
                    c cVar2 = this.f18134e[length];
                    kotlin.jvm.internal.l.c(cVar2);
                    this.f18137h = i12 - cVar2.f18120c;
                    this.f18136g--;
                    i11++;
                    length--;
                }
                c[] cVarArr = this.f18134e;
                int i13 = i10 + 1;
                System.arraycopy(cVarArr, i13, cVarArr, i13 + i11, this.f18136g);
                c[] cVarArr2 = this.f18134e;
                int i14 = this.f18135f + 1;
                Arrays.fill(cVarArr2, i14, i14 + i11, (Object) null);
                this.f18135f += i11;
            }
        }

        public final void b(c cVar) {
            int i = this.f18133d;
            int i10 = cVar.f18120c;
            if (i10 > i) {
                c[] cVarArr = this.f18134e;
                C2088i.i(cVarArr, null, 0, cVarArr.length);
                this.f18135f = this.f18134e.length - 1;
                this.f18136g = 0;
                this.f18137h = 0;
                return;
            }
            a((this.f18137h + i10) - i);
            int i11 = this.f18136g + 1;
            c[] cVarArr2 = this.f18134e;
            if (i11 > cVarArr2.length) {
                c[] cVarArr3 = new c[cVarArr2.length * 2];
                System.arraycopy(cVarArr2, 0, cVarArr3, cVarArr2.length, cVarArr2.length);
                this.f18135f = this.f18134e.length - 1;
                this.f18134e = cVarArr3;
            }
            int i12 = this.f18135f;
            this.f18135f = i12 - 1;
            this.f18134e[i12] = cVar;
            this.f18136g++;
            this.f18137h += i10;
        }

        public final void c(ia.h data) throws IOException {
            kotlin.jvm.internal.l.f(data, "data");
            C4468d c4468d = this.f18130a;
            int[] iArr = r.f18253a;
            int iC = data.c();
            long j4 = 0;
            for (int i = 0; i < iC; i++) {
                byte bF = data.f(i);
                byte[] bArr = V9.b.f13053a;
                j4 += r.f18254b[bF & 255];
            }
            if (((int) ((j4 + 7) >> 3)) >= data.c()) {
                e(data.c(), 127, 0);
                c4468d.y0(data);
                return;
            }
            C4468d c4468d2 = new C4468d();
            int[] iArr2 = r.f18253a;
            int iC2 = data.c();
            long j10 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < iC2; i11++) {
                byte bF2 = data.f(i11);
                byte[] bArr2 = V9.b.f13053a;
                int i12 = bF2 & 255;
                int i13 = r.f18253a[i12];
                byte b10 = r.f18254b[i12];
                j10 = (j10 << b10) | i13;
                i10 += b10;
                while (i10 >= 8) {
                    i10 -= 8;
                    c4468d2.C0((int) (j10 >> i10));
                }
            }
            if (i10 > 0) {
                c4468d2.C0((int) ((255 >>> i10) | (j10 << (8 - i10))));
            }
            ia.h hVarG = c4468d2.g(c4468d2.f38643c);
            e(hVarG.c(), 127, 128);
            c4468d.y0(hVarG);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void d(java.util.ArrayList r14) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 254
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ba.d.b.d(java.util.ArrayList):void");
        }

        public final void e(int i, int i10, int i11) {
            C4468d c4468d = this.f18130a;
            if (i < i10) {
                c4468d.C0(i | i11);
                return;
            }
            c4468d.C0(i11 | i10);
            int i12 = i - i10;
            while (i12 >= 128) {
                c4468d.C0(128 | (i12 & 127));
                i12 >>>= 7;
            }
            c4468d.C0(i12);
        }
    }

    static {
        c cVar = new c(c.i, "");
        ia.h hVar = c.f18115f;
        c cVar2 = new c(hVar, "GET");
        c cVar3 = new c(hVar, "POST");
        ia.h hVar2 = c.f18116g;
        c cVar4 = new c(hVar2, "/");
        c cVar5 = new c(hVar2, "/index.html");
        ia.h hVar3 = c.f18117h;
        c cVar6 = new c(hVar3, "http");
        c cVar7 = new c(hVar3, "https");
        ia.h hVar4 = c.f18114e;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(hVar4, "200"), new c(hVar4, "204"), new c(hVar4, "206"), new c(hVar4, "304"), new c(hVar4, "400"), new c(hVar4, "404"), new c(hVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f18121a = cVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(cVarArr[i].f18118a)) {
                linkedHashMap.put(cVarArr[i].f18118a, Integer.valueOf(i));
            }
        }
        Map<ia.h, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.l.e(mapUnmodifiableMap, "unmodifiableMap(result)");
        f18122b = mapUnmodifiableMap;
    }

    public static void a(ia.h name) throws IOException {
        kotlin.jvm.internal.l.f(name, "name");
        int iC = name.c();
        for (int i = 0; i < iC; i++) {
            byte bF = name.f(i);
            if (65 <= bF && bF < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.j()));
            }
        }
    }
}
