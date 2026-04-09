package com.applovin.impl;

import android.content.Context;

/* loaded from: classes.dex */
public class c4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f19168a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19169b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f19170c;

    public c4(String str, String str2, Context context) {
        this.f19168a = str.replace("android.permission.", "");
        this.f19169b = str2;
        this.f19170c = AbstractC2128k0.a(str, context);
    }

    public String a() {
        return this.f19169b;
    }

    public String b() {
        return this.f19168a;
    }

    public boolean c() {
        return this.f19170c;
    }
}
