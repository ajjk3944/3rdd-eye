package com.google.android.gms.internal.measurement;

import java.util.Map;

/* loaded from: classes.dex */
final class C5 implements Comparable, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    private final Comparable f34959a;

    /* renamed from: b, reason: collision with root package name */
    private Object f34960b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ AbstractC4503y5 f34961c;

    C5(AbstractC4503y5 abstractC4503y5, Map.Entry entry) {
        this(abstractC4503y5, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((C5) obj).getKey());
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
        return a(this.f34959a, entry.getKey()) && a(this.f34960b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f34959a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f34960b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f34959a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f34960b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f34961c.u();
        Object obj2 = this.f34960b;
        this.f34960b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f34959a) + "=" + String.valueOf(this.f34960b);
    }

    C5(AbstractC4503y5 abstractC4503y5, Comparable comparable, Object obj) {
        this.f34961c = abstractC4503y5;
        this.f34959a = comparable;
        this.f34960b = obj;
    }
}
