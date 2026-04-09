package com.applovin.impl;

import android.content.Context;

/* loaded from: classes.dex */
public class p4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f7241a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7242b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f7243c;

    public p4(String str, String str2, Context context) {
        this.f7241a = str.replace("android.permission.", "");
        this.f7242b = str2;
        this.f7243c = o0.a(str, context);
    }

    public String a() {
        return this.f7242b;
    }

    public String b() {
        return this.f7241a;
    }

    public boolean c() {
        return this.f7243c;
    }
}
