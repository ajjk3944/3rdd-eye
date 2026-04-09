package g2;

import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24302a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f24303b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f24304c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k0 f24306e;

    public /* synthetic */ a0(k0 k0Var, f0 f0Var, int i4, k0 k0Var2, int i10) {
        this.f24302a = i10;
        this.f24304c = f0Var;
        this.f24305d = i4;
        this.f24306e = k0Var2;
        this.f24303b = k0Var;
    }

    @Override // g2.k0
    public final Map b() {
        switch (this.f24302a) {
        }
        return this.f24303b.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    @Override // g2.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.f24302a
            switch(r1) {
                case 0: goto L1e;
                default: goto L7;
            }
        L7:
            int r1 = r0.f24305d
            g2.f0 r2 = r0.f24304c
            r2.f24332d = r1
            g2.k0 r1 = r0.f24306e
            r1.c()
            i2.e0 r1 = r2.f24329a
            i2.e0 r1 = r1.f25634i
            if (r1 != 0) goto L1d
            int r1 = r2.f24332d
            r2.g(r1)
        L1d:
            return
        L1e:
            int r1 = r0.f24305d
            g2.f0 r2 = r0.f24304c
            r2.f24333e = r1
            g2.k0 r1 = r0.f24306e
            r1.c()
            w0.e r1 = r2.f24339m
            x.e0 r3 = r2.f24338l
            long[] r4 = r3.f36873a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L9d
            r7 = 0
        L35:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L98
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L4f:
            if (r12 >= r10) goto L95
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L8c
            int r13 = r7 << 3
            int r13 = r13 + r12
            java.lang.Object[] r14 = r3.f36874b
            r14 = r14[r13]
            java.lang.Object[] r15 = r3.f36875c
            r15 = r15[r13]
            g2.a1 r15 = (g2.a1) r15
            int r6 = r1.j(r14)
            r17 = r11
            if (r6 < 0) goto L73
            int r11 = r2.f24333e
            if (r6 < r11) goto L8e
        L73:
            if (r6 < 0) goto L7d
            java.lang.Object[] r11 = r1.f36397a
            r18 = r11[r6]
            java.lang.Object r18 = g2.n0.f24385b
            r11[r6] = r18
        L7d:
            x.e0 r6 = r2.j
            boolean r6 = r6.b(r14)
            if (r6 == 0) goto L88
            r15.a()
        L88:
            r3.l(r13)
            goto L8e
        L8c:
            r17 = r11
        L8e:
            long r8 = r8 >> r17
            int r12 = r12 + 1
            r11 = r17
            goto L4f
        L95:
            r6 = r11
            if (r10 != r6) goto L9d
        L98:
            if (r7 == r5) goto L9d
            int r7 = r7 + 1
            goto L35
        L9d:
            int r1 = r2.f24332d
            r2.g(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.a0.c():void");
    }

    @Override // g2.k0
    public final mk.c d() {
        switch (this.f24302a) {
        }
        return this.f24303b.d();
    }

    @Override // g2.k0
    public final int getHeight() {
        switch (this.f24302a) {
        }
        return this.f24303b.getHeight();
    }

    @Override // g2.k0
    public final int getWidth() {
        switch (this.f24302a) {
        }
        return this.f24303b.getWidth();
    }
}
