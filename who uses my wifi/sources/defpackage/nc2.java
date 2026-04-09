package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nc2 implements ov1 {
    public final Context f;
    public final Object g;
    public final String h;
    public boolean i;

    public nc2(Context context, String str) {
        this.f = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.h = str;
        this.i = false;
        this.g = new Object();
    }

    @Override // defpackage.ov1
    public final void S0(nv1 nv1Var) {
        a(nv1Var.j);
    }

    public final void a(boolean z) {
        hg4 hg4Var = hg4.C;
        oc2 oc2Var = hg4Var.y;
        Context context = this.f;
        if (oc2Var.a(context)) {
            synchronized (this.g) {
                try {
                    if (this.i == z) {
                        return;
                    }
                    this.i = z;
                    String str = this.h;
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (this.i) {
                        oc2 oc2Var2 = hg4Var.y;
                        if (oc2Var2.a(context)) {
                            oc2Var2.j(context, str, "beginAdUnitExposure");
                        }
                    } else {
                        oc2 oc2Var3 = hg4Var.y;
                        if (oc2Var3.a(context)) {
                            oc2Var3.j(context, str, "endAdUnitExposure");
                        }
                    }
                } finally {
                }
            }
        }
    }
}
