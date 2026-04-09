package defpackage;

import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class b32 extends jo1 {
    public final pd2 r;
    public final wb4 s;

    public b32(String str, pd2 pd2Var) throws IOException {
        super(0, str, new zs1(14, pd2Var));
        this.r = pd2Var;
        wb4 wb4Var = new wb4();
        this.s = wb4Var;
        if (wb4.c()) {
            Object obj = null;
            wb4Var.e("onNetworkRequest", new mc2(str, "GET", obj, obj, 26, false));
        }
    }

    @Override // defpackage.jo1
    public final rl h(ho1 ho1Var) {
        return new rl(ho1Var, wl2.C(ho1Var));
    }

    @Override // defpackage.jo1
    public final void i(Object obj) throws IOException {
        ho1 ho1Var = (ho1) obj;
        Map map = ho1Var.c;
        int i = ho1Var.a;
        wb4 wb4Var = this.s;
        wb4Var.getClass();
        if (wb4.c()) {
            wb4Var.e("onNetworkResponse", new t3(i, map, 16));
            if (i < 200 || i >= 300) {
                wb4Var.e("onNetworkRequestError", new er3(null, 5));
            }
        }
        byte[] bArr = ho1Var.b;
        if (wb4.c() && bArr != null) {
            wb4Var.e("onNetworkResponseBody", new it3(0, bArr));
        }
        this.r.a(ho1Var);
    }
}
