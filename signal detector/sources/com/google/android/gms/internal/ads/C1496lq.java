package com.google.android.gms.internal.ads;

import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.lq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1496lq implements InterfaceC0595Kl {

    /* renamed from: a, reason: collision with root package name */
    public final C2951a f15473a;

    /* renamed from: b, reason: collision with root package name */
    public final C0657Of f15474b;

    /* renamed from: c, reason: collision with root package name */
    public final Qt f15475c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0828Yg f15476d;

    /* renamed from: e, reason: collision with root package name */
    public final C0960bu f15477e;

    /* renamed from: f, reason: collision with root package name */
    public final C0500Fb f15478f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15479g;

    /* renamed from: h, reason: collision with root package name */
    public final BinderC0718Rp f15480h;
    public final C0784Vn i;

    public C1496lq(C2951a c2951a, C0657Of c0657Of, Qt qt, InterfaceC0828Yg interfaceC0828Yg, C0960bu c0960bu, boolean z6, C0500Fb c0500Fb, BinderC0718Rp binderC0718Rp, C0784Vn c0784Vn) {
        this.f15473a = c2951a;
        this.f15474b = c0657Of;
        this.f15475c = qt;
        this.f15476d = interfaceC0828Yg;
        this.f15477e = c0960bu;
        this.f15479g = z6;
        this.f15478f = c0500Fb;
        this.f15480h = binderC0718Rp;
        this.i = c0784Vn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0595Kl
    public final Qt c() {
        return this.f15475c;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    @Override // com.google.android.gms.internal.ads.InterfaceC0595Kl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(boolean r18, android.content.Context r19, com.google.android.gms.internal.ads.C1760qk r20) {
        /*
            r17 = this;
            r1 = r17
            com.google.android.gms.internal.ads.bu r0 = r1.f15477e
            com.google.android.gms.internal.ads.Fb r2 = r1.f15478f
            com.google.android.gms.internal.ads.Of r3 = r1.f15474b
            java.lang.Object r3 = com.google.android.gms.internal.ads.AbstractC1984ut.I(r3)
            com.google.android.gms.internal.ads.Sh r3 = (com.google.android.gms.internal.ads.C0727Sh) r3
            com.google.android.gms.internal.ads.Yg r6 = r1.f15476d
            r4 = 1
            r6.h1(r4)
            p2.f r7 = new p2.f
            boolean r5 = r1.f15479g
            if (r5 == 0) goto L1f
            boolean r8 = r2.b(r4)
            goto L20
        L1f:
            r8 = r4
        L20:
            r9 = 0
            if (r5 == 0) goto L2b
            monitor-enter(r2)
            boolean r10 = r2.f8138b     // Catch: java.lang.Throwable -> L2d
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
            com.google.android.gms.internal.ads.Qt r2 = r1.f15475c
            boolean r13 = r2.f10745O
            r14 = 0
            r9 = 1
            r12 = r18
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            if (r20 == 0) goto L4a
            r20.H1()
        L4a:
            p2.j r5 = p2.j.f22785C
            p1.e r5 = r5.f22789b
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r5 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            com.google.android.gms.internal.ads.rN r3 = r3.f11216a0
            java.lang.Object r3 = r3.c()
            com.google.android.gms.internal.ads.Il r3 = (com.google.android.gms.internal.ads.C0561Il) r3
            int r8 = r2.f10747Q
            r9 = -1
            if (r8 == r9) goto L5e
            goto L72
        L5e:
            q2.g1 r9 = r0.f13488k
            if (r9 == 0) goto L6d
            int r9 = r9.f23223a
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
            u2.k.c(r9)
        L72:
            u2.a r9 = r1.f15473a
            r10 = r7
            r7 = r8
            r8 = r9
            java.lang.String r9 = r2.f10726B
            com.google.android.gms.internal.ads.Ut r11 = r2.f10791s
            java.lang.String r12 = r11.f11812b
            java.lang.String r11 = r11.f11811a
            boolean r2 = r2.b()
            if (r2 == 0) goto L89
            com.google.android.gms.internal.ads.Rp r2 = r1.f15480h
        L87:
            r15 = r2
            goto L8b
        L89:
            r2 = 0
            goto L87
        L8b:
            java.lang.String r13 = r0.f13485g
            java.lang.String r16 = r6.o()
            r0 = r12
            r12 = r11
            r11 = r0
            r14 = r20
            r0 = r4
            r4 = r5
            r5 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.google.android.gms.internal.ads.Vn r2 = r1.i
            r3 = r19
            p1.e.i(r3, r4, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1496lq.p(boolean, android.content.Context, com.google.android.gms.internal.ads.qk):void");
    }
}
