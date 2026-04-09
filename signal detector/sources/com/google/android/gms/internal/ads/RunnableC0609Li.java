package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Li, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0609Li implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9734a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0828Yg f9735b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JSONObject f9736c;

    public /* synthetic */ RunnableC0609Li(InterfaceC0828Yg interfaceC0828Yg, JSONObject jSONObject) {
        this.f9735b = interfaceC0828Yg;
        this.f9736c = jSONObject;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.f9734a;
        JSONObject jSONObject = this.f9736c;
        InterfaceC0828Yg interfaceC0828Yg = this.f9735b;
        switch (i) {
            case 0:
                String string = jSONObject.toString();
                StringBuilder sb = new StringBuilder(string.length() + 31);
                sb.append("Calling AFMA_updateActiveView(");
                sb.append(string);
                sb.append(")");
                u2.k.c(sb.toString());
                interfaceC0828Yg.b("AFMA_updateActiveView", jSONObject);
                break;
            default:
                C1197gC c1197gC = C1278hm.f14556J;
                interfaceC0828Yg.p("onVideoEvent", jSONObject);
                break;
        }
    }

    public /* synthetic */ RunnableC0609Li(JSONObject jSONObject, InterfaceC0828Yg interfaceC0828Yg) {
        this.f9736c = jSONObject;
        this.f9735b = interfaceC0828Yg;
    }
}
