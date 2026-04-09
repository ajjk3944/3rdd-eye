package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zp implements wp, jq {

    /* renamed from: a, reason: collision with root package name */
    public qz f19142a;

    public static final void d(Runnable runnable) {
        za.d dVar = va.r.g.f36157a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ya.a0.m("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            ya.a0.m("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (ya.f0.f37440l.post(runnable)) {
                return;
            }
            za.i.h("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.vp
    public final void a(String str, Map map) {
        try {
            h("openIntentAsync", va.r.g.f36157a.j((HashMap) map));
        } catch (JSONException unused) {
            za.i.h("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.jq
    public final void b(String str, oo ooVar) {
        qz qzVar = this.f19142a;
        if (qzVar != null) {
            qzVar.W(str, new ix0(9, ooVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.aq
    public final void c(String str, JSONObject jSONObject) {
        f(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.jq
    public final void e(String str, oo ooVar) {
        qz qzVar = this.f19142a;
        if (qzVar != null) {
            qzVar.Z(str, new xp(this, ooVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.aq
    public final /* synthetic */ void f(String str, String str2) {
        d7.a(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.wp, com.google.android.gms.internal.ads.aq
    public final void g(String str) {
        ya.a0.m("invokeJavascript on adWebView from js");
        d(new yp(this, str, 3));
    }

    @Override // com.google.android.gms.internal.ads.vp
    public final /* synthetic */ void h(String str, JSONObject jSONObject) {
        d7.b(this, jSONObject);
    }
}
