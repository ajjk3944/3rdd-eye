package oe;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class m extends e implements ListIterator {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n f19352x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar) {
        super(nVar);
        this.f19352x = nVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        n nVar = this.f19352x;
        boolean zIsEmpty = nVar.isEmpty();
        b().add(obj);
        nVar.f19360y.f19370x++;
        if (zIsEmpty) {
            nVar.a();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.f19317d;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, int i10) {
        super(nVar, ((List) nVar.f19356d).listIterator(i10));
        this.f19352x = nVar;
    }
}
