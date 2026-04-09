package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.mbridge.msdk.thrid.okio.s;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    static final c[] f17787a;

    /* renamed from: b, reason: collision with root package name */
    static final Map<com.mbridge.msdk.thrid.okio.f, Integer> f17788b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<c> f17789a;

        /* renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.e f17790b;

        /* renamed from: c, reason: collision with root package name */
        private final int f17791c;

        /* renamed from: d, reason: collision with root package name */
        private int f17792d;

        /* renamed from: e, reason: collision with root package name */
        c[] f17793e;

        /* renamed from: f, reason: collision with root package name */
        int f17794f;

        /* renamed from: g, reason: collision with root package name */
        int f17795g;

        /* renamed from: h, reason: collision with root package name */
        int f17796h;

        public a(int i10, s sVar) {
            this(i10, i10, sVar);
        }

        private void a() {
            int i10 = this.f17792d;
            int i11 = this.f17796h;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    b(i11 - i10);
                }
            }
        }

        private void b() {
            Arrays.fill(this.f17793e, (Object) null);
            this.f17794f = this.f17793e.length - 1;
            this.f17795g = 0;
            this.f17796h = 0;
        }

        private boolean d(int i10) {
            return i10 >= 0 && i10 <= d.f17787a.length - 1;
        }

        private void e(int i10) throws IOException {
            if (d(i10)) {
                this.f17789a.add(d.f17787a[i10]);
                return;
            }
            int iA = a(i10 - d.f17787a.length);
            if (iA >= 0) {
                c[] cVarArr = this.f17793e;
                if (iA < cVarArr.length) {
                    this.f17789a.add(cVarArr[iA]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private void g(int i10) throws IOException {
            this.f17789a.add(new c(c(i10), e()));
        }

        private void h() throws IOException {
            this.f17789a.add(new c(d.a(e()), e()));
        }

        public List<c> c() {
            ArrayList arrayList = new ArrayList(this.f17789a);
            this.f17789a.clear();
            return arrayList;
        }

        public void f() throws IOException {
            while (!this.f17790b.f()) {
                byte b10 = this.f17790b.readByte();
                int i10 = b10 & 255;
                if (i10 == 128) {
                    throw new IOException("index == 0");
                }
                if ((b10 & 128) == 128) {
                    e(a(i10, 127) - 1);
                } else if (i10 == 64) {
                    g();
                } else if ((b10 & 64) == 64) {
                    f(a(i10, 63) - 1);
                } else if ((b10 & 32) == 32) {
                    int iA = a(i10, 31);
                    this.f17792d = iA;
                    if (iA < 0 || iA > this.f17791c) {
                        throw new IOException("Invalid dynamic table size update " + this.f17792d);
                    }
                    a();
                } else if (i10 == 16 || i10 == 0) {
                    h();
                } else {
                    g(a(i10, 15) - 1);
                }
            }
        }

        public a(int i10, int i11, s sVar) {
            this.f17789a = new ArrayList();
            this.f17793e = new c[8];
            this.f17794f = 7;
            this.f17795g = 0;
            this.f17796h = 0;
            this.f17791c = i10;
            this.f17792d = i11;
            this.f17790b = com.mbridge.msdk.thrid.okio.l.a(sVar);
        }

        private int d() throws IOException {
            return this.f17790b.readByte() & 255;
        }

        private com.mbridge.msdk.thrid.okio.f c(int i10) throws IOException {
            if (d(i10)) {
                return d.f17787a[i10].f17784a;
            }
            int iA = a(i10 - d.f17787a.length);
            if (iA >= 0) {
                c[] cVarArr = this.f17793e;
                if (iA < cVarArr.length) {
                    return cVarArr[iA].f17784a;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private int a(int i10) {
            return this.f17794f + 1 + i10;
        }

        private void g() throws IOException {
            a(-1, new c(d.a(e()), e()));
        }

        private void a(int i10, c cVar) {
            this.f17789a.add(cVar);
            int i11 = cVar.f17786c;
            if (i10 != -1) {
                i11 -= this.f17793e[a(i10)].f17786c;
            }
            int i12 = this.f17792d;
            if (i11 > i12) {
                b();
                return;
            }
            int iB = b((this.f17796h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f17795g + 1;
                c[] cVarArr = this.f17793e;
                if (i13 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f17794f = this.f17793e.length - 1;
                    this.f17793e = cVarArr2;
                }
                int i14 = this.f17794f;
                this.f17794f = i14 - 1;
                this.f17793e[i14] = cVar;
                this.f17795g++;
            } else {
                this.f17793e[i10 + a(i10) + iB] = cVar;
            }
            this.f17796h += i11;
        }

        private int b(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f17793e.length;
                while (true) {
                    length--;
                    i11 = this.f17794f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    int i13 = this.f17793e[length].f17786c;
                    i10 -= i13;
                    this.f17796h -= i13;
                    this.f17795g--;
                    i12++;
                }
                c[] cVarArr = this.f17793e;
                int i14 = i11 + 1;
                System.arraycopy(cVarArr, i14, cVarArr, i14 + i12, this.f17795g);
                this.f17794f += i12;
            }
            return i12;
        }

        public com.mbridge.msdk.thrid.okio.f e() throws IOException {
            int iD = d();
            boolean z10 = (iD & 128) == 128;
            int iA = a(iD, 127);
            if (z10) {
                return com.mbridge.msdk.thrid.okio.f.a(k.b().a(this.f17790b.c(iA)));
            }
            return this.f17790b.b(iA);
        }

        private void f(int i10) throws IOException {
            a(-1, new c(c(i10), e()));
        }

        public int a(int i10, int i11) throws IOException {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int iD = d();
                if ((iD & 128) == 0) {
                    return i11 + (iD << i13);
                }
                i11 += (iD & 127) << i13;
                i13 += 7;
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.c f17797a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f17798b;

        /* renamed from: c, reason: collision with root package name */
        private int f17799c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f17800d;

        /* renamed from: e, reason: collision with root package name */
        int f17801e;

        /* renamed from: f, reason: collision with root package name */
        int f17802f;

        /* renamed from: g, reason: collision with root package name */
        c[] f17803g;

        /* renamed from: h, reason: collision with root package name */
        int f17804h;

        /* renamed from: i, reason: collision with root package name */
        int f17805i;

        /* renamed from: j, reason: collision with root package name */
        int f17806j;

        public b(com.mbridge.msdk.thrid.okio.c cVar) {
            this(4096, true, cVar);
        }

        private int a(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f17803g.length;
                while (true) {
                    length--;
                    i11 = this.f17804h;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    int i13 = this.f17803g[length].f17786c;
                    i10 -= i13;
                    this.f17806j -= i13;
                    this.f17805i--;
                    i12++;
                }
                c[] cVarArr = this.f17803g;
                int i14 = i11 + 1;
                System.arraycopy(cVarArr, i14, cVarArr, i14 + i12, this.f17805i);
                c[] cVarArr2 = this.f17803g;
                int i15 = this.f17804h + 1;
                Arrays.fill(cVarArr2, i15, i15 + i12, (Object) null);
                this.f17804h += i12;
            }
            return i12;
        }

        private void b() {
            Arrays.fill(this.f17803g, (Object) null);
            this.f17804h = this.f17803g.length - 1;
            this.f17805i = 0;
            this.f17806j = 0;
        }

        public b(int i10, boolean z10, com.mbridge.msdk.thrid.okio.c cVar) {
            this.f17799c = Integer.MAX_VALUE;
            this.f17803g = new c[8];
            this.f17804h = 7;
            this.f17805i = 0;
            this.f17806j = 0;
            this.f17801e = i10;
            this.f17802f = i10;
            this.f17798b = z10;
            this.f17797a = cVar;
        }

        public void b(int i10) {
            this.f17801e = i10;
            int iMin = Math.min(i10, 16384);
            int i11 = this.f17802f;
            if (i11 == iMin) {
                return;
            }
            if (iMin < i11) {
                this.f17799c = Math.min(this.f17799c, iMin);
            }
            this.f17800d = true;
            this.f17802f = iMin;
            a();
        }

        private void a(c cVar) {
            int i10 = cVar.f17786c;
            int i11 = this.f17802f;
            if (i10 > i11) {
                b();
                return;
            }
            a((this.f17806j + i10) - i11);
            int i12 = this.f17805i + 1;
            c[] cVarArr = this.f17803g;
            if (i12 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f17804h = this.f17803g.length - 1;
                this.f17803g = cVarArr2;
            }
            int i13 = this.f17804h;
            this.f17804h = i13 - 1;
            this.f17803g[i13] = cVar;
            this.f17805i++;
            this.f17806j += i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(java.util.List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> r14) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 236
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.http2.d.b.a(java.util.List):void");
        }

        public void a(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f17797a.writeByte(i10 | i12);
                return;
            }
            this.f17797a.writeByte(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f17797a.writeByte(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f17797a.writeByte(i13);
        }

        public void a(com.mbridge.msdk.thrid.okio.f fVar) throws IOException {
            if (this.f17798b && k.b().a(fVar) < fVar.j()) {
                com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
                k.b().a(fVar, cVar);
                com.mbridge.msdk.thrid.okio.f fVarO = cVar.o();
                a(fVarO.j(), 127, 128);
                this.f17797a.a(fVarO);
                return;
            }
            a(fVar.j(), 127, 0);
            this.f17797a.a(fVar);
        }

        private void a() {
            int i10 = this.f17802f;
            int i11 = this.f17806j;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    a(i11 - i10);
                }
            }
        }
    }

    static {
        c cVar = new c(c.f17783i, "");
        com.mbridge.msdk.thrid.okio.f fVar = c.f17780f;
        c cVar2 = new c(fVar, "GET");
        c cVar3 = new c(fVar, "POST");
        com.mbridge.msdk.thrid.okio.f fVar2 = c.f17781g;
        c cVar4 = new c(fVar2, "/");
        c cVar5 = new c(fVar2, "/index.html");
        com.mbridge.msdk.thrid.okio.f fVar3 = c.f17782h;
        c cVar6 = new c(fVar3, "http");
        c cVar7 = new c(fVar3, HttpRequest.DEFAULT_SCHEME);
        com.mbridge.msdk.thrid.okio.f fVar4 = c.f17779e;
        f17787a = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(fVar4, "200"), new c(fVar4, "204"), new c(fVar4, "206"), new c(fVar4, "304"), new c(fVar4, "400"), new c(fVar4, "404"), new c(fVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c(DownloadModel.ETAG, ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c(ToolBar.REFRESH, ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f17788b = a();
    }

    private static Map<com.mbridge.msdk.thrid.okio.f, Integer> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f17787a.length);
        int i10 = 0;
        while (true) {
            c[] cVarArr = f17787a;
            if (i10 >= cVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(cVarArr[i10].f17784a)) {
                linkedHashMap.put(cVarArr[i10].f17784a, Integer.valueOf(i10));
            }
            i10++;
        }
    }

    public static com.mbridge.msdk.thrid.okio.f a(com.mbridge.msdk.thrid.okio.f fVar) throws IOException {
        int iJ = fVar.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            byte bA = fVar.a(i10);
            if (bA >= 65 && bA <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.m());
            }
        }
        return fVar;
    }
}
