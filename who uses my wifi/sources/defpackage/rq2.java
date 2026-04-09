package defpackage;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rq2 implements rn2, ye4, dn2 {
    public final Context f;
    public final ag2 g;
    public final a83 h;
    public final e51 i;
    public final wz2 j;
    public xz2 k;

    public rq2(Context context, ag2 ag2Var, a83 a83Var, e51 e51Var, wz2 wz2Var) {
        this.f = context;
        this.g = ag2Var;
        this.h = a83Var;
        this.i = e51Var;
        this.j = wz2Var;
    }

    @Override // defpackage.dn2
    public final void D0() {
        ag2 ag2Var;
        if (a()) {
            this.j.c();
        } else {
            if (this.k == null || (ag2Var = this.g) == null) {
                return;
            }
            if (((Boolean) tw1.e.c.a(mz1.M5)).booleanValue()) {
                ag2Var.a("onSdkImpression", new s8(0));
            }
        }
    }

    @Override // defpackage.ye4
    public final void G1(int i) {
        this.k = null;
    }

    public final boolean a() {
        cc3 cc3Var;
        if (!((Boolean) tw1.e.c.a(mz1.J5)).booleanValue()) {
            return false;
        }
        wz2 wz2Var = this.j;
        synchronized (wz2Var) {
            cc3Var = wz2Var.f;
        }
        return cc3Var != null;
    }

    @Override // defpackage.rn2
    public final void e() {
        ag2 ag2Var;
        a83 a83Var = this.h;
        if (!a83Var.T || (ag2Var = this.g) == null) {
            return;
        }
        hg4 hg4Var = hg4.C;
        su2 su2Var = hg4Var.x;
        su2 su2Var2 = hg4Var.x;
        su2Var.getClass();
        if (su2.d(this.f)) {
            if (a()) {
                this.j.b();
                return;
            }
            e51 e51Var = this.i;
            int i = e51Var.g;
            int i2 = e51Var.h;
            int i3 = 1;
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length());
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            String string = sb.toString();
            ug0 ug0Var = a83Var.V;
            String str = ug0Var.A() + (-1) != 1 ? "javascript" : null;
            int i4 = 2;
            if (ug0Var.A() == 1) {
                i3 = 3;
            } else {
                i4 = a83Var.Y == 2 ? 4 : 1;
            }
            int i5 = i4;
            int i6 = i3;
            String str2 = a83Var.l0;
            WebView webViewT = ag2Var.t();
            su2Var2.getClass();
            xz2 xz2VarI = su2.i(i5, i6, webViewT, string, str, str2);
            this.k = xz2VarI;
            if (xz2VarI != null) {
                xb3 xb3Var = xz2VarI.a;
                if (((Boolean) tw1.e.c.a(mz1.I5)).booleanValue()) {
                    WebView webViewT2 = ag2Var.t();
                    su2Var2.getClass();
                    su2.k(xb3Var, webViewT2);
                    ArrayList arrayListA = ag2Var.A();
                    int size = arrayListA.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayListA.get(i7);
                        i7++;
                        hg4.C.x.getClass();
                        su2.t(new rz2(xb3Var, (View) obj, 0));
                    }
                } else {
                    View viewP0 = ag2Var.p0();
                    su2Var2.getClass();
                    su2.k(xb3Var, viewP0);
                }
                ag2Var.m0(this.k);
                hg4.C.x.getClass();
                su2.j(xb3Var);
                ag2Var.a("onSdkLoaded", new s8(0));
            }
        }
    }

    @Override // defpackage.ye4
    public final void f() {
        ag2 ag2Var;
        if (((Boolean) tw1.e.c.a(mz1.M5)).booleanValue() || (ag2Var = this.g) == null) {
            return;
        }
        if (this.k != null || a()) {
            if (this.k != null) {
                ag2Var.a("onSdkImpression", new s8(0));
            } else {
                this.j.c();
            }
        }
    }

    @Override // defpackage.ye4
    public final void B1() {
    }

    @Override // defpackage.ye4
    public final void E1() {
    }

    @Override // defpackage.ye4
    public final void M1() {
    }

    @Override // defpackage.ye4
    public final void R2() {
    }

    @Override // defpackage.ye4
    public final void U() {
    }

    @Override // defpackage.ye4
    public final void Y() {
    }

    @Override // defpackage.ye4
    public final void f3() {
    }

    @Override // defpackage.ye4
    public final void h3() {
    }

    @Override // defpackage.ye4
    public final void m2() {
    }
}
