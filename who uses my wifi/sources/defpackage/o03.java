package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class o03 implements zz2 {
    public final bi2 a;
    public final Context b;
    public final pu2 c;
    public final l83 d;
    public final Executor e;
    public final zk3 f;
    public final jv2 g;

    public o03(bi2 bi2Var, Context context, Executor executor, pu2 pu2Var, l83 l83Var, zk3 zk3Var, jv2 jv2Var) {
        this.b = context;
        this.a = bi2Var;
        this.e = executor;
        this.c = pu2Var;
        this.d = l83Var;
        this.f = zk3Var;
        this.g = jv2Var;
    }

    @Override // defpackage.zz2
    public final boolean a(h83 h83Var, a83 a83Var) {
        e83 e83Var = a83Var.s;
        return (e83Var == null || e83Var.a == null) ? false : true;
    }

    @Override // defpackage.zz2
    public final n70 b(h83 h83Var, a83 a83Var) {
        return pu1.O(lq3.g, new op1(this, h83Var, a83Var, 5), this.e);
    }
}
