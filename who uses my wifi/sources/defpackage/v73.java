package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class v73 {
    public final Context a;
    public final Executor b;
    public final th2 c;
    public final s73 d;
    public final k73 e;
    public final i83 f;
    public final ea3 g;
    public final k83 h;
    public n70 i;

    public v73(Context context, Executor executor, th2 th2Var, k73 k73Var, s73 s73Var, k83 k83Var, i83 i83Var) {
        this.a = context;
        this.b = executor;
        this.c = th2Var;
        this.e = k73Var;
        this.d = s73Var;
        this.h = k83Var;
        this.f = i83Var;
        this.g = th2Var.c();
    }

    public final boolean a(pc4 pc4Var, String str, m54 m54Var, y23 y23Var) {
        da3 da3Var;
        Executor executor = this.b;
        if (str == null) {
            gi2.Z("Ad unit ID should not be null for rewarded video ad.");
            executor.execute(new bs2(20, this));
            return false;
        }
        n70 n70Var = this.i;
        if (n70Var != null && !n70Var.isDone()) {
            return false;
        }
        boolean zBooleanValue = ((Boolean) n02.c.w()).booleanValue();
        k73 k73Var = this.e;
        if (!zBooleanValue || k73Var.l() == null) {
            da3Var = null;
        } else {
            da3Var = (da3) ((ji2) k73Var.l()).g.d();
            da3Var.i(5);
            da3Var.c(pc4Var.u);
            da3Var.d(pc4Var.r);
        }
        boolean z = pc4Var.k;
        Context context = this.a;
        yc0.v(context, z);
        if (((Boolean) tw1.e.c.a(mz1.I9)).booleanValue() && z) {
            ((zw2) this.c.z.d()).b(true);
        }
        Pair pair = new Pair("api-call", Long.valueOf(pc4Var.E));
        hg4.C.k.getClass();
        Bundle bundleC = bd2.C(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
        k83 k83Var = this.h;
        k83Var.c = str;
        k83Var.b = new xe4("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
        k83Var.a = pc4Var;
        k83Var.t = bundleC;
        l83 l83VarA = k83Var.a();
        aa3 aa3VarG = aa3.g(context, qb1.N(l83VarA), 5, pc4Var);
        u73 u73Var = new u73();
        u73Var.a = l83VarA;
        n70 n70VarI = k73Var.i(new lv2((Object) u73Var, (Object) null, 5, false), new f23(27, this));
        this.i = n70VarI;
        n70VarI.c(new jq3(n70VarI, new g4(this, y23Var, da3Var, aa3VarG, u73Var, 15, false), 0), executor);
        return true;
    }

    public final yh2 b(i73 i73Var) {
        yh2 yh2Var = new yh2(this.c.b, 1);
        mm2 mm2Var = new mm2();
        mm2Var.a = this.a;
        mm2Var.b = ((u73) i73Var).a;
        mm2Var.d = this.f;
        yh2Var.f = new mm2(mm2Var);
        yh2Var.e = new fp2(new ep2());
        return yh2Var;
    }
}
