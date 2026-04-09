package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wd4 extends ez implements g8 {
    public static final gw3 p = new gw3("AppSet.API", new qb1(3), new pz(12));
    public final Context n;
    public final gz o;

    public wd4(Context context, gz gzVar) {
        super(context, p, u4.a, dz.b);
        this.n = context;
        this.o = gzVar;
    }

    @Override // defpackage.g8
    public final gi4 h() {
        if (this.o.c(this.n, 212800000) == 0) {
            sq0 sq0Var = new sq0(7);
            ju[] juVarArr = {uk2.l};
            sq0Var.g = new y24(18, this);
            return b(0, new rb(sq0Var, juVarArr, false, 27601));
        }
        y4 y4Var = new y4(new Status(17, null, null, null));
        gi4 gi4Var = new gi4();
        gi4Var.d(y4Var);
        return gi4Var;
    }
}
