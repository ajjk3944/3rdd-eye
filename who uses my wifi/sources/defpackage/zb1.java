package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zb1 implements v9 {
    public boolean f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public void a(rh rhVar) {
        xb1 xb1Var = (xb1) ((jz) this.k).o.get((c5) this.h);
        if (xb1Var != null) {
            ou1.g(xb1Var.r.r);
            v4 v4Var = xb1Var.g;
            String name = v4Var.getClass().getName();
            String strValueOf = String.valueOf(rhVar);
            v4Var.d(ex0.m(new StringBuilder(name.length() + 25 + strValueOf.length()), "onSignInFailed for ", name, " with ", strValueOf));
            xb1Var.l(rhVar, null);
        }
    }

    public synchronized boolean b(Context context) {
        if (!wk3.a(context)) {
            return false;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            this.j = new rc3(3, new rk3(context));
        } catch (NullPointerException e) {
            gi2.G("Error connecting LMD Overlay service");
            hg4.C.h.d("LastMileDeliveryOverlay.bindLastMileDeliveryService", e);
        }
        if (((rc3) this.j) == null) {
            this.f = false;
            return false;
        }
        if (((it3) this.k) == null) {
            this.k = new it3(6, this);
        }
        this.f = true;
        return true;
    }

    public void c(ag2 ag2Var, nk3 nk3Var) {
        String str = nk3Var.b;
        if (ag2Var == null) {
            d("adWebview missing", "onLMDShow");
            return;
        }
        this.i = ag2Var;
        if (!this.f && !b(ag2Var.getContext())) {
            d("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) tw1.e.c.a(mz1.mc)).booleanValue()) {
            this.h = str;
        }
        if (((it3) this.k) == null) {
            this.k = new it3(6, this);
        }
        rc3 rc3Var = (rc3) this.j;
        if (rc3Var != null) {
            it3 it3Var = (it3) this.k;
            rk3 rk3Var = (rk3) rc3Var.g;
            x03 x03Var = rk3Var.a;
            if (x03Var == null) {
                rk3.c.e("error: %s", "Play Store not found.");
            } else if (rk3.c(it3Var, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, str))) {
                x03Var.c(new vk3(x03Var, new gi(rk3Var, nk3Var, it3Var, 24), 0));
            }
        }
    }

    public void d(String str, String str2) {
        gi2.G(str);
        if (((ag2) this.i) != null) {
            HashMap map = new HashMap();
            map.put("message", str);
            map.put("action", str2);
            f("onError", map);
        }
    }

    @Override // defpackage.v9
    public void e(rh rhVar) {
        ((jz) this.k).r.post(new jq3(this, rhVar, 17, false));
    }

    public void f(String str, HashMap map) {
        md2.f.execute(new hj4(0, this, map, str));
    }

    public pk3 g() {
        String str;
        String str2 = null;
        if (!((Boolean) tw1.e.c.a(mz1.mc)).booleanValue() || TextUtils.isEmpty((String) this.h)) {
            String str3 = (String) this.g;
            if (str3 != null) {
                str2 = str3;
                str = null;
            } else {
                d("Missing session token and/or appId", "onLMDupdate");
                str = null;
            }
        } else {
            str = (String) this.h;
        }
        return new pk3(str2, str);
    }
}
