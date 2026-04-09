package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ji0 implements f90 {

    /* renamed from: a, reason: collision with root package name */
    public final za.a f12755a;

    /* renamed from: b, reason: collision with root package name */
    public final gx f12756b;

    /* renamed from: c, reason: collision with root package name */
    public final wp0 f12757c;

    /* renamed from: d, reason: collision with root package name */
    public final qz f12758d;

    /* renamed from: e, reason: collision with root package name */
    public final hq0 f12759e;

    /* renamed from: f, reason: collision with root package name */
    public final qo f12760f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final qh0 f12761h;

    /* renamed from: i, reason: collision with root package name */
    public final qd0 f12762i;

    public ji0(za.a aVar, gx gxVar, wp0 wp0Var, qz qzVar, hq0 hq0Var, boolean z3, qo qoVar, qh0 qh0Var, qd0 qd0Var) {
        this.f12755a = aVar;
        this.f12756b = gxVar;
        this.f12757c = wp0Var;
        this.f12758d = qzVar;
        this.f12759e = hq0Var;
        this.g = z3;
        this.f12760f = qoVar;
        this.f12761h = qh0Var;
        this.f12762i = qd0Var;
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final wp0 a() {
        return this.f12757c;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    @Override // com.google.android.gms.internal.ads.f90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(boolean r18, android.content.Context r19, com.google.android.gms.internal.ads.m60 r20) {
        /*
            r17 = this;
            r1 = r17
            com.google.android.gms.internal.ads.hq0 r0 = r1.f12759e
            com.google.android.gms.internal.ads.qo r2 = r1.f12760f
            com.google.android.gms.internal.ads.gx r3 = r1.f12756b
            java.lang.Object r3 = com.google.android.gms.internal.ads.yo0.I(r3)
            com.google.android.gms.internal.ads.l10 r3 = (com.google.android.gms.internal.ads.l10) r3
            com.google.android.gms.internal.ads.qz r6 = r1.f12758d
            r4 = 1
            r6.T0(r4)
            ua.f r7 = new ua.f
            boolean r5 = r1.g
            if (r5 == 0) goto L1f
            boolean r8 = r2.b(r4)
            goto L20
        L1f:
            r8 = r4
        L20:
            r9 = 0
            if (r5 == 0) goto L2b
            monitor-enter(r2)
            boolean r10 = r2.f15383b     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)
            if (r10 == 0) goto L2b
            r10 = r4
            goto L30
        L2b:
            r10 = r9
            goto L30
        L2d:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            throw r0
        L30:
            if (r5 == 0) goto L38
            float r2 = r2.c()
        L36:
            r11 = r2
            goto L3a
        L38:
            r2 = 0
            goto L36
        L3a:
            com.google.android.gms.internal.ads.wp0 r2 = r1.f12757c
            boolean r13 = r2.O
            r14 = 0
            r9 = 1
            r12 = r18
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            if (r20 == 0) goto L4a
            r20.v1()
        L4a:
            ua.j r5 = ua.j.C
            ja.c r5 = r5.f35260b
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r5 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            com.google.android.gms.internal.ads.es1 r3 = r3.f13327e0
            java.lang.Object r3 = r3.a()
            com.google.android.gms.internal.ads.d90 r3 = (com.google.android.gms.internal.ads.d90) r3
            int r8 = r2.Q
            r9 = -1
            if (r8 == r9) goto L5e
            goto L72
        L5e:
            va.f3 r9 = r0.f11949k
            if (r9 == 0) goto L6d
            int r9 = r9.f36093a
            if (r9 != r4) goto L68
            r8 = 7
            goto L72
        L68:
            r10 = 2
            if (r9 != r10) goto L6d
            r8 = 6
            goto L72
        L6d:
            java.lang.String r9 = "Error setting app open orientation; no targeting orientation available."
            za.i.c(r9)
        L72:
            za.a r9 = r1.f12755a
            r10 = r7
            r7 = r8
            r8 = r9
            java.lang.String r9 = r2.B
            com.google.android.gms.internal.ads.aq0 r11 = r2.f18106s
            java.lang.String r12 = r11.f9387b
            java.lang.String r11 = r11.f9386a
            boolean r2 = r2.b()
            if (r2 == 0) goto L89
            com.google.android.gms.internal.ads.qh0 r2 = r1.f12761h
        L87:
            r15 = r2
            goto L8b
        L89:
            r2 = 0
            goto L87
        L8b:
            java.lang.String r13 = r0.g
            java.lang.String r16 = r6.G1()
            r0 = r12
            r12 = r11
            r11 = r0
            r14 = r20
            r0 = r4
            r4 = r5
            r5 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.google.android.gms.internal.ads.qd0 r2 = r1.f12762i
            r3 = r19
            ja.c.E(r3, r4, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ji0.e(boolean, android.content.Context, com.google.android.gms.internal.ads.m60):void");
    }
}
