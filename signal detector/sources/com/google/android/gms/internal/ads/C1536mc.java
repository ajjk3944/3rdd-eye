package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import t2.AbstractC2907C;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.mc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1536mc implements InterfaceC1374jc, InterfaceC2075wc {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0828Yg f15630a;

    public static final void s(Runnable runnable) {
        u2.f fVar = q2.r.f23260g.f23261a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            AbstractC2907C.m("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            AbstractC2907C.m("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (C2911G.f23576l.post(runnable)) {
                return;
            }
            u2.k.h("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1322ic
    public final void a(String str, Map map) {
        try {
            p("openIntentAsync", q2.r.f23260g.f23261a.j((HashMap) map));
        } catch (JSONException unused) {
            u2.k.h("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1590nc
    public final void b(String str, JSONObject jSONObject) {
        f(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1374jc, com.google.android.gms.internal.ads.InterfaceC1590nc
    public final void c(String str) {
        AbstractC2907C.m("invokeJavascript on adWebView from js");
        s(new RunnableC1482lc(this, str, 3));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2075wc
    public final void d(String str, InterfaceC0466Db interfaceC0466Db) {
        InterfaceC0828Yg interfaceC0828Yg = this.f15630a;
        if (interfaceC0828Yg != null) {
            interfaceC0828Yg.R0(str, new Rx(7, interfaceC0466Db));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2075wc
    public final void e(String str, InterfaceC0466Db interfaceC0466Db) {
        InterfaceC0828Yg interfaceC0828Yg = this.f15630a;
        if (interfaceC0828Yg != null) {
            interfaceC0828Yg.g0(str, new C1428kc(this, interfaceC0466Db));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1590nc
    public final /* synthetic */ void f(String str, String str2) {
        AbstractC1135f5.a(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1322ic
    public final /* synthetic */ void p(String str, JSONObject jSONObject) {
        AbstractC1135f5.b(this, jSONObject);
    }
}
