package defpackage;

import java.util.Collections;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pm1 implements gm1 {
    public final t83 a;
    public String b;
    public jg1 c;
    public om1 d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final r60 g = new r60(32);
    public final r60 h = new r60(33);
    public final r60 i = new r60(34);
    public final r60 j = new r60(39);
    public final r60 k = new r60(40);
    public long m = -9223372036854775807L;
    public final kz2 n = new kz2();

    public pm1(t83 t83Var) {
        this.a = t83Var;
    }

    @Override // defpackage.gm1
    public final void a() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        wl2.Z(this.f);
        this.g.e();
        this.h.e();
        this.i.e();
        this.j.e();
        this.k.e();
        ((fw3) this.a.i).y(0);
        om1 om1Var = this.d;
        if (om1Var != null) {
            om1Var.f = false;
            om1Var.g = false;
            om1Var.h = false;
            om1Var.i = false;
            om1Var.j = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    @Override // defpackage.gm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.kz2 r16) {
        /*
            r15 = this;
            r7 = r16
            jg1 r1 = r15.c
            r1.getClass()
            java.lang.String r1 = defpackage.v23.a
        L9:
            int r1 = r7.B()
            if (r1 <= 0) goto L6f
            int r1 = r7.b
            int r8 = r7.c
            byte[] r9 = r7.a
            long r2 = r15.l
            int r4 = r7.B()
            long r4 = (long) r4
            long r2 = r2 + r4
            r15.l = r2
            jg1 r2 = r15.c
            int r3 = r7.B()
            r10 = 0
            r2.a(r7, r3, r10)
        L29:
            if (r1 >= r8) goto L9
            boolean[] r2 = r15.f
            int r2 = defpackage.wl2.W(r9, r1, r8, r2)
            if (r2 == r8) goto L6c
            int r3 = r2 + 3
            r3 = r9[r3]
            r3 = r3 & 126(0x7e, float:1.77E-43)
            r4 = 3
            if (r2 <= 0) goto L46
            int r5 = r2 + (-1)
            r6 = r9[r5]
            if (r6 != 0) goto L46
            r4 = 4
            r12 = r4
            r11 = r5
            goto L48
        L46:
            r11 = r2
            r12 = r4
        L48:
            int r2 = r11 - r1
            if (r2 <= 0) goto L4f
            r15.g(r9, r1, r11)
        L4f:
            int r1 = r8 - r11
            long r4 = r15.l
            long r13 = (long) r1
            long r4 = r4 - r13
            if (r2 >= 0) goto L59
            int r2 = -r2
            goto L5a
        L59:
            r2 = r10
        L5a:
            int r13 = r3 >> 1
            r3 = r4
            long r5 = r15.m
            r0 = r15
            r0.h(r1, r2, r3, r5)
            long r5 = r15.m
            r2 = r13
            r0.f(r1, r2, r3, r5)
            int r1 = r11 + r12
            goto L29
        L6c:
            r15.g(r9, r1, r8)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pm1.b(kz2):void");
    }

    @Override // defpackage.gm1
    public final void c(boolean z) {
        this.c.getClass();
        String str = v23.a;
        if (z) {
            ((fw3) this.a.i).y(0);
            h(0, 0, this.l, this.m);
            f(0, 48, this.l, this.m);
        }
    }

    @Override // defpackage.gm1
    public final void d(int i, long j) {
        this.m = j;
    }

    @Override // defpackage.gm1
    public final void e(nf1 nf1Var, in1 in1Var) {
        in1Var.a();
        in1Var.b();
        this.b = in1Var.e;
        in1Var.b();
        jg1 jg1VarZ = nf1Var.z(in1Var.d, 2);
        this.c = jg1VarZ;
        this.d = new om1(jg1VarZ);
        this.a.U(nf1Var, in1Var);
    }

    public final void f(int i, int i2, long j, long j2) {
        om1 om1Var = this.d;
        boolean z = this.e;
        om1Var.g = false;
        om1Var.h = false;
        om1Var.e = j2;
        om1Var.d = 0;
        om1Var.b = j;
        if (i2 >= 32 && i2 != 40) {
            if (om1Var.i && !om1Var.j) {
                if (z) {
                    om1Var.a(i);
                }
                om1Var.i = false;
            }
            if (i2 <= 35 || i2 == 39) {
                om1Var.h = !om1Var.j;
                om1Var.j = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        om1Var.c = z2;
        om1Var.f = z2 || i2 <= 9;
        if (!this.e) {
            this.g.g(i2);
            this.h.g(i2);
            this.i.g(i2);
        }
        this.j.g(i2);
        this.k.g(i2);
    }

    public final void g(byte[] bArr, int i, int i2) {
        om1 om1Var = this.d;
        if (om1Var.f) {
            int i3 = om1Var.d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                om1Var.g = (bArr[i4] & 128) != 0;
                om1Var.f = false;
            } else {
                om1Var.d = (i2 - i) + i3;
            }
        }
        if (!this.e) {
            this.g.h(bArr, i, i2);
            this.h.h(bArr, i, i2);
            this.i.h(bArr, i, i2);
        }
        this.j.h(bArr, i, i2);
        this.k.h(bArr, i, i2);
    }

    public final void h(int i, int i2, long j, long j2) {
        fw3 fw3Var = (fw3) this.a.i;
        om1 om1Var = this.d;
        boolean z = this.e;
        if (om1Var.j && om1Var.g) {
            om1Var.m = om1Var.c;
            om1Var.j = false;
        } else if (om1Var.h || om1Var.g) {
            if (z && om1Var.i) {
                om1Var.a(i + ((int) (j - om1Var.b)));
            }
            om1Var.k = om1Var.b;
            om1Var.l = om1Var.e;
            om1Var.m = om1Var.c;
            om1Var.i = true;
        }
        if (!this.e) {
            r60 r60Var = this.g;
            r60Var.i(i2);
            r60 r60Var2 = this.h;
            r60Var2.i(i2);
            r60 r60Var3 = this.i;
            r60Var3.i(i2);
            if (r60Var.d && r60Var2.d && r60Var3.d) {
                String str = this.b;
                int i3 = r60Var.e;
                byte[] bArr = new byte[r60Var2.e + i3 + r60Var3.e];
                System.arraycopy((byte[]) r60Var.f, 0, bArr, 0, i3);
                System.arraycopy((byte[]) r60Var2.f, 0, bArr, r60Var.e, r60Var2.e);
                System.arraycopy((byte[]) r60Var3.f, 0, bArr, r60Var.e + r60Var2.e, r60Var3.e);
                String strA = null;
                f83 f83VarT = wl2.T((byte[]) r60Var2.f, 3, r60Var2.e, null);
                q63 q63Var = f83VarT.b;
                if (q63Var != null) {
                    int i4 = q63Var.f;
                    int[] iArr = q63Var.e;
                    int i5 = q63Var.d;
                    strA = mo2.a(q63Var.a, q63Var.b, q63Var.c, i5, iArr, i4);
                }
                gg4 gg4Var = new gg4();
                gg4Var.a = str;
                gg4Var.d("video/mp2t");
                gg4Var.e("video/hevc");
                gg4Var.i = strA;
                gg4Var.s = f83VarT.e;
                gg4Var.t = f83VarT.f;
                gg4Var.u = f83VarT.g;
                gg4Var.v = f83VarT.h;
                gg4Var.B = new n74(f83VarT.k, f83VarT.l, f83VarT.m, null, f83VarT.c + 8, f83VarT.d + 8);
                gg4Var.y = f83VarT.i;
                gg4Var.n = f83VarT.j;
                gg4Var.C = f83VarT.a + 1;
                gg4Var.o = Collections.singletonList(bArr);
                ph4 ph4Var = new ph4(gg4Var);
                this.c.d(ph4Var);
                int i6 = ph4Var.o;
                zt0.b0(i6 != -1);
                fw3Var.w(i6);
                this.e = true;
            }
        }
        r60 r60Var4 = this.j;
        boolean zI = r60Var4.i(i2);
        kz2 kz2Var = this.n;
        if (zI) {
            kz2Var.z(wl2.z(r60Var4.e, (byte[]) r60Var4.f), (byte[]) r60Var4.f);
            kz2Var.G(5);
            fw3Var.x(j2, kz2Var);
        }
        r60 r60Var5 = this.k;
        if (r60Var5.i(i2)) {
            kz2Var.z(wl2.z(r60Var5.e, (byte[]) r60Var5.f), (byte[]) r60Var5.f);
            kz2Var.G(5);
            fw3Var.x(j2, kz2Var);
        }
    }
}
