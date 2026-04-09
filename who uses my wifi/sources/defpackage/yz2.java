package defpackage;

import android.content.Context;
import android.os.Build;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yz2 {
    public wc0 a;
    public final Context b;

    public yz2(Context context) {
        this.b = context;
    }

    public final n70 a() {
        try {
            Context context = this.b;
            c3 c3Var = c3.a;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                c3Var.a();
            }
            uc0 uc0Var = (i >= 30 ? c3Var.a() : 0) >= 5 ? new uc0(context) : null;
            wc0 wc0Var = uc0Var != null ? new wc0(uc0Var) : null;
            this.a = wc0Var;
            return wc0Var == null ? pu1.B(new IllegalStateException("MeasurementManagerFutures is null")) : wc0Var.b();
        } catch (Exception e) {
            return pu1.B(e);
        }
    }
}
