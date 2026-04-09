package ak;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h extends zj.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f459a;

    /* renamed from: b, reason: collision with root package name */
    public final g f460b;

    public /* synthetic */ h(g gVar, int i4) {
        this.f459a = i4;
        this.f460b = gVar;
    }

    @Override // zj.i
    public final int a() {
        switch (this.f459a) {
        }
        return this.f460b.f455i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f459a) {
            case 0:
                k.e((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f459a) {
            case 0:
                k.e(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                k.e(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f459a) {
            case 0:
                this.f460b.clear();
                break;
            default:
                this.f460b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f459a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                return this.f460b.f((Map.Entry) obj);
            default:
                return this.f460b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f459a) {
            case 0:
                k.e(collection, "elements");
                return this.f460b.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f459a) {
        }
        return this.f460b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f459a) {
            case 0:
                g gVar = this.f460b;
                gVar.getClass();
                return new d(gVar, 0);
            default:
                g gVar2 = this.f460b;
                gVar2.getClass();
                return new d(gVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f459a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    g gVar = this.f460b;
                    gVar.getClass();
                    gVar.c();
                    int iH = gVar.h(entry.getKey());
                    if (iH >= 0) {
                        Object[] objArr = gVar.f449b;
                        k.b(objArr);
                        if (k.a(objArr[iH], entry.getValue())) {
                            gVar.l(iH);
                            break;
                        }
                    }
                }
                break;
            default:
                g gVar2 = this.f460b;
                gVar2.c();
                int iH2 = gVar2.h(obj);
                if (iH2 >= 0) {
                    gVar2.l(iH2);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f459a) {
            case 0:
                k.e(collection, "elements");
                this.f460b.c();
                break;
            default:
                k.e(collection, "elements");
                this.f460b.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f459a) {
            case 0:
                k.e(collection, "elements");
                this.f460b.c();
                break;
            default:
                k.e(collection, "elements");
                this.f460b.c();
                break;
        }
        return super.retainAll(collection);
    }
}
