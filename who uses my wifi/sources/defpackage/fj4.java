package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fj4 extends jj4 implements Comparable {
    public final int j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final boolean s;

    public fj4(int i, d02 d02Var, int i2, dj4 dj4Var, int i3, String str, String str2) {
        int iD;
        super(i, d02Var, i2);
        int i4 = 0;
        this.k = kg4.I(i3, false);
        int i5 = this.i.e;
        dj4Var.getClass();
        xm3 xm3Var = dj4Var.r;
        this.l = 1 == (i5 & 1);
        this.m = (i5 & 2) != 0;
        xm3 xm3VarI = str2 != null ? xm3.i(str2) : xm3Var.isEmpty() ? xm3.i("") : xm3Var;
        int i6 = 0;
        while (true) {
            if (i6 >= xm3VarI.size()) {
                iD = 0;
                i6 = Integer.MAX_VALUE;
                break;
            } else {
                iD = lj4.d(this.i, (String) xm3VarI.get(i6), false);
                if (iD > 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        this.n = i6;
        this.o = iD;
        int i7 = str2 != null ? 1088 : 0;
        int i8 = this.i.f;
        int iBitCount = (i8 == 0 || i8 != i7) ? Integer.bitCount(i7 & i8) : Integer.MAX_VALUE;
        this.p = iBitCount;
        ph4 ph4Var = this.i;
        this.s = (1088 & ph4Var.f) != 0;
        int iE = lj4.e(ph4Var, dj4Var.s);
        this.q = iE;
        int iD2 = lj4.d(this.i, str, lj4.c(str) == null);
        this.r = iD2;
        boolean z = iD > 0 || (xm3Var.isEmpty() && iBitCount > 0) || ((xm3Var.isEmpty() && iE != Integer.MAX_VALUE) || this.l || (this.m && iD2 > 0));
        if (kg4.I(i3, dj4Var.B) && z) {
            i4 = 1;
        }
        this.j = i4;
    }

    @Override // defpackage.jj4
    public final int a() {
        return this.j;
    }

    @Override // defpackage.jj4
    public final /* bridge */ /* synthetic */ boolean b(jj4 jj4Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(fj4 fj4Var) {
        pm3 pm3VarD = pm3.a.d(this.k, fj4Var.k);
        Integer numValueOf = Integer.valueOf(this.n);
        Integer numValueOf2 = Integer.valueOf(fj4Var.n);
        qn3 qn3Var = qn3.g;
        qn3 qn3Var2 = qn3.h;
        pm3 pm3VarA = pm3VarD.a(numValueOf, numValueOf2, qn3Var2);
        int i = fj4Var.o;
        int i2 = this.o;
        pm3 pm3VarB = pm3VarA.b(i2, i);
        int i3 = fj4Var.p;
        int i4 = this.p;
        pm3 pm3VarD2 = pm3VarB.b(i4, i3).a(Integer.valueOf(this.q), Integer.valueOf(fj4Var.q), qn3Var2).d(this.l, fj4Var.l);
        Boolean boolValueOf = Boolean.valueOf(this.m);
        Boolean boolValueOf2 = Boolean.valueOf(fj4Var.m);
        if (i2 != 0) {
            qn3Var = qn3Var2;
        }
        pm3 pm3VarB2 = pm3VarD2.a(boolValueOf, boolValueOf2, qn3Var).b(this.r, fj4Var.r);
        if (i4 == 0) {
            pm3VarB2 = pm3VarB2.c(this.s, fj4Var.s);
        }
        return pm3VarB2.e();
    }
}
