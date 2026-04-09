package com.google.android.gms.internal.measurement;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final oe.k0 f4911d = oe.k0.l(3, "_syn", "_err", "_el");

    /* renamed from: a, reason: collision with root package name */
    public String f4912a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4913b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4914c;

    public b(String str, long j, HashMap map) {
        this.f4912a = str;
        this.f4913b = j;
        HashMap map2 = new HashMap();
        this.f4914c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static Object b(Object obj, Object obj2, String str) {
        if (f4911d.contains(str) && (obj2 instanceof Double)) {
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
        return new b(this.f4912a, this.f4913b, new HashMap(this.f4914c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f4913b == bVar.f4913b && this.f4912a.equals(bVar.f4912a)) {
            return this.f4914c.equals(bVar.f4914c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f4912a.hashCode() * 31;
        long j = this.f4913b;
        return this.f4914c.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f4912a;
        String string = this.f4914c.toString();
        int length = String.valueOf(str).length();
        long j = this.f4913b;
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
