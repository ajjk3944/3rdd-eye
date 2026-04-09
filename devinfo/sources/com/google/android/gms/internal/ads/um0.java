package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class um0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17260a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17261b;

    public /* synthetic */ um0(int i4, Object obj) {
        this.f17260a = i4;
        this.f17261b = obj;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void c(Object obj) throws JSONException {
        boolean z3;
        switch (this.f17260a) {
            case 0:
                Integer num = (Integer) this.f17261b;
                t50 t50Var = (t50) obj;
                if (num != null) {
                    t50Var.f16705a.putInt("dspct", Math.min(num.intValue(), 20));
                    return;
                }
                return;
            case 1:
                t50 t50Var2 = (t50) obj;
                vp0 vp0Var = (vp0) this.f17261b;
                if (vp0Var != null) {
                    if (((Boolean) va.s.f36163e.f36166c.a(sk.f16173id)).booleanValue()) {
                        return;
                    }
                    Bundle bundle = t50Var2.f16705a;
                    synchronized (vp0Var.f17683c) {
                        vp0Var.c();
                        z3 = vp0Var.f17685e == 2;
                    }
                    bundle.putBoolean("render_in_browser", z3);
                    bundle.putBoolean("disable_ml", vp0Var.b());
                    return;
                }
                return;
            case 2:
                try {
                    ((JSONObject) obj).put("gms_sdk_env", ((fo0) this.f17261b).f11245a);
                    return;
                } catch (JSONException unused) {
                    ya.a0.m("Failed putting version constants.");
                    return;
                }
            default:
                try {
                    ((JSONObject) obj).put("eid", TextUtils.join(",", (List) this.f17261b));
                    return;
                } catch (JSONException unused2) {
                    ya.a0.m("Failed putting experiment ids.");
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* synthetic */ void h(Object obj) {
        int i4 = this.f17260a;
    }

    private final /* synthetic */ void a(Object obj) {
    }

    private final /* synthetic */ void b(Object obj) {
    }

    private final /* synthetic */ void d(Object obj) {
    }

    private final /* synthetic */ void e(Object obj) {
    }
}
