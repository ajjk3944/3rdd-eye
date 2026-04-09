package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
public final class g1 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f1280a;

    /* renamed from: d, reason: collision with root package name */
    public Object f1281d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f1 f1282g;

    public g1(f1 f1Var, Comparable comparable, Object obj) {
        this.f1282g = f1Var;
        this.f1280a = comparable;
        this.f1281d = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f1280a.compareTo(((g1) obj).f1280a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f1280a;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f1281d;
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
        return this.f1280a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f1281d;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f1280a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f1281d;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f1282g.b();
        Object obj2 = this.f1281d;
        this.f1281d = obj;
        return obj2;
    }

    public final String toString() {
        return this.f1280a + "=" + this.f1281d;
    }
}
