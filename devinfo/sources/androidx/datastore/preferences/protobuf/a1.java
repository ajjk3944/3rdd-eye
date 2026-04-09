package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a1 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f933a;

    /* renamed from: b, reason: collision with root package name */
    public Object f934b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f935c;

    public a1(z0 z0Var, Comparable comparable, Object obj) {
        this.f935c = z0Var;
        this.f933a = comparable;
        this.f934b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f933a.compareTo(((a1) obj).f933a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f933a;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f934b;
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
    public final Object getKey() {
        return this.f933a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f934b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f933a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f934b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f935c.b();
        Object obj2 = this.f934b;
        this.f934b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f933a + "=" + this.f934b;
    }
}
