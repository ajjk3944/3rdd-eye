package oe;

/* loaded from: classes.dex */
public final class x0 extends k0 {

    /* renamed from: r, reason: collision with root package name */
    public final transient z0 f19400r;

    /* renamed from: x, reason: collision with root package name */
    public final transient y0 f19401x;

    public x0(z0 z0Var, y0 y0Var) {
        this.f19400r = z0Var;
        this.f19401x = y0Var;
    }

    @Override // oe.k0, oe.c0
    public final h0 a() {
        return this.f19401x;
    }

    @Override // oe.c0
    public final int b(int i10, Object[] objArr) {
        return this.f19401x.b(i10, objArr);
    }

    @Override // oe.c0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f19400r.get(obj) != null;
    }

    @Override // oe.c0
    public final boolean g() {
        return true;
    }

    @Override // oe.c0
    /* renamed from: j */
    public final h1 iterator() {
        return this.f19401x.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19400r.f19411y;
    }
}
