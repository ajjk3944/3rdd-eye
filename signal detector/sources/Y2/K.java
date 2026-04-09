package Y2;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class K extends G {

    /* renamed from: c, reason: collision with root package name */
    public final transient Object f4274c;

    public K(Object obj) {
        this.f4274c = obj;
    }

    @Override // Y2.C
    public final int a(Object[] objArr) {
        objArr[0] = this.f4274c;
        return 1;
    }

    @Override // Y2.C, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f4274c.equals(obj);
    }

    @Override // Y2.G, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f4274c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new H(this.f4274c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return A.f.m("[", this.f4274c.toString(), "]");
    }
}
