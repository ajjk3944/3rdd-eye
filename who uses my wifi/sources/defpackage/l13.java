package defpackage;

import android.os.Bundle;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class l13 extends j13 {
    public final th2 a;
    public final mm2 b;
    public final f23 c;
    public final fp2 d;
    public final vq2 e;
    public final go2 f;
    public final ViewGroup g;
    public final wo2 h;
    public final o13 i;
    public final e03 j;

    public l13(th2 th2Var, mm2 mm2Var, f23 f23Var, fp2 fp2Var, vq2 vq2Var, go2 go2Var, ViewGroup viewGroup, wo2 wo2Var, o13 o13Var, e03 e03Var) {
        this.a = th2Var;
        this.b = mm2Var;
        this.c = f23Var;
        this.d = fp2Var;
        this.e = vq2Var;
        this.f = go2Var;
        this.g = viewGroup;
        this.h = wo2Var;
        this.i = o13Var;
        this.j = e03Var;
    }

    @Override // defpackage.j13
    public final q93 c(l83 l83Var, Bundle bundle, a83 a83Var, h83 h83Var) {
        mm2 mm2Var = this.b;
        mm2Var.b = l83Var;
        mm2Var.c = bundle;
        mm2Var.e = new t83(h83Var, a83Var, this.i, 19, false);
        if (((Boolean) tw1.e.c.a(mz1.V3)).booleanValue()) {
            mm2Var.f = this.j;
        }
        th2 th2Var = this.a.b;
        mm2 mm2Var2 = new mm2(mm2Var);
        l92 l92Var = new l92(this.f, this.h);
        ug0 ug0Var = new ug0(19, this.g);
        fp2 fp2Var = this.d;
        i41.P(fp2Var, fp2.class);
        f23 f23Var = this.c;
        i41.P(f23Var, f23.class);
        f23 f23Var2 = new f23(25);
        vq2 vq2Var = this.e;
        i41.P(vq2Var, vq2.class);
        nl2 nl2Var = (nl2) new bi2(th2Var, ug0Var, vq2Var, new tv2(0, (byte) 0), fp2Var, mm2Var2, f23Var2, f23Var, l92Var, null, null).r.d();
        return nl2Var.c(nl2Var.b());
    }
}
