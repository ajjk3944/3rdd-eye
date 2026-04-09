package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nm1 implements gm1 {
    public final t83 a;
    public long e;
    public String g;
    public jg1 h;
    public mm1 i;
    public boolean j;
    public boolean l;
    public final boolean[] f = new boolean[3];
    public final r60 b = new r60(7);
    public final r60 c = new r60(8);
    public final r60 d = new r60(6);
    public long k = -9223372036854775807L;
    public final kz2 m = new kz2();

    public nm1(t83 t83Var) {
        this.a = t83Var;
    }

    @Override // defpackage.gm1
    public final void a() {
        this.e = 0L;
        this.l = false;
        this.k = -9223372036854775807L;
        wl2.Z(this.f);
        this.b.e();
        this.c.e();
        this.d.e();
        ((fw3) this.a.i).y(0);
        mm1 mm1Var = this.i;
        if (mm1Var != null) {
            mm1Var.g = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    @Override // defpackage.gm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.kz2 r14) {
        /*
            r13 = this;
            jg1 r2 = r13.h
            r2.getClass()
            java.lang.String r2 = defpackage.v23.a
            int r2 = r14.b
            int r7 = r14.c
            byte[] r8 = r14.a
            long r3 = r13.e
            int r5 = r14.B()
            long r5 = (long) r5
            long r3 = r3 + r5
            r13.e = r3
            jg1 r3 = r13.h
            int r4 = r14.B()
            r9 = 0
            r3.a(r14, r4, r9)
        L21:
            boolean[] r1 = r13.f
            int r1 = defpackage.wl2.W(r8, r2, r7, r1)
            r60 r3 = r13.d
            r60 r4 = r13.c
            r60 r5 = r13.b
            if (r1 == r7) goto L72
            int r6 = r1 + 3
            r6 = r8[r6]
            r10 = r6 & 31
            r6 = 3
            if (r1 <= 0) goto L41
            int r11 = r1 + (-1)
            r12 = r8[r11]
            if (r12 != 0) goto L41
            r6 = 4
        L3f:
            r12 = r6
            goto L43
        L41:
            r11 = r1
            goto L3f
        L43:
            int r1 = r11 - r2
            if (r1 <= 0) goto L54
            boolean r6 = r13.j
            if (r6 != 0) goto L51
            r5.h(r8, r2, r11)
            r4.h(r8, r2, r11)
        L51:
            r3.h(r8, r2, r11)
        L54:
            int r2 = r7 - r11
            long r3 = r13.e
            long r5 = (long) r2
            long r3 = r3 - r5
            if (r1 >= 0) goto L5e
            int r1 = -r1
            goto L5f
        L5e:
            r1 = r9
        L5f:
            long r5 = r13.k
            r0 = r2
            r2 = r1
            r1 = r0
            r0 = r13
            r0.g(r1, r2, r3, r5)
            r2 = r3
            long r4 = r13.k
            r1 = r10
            r0.f(r1, r2, r4)
            int r2 = r11 + r12
            goto L21
        L72:
            boolean r1 = r13.j
            if (r1 != 0) goto L7c
            r5.h(r8, r2, r7)
            r4.h(r8, r2, r7)
        L7c:
            r3.h(r8, r2, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nm1.b(kz2):void");
    }

    @Override // defpackage.gm1
    public final void c(boolean z) {
        this.h.getClass();
        String str = v23.a;
        if (z) {
            ((fw3) this.a.i).y(0);
            g(0, 0, this.e, this.k);
            f(9, this.e, this.k);
            g(0, 0, this.e, this.k);
        }
    }

    @Override // defpackage.gm1
    public final void d(int i, long j) {
        this.k = j;
        int i2 = i & 2;
        this.l = (i2 != 0) | this.l;
    }

    @Override // defpackage.gm1
    public final void e(nf1 nf1Var, in1 in1Var) {
        in1Var.a();
        in1Var.b();
        this.g = in1Var.e;
        in1Var.b();
        jg1 jg1VarZ = nf1Var.z(in1Var.d, 2);
        this.h = jg1VarZ;
        this.i = new mm1(jg1VarZ);
        this.a.U(nf1Var, in1Var);
    }

    public final void f(int i, long j, long j2) {
        if (!this.j) {
            this.b.g(i);
            this.c.g(i);
        }
        this.d.g(i);
        mm1 mm1Var = this.i;
        boolean z = this.l;
        mm1Var.d = i;
        mm1Var.f = j2;
        mm1Var.e = j;
        mm1Var.k = z;
    }

    public final void g(int i, int i2, long j, long j2) {
        fw3 fw3Var = (fw3) this.a.i;
        boolean z = true;
        if (!this.j) {
            r60 r60Var = this.b;
            r60Var.i(i2);
            r60 r60Var2 = this.c;
            r60Var2.i(i2);
            if (this.j) {
                if (r60Var.d) {
                    x93 x93VarO = wl2.O((byte[]) r60Var.f, 4, r60Var.e);
                    fw3Var.w(x93VarO.m);
                    this.i.b.append(x93VarO.d, x93VarO);
                    r60Var.e();
                } else if (r60Var2.d) {
                    lg1 lg1Var = new lg1((byte[]) r60Var2.f, 4, r60Var2.e);
                    int iP = lg1Var.p();
                    lg1Var.p();
                    lg1Var.a();
                    lg1Var.j();
                    this.i.c.append(iP, new tv2(iP));
                    r60Var2.e();
                }
            } else if (r60Var.d && r60Var2.d) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf((byte[]) r60Var.f, r60Var.e));
                arrayList.add(Arrays.copyOf((byte[]) r60Var2.f, r60Var2.e));
                x93 x93VarO2 = wl2.O((byte[]) r60Var.f, 4, r60Var.e);
                lg1 lg1Var2 = new lg1((byte[]) r60Var2.f, 4, r60Var2.e);
                int iP2 = lg1Var2.p();
                lg1Var2.p();
                lg1Var2.a();
                lg1Var2.j();
                tv2 tv2Var = new tv2(iP2);
                int i3 = x93VarO2.a;
                int i4 = x93VarO2.b;
                int i5 = x93VarO2.c;
                byte[] bArr = mo2.a;
                String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
                jg1 jg1Var = this.h;
                gg4 gg4Var = new gg4();
                gg4Var.a = this.g;
                gg4Var.d("video/mp2t");
                gg4Var.e("video/avc");
                gg4Var.i = str;
                gg4Var.s = x93VarO2.e;
                gg4Var.t = x93VarO2.f;
                gg4Var.B = new n74(x93VarO2.j, x93VarO2.k, x93VarO2.l, null, x93VarO2.h + 8, x93VarO2.i + 8);
                gg4Var.y = x93VarO2.g;
                gg4Var.o = arrayList;
                int i6 = x93VarO2.m;
                gg4Var.n = i6;
                jg1Var.d(new ph4(gg4Var));
                this.j = true;
                fw3Var.w(i6);
                this.i.b.append(x93VarO2.d, x93VarO2);
                this.i.c.append(iP2, tv2Var);
                r60Var.e();
                r60Var2.e();
            }
        }
        r60 r60Var3 = this.d;
        if (r60Var3.i(i2)) {
            int iZ = wl2.z(r60Var3.e, (byte[]) r60Var3.f);
            byte[] bArr2 = (byte[]) r60Var3.f;
            kz2 kz2Var = this.m;
            kz2Var.z(iZ, bArr2);
            kz2Var.E(4);
            fw3Var.x(j2, kz2Var);
        }
        mm1 mm1Var = this.i;
        boolean z2 = this.j;
        if (mm1Var.d == 9) {
            if (z2 && mm1Var.g) {
                long j3 = mm1Var.e;
                int i7 = i + ((int) (j - j3));
                long j4 = mm1Var.i;
                if (j4 != -9223372036854775807L) {
                    long j5 = mm1Var.h;
                    if (j3 != j5) {
                        mm1Var.a.c(j4, mm1Var.j ? 1 : 0, (int) (j3 - j5), i7, null);
                    }
                }
            }
            mm1Var.h = mm1Var.e;
            mm1Var.i = mm1Var.f;
            mm1Var.j = false;
            mm1Var.g = true;
        }
        boolean z3 = mm1Var.k;
        boolean z4 = mm1Var.j;
        int i8 = mm1Var.d;
        if (i8 != 5 && (!z3 || i8 != 1)) {
            z = false;
        }
        boolean z5 = z4 | z;
        mm1Var.j = z5;
        mm1Var.d = 24;
        if (z5) {
            this.l = false;
        }
    }
}
