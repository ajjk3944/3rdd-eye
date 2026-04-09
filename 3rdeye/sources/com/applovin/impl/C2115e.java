package com.applovin.impl;

import java.util.Map;

/* renamed from: com.applovin.impl.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2115e {

    /* renamed from: a, reason: collision with root package name */
    private final String f19236a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19237b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f19238c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f19239d;

    public C2115e(String str, String str2) {
        this(str, str2, null, false);
    }

    public String a() {
        return this.f19237b;
    }

    public Map b() {
        return this.f19238c;
    }

    public String c() {
        return this.f19236a;
    }

    public boolean d() {
        return this.f19239d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdEventPostback{url='");
        sb.append(this.f19236a);
        sb.append("', backupUrl='");
        sb.append(this.f19237b);
        sb.append("', headers='");
        sb.append(this.f19238c);
        sb.append("', shouldFireInWebView='");
        return androidx.work.s.h(sb, this.f19239d, "'}");
    }

    public C2115e(String str, String str2, Map map, boolean z10) {
        this.f19236a = str;
        this.f19237b = str2;
        this.f19238c = map;
        this.f19239d = z10;
    }
}
