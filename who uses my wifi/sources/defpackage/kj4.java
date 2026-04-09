package defpackage;

import java.util.Comparator;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class kj4 extends jj4 {
    public final int A;
    public final boolean j;
    public final dj4 k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final boolean v;
    public final int w;
    public final int x;
    public final boolean y;
    public final boolean z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:100:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public kj4(int r8, defpackage.d02 r9, int r10, defpackage.dj4 r11, int r12, java.lang.String r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kj4.<init>(int, d02, int, dj4, int, java.lang.String, boolean):void");
    }

    public static int c(kj4 kj4Var, kj4 kj4Var2) {
        pm3 pm3VarD = pm3.a.d(kj4Var.m, kj4Var2.m);
        Integer numValueOf = Integer.valueOf(kj4Var.r);
        Integer numValueOf2 = Integer.valueOf(kj4Var2.r);
        qn3 qn3Var = qn3.h;
        pm3 pm3VarA = pm3VarD.a(numValueOf, numValueOf2, qn3Var).b(kj4Var.s, kj4Var2.s).b(kj4Var.t, kj4Var2.t).a(Integer.valueOf(kj4Var.u), Integer.valueOf(kj4Var2.u), qn3Var).d(kj4Var.v, kj4Var2.v).b(kj4Var.w, kj4Var2.w).d(kj4Var.n, kj4Var2.n).d(kj4Var.j, kj4Var2.j).d(kj4Var.l, kj4Var2.l).a(Integer.valueOf(kj4Var.q), Integer.valueOf(kj4Var2.q), qn3Var);
        boolean z = kj4Var.y;
        pm3 pm3VarD2 = pm3VarA.d(z, kj4Var2.y);
        boolean z2 = kj4Var.z;
        pm3 pm3VarD3 = pm3VarD2.d(z2, kj4Var2.z);
        if (z && z2) {
            pm3VarD3 = pm3VarD3.b(kj4Var.A, kj4Var2.A);
        }
        return pm3VarD3.e();
    }

    public static int d(kj4 kj4Var, kj4 kj4Var2) {
        Comparator zn3Var = (kj4Var.j && kj4Var.m) ? lj4.k : new zn3();
        kj4Var.k.getClass();
        return nm3.f(zn3Var.compare(Integer.valueOf(kj4Var.p), Integer.valueOf(kj4Var2.p))).a(Integer.valueOf(kj4Var.o), Integer.valueOf(kj4Var2.o), zn3Var).e();
    }

    @Override // defpackage.jj4
    public final int a() {
        return this.x;
    }

    @Override // defpackage.jj4
    public final /* bridge */ /* synthetic */ boolean b(jj4 jj4Var) {
        kj4 kj4Var = (kj4) jj4Var;
        if (!Objects.equals(this.i.m, kj4Var.i.m)) {
            return false;
        }
        this.k.getClass();
        return this.y == kj4Var.y && this.z == kj4Var.z;
    }
}
