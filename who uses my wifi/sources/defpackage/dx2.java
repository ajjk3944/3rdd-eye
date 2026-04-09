package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class dx2 extends h30 {
    public final /* synthetic */ String y;
    public final /* synthetic */ ex2 z;

    public dx2(ex2 ex2Var, String str) {
        this.y = str;
        Objects.requireNonNull(ex2Var);
        this.z = ex2Var;
    }

    @Override // defpackage.um
    public final void q(u70 u70Var) {
        this.z.C3(ex2.F3(u70Var));
    }

    @Override // defpackage.um
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        String str = this.y;
        this.z.B3((g30) obj, str);
    }
}
