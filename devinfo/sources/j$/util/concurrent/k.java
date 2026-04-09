package j$.util.concurrent;

import java.util.Map;

/* loaded from: classes2.dex */
public final class k implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f26321a;

    /* renamed from: b, reason: collision with root package name */
    public Object f26322b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f26323c;

    public k(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
        this.f26321a = obj;
        this.f26322b = obj2;
        this.f26323c = concurrentHashMap;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f26321a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f26322b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f26321a.hashCode() ^ this.f26322b.hashCode();
    }

    public final String toString() {
        return j$.com.android.tools.r8.a.D(this.f26321a, this.f26322b);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (value = entry.getValue()) == null) {
            return false;
        }
        Object obj2 = this.f26321a;
        if (key != obj2 && !key.equals(obj2)) {
            return false;
        }
        Object obj3 = this.f26322b;
        return value == obj3 || value.equals(obj3);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        Object obj2 = this.f26322b;
        this.f26322b = obj;
        this.f26323c.put(this.f26321a, obj);
        return obj2;
    }
}
