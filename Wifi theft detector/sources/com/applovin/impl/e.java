package com.applovin.impl;

import java.util.Map;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f5849a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5850b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f5851c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f5852d;

    public e(String str, String str2) {
        this(str, str2, null, false);
    }

    public String a() {
        return this.f5850b;
    }

    public Map b() {
        return this.f5851c;
    }

    public String c() {
        return this.f5849a;
    }

    public boolean d() {
        return this.f5852d;
    }

    public String toString() {
        return "AdEventPostback{url='" + this.f5849a + "', backupUrl='" + this.f5850b + "', headers='" + this.f5851c + "', shouldFireInWebView='" + this.f5852d + "'}";
    }

    public e(String str, String str2, Map map, boolean z10) {
        this.f5849a = str;
        this.f5850b = str2;
        this.f5851c = map;
        this.f5852d = z10;
    }
}
