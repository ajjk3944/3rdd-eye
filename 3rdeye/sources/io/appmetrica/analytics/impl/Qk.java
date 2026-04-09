package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Qk {

    /* renamed from: a, reason: collision with root package name */
    public final String f40024a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40025b;

    /* renamed from: c, reason: collision with root package name */
    public final String f40026c;

    /* renamed from: d, reason: collision with root package name */
    public final String f40027d;

    /* renamed from: e, reason: collision with root package name */
    public final String f40028e;

    /* renamed from: f, reason: collision with root package name */
    public final int f40029f;

    /* renamed from: g, reason: collision with root package name */
    public final int f40030g;

    public Qk(JSONObject jSONObject) {
        this.f40024a = jSONObject.optString("analyticsSdkVersionName", "");
        this.f40025b = jSONObject.optString("kitBuildNumber", "");
        this.f40026c = jSONObject.optString("appVer", "");
        this.f40027d = jSONObject.optString("appBuild", "");
        this.f40028e = jSONObject.optString("osVer", "");
        this.f40029f = jSONObject.optInt("osApiLev", -1);
        this.f40030g = jSONObject.optInt("attribution_id", 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionRequestParams(kitVersionName='");
        sb.append(this.f40024a);
        sb.append("', kitBuildNumber='");
        sb.append(this.f40025b);
        sb.append("', appVersion='");
        sb.append(this.f40026c);
        sb.append("', appBuild='");
        sb.append(this.f40027d);
        sb.append("', osVersion='");
        sb.append(this.f40028e);
        sb.append("', apiLevel=");
        sb.append(this.f40029f);
        sb.append(", attributionId=");
        return N7.H7.p(sb, this.f40030g, ')');
    }
}
