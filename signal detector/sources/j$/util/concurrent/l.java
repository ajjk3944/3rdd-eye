package j$.util.concurrent;

import java.util.Map;

/* loaded from: classes2.dex */
public class l implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final int f20737a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f20738b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f20739c;

    /* renamed from: d, reason: collision with root package name */
    public volatile l f20740d;

    public l(int i, Object obj, Object obj2) {
        this.f20737a = i;
        this.f20738b = obj;
        this.f20739c = obj2;
    }

    public l(int i, Object obj, Object obj2, l lVar) {
        this(i, obj, obj2);
        this.f20740d = lVar;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f20738b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f20739c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f20738b.hashCode() ^ this.f20739c.hashCode();
    }

    public final String toString() {
        return j$.com.android.tools.r8.a.g(this.f20738b, this.f20739c);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (value = entry.getValue()) == null) {
            return false;
        }
        Object obj2 = this.f20738b;
        if (key != obj2 && !key.equals(obj2)) {
            return false;
        }
        Object obj3 = this.f20739c;
        return value == obj3 || value.equals(obj3);
    }

    public l a(Object obj, int i) {
        Object obj2;
        l lVar = this;
        do {
            if (lVar.f20737a == i && ((obj2 = lVar.f20738b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return lVar;
            }
            lVar = lVar.f20740d;
        } while (lVar != null);
        return null;
    }
}
