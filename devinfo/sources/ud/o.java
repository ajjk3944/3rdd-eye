package ud;

import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o extends f {

    /* renamed from: d, reason: collision with root package name */
    public final transient Object f35326d;

    public o(Object obj) {
        this.f35326d = obj;
    }

    @Override // ud.a
    public final int a(Object[] objArr) {
        objArr[0] = this.f35326d;
        return 1;
    }

    @Override // ud.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f35326d.equals(obj);
    }

    @Override // ud.f, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f35326d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new g(this.f35326d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.f35326d.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 2);
        sb2.append('[');
        sb2.append(string);
        sb2.append(']');
        return sb2.toString();
    }
}
