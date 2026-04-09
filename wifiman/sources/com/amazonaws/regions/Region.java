package com.amazonaws.regions;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class Region {

    /* renamed from: a, reason: collision with root package name */
    private final String f34142a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34143b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f34144c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map f34145d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map f34146e = new HashMap();

    Region(String str, String str2) {
        this.f34142a = str;
        if (str2 == null || str2.isEmpty()) {
            this.f34143b = "amazonaws.com";
        } else {
            this.f34143b = str2;
        }
    }

    public static Region e(String str) {
        return RegionUtils.a(str);
    }

    public String a() {
        return this.f34143b;
    }

    Map b() {
        return this.f34145d;
    }

    Map c() {
        return this.f34146e;
    }

    public String d() {
        return this.f34142a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Region) {
            return d().equals(((Region) obj).d());
        }
        return false;
    }

    Map f() {
        return this.f34144c;
    }

    public int hashCode() {
        return d().hashCode();
    }

    public String toString() {
        return d();
    }
}
