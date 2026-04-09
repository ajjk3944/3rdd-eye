package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class a7 {

    /* renamed from: a, reason: collision with root package name */
    private final a f3590a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f3591b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3592c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3593d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f3594e;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum a {
        TCF_VENDOR,
        ATP_NETWORK,
        OTHER;

        /* JADX INFO: Access modifiers changed from: private */
        public static a b(int i4) {
            return i4 != 0 ? i4 != 1 ? OTHER : ATP_NETWORK : TCF_VENDOR;
        }
    }

    public a7(JSONObject jSONObject, String str) {
        this.f3593d = str;
        this.f3590a = a.b(JsonUtils.getInt(jSONObject, "type", a.OTHER.ordinal()));
        this.f3591b = JsonUtils.getInteger(jSONObject, FacebookMediationAdapter.KEY_ID, null);
        this.f3592c = JsonUtils.getString(jSONObject, "name", null);
    }

    public void a(Boolean bool) {
        this.f3594e = bool;
    }

    public String b() {
        return this.f3593d;
    }

    public String c() {
        return this.f3592c;
    }

    public Integer d() {
        return this.f3591b;
    }

    public String e() {
        Boolean bool = this.f3594e;
        return r5.c.m(new StringBuilder("\n"), this.f3593d, " - ", bool != null ? String.valueOf(bool) : p0.b().a(com.applovin.impl.sdk.k.o()));
    }

    public a f() {
        return this.f3590a;
    }

    public Boolean a() {
        return this.f3594e;
    }
}
