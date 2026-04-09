package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class do0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f10534a;

    public do0(JSONObject jSONObject) {
        this.f10534a = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* bridge */ /* synthetic */ void c(Object obj) throws JSONException {
        try {
            ((JSONObject) obj).put("cache_state", this.f10534a);
        } catch (JSONException unused) {
            ya.a0.m("Unable to get cache_state");
        }
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* synthetic */ void h(Object obj) {
    }
}
