package defpackage;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class eb0 extends AbstractSet implements Set, p40 {
    public final /* synthetic */ int f;
    public final db0 g;

    public /* synthetic */ eb0(db0 db0Var, int i) {
        this.f = i;
        this.g = db0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f) {
            case 0:
                i30.m((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f) {
            case 0:
                i30.m(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                i30.m(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f) {
            case 0:
                this.g.clear();
                break;
            default:
                this.g.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                return this.g.e((Map.Entry) obj);
            default:
                return this.g.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f) {
            case 0:
                i30.m(collection, "elements");
                return this.g.d(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f) {
        }
        return this.g.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f) {
            case 0:
                db0 db0Var = this.g;
                db0Var.getClass();
                return new ab0(db0Var, 0);
            default:
                db0 db0Var2 = this.g;
                db0Var2.getClass();
                return new ab0(db0Var2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    db0 db0Var = this.g;
                    db0Var.getClass();
                    db0Var.b();
                    int iG = db0Var.g(entry.getKey());
                    if (iG >= 0) {
                        Object[] objArr = db0Var.g;
                        i30.j(objArr);
                        if (i30.c(objArr[iG], entry.getValue())) {
                            db0Var.k(iG);
                            break;
                        }
                    }
                }
                break;
            default:
                db0 db0Var2 = this.g;
                db0Var2.b();
                int iG2 = db0Var2.g(obj);
                if (iG2 >= 0) {
                    db0Var2.k(iG2);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f) {
            case 0:
                i30.m(collection, "elements");
                this.g.b();
                break;
            default:
                i30.m(collection, "elements");
                this.g.b();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f) {
            case 0:
                i30.m(collection, "elements");
                this.g.b();
                break;
            default:
                i30.m(collection, "elements");
                this.g.b();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f) {
        }
        return this.g.n;
    }
}
