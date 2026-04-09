package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class aj0 implements bi0 {

    /* renamed from: a, reason: collision with root package name */
    public final ed0 f9338a;

    public aj0(ed0 ed0Var) {
        this.f9338a = ed0Var;
    }

    @Override // com.google.android.gms.internal.ads.bi0
    public final ci0 a(String str, JSONObject jSONObject) {
        return new ci0(this.f9338a.a(str, jSONObject), new vi0(), str);
    }
}
