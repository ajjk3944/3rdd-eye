package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class i13 extends j13 {
    public final /* synthetic */ int a = 1;
    public final th2 b;
    public final mm2 c;
    public final fp2 d;
    public final o13 e;
    public final e03 f;
    public final Object g;

    public i13(th2 th2Var, mm2 mm2Var, fp2 fp2Var, i83 i83Var, o13 o13Var, e03 e03Var) {
        this.b = th2Var;
        this.c = mm2Var;
        this.d = fp2Var;
        this.g = i83Var;
        this.e = o13Var;
        this.f = e03Var;
    }

    @Override // defpackage.j13
    public final q93 c(l83 l83Var, Bundle bundle, a83 a83Var, h83 h83Var) {
        i83 i83Var;
        switch (this.a) {
            case 0:
                mm2 mm2Var = this.c;
                mm2Var.b = l83Var;
                mm2Var.c = bundle;
                mm2Var.e = new t83(h83Var, a83Var, this.e, 19, false);
                if (((Boolean) tw1.e.c.a(mz1.V3)).booleanValue()) {
                    mm2Var.f = this.f;
                }
                th2 th2Var = this.b.b;
                mm2 mm2Var2 = new mm2(mm2Var);
                vq2 vq2Var = (vq2) this.g;
                ug0 ug0Var = new ug0(19, (Object) null);
                fp2 fp2Var = this.d;
                i41.P(fp2Var, fp2.class);
                i41.P(vq2Var, vq2.class);
                nl2 nl2Var = (nl2) new sh2(th2Var, ug0Var, vq2Var, new tv2(0, (byte) 0), fp2Var, mm2Var2, new f23(25), null, null).n.d();
                return nl2Var.c(nl2Var.b());
            case 1:
                mm2 mm2Var3 = this.c;
                mm2Var3.b = l83Var;
                mm2Var3.c = bundle;
                mm2Var3.e = new t83(h83Var, a83Var, this.e, 19, false);
                if (((Boolean) tw1.e.c.a(mz1.V3)).booleanValue()) {
                    mm2Var3.f = this.f;
                }
                th2 th2Var2 = this.b.b;
                mm2 mm2Var4 = new mm2(mm2Var3);
                f23 f23Var = (f23) this.g;
                fp2 fp2Var2 = this.d;
                i41.P(fp2Var2, fp2.class);
                i41.P(f23Var, f23.class);
                nl2 nl2Var2 = (nl2) new ei2(th2Var2, new tv2(0, (byte) 0), fp2Var2, mm2Var4, new f23(25), f23Var, null, null).m.d();
                return nl2Var2.c(nl2Var2.b());
            default:
                mm2 mm2Var5 = this.c;
                mm2Var5.b = l83Var;
                mm2Var5.c = bundle;
                mm2Var5.e = new t83(h83Var, a83Var, this.e, 19, false);
                iz1 iz1Var = mz1.U3;
                tw1 tw1Var = tw1.e;
                if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue() && (i83Var = (i83) this.g) != null) {
                    mm2Var5.d = i83Var;
                }
                if (((Boolean) tw1Var.c.a(mz1.V3)).booleanValue()) {
                    mm2Var5.f = this.f;
                }
                th2 th2Var3 = this.b.b;
                mm2 mm2Var6 = new mm2(mm2Var5);
                fp2 fp2Var3 = this.d;
                i41.P(fp2Var3, fp2.class);
                nl2 nl2VarA = new ji2(th2Var3, new tv2(0, (byte) 0), fp2Var3, mm2Var6, new f23(25), null, null).a();
                return nl2VarA.c(nl2VarA.b());
        }
    }

    public i13(th2 th2Var, mm2 mm2Var, f23 f23Var, fp2 fp2Var, o13 o13Var, e03 e03Var) {
        this.b = th2Var;
        this.c = mm2Var;
        this.g = f23Var;
        this.d = fp2Var;
        this.e = o13Var;
        this.f = e03Var;
    }

    public i13(th2 th2Var, vq2 vq2Var, mm2 mm2Var, fp2 fp2Var, o13 o13Var, e03 e03Var) {
        this.b = th2Var;
        this.g = vq2Var;
        this.c = mm2Var;
        this.d = fp2Var;
        this.e = o13Var;
        this.f = e03Var;
    }
}
