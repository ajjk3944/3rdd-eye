package rs;

import java.util.Map;

/* loaded from: classes.dex */
public final class f0 implements Comparable, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f21750a;

    /* renamed from: d, reason: collision with root package name */
    public Object f21751d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b0 f21752g;

    public f0(b0 b0Var, Comparable comparable, Object obj) {
        this.f21752g = b0Var;
        this.f21750a = comparable;
        this.f21751d = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f21750a.compareTo(((f0) obj).f21750a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f21750a;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f21751d;
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
        return this.f21750a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f21751d;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f21750a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f21751d;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f21752g.b();
        Object obj2 = this.f21751d;
        this.f21751d = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f21750a);
        String strValueOf2 = String.valueOf(this.f21751d);
        return h0.b.s(new StringBuilder(strValueOf2.length() + strValueOf.length() + 1), strValueOf, "=", strValueOf2);
    }
}
