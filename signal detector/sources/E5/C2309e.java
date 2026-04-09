package e5;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: e5.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2309e implements Map.Entry, r5.a {

    /* renamed from: a, reason: collision with root package name */
    public final C2310f f19956a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19957b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19958c;

    public C2309e(C2310f c2310f, int i) {
        q5.i.e(c2310f, "map");
        this.f19956a = c2310f;
        this.f19957b = i;
        this.f19958c = c2310f.f19967h;
    }

    public final void a() {
        if (this.f19956a.f19967h != this.f19958c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return q5.i.a(entry.getKey(), getKey()) && q5.i.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f19956a.f19960a[this.f19957b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f19956a.f19961b;
        q5.i.b(objArr);
        return objArr[this.f19957b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        C2310f c2310f = this.f19956a;
        c2310f.c();
        Object[] objArr = c2310f.f19961b;
        if (objArr == null) {
            int length = c2310f.f19960a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            c2310f.f19961b = objArr;
        }
        int i = this.f19957b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
