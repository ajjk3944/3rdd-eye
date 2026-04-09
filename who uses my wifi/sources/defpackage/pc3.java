package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pc3 implements jc3 {
    public static pc3 d;
    public float a;
    public fc3 b;
    public ic3 c;

    public static pc3 a() {
        if (d == null) {
            pc3 pc3Var = new pc3();
            pc3Var.a = 0.0f;
            d = pc3Var;
        }
        return d;
    }

    @Override // defpackage.jc3
    public final void b(boolean z) {
        if (z) {
            zc3.g.getClass();
            zc3.b();
            return;
        }
        zc3.g.getClass();
        Handler handler = zc3.i;
        if (handler != null) {
            handler.removeCallbacks(zc3.k);
            zc3.i = null;
        }
    }
}
