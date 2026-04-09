package ak;

import java.util.ConcurrentModificationException;
import java.util.Map;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e implements Map.Entry, ok.a {

    /* renamed from: a, reason: collision with root package name */
    public final g f440a;

    /* renamed from: b, reason: collision with root package name */
    public final int f441b;

    /* renamed from: c, reason: collision with root package name */
    public final int f442c;

    public e(g gVar, int i4) {
        k.e(gVar, "map");
        this.f440a = gVar;
        this.f441b = i4;
        this.f442c = gVar.f454h;
    }

    public final void a() {
        if (this.f440a.f454h != this.f442c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return k.a(entry.getKey(), getKey()) && k.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f440a.f448a[this.f441b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f440a.f449b;
        k.b(objArr);
        return objArr[this.f441b];
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
        g gVar = this.f440a;
        gVar.c();
        Object[] objArr = gVar.f449b;
        if (objArr == null) {
            int length = gVar.f448a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            gVar.f449b = objArr;
        }
        int i4 = this.f441b;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
