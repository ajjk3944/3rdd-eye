package com.applovin.impl;

import java.util.Map;

/* loaded from: classes.dex */
public class o4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f7150a;

    /* renamed from: b, reason: collision with root package name */
    private Map f7151b;

    private o4(String str, Map map) {
        this.f7150a = str;
        this.f7151b = map;
    }

    public static o4 a(String str) {
        return a(str, null);
    }

    public String b() {
        return this.f7150a;
    }

    public String toString() {
        return "PendingReward{result='" + this.f7150a + "'params='" + this.f7151b + "'}";
    }

    public static o4 a(String str, Map map) {
        return new o4(str, map);
    }

    public Map a() {
        return this.f7151b;
    }
}
