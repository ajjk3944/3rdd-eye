package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jy2 implements jo2 {
    public final Context f;
    public final oc2 g;

    public jy2(Context context, oc2 oc2Var) {
        this.f = context;
        this.g = oc2Var;
    }

    @Override // defpackage.jo2
    public final void B(h83 h83Var) {
        String str = ((c83) h83Var.b.g).e;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        oc2 oc2Var = this.g;
        Context context = this.f;
        oc2Var.getClass();
        if (((Boolean) tw1.e.c.a(mz1.A0)).booleanValue() && oc2Var.a(context) && oc2.g(context)) {
            synchronized (oc2Var.i) {
            }
        }
        oc2Var.h(context, "_aq", str, null);
    }

    @Override // defpackage.jo2
    public final void G0(fa2 fa2Var) {
    }
}
