package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zt2 implements Callable {
    public final l92 a;
    public final Context b;
    public final mv2 c;
    public final jz2 d;
    public final Executor e;
    public final vs1 f;
    public final e51 g;
    public final eb3 h;
    public final pz2 i;
    public final m83 j;

    public zt2(Context context, Executor executor, vs1 vs1Var, e51 e51Var, l92 l92Var, jz2 jz2Var, eb3 eb3Var, mv2 mv2Var, pz2 pz2Var, m83 m83Var) {
        this.b = context;
        this.e = executor;
        this.f = vs1Var;
        this.g = e51Var;
        this.a = l92Var;
        this.d = jz2Var;
        this.h = eb3Var;
        this.c = mv2Var;
        this.i = pz2Var;
        this.j = m83Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        au2 au2Var = new au2(this);
        synchronized (au2Var) {
            String str = (String) tw1.e.c.a(mz1.e4);
            vs1 vs1Var = au2Var.f;
            l92 l92Var = au2Var.b;
            pz2 pz2Var = au2Var.k;
            rp3 rp3VarP = pu1.P(pu1.H(new gi1(au2Var.c, vs1Var, au2Var.g, l92Var, pz2Var, au2Var.l, au2Var.d, str), md2.f), new vn1(2, au2Var), au2Var.e);
            au2Var.m = rp3VarP;
            um.F(rp3VarP, "NativeJavascriptExecutor.initializeEngine");
        }
        return au2Var;
    }
}
