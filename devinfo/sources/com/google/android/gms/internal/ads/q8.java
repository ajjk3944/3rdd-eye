package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q8 implements j8 {

    /* renamed from: a, reason: collision with root package name */
    public final e9 f15246a;

    /* renamed from: e, reason: collision with root package name */
    public long f15250e;
    public String g;

    /* renamed from: h, reason: collision with root package name */
    public u2 f15252h;

    /* renamed from: i, reason: collision with root package name */
    public p8 f15253i;
    public boolean j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f15255l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f15251f = new boolean[3];

    /* renamed from: b, reason: collision with root package name */
    public final x8 f15247b = new x8(7);

    /* renamed from: c, reason: collision with root package name */
    public final x8 f15248c = new x8(8);

    /* renamed from: d, reason: collision with root package name */
    public final x8 f15249d = new x8(6);

    /* renamed from: k, reason: collision with root package name */
    public long f15254k = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    public final sk0 f15256m = new sk0();

    public q8(e9 e9Var) {
        this.f15246a = e9Var;
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void a(boolean z3) {
        this.f15252h.getClass();
        String str = bq0.f9768a;
        if (z3) {
            this.f15246a.f10746d.L(0);
            g(0, 0, this.f15250e, this.f15254k);
            f(this.f15250e, this.f15254k, 9);
            g(0, 0, this.f15250e, this.f15254k);
        }
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void b() {
        this.f15250e = 0L;
        this.f15255l = false;
        this.f15254k = -9223372036854775807L;
        ls.S(this.f15251f);
        this.f15247b.a();
        this.f15248c.a();
        this.f15249d.a();
        this.f15246a.f10746d.L(0);
        p8 p8Var = this.f15253i;
        if (p8Var != null) {
            p8Var.g = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void c(int i4, long j) {
        this.f15254k = j;
        int i10 = i4 & 2;
        this.f15255l = (i10 != 0) | this.f15255l;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    @Override // com.google.android.gms.internal.ads.j8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.google.android.gms.internal.ads.sk0 r13) {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.u2 r2 = r12.f15252h
            r2.getClass()
            java.lang.String r2 = com.google.android.gms.internal.ads.bq0.f9768a
            int r2 = r13.f16447b
            int r7 = r13.f16448c
            byte[] r8 = r13.f16446a
            long r3 = r12.f15250e
            int r5 = r13.B()
            long r5 = (long) r5
            long r3 = r3 + r5
            r12.f15250e = r3
            com.google.android.gms.internal.ads.u2 r3 = r12.f15252h
            int r4 = r13.B()
            r3.b(r4, r13)
        L20:
            boolean[] r1 = r12.f15251f
            int r1 = com.google.android.gms.internal.ads.ls.Q(r8, r2, r7, r1)
            com.google.android.gms.internal.ads.x8 r3 = r12.f15249d
            com.google.android.gms.internal.ads.x8 r4 = r12.f15248c
            com.google.android.gms.internal.ads.x8 r5 = r12.f15247b
            if (r1 == r7) goto L71
            int r6 = r1 + 3
            r6 = r8[r6]
            r9 = r6 & 31
            r6 = 3
            if (r1 <= 0) goto L40
            int r10 = r1 + (-1)
            r11 = r8[r10]
            if (r11 != 0) goto L40
            r6 = 4
        L3e:
            r11 = r6
            goto L42
        L40:
            r10 = r1
            goto L3e
        L42:
            int r1 = r10 - r2
            if (r1 <= 0) goto L53
            boolean r6 = r12.j
            if (r6 != 0) goto L50
            r5.d(r2, r10, r8)
            r4.d(r2, r10, r8)
        L50:
            r3.d(r2, r10, r8)
        L53:
            int r2 = r7 - r10
            long r3 = r12.f15250e
            long r5 = (long) r2
            long r3 = r3 - r5
            if (r1 >= 0) goto L5d
            int r1 = -r1
            goto L5e
        L5d:
            r1 = 0
        L5e:
            long r5 = r12.f15254k
            r0 = r2
            r2 = r1
            r1 = r0
            r0 = r12
            r0.g(r1, r2, r3, r5)
            r1 = r3
            long r3 = r12.f15254k
            r5 = r9
            r0.f(r1, r3, r5)
            int r2 = r10 + r11
            goto L20
        L71:
            boolean r1 = r12.j
            if (r1 != 0) goto L7b
            r5.d(r2, r7, r8)
            r4.d(r2, r7, r8)
        L7b:
            r3.d(r2, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q8.d(com.google.android.gms.internal.ads.sk0):void");
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void e(z1 z1Var, h9 h9Var) {
        h9Var.a();
        h9Var.b();
        this.g = h9Var.f11777e;
        h9Var.b();
        u2 u2VarM = z1Var.m(h9Var.f11776d, 2);
        this.f15252h = u2VarM;
        this.f15253i = new p8(u2VarM);
        this.f15246a.a(z1Var, h9Var);
    }

    public final void f(long j, long j8, int i4) {
        if (!this.j) {
            this.f15247b.c(i4);
            this.f15248c.c(i4);
        }
        this.f15249d.c(i4);
        p8 p8Var = this.f15253i;
        boolean z3 = this.f15255l;
        p8Var.f14921d = i4;
        p8Var.f14923f = j8;
        p8Var.f14922e = j;
        p8Var.f14926k = z3;
    }

    public final void g(int i4, int i10, long j, long j8) {
        be1 be1Var = this.f15246a.f10746d;
        boolean z3 = true;
        if (!this.j) {
            x8 x8Var = this.f15247b;
            x8Var.e(i10);
            x8 x8Var2 = this.f15248c;
            x8Var2.e(i10);
            if (this.j) {
                if (x8Var.f18319c) {
                    k11 k11VarC = ls.C(4, x8Var.f18320d, (byte[]) x8Var.f18321e);
                    be1Var.J(k11VarC.f12982m);
                    this.f15253i.f14919b.append(k11VarC.f12975d, k11VarC);
                    x8Var.a();
                } else if (x8Var2.f18319c) {
                    w2 w2Var = new w2((byte[]) x8Var2.f18321e, 4, x8Var2.f18320d);
                    int iJ = w2Var.j();
                    w2Var.j();
                    w2Var.a();
                    w2Var.g();
                    this.f15253i.f14920c.append(iJ, new tk0(iJ));
                    x8Var2.a();
                }
            } else if (x8Var.f18319c && x8Var2.f18319c) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf((byte[]) x8Var.f18321e, x8Var.f18320d));
                arrayList.add(Arrays.copyOf((byte[]) x8Var2.f18321e, x8Var2.f18320d));
                k11 k11VarC2 = ls.C(4, x8Var.f18320d, (byte[]) x8Var.f18321e);
                w2 w2Var2 = new w2((byte[]) x8Var2.f18321e, 4, x8Var2.f18320d);
                int iJ2 = w2Var2.j();
                w2Var2.j();
                w2Var2.a();
                w2Var2.g();
                tk0 tk0Var = new tk0(iJ2);
                int i11 = k11VarC2.f12972a;
                int i12 = k11VarC2.f12973b;
                int i13 = k11VarC2.f12974c;
                byte[] bArr = ba0.f9638a;
                String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
                u2 u2Var = this.f15252h;
                lw1 lw1Var = new lw1();
                lw1Var.f13652a = this.g;
                lw1Var.d("video/mp2t");
                lw1Var.e("video/avc");
                lw1Var.f13659i = str;
                lw1Var.f13668s = k11VarC2.f12976e;
                lw1Var.f13669t = k11VarC2.f12977f;
                lw1Var.B = new sm1(k11VarC2.j, k11VarC2.f12980k, k11VarC2.f12981l, null, k11VarC2.f12978h + 8, k11VarC2.f12979i + 8);
                lw1Var.f13674y = k11VarC2.g;
                lw1Var.f13664o = arrayList;
                int i14 = k11VarC2.f12982m;
                lw1Var.f13663n = i14;
                u2Var.f(new mx1(lw1Var));
                this.j = true;
                be1Var.J(i14);
                this.f15253i.f14919b.append(k11VarC2.f12975d, k11VarC2);
                this.f15253i.f14920c.append(iJ2, tk0Var);
                x8Var.a();
                x8Var2.a();
            }
        }
        x8 x8Var3 = this.f15249d;
        if (x8Var3.e(i10)) {
            int iB = ls.b(x8Var3.f18320d, (byte[]) x8Var3.f18321e);
            byte[] bArr2 = (byte[]) x8Var3.f18321e;
            sk0 sk0Var = this.f15256m;
            sk0Var.z(iB, bArr2);
            sk0Var.E(4);
            be1Var.K(j8, sk0Var);
        }
        p8 p8Var = this.f15253i;
        boolean z10 = this.j;
        if (p8Var.f14921d == 9) {
            if (z10 && p8Var.g) {
                long j9 = p8Var.f14922e;
                int i15 = i4 + ((int) (j - j9));
                long j10 = p8Var.f14925i;
                if (j10 != -9223372036854775807L) {
                    long j11 = p8Var.f14924h;
                    if (j9 != j11) {
                        p8Var.f14918a.d(j10, p8Var.j ? 1 : 0, (int) (j9 - j11), i15, null);
                    }
                }
            }
            p8Var.f14924h = p8Var.f14922e;
            p8Var.f14925i = p8Var.f14923f;
            p8Var.j = false;
            p8Var.g = true;
        }
        boolean z11 = p8Var.f14926k;
        boolean z12 = p8Var.j;
        int i16 = p8Var.f14921d;
        if (i16 != 5 && (!z11 || i16 != 1)) {
            z3 = false;
        }
        boolean z13 = z12 | z3;
        p8Var.j = z13;
        p8Var.f14921d = 24;
        if (z13) {
            this.f15255l = false;
        }
    }
}
