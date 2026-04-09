package defpackage;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vg4 implements rh4, kf4 {
    public final Object f;
    public wt2 g;
    public lv2 h;
    public final /* synthetic */ xg4 i;

    public vg4(xg4 xg4Var, Object obj) {
        this.i = xg4Var;
        Object obj2 = null;
        this.g = new wt2((CopyOnWriteArrayList) xg4Var.c.h, obj2, 14);
        this.h = new lv2(xg4Var.d.h, obj2, 18, false);
        this.f = obj;
    }

    public final boolean a(kh4 kh4Var) {
        kh4 kh4VarV;
        Object obj = this.f;
        xg4 xg4Var = this.i;
        if (kh4Var != null) {
            kh4VarV = xg4Var.v(obj, kh4Var);
            if (kh4VarV == null) {
                return false;
            }
        } else {
            kh4VarV = null;
        }
        xg4Var.u(obj);
        wt2 wt2Var = this.g;
        wt2Var.getClass();
        if (!Objects.equals((kh4) wt2Var.g, kh4VarV)) {
            this.g = new wt2((CopyOnWriteArrayList) xg4Var.c.h, kh4VarV, 14);
        }
        lv2 lv2Var = this.h;
        lv2Var.getClass();
        if (Objects.equals((kh4) lv2Var.g, kh4VarV)) {
            return true;
        }
        this.h = new lv2(xg4Var.d.h, (Object) kh4VarV, 18, false);
        return true;
    }

    public final void b(hh4 hh4Var, kh4 kh4Var) {
        long j = hh4Var.c;
        xg4 xg4Var = this.i;
        Object obj = this.f;
        xg4Var.w(j, obj);
        xg4Var.w(hh4Var.d, obj);
    }

    @Override // defpackage.rh4
    public final void j(int i, kh4 kh4Var, ch4 ch4Var, hh4 hh4Var) {
        if (a(kh4Var)) {
            wt2 wt2Var = this.g;
            b(hh4Var, kh4Var);
            wt2Var.getClass();
            wt2Var.n(new jr3(wt2Var, ch4Var, hh4Var, 9));
        }
    }

    @Override // defpackage.rh4
    public final void n(int i, kh4 kh4Var, ch4 ch4Var, hh4 hh4Var, int i2) {
        if (a(kh4Var)) {
            wt2 wt2Var = this.g;
            b(hh4Var, kh4Var);
            wt2Var.getClass();
            wt2Var.n(new r2(wt2Var, ch4Var, hh4Var, i2, 7));
        }
    }

    @Override // defpackage.rh4
    public final void o(int i, kh4 kh4Var, ch4 ch4Var, hh4 hh4Var, IOException iOException, boolean z) {
        if (a(kh4Var)) {
            wt2 wt2Var = this.g;
            b(hh4Var, kh4Var);
            wt2Var.getClass();
            wt2Var.n(new de3(wt2Var, ch4Var, hh4Var, iOException, z));
        }
    }

    @Override // defpackage.rh4
    public final void p(int i, kh4 kh4Var, hh4 hh4Var) {
        if (a(kh4Var)) {
            wt2 wt2Var = this.g;
            b(hh4Var, kh4Var);
            wt2Var.getClass();
            wt2Var.n(new lv2(wt2Var, hh4Var, 19));
        }
    }

    @Override // defpackage.rh4
    public final void r(int i, kh4 kh4Var, ch4 ch4Var, hh4 hh4Var) {
        if (a(kh4Var)) {
            wt2 wt2Var = this.g;
            b(hh4Var, kh4Var);
            wt2Var.getClass();
            wt2Var.n(new pb3(wt2Var, ch4Var, hh4Var, 10));
        }
    }
}
