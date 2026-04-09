package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Comparator;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yi4 extends jj4 implements Comparable {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final int j;
    public final boolean k;
    public final String l;
    public final dj4 m;
    public final boolean n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final boolean s;
    public final int t;
    public final int u;
    public final boolean v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public yi4(int i, d02 d02Var, int i2, dj4 dj4Var, int i3, boolean z, zi4 zi4Var) {
        int i4;
        int iD;
        int iHashCode;
        int iD2;
        boolean z2;
        super(i, d02Var, i2);
        this.m = dj4Var;
        boolean z3 = dj4Var.z;
        xm3 xm3Var = dj4Var.p;
        xm3 xm3Var2 = dj4Var.l;
        int i5 = 1;
        int i6 = true != z3 ? 16 : 24;
        this.l = lj4.c(this.i.d);
        this.n = kg4.I(i3, false);
        int i7 = 0;
        while (true) {
            i4 = Integer.MAX_VALUE;
            if (i7 >= xm3Var2.size()) {
                iD = 0;
                i7 = Integer.MAX_VALUE;
                break;
            } else {
                iD = lj4.d(this.i, (String) xm3Var2.get(i7), false);
                if (iD > 0) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        this.p = i7;
        this.o = iD;
        int i8 = this.i.f;
        this.q = (i8 == 0 || i8 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        this.r = lj4.e(this.i, dj4Var.m);
        ph4 ph4Var = this.i;
        int i9 = ph4Var.f;
        this.s = i9 == 0 || (i9 & 1) != 0;
        this.v = 1 == (ph4Var.e & 1);
        String str = ph4Var.m;
        this.C = str != null && ((iHashCode = str.hashCode()) == -2123537834 ? str.equals("audio/eac3-joc") : !(iHashCode == 187078297 ? !str.equals("audio/ac4") : !(iHashCode == 1504698186 && str.equals("audio/iamf"))));
        int i10 = ph4Var.E;
        this.w = i10;
        this.x = ph4Var.F;
        int i11 = ph4Var.i;
        this.y = i11;
        this.k = (i11 == -1 || i11 <= dj4Var.o) && (i10 == -1 || i10 <= dj4Var.n) && zi4Var.c(ph4Var);
        String str2 = v23.a;
        String[] strArrSplit = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        for (int i12 = 0; i12 < strArrSplit.length; i12++) {
            strArrSplit[i12] = v23.n(strArrSplit[i12]);
        }
        int i13 = 0;
        while (true) {
            if (i13 >= strArrSplit.length) {
                iD2 = 0;
                i13 = Integer.MAX_VALUE;
                break;
            } else {
                iD2 = lj4.d(this.i, strArrSplit[i13], false);
                if (iD2 > 0) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        this.t = i13;
        this.u = iD2;
        int i14 = 0;
        while (true) {
            if (i14 >= xm3Var.size()) {
                break;
            }
            String str3 = this.i.m;
            if (str3 != null && str3.equals(xm3Var.get(i14))) {
                i4 = i14;
                break;
            }
            i14++;
        }
        this.z = i4;
        this.A = (i3 & 384) == 128;
        this.B = (i3 & 64) == 64;
        dj4 dj4Var2 = this.m;
        if (kg4.I(i3, dj4Var2.B) && ((z2 = this.k) || dj4Var2.y)) {
            dj4Var2.q.getClass();
            if (kg4.I(i3, false) && z2 && this.i.i != -1 && ((dj4Var2.C || !z) && (i6 & i3) != 0)) {
                i5 = 2;
            }
        } else {
            i5 = 0;
        }
        this.j = i5;
    }

    @Override // defpackage.jj4
    public final int a() {
        return this.j;
    }

    @Override // defpackage.jj4
    public final /* bridge */ /* synthetic */ boolean b(jj4 jj4Var) {
        String str;
        int i;
        yi4 yi4Var = (yi4) jj4Var;
        this.m.getClass();
        ph4 ph4Var = this.i;
        int i2 = ph4Var.E;
        if (i2 == -1) {
            return false;
        }
        ph4 ph4Var2 = yi4Var.i;
        return i2 == ph4Var2.E && (str = ph4Var.m) != null && TextUtils.equals(str, ph4Var2.m) && (i = ph4Var.F) != -1 && i == ph4Var2.F && this.A == yi4Var.A && this.B == yi4Var.B;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(yi4 yi4Var) {
        boolean z = this.n;
        boolean z2 = this.k;
        Comparator zn3Var = (z2 && z) ? lj4.k : new zn3();
        pm3 pm3VarD = pm3.a.d(z, yi4Var.n);
        Integer numValueOf = Integer.valueOf(this.p);
        Integer numValueOf2 = Integer.valueOf(yi4Var.p);
        qn3 qn3Var = qn3.h;
        pm3 pm3VarA = pm3VarD.a(numValueOf, numValueOf2, qn3Var).b(this.o, yi4Var.o).b(this.q, yi4Var.q).a(Integer.valueOf(this.r), Integer.valueOf(yi4Var.r), qn3Var).d(this.v, yi4Var.v).d(this.s, yi4Var.s).a(Integer.valueOf(this.t), Integer.valueOf(yi4Var.t), qn3Var).b(this.u, yi4Var.u).d(z2, yi4Var.k).a(Integer.valueOf(this.z), Integer.valueOf(yi4Var.z), qn3Var);
        this.m.getClass();
        pm3 pm3VarA2 = pm3VarA.d(this.A, yi4Var.A).d(this.B, yi4Var.B).d(this.C, yi4Var.C).a(Integer.valueOf(this.w), Integer.valueOf(yi4Var.w), zn3Var).a(Integer.valueOf(this.x), Integer.valueOf(yi4Var.x), zn3Var);
        if (Objects.equals(this.l, yi4Var.l)) {
            pm3VarA2 = pm3VarA2.a(Integer.valueOf(this.y), Integer.valueOf(yi4Var.y), zn3Var);
        }
        return pm3VarA2.e();
    }
}
