package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.Ig, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0556Ig extends AbstractC2003vB implements InterfaceC1742qJ {

    /* renamed from: H, reason: collision with root package name */
    public static final Pattern f9121H = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: I, reason: collision with root package name */
    public static final AtomicReference f9122I = new AtomicReference();

    /* renamed from: C, reason: collision with root package name */
    public long f9123C;

    /* renamed from: D, reason: collision with root package name */
    public long f9124D;

    /* renamed from: E, reason: collision with root package name */
    public long f9125E;

    /* renamed from: F, reason: collision with root package name */
    public int f9126F;

    /* renamed from: G, reason: collision with root package name */
    public final HashSet f9127G;

    /* renamed from: e, reason: collision with root package name */
    public final C0539Hg f9128e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9129f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9130g;

    /* renamed from: h, reason: collision with root package name */
    public final String f9131h;
    public final C1879sw i;

    /* renamed from: j, reason: collision with root package name */
    public HttpURLConnection f9132j;

    /* renamed from: k, reason: collision with root package name */
    public InputStream f9133k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9134l;

    /* renamed from: m, reason: collision with root package name */
    public int f9135m;

    /* renamed from: n, reason: collision with root package name */
    public long f9136n;

    public C0556Ig(String str, C0641Ng c0641Ng, int i, int i3, int i6) {
        super(true);
        this.f9128e = new C0539Hg(this);
        this.f9127G = new HashSet();
        AbstractC0582Jp.m(true ^ TextUtils.isEmpty(str));
        this.f9131h = str;
        this.i = new C1879sw(6);
        this.f9129f = i;
        this.f9130g = i3;
        this.f9126F = i6;
        if (c0641Ng != null) {
            c(c0641Ng);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x029b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x026d A[Catch: IOException -> 0x003d, TryCatch #4 {IOException -> 0x003d, blocks: (B:3:0x000c, B:4:0x001e, B:6:0x0026, B:8:0x0034, B:11:0x0040, B:12:0x0058, B:14:0x005e, B:22:0x0088, B:24:0x00ab, B:26:0x00d1, B:27:0x00d6, B:40:0x010c, B:89:0x0260, B:91:0x026d, B:93:0x027e, B:96:0x0287, B:97:0x0294, B:99:0x029b, B:100:0x02a2, B:101:0x02a3, B:102:0x02c0), top: B:113:0x000c }] */
    @Override // com.google.android.gms.internal.ads.XD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(com.google.android.gms.internal.ads.TE r25) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0556Ig.a(com.google.android.gms.internal.ads.TE):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0078 A[Catch: IOException -> 0x001b, TryCatch #0 {IOException -> 0x001b, blocks: (B:2:0x0000, B:23:0x0058, B:25:0x0060, B:28:0x006a, B:29:0x0070, B:31:0x0078, B:34:0x007f, B:35:0x0084, B:36:0x0085, B:5:0x000b, B:7:0x0016, B:10:0x001e, B:12:0x0026, B:15:0x003c, B:16:0x0046, B:17:0x004b, B:18:0x004c, B:19:0x0051, B:20:0x0052), top: B:40:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[Catch: IOException -> 0x001b, TRY_LEAVE, TryCatch #0 {IOException -> 0x001b, blocks: (B:2:0x0000, B:23:0x0058, B:25:0x0060, B:28:0x006a, B:29:0x0070, B:31:0x0078, B:34:0x007f, B:35:0x0084, B:36:0x0085, B:5:0x000b, B:7:0x0016, B:10:0x001e, B:12:0x0026, B:15:0x003c, B:16:0x0046, B:17:0x004b, B:18:0x004c, B:19:0x0051, B:20:0x0052), top: B:40:0x0000 }] */
    @Override // com.google.android.gms.internal.ads.IN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(int r10, int r11, byte[] r12) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.f9124D     // Catch: java.io.IOException -> L1b
            long r2 = r9.f9136n     // Catch: java.io.IOException -> L1b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = -1
            if (r0 != 0) goto Lb
            goto L55
        Lb:
            java.util.concurrent.atomic.AtomicReference r0 = com.google.android.gms.internal.ads.C0556Ig.f9122I     // Catch: java.io.IOException -> L1b
            r3 = 0
            java.lang.Object r3 = r0.getAndSet(r3)     // Catch: java.io.IOException -> L1b
            byte[] r3 = (byte[]) r3     // Catch: java.io.IOException -> L1b
            if (r3 != 0) goto L1e
            r3 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r3]     // Catch: java.io.IOException -> L1b
            goto L1e
        L1b:
            r10 = move-exception
            goto L8f
        L1e:
            long r4 = r9.f9124D     // Catch: java.io.IOException -> L1b
            long r6 = r9.f9136n     // Catch: java.io.IOException -> L1b
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L52
            int r8 = r3.length     // Catch: java.io.IOException -> L1b
            long r6 = r6 - r4
            long r4 = (long) r8     // Catch: java.io.IOException -> L1b
            long r4 = java.lang.Math.min(r6, r4)     // Catch: java.io.IOException -> L1b
            int r4 = (int) r4     // Catch: java.io.IOException -> L1b
            java.io.InputStream r5 = r9.f9133k     // Catch: java.io.IOException -> L1b
            int r4 = r5.read(r3, r1, r4)     // Catch: java.io.IOException -> L1b
            boolean r5 = java.lang.Thread.interrupted()     // Catch: java.io.IOException -> L1b
            if (r5 != 0) goto L4c
            if (r4 == r2) goto L46
            long r5 = r9.f9124D     // Catch: java.io.IOException -> L1b
            long r7 = (long) r4     // Catch: java.io.IOException -> L1b
            long r5 = r5 + r7
            r9.f9124D = r5     // Catch: java.io.IOException -> L1b
            r9.g(r4)     // Catch: java.io.IOException -> L1b
            goto L1e
        L46:
            java.io.EOFException r10 = new java.io.EOFException     // Catch: java.io.IOException -> L1b
            r10.<init>()     // Catch: java.io.IOException -> L1b
            throw r10     // Catch: java.io.IOException -> L1b
        L4c:
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException     // Catch: java.io.IOException -> L1b
            r10.<init>()     // Catch: java.io.IOException -> L1b
            throw r10     // Catch: java.io.IOException -> L1b
        L52:
            r0.set(r3)     // Catch: java.io.IOException -> L1b
        L55:
            if (r11 != 0) goto L58
            return r1
        L58:
            long r0 = r9.f9123C     // Catch: java.io.IOException -> L1b
            r3 = -1
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L70
            long r5 = r9.f9125E     // Catch: java.io.IOException -> L1b
            long r0 = r0 - r5
            r5 = 0
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 != 0) goto L6a
            goto L7e
        L6a:
            long r5 = (long) r11     // Catch: java.io.IOException -> L1b
            long r0 = java.lang.Math.min(r5, r0)     // Catch: java.io.IOException -> L1b
            int r11 = (int) r0     // Catch: java.io.IOException -> L1b
        L70:
            java.io.InputStream r0 = r9.f9133k     // Catch: java.io.IOException -> L1b
            int r10 = r0.read(r12, r10, r11)     // Catch: java.io.IOException -> L1b
            if (r10 != r2) goto L85
            long r10 = r9.f9123C     // Catch: java.io.IOException -> L1b
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 != 0) goto L7f
        L7e:
            return r2
        L7f:
            java.io.EOFException r10 = new java.io.EOFException     // Catch: java.io.IOException -> L1b
            r10.<init>()     // Catch: java.io.IOException -> L1b
            throw r10     // Catch: java.io.IOException -> L1b
        L85:
            long r11 = r9.f9125E     // Catch: java.io.IOException -> L1b
            long r0 = (long) r10     // Catch: java.io.IOException -> L1b
            long r11 = r11 + r0
            r9.f9125E = r11     // Catch: java.io.IOException -> L1b
            r9.g(r10)     // Catch: java.io.IOException -> L1b
            return r10
        L8f:
            com.google.android.gms.internal.ads.YH r11 = new com.google.android.gms.internal.ads.YH
            r12 = 2000(0x7d0, float:2.803E-42)
            r0 = 2
            r11.<init>(r10, r12, r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0556Ig.d(int, int, byte[]):int");
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final Uri f() {
        HttpURLConnection httpURLConnection = this.f9132j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2003vB, com.google.android.gms.internal.ads.XD
    public final Map h() {
        HttpURLConnection httpURLConnection = this.f9132j;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final void k() {
        HttpURLConnection httpURLConnection = this.f9132j;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e6) {
                u2.k.f("Unexpected error while disconnecting", e6);
            }
            this.f9132j = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final void m() {
        HashSet hashSet = this.f9127G;
        try {
            InputStream inputStream = this.f9133k;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e6) {
                    throw new YH(e6, 2000, 3);
                }
            }
        } finally {
            this.f9133k = null;
            k();
            if (this.f9134l) {
                this.f9134l = false;
                j();
            }
            hashSet.clear();
        }
    }
}
