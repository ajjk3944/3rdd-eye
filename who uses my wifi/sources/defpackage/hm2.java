package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hm2 implements rn2, en2 {
    public final a83 f;

    public hm2(a83 a83Var) {
        this.f = a83Var;
    }

    @Override // defpackage.rn2
    public final void e() {
        g92 g92Var = this.f.d0;
        if (g92Var == null || !g92Var.a) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = g92Var.b;
        if (str.isEmpty()) {
            return;
        }
        arrayList.add(str);
    }

    @Override // defpackage.en2
    public final void h(Context context) {
    }

    @Override // defpackage.en2
    public final void l(Context context) {
    }

    @Override // defpackage.en2
    public final void p(Context context) {
    }
}
