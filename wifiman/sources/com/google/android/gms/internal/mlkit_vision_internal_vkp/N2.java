package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.util.Map;

/* loaded from: classes.dex */
final class N2 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final Comparable f35617a;

    /* renamed from: b, reason: collision with root package name */
    private Object f35618b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ T2 f35619c;

    N2(T2 t22, Comparable comparable, Object obj) {
        this.f35619c = t22;
        this.f35617a = comparable;
        this.f35618b = obj;
    }

    private static final boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final Comparable a() {
        return this.f35617a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f35617a.compareTo(((N2) obj).f35617a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return b(this.f35617a, entry.getKey()) && b(this.f35618b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f35617a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f35618b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f35617a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f35618b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f35619c.s();
        Object obj2 = this.f35618b;
        this.f35618b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f35617a) + "=" + String.valueOf(this.f35618b);
    }
}
