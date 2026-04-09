package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ij, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0559Ij implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9140a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069wN f9141b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f9142c;

    /* renamed from: d, reason: collision with root package name */
    public final C1113ek f9143d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2069wN f9144e;

    public C0559Ij(C1799rN c1799rN, C1113ek c1113ek, C0540Hh c0540Hh, C1799rN c1799rN2) {
        this.f9140a = 2;
        this.f9141b = c1799rN;
        this.f9143d = c1113ek;
        this.f9142c = c0540Hh;
        this.f9144e = c1799rN2;
    }

    public Jr a() {
        return new Jr((C1552ms) this.f9141b.c(), this.f9143d.a(), ((C0540Hh) this.f9142c).a(), (C0538Hf) this.f9144e.c(), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0082  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c() {
        /*
            r10 = this;
            int r0 = r10.f9140a
            switch(r0) {
                case 0: goto L90;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            com.google.android.gms.internal.ads.Jr r0 = r10.a()
            return r0
        La:
            com.google.android.gms.internal.ads.wN r0 = r10.f9141b
            java.lang.Object r0 = r0.c()
            com.google.android.gms.internal.ads.H6 r0 = (com.google.android.gms.internal.ads.H6) r0
            com.google.android.gms.internal.ads.wN r1 = r10.f9142c
            com.google.android.gms.internal.ads.Hh r1 = (com.google.android.gms.internal.ads.C0540Hh) r1
            android.content.Context r1 = r1.a()
            com.google.android.gms.internal.ads.ek r2 = r10.f9143d
            com.google.android.gms.internal.ads.bu r2 = r2.a()
            com.google.android.gms.internal.ads.wN r3 = r10.f9144e
            java.lang.Object r3 = r3.c()
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            com.google.android.gms.internal.ads.Mf r5 = com.google.android.gms.internal.ads.AbstractC0640Nf.f10005a
            com.google.android.gms.internal.ads.Cr.v(r5)
            com.google.android.gms.internal.ads.E9 r6 = com.google.android.gms.internal.ads.H9.f8779l3
            q2.s r7 = q2.C2841s.f23267e
            com.google.android.gms.internal.ads.G9 r8 = r7.f23270c
            java.lang.Object r6 = r8.a(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r8 = -1
            if (r6 == r8) goto L58
            q2.a1 r2 = r2.f13482d
            java.lang.String r6 = java.lang.Integer.toString(r6)
            java.lang.String r2 = I5.b.B(r2)
            java.lang.String r2 = I5.b.A(r2)
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L82
        L58:
            p2.j r2 = p2.j.f22785C
            Q2.a r2 = r2.f22797k
            r2.getClass()
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r3
            com.google.android.gms.internal.ads.E9 r2 = com.google.android.gms.internal.ads.H9.f8793n3
            com.google.android.gms.internal.ads.G9 r3 = r7.f23270c
            java.lang.Object r2 = r3.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            long r2 = (long) r2
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 >= 0) goto L82
            com.google.android.gms.internal.ads.dp r2 = new com.google.android.gms.internal.ads.dp
            r3 = 1
            r2.<init>()
            f4.a r0 = r5.b(r2)
            goto L8c
        L82:
            com.google.android.gms.internal.ads.dp r2 = new com.google.android.gms.internal.ads.dp
            r3 = 0
            r2.<init>()
            f4.a r0 = r5.b(r2)
        L8c:
            com.google.android.gms.internal.ads.Cr.v(r0)
            return r0
        L90:
            com.google.android.gms.internal.ads.wN r0 = r10.f9141b
            java.lang.Object r0 = r0.c()
            Q2.a r0 = (Q2.a) r0
            com.google.android.gms.internal.ads.wN r1 = r10.f9142c
            java.lang.Object r1 = r1.c()
            com.google.android.gms.internal.ads.Jj r1 = (com.google.android.gms.internal.ads.C0576Jj) r1
            com.google.android.gms.internal.ads.ek r2 = r10.f9143d
            com.google.android.gms.internal.ads.bu r2 = r2.a()
            com.google.android.gms.internal.ads.wN r3 = r10.f9144e
            java.lang.Object r3 = r3.c()
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.internal.ads.Hj r4 = new com.google.android.gms.internal.ads.Hj
            r4.<init>(r0, r1, r2, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0559Ij.c():java.lang.Object");
    }

    public /* synthetic */ C0559Ij(InterfaceC2069wN interfaceC2069wN, InterfaceC2069wN interfaceC2069wN2, C1113ek c1113ek, InterfaceC2069wN interfaceC2069wN3, int i) {
        this.f9140a = i;
        this.f9141b = interfaceC2069wN;
        this.f9142c = interfaceC2069wN2;
        this.f9143d = c1113ek;
        this.f9144e = interfaceC2069wN3;
    }
}
