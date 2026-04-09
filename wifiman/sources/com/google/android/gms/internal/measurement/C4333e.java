package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4333e {

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.common.collect.r f35203d = com.google.common.collect.r.K0("_syn", "_err", "_el");

    /* renamed from: a, reason: collision with root package name */
    private String f35204a;

    /* renamed from: b, reason: collision with root package name */
    private long f35205b;

    /* renamed from: c, reason: collision with root package name */
    private Map f35206c;

    public C4333e(String str, long j10, Map map) {
        this.f35204a = str;
        this.f35205b = j10;
        HashMap map2 = new HashMap();
        this.f35206c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static Object c(String str, Object obj, Object obj2) {
        return (f35203d.contains(str) && (obj2 instanceof Double)) ? Long.valueOf(Math.round(((Double) obj2).doubleValue())) : str.startsWith("_") ? ((obj instanceof String) || obj == null) ? obj2 : obj : obj instanceof Double ? obj2 : obj instanceof Long ? Long.valueOf(Math.round(((Double) obj2).doubleValue())) : obj instanceof String ? obj2.toString() : obj2;
    }

    public final long a() {
        return this.f35205b;
    }

    public final Object b(String str) {
        if (this.f35206c.containsKey(str)) {
            return this.f35206c.get(str);
        }
        return null;
    }

    public final /* synthetic */ Object clone() {
        return new C4333e(this.f35204a, this.f35205b, new HashMap(this.f35206c));
    }

    public final void d(String str, Object obj) {
        if (obj == null) {
            this.f35206c.remove(str);
        } else {
            this.f35206c.put(str, c(str, this.f35206c.get(str), obj));
        }
    }

    public final String e() {
        return this.f35204a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4333e)) {
            return false;
        }
        C4333e c4333e = (C4333e) obj;
        if (this.f35205b == c4333e.f35205b && this.f35204a.equals(c4333e.f35204a)) {
            return this.f35206c.equals(c4333e.f35206c);
        }
        return false;
    }

    public final void f(String str) {
        this.f35204a = str;
    }

    public final Map g() {
        return this.f35206c;
    }

    public final int hashCode() {
        int iHashCode = this.f35204a.hashCode() * 31;
        long j10 = this.f35205b;
        return ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f35206c.hashCode();
    }

    public final String toString() {
        return "Event{name='" + this.f35204a + "', timestamp=" + this.f35205b + ", params=" + String.valueOf(this.f35206c) + "}";
    }
}
