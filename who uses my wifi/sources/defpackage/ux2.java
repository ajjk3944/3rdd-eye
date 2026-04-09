package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class ux2 implements yp3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fa2 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ux2(Object obj, fa2 fa2Var, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = fa2Var;
        this.c = i;
    }

    @Override // defpackage.yp3
    public final /* synthetic */ n70 c(Object obj) {
        Bundle bundle;
        Bundle bundle2;
        switch (this.a) {
            case 0:
                mc2 mc2Var = (mc2) this.d;
                fa2 fa2Var = this.b;
                if (fa2Var != null && (bundle = fa2Var.r) != null) {
                    bundle.putBoolean("ls", true);
                }
                return pu1.O(((xy2) ((z94) mc2Var.j).d()).B3(fa2Var, this.c), new c02(fa2Var, 1), (pq3) mc2Var.h);
            default:
                g4 g4Var = (g4) this.d;
                fa2 fa2Var2 = this.b;
                if (fa2Var2 != null && (bundle2 = fa2Var2.r) != null) {
                    bundle2.putBoolean("ls", true);
                }
                return pu1.O(((xy2) ((z94) g4Var.k).d()).E3(fa2Var2, this.c), new c02(fa2Var2, 2), (pq3) g4Var.j);
        }
    }
}
