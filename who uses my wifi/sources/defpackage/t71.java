package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class t71 {
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public Object e;
    public Object f;

    public static boolean l(kg4 kg4Var) {
        return kg4Var.m != 0;
    }

    public static final void n(kg4 kg4Var) {
        int i = kg4Var.m;
        if (i == 2) {
            zt0.b0(i == 2);
            kg4Var.m = 1;
            kg4Var.h();
        }
    }

    public boolean A(pb4 pb4Var) {
        return h(pb4Var, (kg4) this.e) && h(pb4Var, (kg4) this.f);
    }

    public void B(long j, long j2) {
        kg4 kg4Var = (kg4) this.e;
        if (l(kg4Var)) {
            kg4Var.s(j, j2);
        }
        kg4 kg4Var2 = (kg4) this.f;
        if (kg4Var2 == null || kg4Var2.m == 0) {
            return;
        }
        kg4Var2.s(j, j2);
    }

    public boolean C(pb4 pb4Var) {
        kg4 kg4VarM = m(pb4Var);
        return kg4VarM == null || kg4VarM.n0() || kg4VarM.t() || kg4VarM.u();
    }

    public void D() {
        int i;
        kg4 kg4Var = (kg4) this.e;
        int i2 = kg4Var.m;
        if (i2 == 1 && this.b != 4) {
            zt0.b0(i2 == 1);
            kg4Var.m = 2;
            kg4Var.d();
            return;
        }
        kg4 kg4Var2 = (kg4) this.f;
        if (kg4Var2 == null || (i = kg4Var2.m) != 1 || this.b == 3) {
            return;
        }
        zt0.b0(i == 1);
        kg4Var2.m = 2;
        kg4Var2.d();
    }

    public void a() {
        int i = this.b;
        if (i != 3 && i != 4) {
            if (i == 2) {
                this.b = 0;
                return;
            }
            return;
        }
        boolean z = i == 4;
        kg4 kg4Var = (kg4) this.e;
        kg4 kg4Var2 = (kg4) this.f;
        if (z) {
            kg4Var2.getClass();
            kg4Var2.a(17, kg4Var);
        } else {
            kg4Var2.getClass();
            kg4Var.a(17, kg4Var2);
        }
        this.b = this.b != 4 ? 1 : 0;
    }

    public void b() {
        if (!l((kg4) this.e)) {
            j(true);
        }
        kg4 kg4Var = (kg4) this.f;
        if (kg4Var == null || kg4Var.m != 0) {
            return;
        }
        j(false);
    }

    public int c(pb4 pb4Var, pj4 pj4Var, g53 g53Var) {
        int iK = k((kg4) this.e, pb4Var, pj4Var, g53Var);
        return iK == 1 ? k((kg4) this.f, pb4Var, pj4Var, g53Var) : iK;
    }

    public void d() {
        kg4 kg4Var = (kg4) this.e;
        zt0.b0(kg4Var.m == 0);
        kg4Var.k();
        this.c = false;
        kg4 kg4Var2 = (kg4) this.f;
        if (kg4Var2 != null) {
            zt0.b0(kg4Var2.m == 0);
            kg4Var2.k();
            this.d = false;
        }
    }

    public void e(Object obj) {
        kg4 kg4Var = (kg4) this.e;
        if (kg4Var.g != 2) {
            return;
        }
        int i = this.b;
        if (i != 4 && i != 1) {
            kg4Var.a(1, obj);
            return;
        }
        kg4 kg4Var2 = (kg4) this.f;
        kg4Var2.getClass();
        kg4Var2.a(1, obj);
    }

    public void f(be1 be1Var) {
        kg4 kg4Var = (kg4) this.e;
        if (kg4Var.g == 2) {
            kg4Var.a(7, be1Var);
            kg4 kg4Var2 = (kg4) this.f;
            if (kg4Var2 != null) {
                kg4Var2.a(7, be1Var);
            }
        }
    }

    public boolean g() {
        int i = this.b;
        if (i == 0 || i == 2 || i == 4) {
            return l((kg4) this.e);
        }
        kg4 kg4Var = (kg4) this.f;
        kg4Var.getClass();
        return kg4Var.m != 0;
    }

    public boolean h(pb4 pb4Var, kg4 kg4Var) {
        if (kg4Var == null) {
            return true;
        }
        li4[] li4VarArr = pb4Var.c;
        int i = this.a;
        li4 li4Var = li4VarArr[i];
        li4 li4Var2 = kg4Var.n;
        if (li4Var2 == null) {
            return true;
        }
        if (li4Var2 == li4Var && (li4Var == null || kg4Var.n0())) {
            return true;
        }
        pb4 pb4Var2 = pb4Var.m;
        return pb4Var2 != null && pb4Var2.c[i] == kg4Var.n;
    }

    public void i(kg4 kg4Var, g53 g53Var) {
        zt0.b0(((kg4) this.e) == kg4Var || ((kg4) this.f) == kg4Var);
        if (l(kg4Var)) {
            if (kg4Var == ((kg4) g53Var.j)) {
                g53Var.k = null;
                g53Var.j = null;
                g53Var.f = true;
            }
            n(kg4Var);
            zt0.b0(kg4Var.m == 1);
            mr2 mr2Var = kg4Var.h;
            mr2Var.g = null;
            mr2Var.h = null;
            kg4Var.m = 0;
            kg4Var.n = null;
            kg4Var.o = null;
            kg4Var.s = false;
            kg4Var.i();
            kg4Var.v = null;
        }
    }

    public void j(boolean z) {
        if (z) {
            if (this.c) {
                kg4 kg4Var = (kg4) this.e;
                zt0.b0(kg4Var.m == 0);
                mr2 mr2Var = kg4Var.h;
                mr2Var.g = null;
                mr2Var.h = null;
                kg4Var.j();
                this.c = false;
                return;
            }
            return;
        }
        if (this.d) {
            kg4 kg4Var2 = (kg4) this.f;
            kg4Var2.getClass();
            zt0.b0(kg4Var2.m == 0);
            mr2 mr2Var2 = kg4Var2.h;
            mr2Var2.g = null;
            mr2Var2.h = null;
            kg4Var2.j();
            this.d = false;
        }
    }

    public int k(kg4 kg4Var, pb4 pb4Var, pj4 pj4Var, g53 g53Var) {
        int i;
        if (kg4Var != null && kg4Var.m != 0) {
            kg4 kg4Var2 = (kg4) this.e;
            boolean z = kg4Var != kg4Var2;
            if (kg4Var == kg4Var2 && ((i = this.b) == 2 || i == 4)) {
                return 1;
            }
            if (kg4Var == ((kg4) this.f) && this.b == 3) {
                return 1;
            }
            li4 li4Var = kg4Var.n;
            li4[] li4VarArr = pb4Var.c;
            int i2 = this.a;
            li4 li4Var2 = li4VarArr[i2];
            boolean zA = pj4Var.a(i2);
            if (!zA || li4Var != li4Var2) {
                if (!kg4Var.s) {
                    nj4 nj4Var = ((nj4[]) pj4Var.h)[i2];
                    int iB = nj4Var != null ? nj4Var.b() : 0;
                    ph4[] ph4VarArr = new ph4[iB];
                    for (int i3 = 0; i3 < iB; i3++) {
                        nj4Var.getClass();
                        ph4VarArr[i3] = nj4Var.c(i3);
                    }
                    li4 li4Var3 = li4VarArr[i2];
                    li4Var3.getClass();
                    kg4Var.l0(ph4VarArr, li4Var3, pb4Var.a(), pb4Var.p, pb4Var.g.a);
                    return 3;
                }
                if (!kg4Var.u()) {
                    return 0;
                }
                i(kg4Var, g53Var);
                if (!zA || q()) {
                    j(!z);
                    return 1;
                }
            }
        }
        return 1;
    }

    public kg4 m(pb4 pb4Var) {
        if (pb4Var != null) {
            li4 li4Var = pb4Var.c[this.a];
            if (li4Var != null) {
                kg4 kg4Var = (kg4) this.e;
                if (kg4Var.n == li4Var) {
                    return kg4Var;
                }
                kg4 kg4Var2 = (kg4) this.f;
                if (kg4Var2 != null && kg4Var2.n == li4Var) {
                    return kg4Var2;
                }
            }
        }
        return null;
    }

    public boolean o() {
        return ((kg4) this.f) != null;
    }

    public void p() {
        int i;
        zt0.b0(!q());
        if (l((kg4) this.e)) {
            i = 3;
        } else {
            kg4 kg4Var = (kg4) this.f;
            i = (kg4Var == null || kg4Var.m == 0) ? 2 : 4;
        }
        this.b = i;
    }

    public boolean q() {
        int i = this.b;
        return i == 2 || i == 4 || i == 3;
    }

    public int r() {
        kg4 kg4Var = (kg4) this.f;
        boolean zL = l((kg4) this.e);
        int i = 0;
        if (kg4Var != null && kg4Var.m != 0) {
            i = 1;
        }
        return (zL ? 1 : 0) + i;
    }

    public void s() {
        int i = ((kg4) this.e).g;
    }

    public boolean t(pb4 pb4Var) {
        kg4 kg4VarM = m(pb4Var);
        kg4VarM.getClass();
        return kg4VarM.n0();
    }

    public void u(pb4 pb4Var) {
        kg4 kg4VarM = m(pb4Var);
        kg4VarM.getClass();
        kg4VarM.s = true;
    }

    public void v(pj4 pj4Var, pj4 pj4Var2) {
        int i;
        kg4 kg4Var = (kg4) this.e;
        int i2 = this.a;
        boolean zA = pj4Var.a(i2);
        boolean zA2 = pj4Var2.a(i2);
        kg4 kg4Var2 = (kg4) this.f;
        if (kg4Var2 == null || (i = this.b) == 3 || (i == 0 && l(kg4Var))) {
            kg4Var2 = kg4Var;
        }
        if (!zA || kg4Var2.s) {
            return;
        }
        int i3 = kg4Var.g;
        jc4 jc4Var = ((jc4[]) pj4Var.g)[i2];
        jc4 jc4Var2 = ((jc4[]) pj4Var2.g)[i2];
        if (zA2 && Objects.equals(jc4Var2, jc4Var) && !q()) {
            return;
        }
        kg4Var2.s = true;
    }

    public void w() {
        int i;
        kg4 kg4Var = (kg4) this.e;
        if (l(kg4Var) && (i = this.b) != 4 && i != 2) {
            kg4Var.s = true;
        }
        kg4 kg4Var2 = (kg4) this.f;
        if (kg4Var2 == null || kg4Var2.m == 0 || this.b == 3) {
            return;
        }
        kg4Var2.s = true;
    }

    public void x() {
        kg4 kg4Var = (kg4) this.e;
        if (l(kg4Var)) {
            kg4Var.r();
            return;
        }
        kg4 kg4Var2 = (kg4) this.f;
        if (kg4Var2 == null || kg4Var2.m == 0) {
            return;
        }
        kg4Var2.r();
    }

    public boolean y() {
        kg4 kg4Var = (kg4) this.e;
        boolean zU = l(kg4Var) ? kg4Var.u() : true;
        kg4 kg4Var2 = (kg4) this.f;
        return (kg4Var2 == null || kg4Var2.m == 0) ? zU : zU & kg4Var2.u();
    }

    public boolean z(pb4 pb4Var) {
        int i = this.b;
        return ((i == 2 || i == 4) && m(pb4Var) == ((kg4) this.e)) || (this.b == 3 && m(pb4Var) == ((kg4) this.f));
    }
}
