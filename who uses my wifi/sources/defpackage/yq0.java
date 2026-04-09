package defpackage;

import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yq0 implements x9, vi {
    public final i90 a;
    public final ba b;
    public wu0 c;

    public yq0(i90 i90Var, da daVar, xq0 xq0Var) {
        this.a = i90Var;
        ba baVarQ0 = xq0Var.a.Q0();
        this.b = baVarQ0;
        daVar.e(baVarQ0);
        baVarQ0.a(this);
    }

    public static int a(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    @Override // defpackage.x9
    public final void c() {
        this.a.invalidateSelf();
    }

    @Override // defpackage.vi
    public final void d(List list, List list2) {
    }
}
