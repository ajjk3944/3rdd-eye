package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class kq implements wp, jq {

    /* renamed from: a, reason: collision with root package name */
    public final jq f13229a;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f13230b = new HashSet();

    public kq(zp zpVar) {
        this.f13229a = zpVar;
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
        this.f13229a.b(str, ooVar);
        this.f13230b.remove(new AbstractMap.SimpleEntry(str, ooVar));
    }

    @Override // com.google.android.gms.internal.ads.aq
    public final void c(String str, JSONObject jSONObject) {
        f(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.jq
    public final void e(String str, oo ooVar) {
        this.f13229a.e(str, ooVar);
        this.f13230b.add(new AbstractMap.SimpleEntry(str, ooVar));
    }

    @Override // com.google.android.gms.internal.ads.aq
    public final /* synthetic */ void f(String str, String str2) {
        d7.a(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.wp, com.google.android.gms.internal.ads.aq
    public final void g(String str) {
        this.f13229a.g(str);
    }

    @Override // com.google.android.gms.internal.ads.vp
    public final /* synthetic */ void h(String str, JSONObject jSONObject) {
        d7.b(this, jSONObject);
    }
}
