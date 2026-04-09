package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class dz2 implements rn2, wm2 {
    public static final Object h = new Object();
    public static int i;
    public final ra4 f;
    public final gz2 g;

    public dz2(gz2 gz2Var, ra4 ra4Var) {
        this.g = gz2Var;
        this.f = ra4Var;
    }

    public final void a(boolean z) {
        int i2;
        int iIntValue;
        iz1 iz1Var = mz1.C6;
        tw1 tw1Var = tw1.e;
        if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue() && !this.f.s()) {
            Object obj = h;
            synchronized (obj) {
                i2 = i;
                iIntValue = ((Integer) tw1Var.c.a(mz1.D6)).intValue();
            }
            if (i2 < iIntValue) {
                gz2 gz2Var = this.g;
                q93 q93VarA = gz2Var.d.a(new Bundle());
                q93VarA.c(new jq3(q93VarA, new nb(gz2Var, z), 0), md2.g);
                synchronized (obj) {
                    i++;
                }
            }
        }
    }

    @Override // defpackage.wm2
    public final void d0(nx2 nx2Var) {
        a(false);
    }

    @Override // defpackage.rn2
    public final void e() {
        a(true);
    }
}
