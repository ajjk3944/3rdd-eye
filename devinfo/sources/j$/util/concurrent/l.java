package j$.util.concurrent;

import java.util.Map;

/* loaded from: classes2.dex */
public class l implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final int f26324a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f26325b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f26326c;

    /* renamed from: d, reason: collision with root package name */
    public volatile l f26327d;

    public l(int i4, Object obj, Object obj2) {
        this.f26324a = i4;
        this.f26325b = obj;
        this.f26326c = obj2;
    }

    public l(int i4, Object obj, Object obj2, l lVar) {
        this(i4, obj, obj2);
        this.f26327d = lVar;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f26325b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f26326c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f26325b.hashCode() ^ this.f26326c.hashCode();
    }

    public final String toString() {
        return j$.com.android.tools.r8.a.D(this.f26325b, this.f26326c);
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
        Object obj2 = this.f26325b;
        if (key != obj2 && !key.equals(obj2)) {
            return false;
        }
        Object obj3 = this.f26326c;
        return value == obj3 || value.equals(obj3);
    }

    public l a(int i4, Object obj) {
        Object obj2;
        l lVar = this;
        do {
            if (lVar.f26324a == i4 && ((obj2 = lVar.f26325b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return lVar;
            }
            lVar = lVar.f26327d;
        } while (lVar != null);
        return null;
    }
}
