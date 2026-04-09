package com.google.android.gms.internal.measurement;

import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final ud.f f19614d = ud.f.j(new Object[]{"_syn", "_err", "_el"}, 3);

    /* renamed from: a, reason: collision with root package name */
    public String f19615a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19616b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f19617c;

    public b(String str, long j, HashMap map) {
        this.f19615a = str;
        this.f19616b = j;
        HashMap map2 = new HashMap();
        this.f19617c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static Object b(Object obj, Object obj2, String str) {
        if (f19614d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final b clone() {
        return new b(this.f19615a, this.f19616b, new HashMap(this.f19617c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f19616b == bVar.f19616b && this.f19615a.equals(bVar.f19615a)) {
            return this.f19617c.equals(bVar.f19617c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f19615a.hashCode() * 31;
        long j = this.f19616b;
        return this.f19617c.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f19615a;
        String string = this.f19617c.toString();
        int length = String.valueOf(str).length();
        long j = this.f19616b;
        StringBuilder sb2 = new StringBuilder(length + 25 + String.valueOf(j).length() + 9 + string.length() + 1);
        sb2.append("Event{name='");
        sb2.append(str);
        sb2.append("', timestamp=");
        sb2.append(j);
        sb2.append(", params=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }
}
