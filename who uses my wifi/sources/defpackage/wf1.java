package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wf1 implements cg1 {
    public final t3 a;
    public final t3 b;
    public final long c;

    public wf1(long j, long[] jArr, long[] jArr2) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zt0.D(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.a = new t3(length2, 12);
            this.b = new t3(length2, 12);
        } else {
            int i = length2 + 1;
            t3 t3Var = new t3(i, 12);
            this.a = t3Var;
            t3 t3Var2 = new t3(i, 12);
            this.b = t3Var2;
            t3Var.u();
            t3Var2.u();
        }
        this.a.z(jArr);
        this.b.z(jArr2);
        this.c = j;
    }

    @Override // defpackage.cg1
    public final long a() {
        return this.c;
    }

    @Override // defpackage.cg1
    public final bg1 b(long j) {
        t3 t3Var = this.b;
        int i = t3Var.g;
        if (i == 0) {
            dg1 dg1Var = dg1.c;
            return new bg1(dg1Var, dg1Var);
        }
        String str = v23.a;
        int i2 = i - 1;
        int i3 = 0;
        int i4 = 0;
        while (i4 <= i2) {
            int i5 = (i4 + i2) >>> 1;
            if (t3Var.A(i5) < j) {
                i4 = i5 + 1;
            } else {
                i2 = i5 - 1;
            }
        }
        int i6 = i2 + 1;
        if (i6 < t3Var.g && t3Var.A(i6) == j) {
            i3 = i6;
        } else if (i2 != -1) {
            i3 = i2;
        }
        long jA = t3Var.A(i3);
        t3 t3Var2 = this.a;
        dg1 dg1Var2 = new dg1(jA, t3Var2.A(i3));
        if (jA == j || i3 == t3Var.g - 1) {
            return new bg1(dg1Var2, dg1Var2);
        }
        int i7 = i3 + 1;
        return new bg1(dg1Var2, new dg1(t3Var.A(i7), t3Var2.A(i7)));
    }

    @Override // defpackage.cg1
    public final boolean d() {
        return this.b.g > 0;
    }
}
