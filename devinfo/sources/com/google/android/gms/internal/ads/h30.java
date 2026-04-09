package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class h30 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11690a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qz f11691b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JSONObject f11692c;

    public /* synthetic */ h30(qz qzVar, JSONObject jSONObject) {
        this.f11691b = qzVar;
        this.f11692c = jSONObject;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i4 = this.f11690a;
        JSONObject jSONObject = this.f11692c;
        qz qzVar = this.f11691b;
        switch (i4) {
            case 0:
                String string = jSONObject.toString();
                StringBuilder sb2 = new StringBuilder(string.length() + 31);
                sb2.append("Calling AFMA_updateActiveView(");
                sb2.append(string);
                sb2.append(")");
                za.i.c(sb2.toString());
                qzVar.c("AFMA_updateActiveView", jSONObject);
                break;
            default:
                u51 u51Var = ca0.J;
                qzVar.h("onVideoEvent", jSONObject);
                break;
        }
    }

    public /* synthetic */ h30(JSONObject jSONObject, qz qzVar) {
        this.f11692c = jSONObject;
        this.f11691b = qzVar;
    }
}
