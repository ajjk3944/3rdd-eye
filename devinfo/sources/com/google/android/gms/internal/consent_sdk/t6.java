package com.google.android.gms.internal.consent_sdk;

import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t6 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f19523a;

    /* renamed from: b, reason: collision with root package name */
    public Object f19524b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s6 f19525c;

    public t6(s6 s6Var, Comparable comparable, Object obj) {
        this.f19525c = s6Var;
        this.f19523a = comparable;
        this.f19524b = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f19523a.compareTo(((t6) obj).f19523a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f19523a;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f19524b;
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
        return this.f19523a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f19524b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f19523a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f19524b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f19525c.g();
        Object obj2 = this.f19524b;
        this.f19524b = obj;
        return obj2;
    }

    public final String toString() {
        return d.h.E(String.valueOf(this.f19523a), "=", String.valueOf(this.f19524b));
    }
}
