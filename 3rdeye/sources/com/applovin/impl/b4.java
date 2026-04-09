package com.applovin.impl;

import java.util.Map;

/* loaded from: classes.dex */
public class b4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f19104a;

    /* renamed from: b, reason: collision with root package name */
    private Map f19105b;

    private b4(String str, Map map) {
        this.f19104a = str;
        this.f19105b = map;
    }

    public static b4 a(String str) {
        return a(str, null);
    }

    public String b() {
        return this.f19104a;
    }

    public String toString() {
        return "PendingReward{result='" + this.f19104a + "'params='" + this.f19105b + "'}";
    }

    public static b4 a(String str, Map map) {
        return new b4(str, map);
    }

    public Map a() {
        return this.f19105b;
    }
}
