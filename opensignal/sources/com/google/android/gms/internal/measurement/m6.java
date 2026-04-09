package com.google.android.gms.internal.measurement;

import java.util.Map;

/* loaded from: classes.dex */
public final class m6 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f5123a;

    /* renamed from: d, reason: collision with root package name */
    public Object f5124d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l6 f5125g;

    public m6(l6 l6Var, Comparable comparable, Object obj) {
        this.f5125g = l6Var;
        this.f5123a = comparable;
        this.f5124d = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f5123a.compareTo(((m6) obj).f5123a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f5123a;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f5124d;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f5123a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f5124d;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f5123a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f5124d;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f5125g.f();
        Object obj2 = this.f5124d;
        this.f5124d = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f5123a);
        String strValueOf2 = String.valueOf(this.f5124d);
        return h0.b.s(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
    }
}
