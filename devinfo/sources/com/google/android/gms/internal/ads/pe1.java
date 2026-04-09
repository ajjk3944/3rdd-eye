package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class pe1 extends h41 implements dk1 {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14982e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14983f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final String f14984h;

    /* renamed from: i, reason: collision with root package name */
    public final ce1 f14985i;
    public final ce1 j;

    /* renamed from: k, reason: collision with root package name */
    public gb1 f14986k;

    /* renamed from: l, reason: collision with root package name */
    public HttpURLConnection f14987l;

    /* renamed from: m, reason: collision with root package name */
    public InputStream f14988m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f14989n;

    /* renamed from: o, reason: collision with root package name */
    public int f14990o;

    /* renamed from: p, reason: collision with root package name */
    public long f14991p;

    /* renamed from: q, reason: collision with root package name */
    public long f14992q;

    public /* synthetic */ pe1(String str, int i4, int i10, boolean z3, ce1 ce1Var) {
        super(true);
        this.f14984h = str;
        this.f14983f = i4;
        this.g = i10;
        this.f14982e = z3;
        this.f14985i = ce1Var;
        this.j = new ce1();
    }

    @Override // com.google.android.gms.internal.ads.h41, com.google.android.gms.internal.ads.l91
    public final Map A1() {
        HttpURLConnection httpURLConnection = this.f14987l;
        return httpURLConnection == null ? z51.g : new zd1(httpURLConnection.getHeaderFields());
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c6 A[Catch: IOException -> 0x01d1, TRY_LEAVE, TryCatch #3 {IOException -> 0x01d1, blocks: (B:81:0x01be, B:83:0x01c6), top: B:156:0x01be }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01de  */
    @Override // com.google.android.gms.internal.ads.l91
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(com.google.android.gms.internal.ads.gb1 r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pe1.a(com.google.android.gms.internal.ads.gb1):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b A[Catch: IOException -> 0x001e, TRY_LEAVE, TryCatch #0 {IOException -> 0x001e, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:13:0x0020, B:16:0x002b), top: B:20:0x0004 }] */
    @Override // com.google.android.gms.internal.ads.vs1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(int r7, int r8, byte[] r9) throws java.io.IOException {
        /*
            r6 = this;
            if (r8 != 0) goto L4
            r7 = 0
            return r7
        L4:
            long r0 = r6.f14991p     // Catch: java.io.IOException -> L1e
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L20
            long r4 = r6.f14992q     // Catch: java.io.IOException -> L1e
            long r0 = r0 - r4
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L17
            goto L2a
        L17:
            long r4 = (long) r8     // Catch: java.io.IOException -> L1e
            long r0 = java.lang.Math.min(r4, r0)     // Catch: java.io.IOException -> L1e
            int r8 = (int) r0     // Catch: java.io.IOException -> L1e
            goto L20
        L1e:
            r7 = move-exception
            goto L35
        L20:
            java.io.InputStream r0 = r6.f14988m     // Catch: java.io.IOException -> L1e
            java.lang.String r1 = com.google.android.gms.internal.ads.bq0.f9768a     // Catch: java.io.IOException -> L1e
            int r7 = r0.read(r9, r7, r8)     // Catch: java.io.IOException -> L1e
            if (r7 != r3) goto L2b
        L2a:
            return r3
        L2b:
            long r8 = r6.f14992q     // Catch: java.io.IOException -> L1e
            long r0 = (long) r7     // Catch: java.io.IOException -> L1e
            long r8 = r8 + r0
            r6.f14992q = r8     // Catch: java.io.IOException -> L1e
            r6.g(r7)     // Catch: java.io.IOException -> L1e
            return r7
        L35:
            java.lang.String r8 = com.google.android.gms.internal.ads.bq0.f9768a
            r8 = 2
            com.google.android.gms.internal.ads.mh1 r7 = com.google.android.gms.internal.ads.mh1.a(r7, r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pe1.d(int, int, byte[]):int");
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void f() {
        try {
            InputStream inputStream = this.f14988m;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    String str = bq0.f9768a;
                    throw new mh1(e2, AdError.SERVER_ERROR_CODE, 3);
                }
            }
        } finally {
            this.f14988m = null;
            k();
            if (this.f14989n) {
                this.f14989n = false;
                h();
            }
            this.f14987l = null;
            this.f14986k = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.net.HttpURLConnection i(java.net.URL r5, long r6, long r8, boolean r10, boolean r11, java.util.Map r12) throws java.io.IOException {
        /*
            r4 = this;
            java.net.URLConnection r5 = r5.openConnection()
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5
            int r0 = r4.f14983f
            r5.setConnectTimeout(r0)
            int r0 = r4.g
            r5.setReadTimeout(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.android.gms.internal.ads.ce1 r1 = r4.f14985i
            java.util.Map r1 = r1.g()
            r0.putAll(r1)
            com.google.android.gms.internal.ads.ce1 r1 = r4.j
            java.util.Map r1 = r1.g()
            r0.putAll(r1)
            r0.putAll(r12)
            java.util.Set r12 = r0.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L32:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r12.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r5.setRequestProperty(r1, r0)
            goto L32
        L4e:
            r0 = 0
            int r12 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r2 = -1
            if (r12 != 0) goto L5d
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r6 != 0) goto L5c
            r6 = 0
            goto L72
        L5c:
            r6 = r0
        L5d:
            java.lang.String r12 = "bytes="
            java.lang.String r0 = "-"
            java.lang.StringBuilder r12 = d.h.y(r6, r12, r0)
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 == 0) goto L6e
            long r6 = r6 + r8
            long r6 = r6 + r2
            r12.append(r6)
        L6e:
            java.lang.String r6 = r12.toString()
        L72:
            if (r6 == 0) goto L79
            java.lang.String r7 = "Range"
            r5.setRequestProperty(r7, r6)
        L79:
            java.lang.String r6 = r4.f14984h
            if (r6 == 0) goto L82
            java.lang.String r7 = "User-Agent"
            r5.setRequestProperty(r7, r6)
        L82:
            r6 = 1
            if (r6 == r10) goto L88
            java.lang.String r6 = "identity"
            goto L8a
        L88:
            java.lang.String r6 = "gzip"
        L8a:
            java.lang.String r7 = "Accept-Encoding"
            r5.setRequestProperty(r7, r6)
            r5.setInstanceFollowRedirects(r11)
            r6 = 0
            r5.setDoOutput(r6)
            int r6 = com.google.android.gms.internal.ads.gb1.f11478f
            java.lang.String r6 = "GET"
            r5.setRequestMethod(r6)
            r5.connect()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pe1.i(java.net.URL, long, long, boolean, boolean, java.util.Map):java.net.HttpURLConnection");
    }

    public final URL j(URL url, String str) throws mh1 {
        if (str == null) {
            throw new mh1("Null location redirect", AdError.INTERNAL_ERROR_CODE, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new mh1("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), AdError.INTERNAL_ERROR_CODE, 1);
            }
            if (this.f14982e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder sb2 = new StringBuilder(r5.c.f(String.valueOf(protocol2).length() + 40, 1, protocol));
            sb2.append("Disallowed cross-protocol redirect (");
            sb2.append(protocol2);
            sb2.append(" to ");
            sb2.append(protocol);
            sb2.append(")");
            throw new mh1(sb2.toString(), AdError.INTERNAL_ERROR_CODE, 1);
        } catch (MalformedURLException e2) {
            throw new mh1(e2, AdError.INTERNAL_ERROR_CODE, 1);
        }
    }

    public final void k() {
        HttpURLConnection httpURLConnection = this.f14987l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                ls.H("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f14987l;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        gb1 gb1Var = this.f14986k;
        if (gb1Var != null) {
            return gb1Var.f11479a;
        }
        return null;
    }
}
