package com.applovin.impl;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class p4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f5061a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5062b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f5063c;

    public p4(String str, String str2, Context context) {
        this.f5061a = str.replace("android.permission.", "");
        this.f5062b = str2;
        this.f5063c = o0.a(str, context);
    }

    public String a() {
        return this.f5062b;
    }

    public String b() {
        return this.f5061a;
    }

    public boolean c() {
        return this.f5063c;
    }
}
