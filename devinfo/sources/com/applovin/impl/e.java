package com.applovin.impl;

import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f3990a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3991b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f3992c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f3993d;

    public e(String str, String str2) {
        this(str, str2, null, false);
    }

    public String a() {
        return this.f3991b;
    }

    public Map b() {
        return this.f3992c;
    }

    public String c() {
        return this.f3990a;
    }

    public boolean d() {
        return this.f3993d;
    }

    public String toString() {
        return "AdEventPostback{url='" + this.f3990a + "', backupUrl='" + this.f3991b + "', headers='" + this.f3992c + "', shouldFireInWebView='" + this.f3993d + "'}";
    }

    public e(String str, String str2, Map map, boolean z3) {
        this.f3990a = str;
        this.f3991b = str2;
        this.f3992c = map;
        this.f3993d = z3;
    }
}
