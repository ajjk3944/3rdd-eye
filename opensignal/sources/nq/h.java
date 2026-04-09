package nq;

import br.l;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import s0.m;

/* loaded from: classes.dex */
public final class h extends AbstractCollection implements Collection, cr.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18513a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f18514d;

    public /* synthetic */ h(int i10, Object obj) {
        this.f18513a = i10;
        this.f18514d = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f18513a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.f18513a) {
            case 0:
                l.e(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f18513a) {
            case 0:
                ((f) this.f18514d).clear();
                break;
            default:
                ((v0.g) this.f18514d).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f18513a) {
            case 0:
                return ((f) this.f18514d).containsValue(obj);
            default:
                return ((v0.g) this.f18514d).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f18513a) {
            case 0:
                return ((f) this.f18514d).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f18513a) {
            case 0:
                f fVar = (f) this.f18514d;
                fVar.getClass();
                return new d(fVar, 2);
            default:
                v0.g gVar = (v0.g) this.f18514d;
                s0.l[] lVarArr = new s0.l[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    lVarArr[i10] = new m(2);
                }
                return new s0.g(gVar, lVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f18513a) {
            case 0:
                f fVar = (f) this.f18514d;
                fVar.c();
                int i10 = fVar.i(obj);
                if (i10 < 0) {
                    return false;
                }
                fVar.l(i10);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f18513a) {
            case 0:
                l.e(collection, "elements");
                ((f) this.f18514d).c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f18513a) {
            case 0:
                l.e(collection, "elements");
                ((f) this.f18514d).c();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f18513a) {
            case 0:
                return ((f) this.f18514d).E;
            default:
                return ((v0.g) this.f18514d).c();
        }
    }
}
