package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;
import t2.AbstractC2907C;

/* renamed from: com.google.android.gms.internal.ads.xs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2145xs implements Ls {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17637a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17638b;

    public /* synthetic */ C2145xs(int i, Object obj) {
        this.f17637a = i;
        this.f17638b = obj;
    }

    private final /* synthetic */ void a(Object obj) {
    }

    private final /* synthetic */ void c(Object obj) {
    }

    private final /* synthetic */ void e(Object obj) {
    }

    private final /* synthetic */ void f(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final void b(Object obj) throws JSONException {
        boolean z6;
        switch (this.f17637a) {
            case 0:
                C0797Wj c0797Wj = (C0797Wj) obj;
                Pt pt = (Pt) this.f17638b;
                if (pt != null) {
                    if (((Boolean) C2841s.f23267e.f23270c.a(H9.gd)).booleanValue()) {
                        return;
                    }
                    Bundle bundle = c0797Wj.f12308a;
                    synchronized (pt.f10532c) {
                        pt.c();
                        z6 = pt.f10534e == 2;
                    }
                    bundle.putBoolean("render_in_browser", z6);
                    bundle.putBoolean("disable_ml", pt.b());
                    return;
                }
                return;
            case 1:
                try {
                    ((JSONObject) obj).put("cache_state", (JSONObject) this.f17638b);
                    return;
                } catch (JSONException unused) {
                    AbstractC2907C.m("Unable to get cache_state");
                    return;
                }
            case 2:
                try {
                    ((JSONObject) obj).put("gms_sdk_env", ((Ys) this.f17638b).f12717a);
                    return;
                } catch (JSONException unused2) {
                    AbstractC2907C.m("Failed putting version constants.");
                    return;
                }
            default:
                try {
                    ((JSONObject) obj).put("eid", TextUtils.join(",", (List) this.f17638b));
                    return;
                } catch (JSONException unused3) {
                    AbstractC2907C.m("Failed putting experiment ids.");
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final /* synthetic */ void d(Object obj) {
        int i = this.f17637a;
    }
}
