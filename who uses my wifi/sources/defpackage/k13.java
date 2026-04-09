package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class k13 extends j13 {
    public final th2 a;
    public final mm2 b;
    public final fp2 c;
    public final o13 d;
    public final e03 e;

    public k13(th2 th2Var, mm2 mm2Var, fp2 fp2Var, o13 o13Var, e03 e03Var) {
        this.a = th2Var;
        this.b = mm2Var;
        this.c = fp2Var;
        this.d = o13Var;
        this.e = e03Var;
    }

    @Override // defpackage.j13
    public final q93 c(l83 l83Var, Bundle bundle, a83 a83Var, h83 h83Var) {
        mm2 mm2Var = this.b;
        mm2Var.b = l83Var;
        mm2Var.c = bundle;
        mm2Var.e = new t83(h83Var, a83Var, this.d, 19, false);
        if (((Boolean) tw1.e.c.a(mz1.V3)).booleanValue()) {
            mm2Var.f = this.e;
        }
        th2 th2Var = this.a.b;
        mm2 mm2Var2 = new mm2(mm2Var);
        fp2 fp2Var = this.c;
        i41.P(fp2Var, fp2.class);
        nl2 nl2VarA = new zh2(th2Var, new tv2(0, (byte) 0), fp2Var, mm2Var2, new f23(25), null, null).a();
        return nl2VarA.c(nl2VarA.b());
    }
}
