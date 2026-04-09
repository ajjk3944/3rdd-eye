package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class x21 extends w21 {
    public final /* synthetic */ s8 a;
    public final /* synthetic */ y21 b;

    public x21(y21 y21Var, s8 s8Var) {
        this.b = y21Var;
        this.a = s8Var;
    }

    @Override // defpackage.u21
    public final void d(v21 v21Var) {
        ((ArrayList) this.a.get(this.b.g)).remove(v21Var);
        v21Var.x(this);
    }
}
