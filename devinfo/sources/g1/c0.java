package g1;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c0 implements ListIterator, ok.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24215a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f24216b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24217c;

    public c0(vk.d dVar, int i4) {
        this.f24217c = dVar;
        List list = (List) dVar.f36280b;
        if (i4 >= 0 && i4 <= dVar.size()) {
            this.f24216b = list.listIterator(dVar.size() - i4);
            return;
        }
        StringBuilder sbW = je.u.w(i4, "Position index ", " must be in range [");
        sbW.append(new sk.d(0, dVar.size(), 1));
        sbW.append("].");
        throw new IndexOutOfBoundsException(sbW.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f24215a) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f24215a) {
            case 0:
                return ((nk.s) this.f24216b).f29984a < ((d0) this.f24217c).f24223d - 1;
            default:
                return ((ListIterator) this.f24216b).hasPrevious();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f24215a) {
            case 0:
                return ((nk.s) this.f24216b).f29984a >= 0;
            default:
                return ((ListIterator) this.f24216b).hasNext();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f24215a) {
            case 0:
                nk.s sVar = (nk.s) this.f24216b;
                int i4 = sVar.f29984a + 1;
                d0 d0Var = (d0) this.f24217c;
                r.a(i4, d0Var.f24223d);
                sVar.f29984a = i4;
                return d0Var.get(i4);
            default:
                return ((ListIterator) this.f24216b).previous();
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f24215a) {
            case 0:
                return ((nk.s) this.f24216b).f29984a + 1;
            default:
                vk.d dVar = (vk.d) this.f24217c;
                return cm.g.r(dVar) - ((ListIterator) this.f24216b).previousIndex();
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f24215a) {
            case 0:
                nk.s sVar = (nk.s) this.f24216b;
                int i4 = sVar.f29984a;
                d0 d0Var = (d0) this.f24217c;
                r.a(i4, d0Var.f24223d);
                sVar.f29984a = i4 - 1;
                return d0Var.get(i4);
            default:
                return ((ListIterator) this.f24216b).next();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f24215a) {
            case 0:
                return ((nk.s) this.f24216b).f29984a;
            default:
                vk.d dVar = (vk.d) this.f24217c;
                return cm.g.r(dVar) - ((ListIterator) this.f24216b).nextIndex();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f24215a) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f24215a) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c0(nk.s sVar, d0 d0Var) {
        this.f24216b = sVar;
        this.f24217c = d0Var;
    }
}
