package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class E3 implements I3 {

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f7882x = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7883a;

    /* renamed from: d, reason: collision with root package name */
    public final String f7886d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7887e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7888f;

    /* renamed from: g, reason: collision with root package name */
    public String f7889g;

    /* renamed from: h, reason: collision with root package name */
    public T0 f7890h;
    public T0 i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7894m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7895n;

    /* renamed from: q, reason: collision with root package name */
    public int f7898q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7899r;

    /* renamed from: t, reason: collision with root package name */
    public int f7901t;

    /* renamed from: v, reason: collision with root package name */
    public T0 f7903v;

    /* renamed from: w, reason: collision with root package name */
    public long f7904w;

    /* renamed from: b, reason: collision with root package name */
    public final C1443kr f7884b = new C1443kr(new byte[7], 7);

    /* renamed from: c, reason: collision with root package name */
    public final C2036vr f7885c = new C2036vr(Arrays.copyOf(f7882x, 10));

    /* renamed from: o, reason: collision with root package name */
    public int f7896o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f7897p = -1;

    /* renamed from: s, reason: collision with root package name */
    public long f7900s = -9223372036854775807L;

    /* renamed from: u, reason: collision with root package name */
    public long f7902u = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    public int f7891j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f7892k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f7893l = 256;

    public E3(String str, int i, String str2, boolean z6) {
        this.f7883a = z6;
        this.f7886d = str;
        this.f7887e = i;
        this.f7888f = str2;
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void a() {
        this.f7902u = -9223372036854775807L;
        this.f7895n = false;
        this.f7891j = 0;
        this.f7892k = 0;
        this.f7893l = 256;
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void b(boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void c(int i, long j6) {
        this.f7902u = j6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x029d, code lost:
    
        r20.f7898q = (r9 & 8) >> 3;
        r5 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02a9, code lost:
    
        if (r5 == ((r9 & 1) ^ 1)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02ab, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02ad, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02ae, code lost:
    
        r20.f7894m = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02b2, code lost:
    
        if (r20.f7895n != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02b4, code lost:
    
        r20.f7891j = r5;
        r20.f7892k = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02ba, code lost:
    
        r20.f7891j = r16;
        r20.f7892k = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02c1, code lost:
    
        r21.E(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0221, code lost:
    
        r19 = r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0315 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.I3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.google.android.gms.internal.ads.C2036vr r21) throws com.google.android.gms.internal.ads.P4 {
        /*
            Method dump skipped, instructions count: 816
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.E3.d(com.google.android.gms.internal.ads.vr):void");
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void e(InterfaceC2100x0 interfaceC2100x0, C1189g4 c1189g4) {
        c1189g4.a();
        c1189g4.b();
        this.f7889g = c1189g4.f14198e;
        c1189g4.b();
        T0 t0X = interfaceC2100x0.x(c1189g4.f14197d, 1);
        this.f7890h = t0X;
        this.f7903v = t0X;
        if (!this.f7883a) {
            this.i = new C1938u0();
            return;
        }
        c1189g4.a();
        c1189g4.b();
        T0 t0X2 = interfaceC2100x0.x(c1189g4.f14197d, 5);
        this.i = t0X2;
        C1855sP c1855sP = new C1855sP();
        c1189g4.b();
        c1855sP.f16722a = c1189g4.f14198e;
        c1855sP.d(this.f7888f);
        c1855sP.e("application/id3");
        t0X2.e(new TP(c1855sP));
    }
}
