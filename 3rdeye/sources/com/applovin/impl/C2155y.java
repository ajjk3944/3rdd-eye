package com.applovin.impl;

import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2155y {

    /* renamed from: a, reason: collision with root package name */
    private final Map f21744a;

    /* renamed from: b, reason: collision with root package name */
    private final List f21745b;

    public C2155y(Map map, List list) {
        this.f21744a = map;
        this.f21745b = list;
    }

    public boolean a(Object obj) {
        return obj instanceof C2155y;
    }

    public List b() {
        return this.f21745b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2155y)) {
            return false;
        }
        C2155y c2155y = (C2155y) obj;
        if (!c2155y.a(this)) {
            return false;
        }
        Map mapA = a();
        Map mapA2 = c2155y.a();
        if (mapA != null ? !mapA.equals(mapA2) : mapA2 != null) {
            return false;
        }
        List listB = b();
        List listB2 = c2155y.b();
        return listB != null ? listB.equals(listB2) : listB2 == null;
    }

    public int hashCode() {
        Map mapA = a();
        int iHashCode = mapA == null ? 43 : mapA.hashCode();
        List listB = b();
        return ((iHashCode + 59) * 59) + (listB != null ? listB.hashCode() : 43);
    }

    public String toString() {
        return "AppAdsTxt(domainEntries=" + a() + ", invalidEntries=" + b() + ")";
    }

    public Map a() {
        return this.f21744a;
    }
}
