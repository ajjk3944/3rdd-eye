package nq;

import br.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class g extends mq.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18511a;

    /* renamed from: d, reason: collision with root package name */
    public final f f18512d;

    public /* synthetic */ g(f fVar, int i10) {
        this.f18511a = i10;
        this.f18512d = fVar;
    }

    @Override // mq.h
    public final int a() {
        switch (this.f18511a) {
        }
        return this.f18512d.E;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f18511a) {
            case 0:
                l.e((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f18511a) {
            case 0:
                l.e(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                l.e(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f18511a) {
            case 0:
                this.f18512d.clear();
                break;
            default:
                this.f18512d.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f18511a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                return this.f18512d.f((Map.Entry) obj);
            default:
                return this.f18512d.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f18511a) {
            case 0:
                l.e(collection, "elements");
                return this.f18512d.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f18511a) {
        }
        return this.f18512d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f18511a) {
            case 0:
                f fVar = this.f18512d;
                fVar.getClass();
                return new d(fVar, 0);
            default:
                f fVar2 = this.f18512d;
                fVar2.getClass();
                return new d(fVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f18511a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    f fVar = this.f18512d;
                    fVar.getClass();
                    fVar.c();
                    int iH = fVar.h(entry.getKey());
                    if (iH >= 0) {
                        Object[] objArr = fVar.f18506d;
                        l.b(objArr);
                        if (l.a(objArr[iH], entry.getValue())) {
                            fVar.l(iH);
                            break;
                        }
                    }
                }
                break;
            default:
                f fVar2 = this.f18512d;
                fVar2.c();
                int iH2 = fVar2.h(obj);
                if (iH2 >= 0) {
                    fVar2.l(iH2);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f18511a) {
            case 0:
                l.e(collection, "elements");
                this.f18512d.c();
                break;
            default:
                l.e(collection, "elements");
                this.f18512d.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f18511a) {
            case 0:
                l.e(collection, "elements");
                this.f18512d.c();
                break;
            default:
                l.e(collection, "elements");
                this.f18512d.c();
                break;
        }
        return super.retainAll(collection);
    }
}
