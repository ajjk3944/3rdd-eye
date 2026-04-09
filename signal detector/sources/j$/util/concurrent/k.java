package j$.util.concurrent;

import java.util.Map;

/* loaded from: classes2.dex */
public final class k implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20734a;

    /* renamed from: b, reason: collision with root package name */
    public Object f20735b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f20736c;

    public k(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
        this.f20734a = obj;
        this.f20735b = obj2;
        this.f20736c = concurrentHashMap;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f20734a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f20735b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f20734a.hashCode() ^ this.f20735b.hashCode();
    }

    public final String toString() {
        return j$.com.android.tools.r8.a.g(this.f20734a, this.f20735b);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (value = entry.getValue()) == null) {
            return false;
        }
        Object obj2 = this.f20734a;
        if (key != obj2 && !key.equals(obj2)) {
            return false;
        }
        Object obj3 = this.f20735b;
        return value == obj3 || value.equals(obj3);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        Object obj2 = this.f20735b;
        this.f20735b = obj;
        this.f20736c.put(this.f20734a, obj);
        return obj2;
    }
}
