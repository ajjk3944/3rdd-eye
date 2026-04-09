package defpackage;

import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class z42 {
    public final zs1 a;
    public final Executor b;
    public final AtomicReference c = new AtomicReference();
    public final AtomicReference d = new AtomicReference();

    public z42(zs1 zs1Var, Executor executor) {
        this.a = zs1Var;
        this.b = executor;
    }

    public final void a() {
        z52 z52Var = (z52) this.c.get();
        if (z52Var == null) {
            Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        f20 f20Var = (f20) this.a.mo18a();
        f20Var.getClass();
        gi1 gi1Var = (gi1) f20Var.g;
        ls2 ls2VarB = ls2.b(new vg0(16, (ax0) gi1Var.g));
        ax0 ax0Var = new ax0(z52Var);
        zs1 zs1Var = new zs1(20, false);
        ax0 ax0Var2 = (ax0) gi1Var.g;
        ls2 ls2Var = (ls2) gi1Var.k;
        xn1 xn1Var = (xn1) gi1Var.m;
        ls2 ls2Var2 = (ls2) gi1Var.h;
        ls2 ls2VarB2 = ls2.b(new bu1(ax0Var2, (ls2) gi1Var.i, ls2VarB, ls2Var2, ax0Var, new vq2(ls2VarB, new bu1(ax0Var2, ls2VarB, ls2Var, xn1Var, zs1Var, ls2Var2, 5), 25), 3));
        if (((ls2) zs1Var.g) != null) {
            throw new IllegalStateException();
        }
        zs1Var.g = ls2VarB2;
        bw1 bw1Var = (bw1) zs1Var.mo18a();
        bw1Var.l = true;
        ok2.a.post(new jq3(this, bw1Var, 27));
    }
}
