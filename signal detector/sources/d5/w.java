package d5;

import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public final class w implements ListIterator, r5.a {

    /* renamed from: a, reason: collision with root package name */
    public final ListIterator f19827a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f19828b;

    public w(x xVar, int i) {
        this.f19828b = xVar;
        List list = xVar.f19829a;
        if (i >= 0 && i <= xVar.a()) {
            this.f19827a = list.listIterator(xVar.a() - i);
            return;
        }
        StringBuilder sbP = AbstractC1135f5.p(i, "Position index ", " must be in range [");
        sbP.append(new v5.c(0, xVar.a(), 1));
        sbP.append("].");
        throw new IndexOutOfBoundsException(sbP.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f19827a.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f19827a.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f19827a.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return AbstractC2283k.L(this.f19828b) - this.f19827a.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f19827a.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return AbstractC2283k.L(this.f19828b) - this.f19827a.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
