package e5;

import d5.AbstractC2278f;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: e5.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2311g extends AbstractC2278f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19972a;

    /* renamed from: b, reason: collision with root package name */
    public final C2310f f19973b;

    public /* synthetic */ C2311g(C2310f c2310f, int i) {
        this.f19972a = i;
        this.f19973b = c2310f;
    }

    @Override // d5.AbstractC2278f
    public final int a() {
        switch (this.f19972a) {
        }
        return this.f19973b.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f19972a) {
            case 0:
                q5.i.e((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f19972a) {
            case 0:
                q5.i.e(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                q5.i.e(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f19972a) {
            case 0:
                this.f19973b.clear();
                break;
            default:
                this.f19973b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f19972a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                q5.i.e(entry, "element");
                return this.f19973b.f(entry);
            default:
                return this.f19973b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f19972a) {
            case 0:
                q5.i.e(collection, "elements");
                return this.f19973b.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f19972a) {
        }
        return this.f19973b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f19972a) {
            case 0:
                C2310f c2310f = this.f19973b;
                c2310f.getClass();
                return new C2308d(c2310f, 0);
            default:
                C2310f c2310f2 = this.f19973b;
                c2310f2.getClass();
                return new C2308d(c2310f2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f19972a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    q5.i.e(entry, "element");
                    C2310f c2310f = this.f19973b;
                    c2310f.getClass();
                    c2310f.c();
                    int iH = c2310f.h(entry.getKey());
                    if (iH >= 0) {
                        Object[] objArr = c2310f.f19961b;
                        q5.i.b(objArr);
                        if (q5.i.a(objArr[iH], entry.getValue())) {
                            c2310f.l(iH);
                            break;
                        }
                    }
                }
                break;
            default:
                C2310f c2310f2 = this.f19973b;
                c2310f2.c();
                int iH2 = c2310f2.h(obj);
                if (iH2 >= 0) {
                    c2310f2.l(iH2);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f19972a) {
            case 0:
                q5.i.e(collection, "elements");
                this.f19973b.c();
                break;
            default:
                q5.i.e(collection, "elements");
                this.f19973b.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f19972a) {
            case 0:
                q5.i.e(collection, "elements");
                this.f19973b.c();
                break;
            default:
                q5.i.e(collection, "elements");
                this.f19973b.c();
                break;
        }
        return super.retainAll(collection);
    }
}
