package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class q33 implements n53 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ q33(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.n53
    public final void c(Object obj) throws JSONException {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                i30.r0(((jm2) obj).a, "android_permissions", (ArrayList) this.b);
                return;
            case 1:
                jm2 jm2Var = (jm2) obj;
                z73 z73Var = (z73) this.b;
                if (z73Var != null) {
                    if (((Boolean) tw1.e.c.a(mz1.Jc)).booleanValue()) {
                        return;
                    }
                    Bundle bundle = jm2Var.a;
                    synchronized (z73Var.c) {
                        z73Var.b();
                        z = z73Var.e == 2;
                    }
                    bundle.putBoolean("render_in_browser", z);
                    synchronized (z73Var.c) {
                        z73Var.b();
                        z2 = z73Var.e == 3;
                    }
                    bundle.putBoolean("disable_ml", z2);
                    return;
                }
                return;
            case 2:
                try {
                    ((JSONObject) obj).put("cache_state", (JSONObject) this.b);
                    return;
                } catch (JSONException unused) {
                    gi2.G("Unable to get cache_state");
                    return;
                }
            case 3:
                try {
                    ((JSONObject) obj).put("gms_sdk_env", ((e63) this.b).a);
                    return;
                } catch (JSONException unused2) {
                    gi2.G("Failed putting version constants.");
                    return;
                }
            default:
                try {
                    ((JSONObject) obj).put("eid", TextUtils.join(",", (List) this.b));
                    return;
                } catch (JSONException unused3) {
                    gi2.G("Failed putting experiment ids.");
                    return;
                }
        }
    }
}
