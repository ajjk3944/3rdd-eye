package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public final class CG extends AbstractC2003vB implements InterfaceC1742qJ {

    /* renamed from: C, reason: collision with root package name */
    public int f7558C;

    /* renamed from: D, reason: collision with root package name */
    public long f7559D;

    /* renamed from: E, reason: collision with root package name */
    public long f7560E;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7561e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7562f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7563g;

    /* renamed from: h, reason: collision with root package name */
    public final String f7564h;
    public final C1879sw i;

    /* renamed from: j, reason: collision with root package name */
    public final C1879sw f7565j;

    /* renamed from: k, reason: collision with root package name */
    public TE f7566k;

    /* renamed from: l, reason: collision with root package name */
    public HttpURLConnection f7567l;

    /* renamed from: m, reason: collision with root package name */
    public InputStream f7568m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7569n;

    public /* synthetic */ CG(String str, int i, int i3, boolean z6, C1879sw c1879sw) {
        super(true);
        this.f7564h = str;
        this.f7562f = i;
        this.f7563g = i3;
        this.f7561e = z6;
        this.i = c1879sw;
        this.f7565j = new C1879sw(6);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c6 A[Catch: IOException -> 0x01d1, TRY_LEAVE, TryCatch #3 {IOException -> 0x01d1, blocks: (B:81:0x01be, B:83:0x01c6), top: B:156:0x01be }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01de  */
    @Override // com.google.android.gms.internal.ads.XD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(com.google.android.gms.internal.ads.TE r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.CG.a(com.google.android.gms.internal.ads.TE):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b A[Catch: IOException -> 0x001e, TRY_LEAVE, TryCatch #0 {IOException -> 0x001e, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:13:0x0020, B:16:0x002b), top: B:20:0x0004 }] */
    @Override // com.google.android.gms.internal.ads.IN
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
            long r0 = r6.f7559D     // Catch: java.io.IOException -> L1e
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L20
            long r4 = r6.f7560E     // Catch: java.io.IOException -> L1e
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
            java.io.InputStream r0 = r6.f7568m     // Catch: java.io.IOException -> L1e
            java.lang.String r1 = com.google.android.gms.internal.ads.Vt.f12096a     // Catch: java.io.IOException -> L1e
            int r7 = r0.read(r9, r7, r8)     // Catch: java.io.IOException -> L1e
            if (r7 != r3) goto L2b
        L2a:
            return r3
        L2b:
            long r8 = r6.f7560E     // Catch: java.io.IOException -> L1e
            long r0 = (long) r7     // Catch: java.io.IOException -> L1e
            long r8 = r8 + r0
            r6.f7560E = r8     // Catch: java.io.IOException -> L1e
            r6.g(r7)     // Catch: java.io.IOException -> L1e
            return r7
        L35:
            java.lang.String r8 = com.google.android.gms.internal.ads.Vt.f12096a
            r8 = 2
            com.google.android.gms.internal.ads.YH r7 = com.google.android.gms.internal.ads.YH.a(r7, r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.CG.d(int, int, byte[]):int");
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final Uri f() {
        HttpURLConnection httpURLConnection = this.f7567l;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        TE te = this.f7566k;
        if (te != null) {
            return te.f11361a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2003vB, com.google.android.gms.internal.ads.XD
    public final Map h() {
        HttpURLConnection httpURLConnection = this.f7567l;
        return httpURLConnection == null ? C1465lC.f15361g : new C1523mG(httpURLConnection.getHeaderFields());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.net.HttpURLConnection k(java.net.URL r5, long r6, long r8, boolean r10, boolean r11, java.util.Map r12) throws java.io.IOException {
        /*
            r4 = this;
            java.net.URLConnection r5 = r5.openConnection()
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5
            int r0 = r4.f7562f
            r5.setConnectTimeout(r0)
            int r0 = r4.f7563g
            r5.setReadTimeout(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.android.gms.internal.ads.sw r1 = r4.i
            java.util.Map r1 = r1.a()
            r0.putAll(r1)
            com.google.android.gms.internal.ads.sw r1 = r4.f7565j
            java.util.Map r1 = r1.a()
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
            goto L79
        L5c:
            r6 = r0
        L5d:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "bytes="
            r12.<init>(r0)
            r12.append(r6)
            java.lang.String r0 = "-"
            r12.append(r0)
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 == 0) goto L75
            long r6 = r6 + r8
            long r6 = r6 + r2
            r12.append(r6)
        L75:
            java.lang.String r6 = r12.toString()
        L79:
            if (r6 == 0) goto L80
            java.lang.String r7 = "Range"
            r5.setRequestProperty(r7, r6)
        L80:
            java.lang.String r6 = r4.f7564h
            if (r6 == 0) goto L89
            java.lang.String r7 = "User-Agent"
            r5.setRequestProperty(r7, r6)
        L89:
            r6 = 1
            if (r6 == r10) goto L8f
            java.lang.String r6 = "identity"
            goto L91
        L8f:
            java.lang.String r6 = "gzip"
        L91:
            java.lang.String r7 = "Accept-Encoding"
            r5.setRequestProperty(r7, r6)
            r5.setInstanceFollowRedirects(r11)
            r6 = 0
            r5.setDoOutput(r6)
            int r6 = com.google.android.gms.internal.ads.TE.f11360f
            java.lang.String r6 = "GET"
            r5.setRequestMethod(r6)
            r5.connect()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.CG.k(java.net.URL, long, long, boolean, boolean, java.util.Map):java.net.HttpURLConnection");
    }

    public final URL l(URL url, String str) throws YH {
        if (str == null) {
            throw new YH("Null location redirect", 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new YH("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), 2001, 1);
            }
            if (this.f7561e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder sb = new StringBuilder(AbstractC2763b.b(String.valueOf(protocol2).length() + 40, 1, protocol));
            sb.append("Disallowed cross-protocol redirect (");
            sb.append(protocol2);
            sb.append(" to ");
            sb.append(protocol);
            sb.append(")");
            throw new YH(sb.toString(), 2001, 1);
        } catch (MalformedURLException e6) {
            throw new YH(e6, 2001, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final void m() {
        try {
            InputStream inputStream = this.f7568m;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e6) {
                    String str = Vt.f12096a;
                    throw new YH(e6, 2000, 3);
                }
            }
        } finally {
            this.f7568m = null;
            q();
            if (this.f7569n) {
                this.f7569n = false;
                j();
            }
            this.f7567l = null;
            this.f7566k = null;
        }
    }

    public final void q() {
        HttpURLConnection httpURLConnection = this.f7567l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e6) {
                AbstractC2022vd.K("DefaultHttpDataSource", "Unexpected error while disconnecting", e6);
            }
        }
    }
}
