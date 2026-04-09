package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bm3 extends tl3 implements ListIterator {
    public final /* synthetic */ cm3 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm3(cm3 cm3Var) {
        super(cm3Var);
        this.j = cm3Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        cm3 cm3Var = this.j;
        boolean zIsEmpty = cm3Var.isEmpty();
        a();
        ((ListIterator) this.g).add(obj);
        cm3Var.k.j++;
        if (zIsEmpty) {
            cm3Var.c();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.g).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.g).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.g).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.g).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.g).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm3(cm3 cm3Var, int i) {
        super(cm3Var, ((List) cm3Var.g).listIterator(i));
        this.j = cm3Var;
    }
}
