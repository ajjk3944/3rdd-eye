package ot;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class p extends a {

    /* renamed from: a, reason: collision with root package name */
    public final ht.i f19820a;

    /* renamed from: d, reason: collision with root package name */
    public final int f19821d;

    public p(int i10, ht.i iVar) {
        this.f19820a = iVar;
        this.f19821d = i10;
    }

    @Override // ot.a
    public final int a() {
        return 1;
    }

    @Override // ot.a
    public final void b(int i10, ht.i iVar) {
        throw new IllegalStateException();
    }

    @Override // ot.a
    public final Object get(int i10) {
        if (i10 == this.f19821d) {
            return this.f19820a;
        }
        return null;
    }

    @Override // ot.a, java.lang.Iterable
    public final Iterator iterator() {
        return new rt.g(2, this);
    }
}
