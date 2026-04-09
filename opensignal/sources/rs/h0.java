package rs;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import oe.o0;

/* loaded from: classes.dex */
public final class h0 extends AbstractList implements RandomAccess, v {

    /* renamed from: a, reason: collision with root package name */
    public final u f21758a;

    public h0(u uVar) {
        this.f21758a = uVar;
    }

    @Override // rs.v
    public final List f() {
        return Collections.unmodifiableList(this.f21758a.f21778a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (String) this.f21758a.get(i10);
    }

    @Override // rs.v
    public final void h(w wVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        o0 o0Var = new o0();
        o0Var.f19362d = this.f21758a.iterator();
        return o0Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        g0 g0Var = new g0();
        g0Var.f21755a = this.f21758a.listIterator(i10);
        return g0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21758a.size();
    }

    @Override // rs.v
    public final e y(int i10) {
        return this.f21758a.y(i10);
    }

    @Override // rs.v
    public final h0 L() {
        return this;
    }
}
