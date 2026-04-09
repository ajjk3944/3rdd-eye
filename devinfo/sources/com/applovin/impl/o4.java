package com.applovin.impl;

import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class o4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f4986a;

    /* renamed from: b, reason: collision with root package name */
    private Map f4987b;

    private o4(String str, Map map) {
        this.f4986a = str;
        this.f4987b = map;
    }

    public static o4 a(String str) {
        return a(str, null);
    }

    public String b() {
        return this.f4986a;
    }

    public String toString() {
        return "PendingReward{result='" + this.f4986a + "'params='" + this.f4987b + "'}";
    }

    public static o4 a(String str, Map map) {
        return new o4(str, map);
    }

    public Map a() {
        return this.f4987b;
    }
}
