package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class q73 {
    public final Context a;
    public final Executor b;
    public final th2 c;
    public final s23 d;
    public final s73 e;
    public vz1 f;
    public final ea3 g;
    public final k83 h;
    public q93 i;

    public q73(Context context, Executor executor, th2 th2Var, s23 s23Var, s73 s73Var, k83 k83Var) {
        this.a = context;
        this.b = executor;
        this.c = th2Var;
        this.d = s23Var;
        this.h = k83Var;
        this.e = s73Var;
        this.g = th2Var.c();
    }

    public final boolean a(pc4 pc4Var, String str, m54 m54Var, y23 y23Var) {
        ei2 ei2Var;
        da3 da3Var;
        Executor executor = this.b;
        if (str == null) {
            gi2.Z("Ad unit ID should not be null for interstitial ad.");
            executor.execute(new bs2(18, this));
            return false;
        }
        if (b()) {
            return false;
        }
        iz1 iz1Var = mz1.I9;
        tw1 tw1Var = tw1.e;
        boolean zBooleanValue = ((Boolean) tw1Var.c.a(iz1Var)).booleanValue();
        th2 th2Var = this.c;
        if (zBooleanValue && pc4Var.k) {
            ((zw2) th2Var.z.d()).b(true);
        }
        xe4 xe4Var = ((n73) m54Var).g;
        Pair pair = new Pair("api-call", Long.valueOf(pc4Var.E));
        hg4.C.k.getClass();
        Bundle bundleC = bd2.C(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
        k83 k83Var = this.h;
        k83Var.c = str;
        k83Var.b = xe4Var;
        k83Var.a = pc4Var;
        k83Var.t = bundleC;
        l83 l83VarA = k83Var.a();
        int iN = qb1.N(l83VarA);
        Context context = this.a;
        aa3 aa3VarG = aa3.g(context, iN, 4, pc4Var);
        boolean zBooleanValue2 = ((Boolean) tw1Var.c.a(mz1.Q8)).booleanValue();
        s23 s23Var = this.d;
        if (zBooleanValue2) {
            th2 th2Var2 = th2Var.b;
            mm2 mm2Var = new mm2();
            mm2Var.a = context;
            mm2Var.b = l83VarA;
            mm2 mm2Var2 = new mm2(mm2Var);
            ep2 ep2Var = new ep2();
            ep2Var.d(s23Var, executor);
            ep2Var.b(s23Var, executor);
            ei2Var = new ei2(th2Var2, new tv2(0, (byte) 0), new fp2(ep2Var), mm2Var2, new f23(25), new f23(0, this.f), null, null);
        } else {
            ep2 ep2Var2 = new ep2();
            HashSet hashSet = (HashSet) ep2Var2.h;
            HashSet hashSet2 = (HashSet) ep2Var2.e;
            s73 s73Var = this.e;
            if (s73Var != null) {
                hashSet2.add(new up2(s73Var, executor));
                hashSet.add(new up2(s73Var, executor));
                ep2Var2.a(s73Var, executor);
            }
            th2 th2Var3 = th2Var.b;
            mm2 mm2Var3 = new mm2();
            mm2Var3.a = context;
            mm2Var3.b = l83VarA;
            mm2 mm2Var4 = new mm2(mm2Var3);
            ep2Var2.d(s23Var, executor);
            hashSet2.add(new up2(s23Var, executor));
            hashSet.add(new up2(s23Var, executor));
            ep2Var2.a(s23Var, executor);
            ((HashSet) ep2Var2.c).add(new up2(s23Var, executor));
            ep2Var2.c(s23Var, executor);
            ep2Var2.b(s23Var, executor);
            ((HashSet) ep2Var2.m).add(new up2(s23Var, executor));
            ((HashSet) ep2Var2.l).add(new up2(s23Var, executor));
            ei2Var = new ei2(th2Var3, new tv2(0, (byte) 0), new fp2(ep2Var2), mm2Var4, new f23(25), new f23(0, this.f), null, null);
        }
        if (((Boolean) n02.c.w()).booleanValue()) {
            da3Var = (da3) ei2Var.h.d();
            da3Var.i(4);
            da3Var.c(pc4Var.u);
            da3Var.d(pc4Var.r);
        } else {
            da3Var = null;
        }
        nl2 nl2Var = (nl2) ei2Var.m.d();
        q93 q93VarC = nl2Var.c(nl2Var.b());
        this.i = q93VarC;
        q93VarC.c(new jq3(q93VarC, new g4(this, y23Var, da3Var, aa3VarG, ei2Var, 14, false), 0), executor);
        return true;
    }

    public final boolean b() {
        q93 q93Var = this.i;
        return (q93Var == null || q93Var.h.isDone()) ? false : true;
    }
}
