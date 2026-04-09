package ak;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import nk.k;
import z0.l;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i extends AbstractCollection implements Collection, ok.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f461a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f462b;

    public /* synthetic */ i(int i4, Object obj) {
        this.f461a = i4;
        this.f462b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f461a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.f461a) {
            case 0:
                k.e(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f461a) {
            case 0:
                ((g) this.f462b).clear();
                break;
            default:
                ((z0.d) this.f462b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f461a) {
            case 0:
                return ((g) this.f462b).containsValue(obj);
            default:
                return ((z0.d) this.f462b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f461a) {
            case 0:
                return ((g) this.f462b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f461a) {
            case 0:
                g gVar = (g) this.f462b;
                gVar.getClass();
                return new d(gVar, 2);
            default:
                z0.d dVar = (z0.d) this.f462b;
                z0.k[] kVarArr = new z0.k[8];
                for (int i4 = 0; i4 < 8; i4++) {
                    kVarArr[i4] = new l(2);
                }
                return new z0.g(dVar, kVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f461a) {
            case 0:
                g gVar = (g) this.f462b;
                gVar.c();
                int i4 = gVar.i(obj);
                if (i4 < 0) {
                    return false;
                }
                gVar.l(i4);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f461a) {
            case 0:
                k.e(collection, "elements");
                ((g) this.f462b).c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f461a) {
            case 0:
                k.e(collection, "elements");
                ((g) this.f462b).c();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f461a) {
            case 0:
                return ((g) this.f462b).f455i;
            default:
                z0.d dVar = (z0.d) this.f462b;
                dVar.getClass();
                return dVar.f37813f;
        }
    }
}
