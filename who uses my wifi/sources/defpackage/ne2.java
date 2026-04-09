package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class ne2 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ se2 g;

    public /* synthetic */ ne2(se2 se2Var, int i) {
        this.f = i;
        this.g = se2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                ee2 ee2Var = this.g.l;
                if (ee2Var != null) {
                    ee2Var.e();
                    break;
                }
                break;
            case 1:
                ee2 ee2Var2 = this.g.l;
                if (ee2Var2 != null) {
                    ee2Var2.k();
                    break;
                }
                break;
            case 2:
                ee2 ee2Var3 = this.g.l;
                if (ee2Var3 != null) {
                    ee2Var3.h();
                    break;
                }
                break;
            case 3:
                ee2 ee2Var4 = this.g.l;
                if (ee2Var4 != null) {
                    ee2Var4.f();
                    break;
                }
                break;
            case 4:
                ee2 ee2Var5 = this.g.l;
                if (ee2Var5 != null) {
                    ee2Var5.g();
                    break;
                }
                break;
            case 5:
                ee2 ee2Var6 = this.g.l;
                if (ee2Var6 != null) {
                    de2 de2Var = ee2Var6.j;
                    de2Var.h = false;
                    i63 i63Var = lf4.l;
                    i63Var.removeCallbacks(de2Var);
                    i63Var.postDelayed(de2Var, 250L);
                    i63Var.post(new be2(ee2Var6, 0));
                    break;
                }
                break;
            case 6:
                ee2 ee2Var7 = this.g.l;
                if (ee2Var7 != null) {
                    ee2Var7.i();
                    break;
                }
                break;
            default:
                se2 se2Var = this.g;
                me2 me2Var = se2Var.g;
                float f = me2Var.c ? me2Var.e ? 0.0f : me2Var.f : 0.0f;
                sf2 sf2Var = se2Var.n;
                if (sf2Var == null) {
                    gi2.i0("Trying to set volume before player is initialized.");
                    break;
                } else {
                    try {
                        mc4 mc4Var = sf2Var.l;
                        if (mc4Var != null) {
                            mc4Var.j.b();
                            mc4Var.i.U1(f);
                            break;
                        }
                    } catch (IOException unused) {
                        gi2.q0(5);
                        return;
                    }
                }
                break;
        }
    }
}
