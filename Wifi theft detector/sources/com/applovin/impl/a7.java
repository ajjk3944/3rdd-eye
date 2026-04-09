package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a7 {

    /* renamed from: a, reason: collision with root package name */
    private final a f5384a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f5385b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5386c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5387d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f5388e;

    public enum a {
        TCF_VENDOR,
        ATP_NETWORK,
        OTHER;

        /* JADX INFO: Access modifiers changed from: private */
        public static a b(int i10) {
            return i10 != 0 ? i10 != 1 ? OTHER : ATP_NETWORK : TCF_VENDOR;
        }
    }

    public a7(JSONObject jSONObject, String str) {
        this.f5387d = str;
        this.f5384a = a.b(JsonUtils.getInt(jSONObject, HandleInvocationsFromAdViewer.KEY_AD_TYPE, a.OTHER.ordinal()));
        this.f5385b = JsonUtils.getInteger(jSONObject, "id", null);
        this.f5386c = JsonUtils.getString(jSONObject, "name", null);
    }

    public void a(Boolean bool) {
        this.f5388e = bool;
    }

    public String b() {
        return this.f5387d;
    }

    public String c() {
        return this.f5386c;
    }

    public Integer d() {
        return this.f5385b;
    }

    public String e() {
        Boolean bool = this.f5388e;
        return "\n" + this.f5387d + " - " + (bool != null ? String.valueOf(bool) : p0.b().a(com.applovin.impl.sdk.k.o()));
    }

    public a f() {
        return this.f5384a;
    }

    public Boolean a() {
        return this.f5388e;
    }
}
