package defpackage;

import android.os.Looper;
import android.text.TextUtils;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class q32 implements dq2 {
    public final lu1 f;
    public final int g;
    public final String h;

    public q32(lu1 lu1Var, int i, String str) {
        this.f = lu1Var;
        this.g = i;
        this.h = str;
    }

    @Override // defpackage.dq2
    public final void a(l22 l22Var) throws JSONException, IllegalAccessException, InterruptedException, ze4, IOException, IllegalArgumentException, InvocationTargetException {
        if (l22Var == null || this.g != 2 || TextUtils.isEmpty(this.h)) {
            return;
        }
        jq3 jq3Var = new jq3(this, l22Var, 28);
        i63 i63Var = lf4.l;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            jq3Var.run();
        } else {
            md2.a.execute(jq3Var);
        }
    }

    @Override // defpackage.dq2
    public final void G(String str) {
    }
}
