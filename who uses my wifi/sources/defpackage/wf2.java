package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wf2 extends ae2 {
    public final ke2 h;
    public z71 i;
    public ee2 j;
    public boolean k;
    public int l;

    public wf2(Context context, ke2 ke2Var) {
        super(context);
        this.l = 1;
        this.k = false;
        this.h = ke2Var;
        ke2Var.a(this);
    }

    public final boolean D() {
        int i = this.l;
        return (i == 1 || i == 2 || this.i == null) ? false : true;
    }

    public final void E(int i) {
        me2 me2Var = this.g;
        ke2 ke2Var = this.h;
        if (i == 4) {
            ke2Var.d();
            me2Var.d = true;
            me2Var.a();
        } else if (this.l == 4) {
            ke2Var.m = false;
            me2Var.d = false;
            me2Var.a();
        }
        this.l = i;
    }

    @Override // defpackage.ae2
    public final String d() {
        return "ImmersivePlayer";
    }

    @Override // defpackage.ae2
    public final void e(ee2 ee2Var) {
        this.j = ee2Var;
    }

    @Override // defpackage.ae2
    public final void f(String str) {
        if (str != null) {
            Uri.parse(str).toString();
            this.i = new z71(18);
            E(3);
            lf4.l.post(new vf2(this, 2));
        }
    }

    @Override // defpackage.ae2
    public final void g() {
        gi2.G("AdImmersivePlayerView stop");
        z71 z71Var = this.i;
        if (z71Var != null) {
            ((AtomicBoolean) z71Var.g).set(false);
            this.i = null;
            E(1);
        }
        this.h.b();
    }

    @Override // defpackage.ae2
    public final void h() {
        gi2.G("AdImmersivePlayerView play");
        if (D()) {
            ((AtomicBoolean) this.i.g).set(true);
            E(4);
            this.f.c = true;
            lf4.l.post(new vf2(this, 0));
        }
    }

    @Override // defpackage.ae2
    public final void i() {
        gi2.G("AdImmersivePlayerView pause");
        if (D() && ((AtomicBoolean) this.i.g).get()) {
            ((AtomicBoolean) this.i.g).set(false);
            E(5);
            lf4.l.post(new vf2(this, 1));
        }
    }

    @Override // defpackage.ae2
    public final int j() {
        return D() ? 0 : -1;
    }

    @Override // defpackage.ae2
    public final int k() {
        return 0;
    }

    @Override // defpackage.ae2
    public final void l(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 27);
        sb.append("AdImmersivePlayerView seek ");
        sb.append(i);
        gi2.G(sb.toString());
    }

    @Override // defpackage.le2
    public final void m() {
        if (this.i != null) {
            this.g.getClass();
        }
    }

    @Override // defpackage.ae2
    public final int o() {
        return 0;
    }

    @Override // defpackage.ae2
    public final int p() {
        return 0;
    }

    @Override // defpackage.ae2
    public final long q() {
        return 0L;
    }

    @Override // defpackage.ae2
    public final long r() {
        return 0L;
    }

    @Override // defpackage.ae2
    public final long s() {
        return 0L;
    }

    @Override // android.view.View
    public final String toString() {
        String name = wf2.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return ex0.l(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
    }

    @Override // defpackage.ae2
    public final int y() {
        return D() ? 0 : -1;
    }

    @Override // defpackage.ae2
    public final void n(float f, float f2) {
    }
}
