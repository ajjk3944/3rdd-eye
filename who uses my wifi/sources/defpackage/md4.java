package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class md4 implements zt1, rh4, kf4 {
    public final pz f;
    public final sw1 g;
    public final ez1 h;
    public final bu1 i;
    public final SparseArray j;
    public mu2 k;
    public f74 l;
    public d13 m;
    public boolean n;

    public md4(pz pzVar) {
        pzVar.getClass();
        this.f = pzVar;
        String str = v23.a;
        Looper looperMyLooper = Looper.myLooper();
        this.k = new mu2(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, pzVar, id4.g);
        sw1 sw1Var = new sw1();
        this.g = sw1Var;
        this.h = new ez1();
        this.i = new bu1(sw1Var);
        this.j = new SparseArray();
    }

    public final void A(mc4 mc4Var, Looper looper) {
        boolean z = true;
        if (this.l != null && !((xm3) this.i.h).isEmpty()) {
            z = false;
        }
        zt0.b0(z);
        mc4Var.getClass();
        this.l = mc4Var;
        this.m = this.f.p(looper, null);
        mu2 mu2Var = this.k;
        this.k = new mu2((CopyOnWriteArraySet) mu2Var.f, looper, (pz) mu2Var.c, new lv2(this, mc4Var, 15), mu2Var.b);
    }

    @Override // defpackage.zt1
    public final void B(int i) {
        ad4 ad4VarT = t();
        s(ad4VarT, 4, new h80(ad4VarT, i));
    }

    @Override // defpackage.zt1
    public final void E() {
        s(y(), 22, new y24(21));
    }

    @Override // defpackage.zt1
    public final void F(t82 t82Var) {
        ad4 ad4VarY = y();
        s(ad4VarY, 25, new k34(ad4VarY, t82Var));
    }

    @Override // defpackage.zt1
    public final void G(b84 b84Var) {
        kh4 kh4Var;
        ad4 ad4VarT = (b84Var == null || (kh4Var = b84Var.m) == null) ? t() : x(kh4Var);
        s(ad4VarT, 10, new il3(ad4VarT, b84Var));
    }

    @Override // defpackage.zt1
    public final void H(b84 b84Var) {
        kh4 kh4Var;
        s((b84Var == null || (kh4Var = b84Var.m) == null) ? t() : x(kh4Var), 10, new hd4(3));
    }

    @Override // defpackage.zt1
    public final void I(xu1 xu1Var, xu1 xu1Var2, int i) {
        if (i == 1) {
            this.n = false;
            i = 1;
        }
        f74 f74Var = this.l;
        f74Var.getClass();
        bu1 bu1Var = this.i;
        bu1Var.j = bu1.D(f74Var, (xm3) bu1Var.h, (kh4) bu1Var.k, (sw1) bu1Var.g);
        ad4 ad4VarT = t();
        s(ad4VarT, 11, new h80(ad4VarT, i, xu1Var, xu1Var2));
    }

    @Override // defpackage.zt1
    public final void b() {
        s(t(), 14, new hd4(4));
    }

    @Override // defpackage.zt1
    public final void c() {
        s(t(), 3, new y24(29));
    }

    @Override // defpackage.zt1
    public final void d() {
        f74 f74Var = this.l;
        f74Var.getClass();
        bu1 bu1Var = this.i;
        bu1Var.j = bu1.D(f74Var, (xm3) bu1Var.h, (kh4) bu1Var.k, (sw1) bu1Var.g);
        bu1Var.B(f74Var.K1());
        s(t(), 0, new t24(28, (byte) 0));
    }

    @Override // defpackage.zt1
    public final void e() {
        s(t(), 13, new hd4(0));
    }

    @Override // defpackage.zt1
    public final void f() {
        s(t(), -1, new id4(0));
    }

    @Override // defpackage.zt1
    public final void g() {
        s(t(), 5, new hd4(1));
    }

    @Override // defpackage.zt1
    public final void h() {
        s(t(), 1, new y24(28));
    }

    @Override // defpackage.zt1
    public final void i() {
        s(t(), 7, new id4(2));
    }

    @Override // defpackage.rh4
    public final void j(int i, kh4 kh4Var, ch4 ch4Var, hh4 hh4Var) {
        s(z(i, kh4Var), 1002, new t24(27, (byte) 0));
    }

    @Override // defpackage.zt1
    public final void k() {
        s(t(), 6, new hd4(2));
    }

    @Override // defpackage.zt1
    public final void l() {
        s(t(), 2, new t24(29, (byte) 0));
    }

    @Override // defpackage.zt1
    public final void m() {
        s(y(), 21, new hd4(5));
    }

    @Override // defpackage.rh4
    public final void n(int i, kh4 kh4Var, ch4 ch4Var, hh4 hh4Var, int i2) {
        s(z(i, kh4Var), 1000, new t24(26, (byte) 0));
    }

    @Override // defpackage.rh4
    public final void o(int i, kh4 kh4Var, ch4 ch4Var, hh4 hh4Var, IOException iOException, boolean z) {
        ad4 ad4VarZ = z(i, kh4Var);
        s(ad4VarZ, 1003, new ci3(ad4VarZ, ch4Var, hh4Var, iOException, z));
    }

    @Override // defpackage.rh4
    public final void p(int i, kh4 kh4Var, hh4 hh4Var) {
        ad4 ad4VarZ = z(i, kh4Var);
        s(ad4VarZ, 1004, new mr2(ad4VarZ, hh4Var, 18, false));
    }

    @Override // defpackage.zt1
    public final void q() {
        s(t(), 12, new id4(3));
    }

    @Override // defpackage.rh4
    public final void r(int i, kh4 kh4Var, ch4 ch4Var, hh4 hh4Var) {
        s(z(i, kh4Var), 1001, new y24(26));
    }

    public final void s(ad4 ad4Var, int i, ks2 ks2Var) {
        this.j.put(i, ad4Var);
        mu2 mu2Var = this.k;
        mu2Var.c(i, ks2Var);
        mu2Var.d();
    }

    public final ad4 t() {
        return x((kh4) this.i.j);
    }

    @Override // defpackage.zt1
    public final void u() {
        s(y(), 23, new id4(4));
    }

    @Override // defpackage.zt1
    public final void v() {
        s(y(), 24, new y24(25));
    }

    public final ad4 w(oz1 oz1Var, int i, kh4 kh4Var) {
        kh4 kh4Var2 = true == oz1Var.g() ? null : kh4Var;
        this.f.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        if (oz1Var.equals(this.l.K1()) && i == this.l.O1()) {
            z = true;
        }
        long jQ = 0;
        if (kh4Var2 == null || !kh4Var2.b()) {
            if (z) {
                jQ = this.l.o1();
            } else if (!oz1Var.g()) {
                oz1Var.b(i, this.h, 0L).getClass();
                jQ = v23.q(0L);
            }
        } else if (z && this.l.d() == kh4Var2.b && this.l.T1() == kh4Var2.c) {
            jQ = this.l.Q1();
        }
        return new ad4(jElapsedRealtime, oz1Var, i, kh4Var2, jQ, this.l.K1(), this.l.O1(), (kh4) this.i.j, this.l.Q1(), this.l.R1());
    }

    public final ad4 x(kh4 kh4Var) {
        this.l.getClass();
        oz1 oz1Var = kh4Var == null ? null : (oz1) ((xn3) this.i.i).get(kh4Var);
        if (kh4Var != null && oz1Var != null) {
            return w(oz1Var, oz1Var.o(kh4Var.a, this.g).c, kh4Var);
        }
        int iO1 = this.l.O1();
        oz1 oz1VarK1 = this.l.K1();
        if (iO1 >= oz1VarK1.a()) {
            oz1VarK1 = oz1.a;
        }
        return w(oz1VarK1, iO1, null);
    }

    public final ad4 y() {
        return x((kh4) this.i.l);
    }

    public final ad4 z(int i, kh4 kh4Var) {
        f74 f74Var = this.l;
        f74Var.getClass();
        if (kh4Var != null) {
            return ((oz1) ((xn3) this.i.i).get(kh4Var)) != null ? x(kh4Var) : w(oz1.a, i, kh4Var);
        }
        oz1 oz1VarK1 = f74Var.K1();
        if (i >= oz1VarK1.a()) {
            oz1VarK1 = oz1.a;
        }
        return w(oz1VarK1, i, null);
    }

    @Override // defpackage.zt1
    public final void a() {
    }
}
