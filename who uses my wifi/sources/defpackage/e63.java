package defpackage;

import android.content.Context;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class e63 implements q53 {
    public final JSONObject a;

    public e63(Context context) {
        this.a = g4.i(context, e51.a());
    }

    @Override // defpackage.q53
    public final n70 a() {
        return ((Boolean) tw1.e.c.a(mz1.Kc)).booleanValue() ? pu1.r(d63.a) : pu1.r(new q33(3, this));
    }

    @Override // defpackage.q53
    public final int d() {
        return 46;
    }
}
