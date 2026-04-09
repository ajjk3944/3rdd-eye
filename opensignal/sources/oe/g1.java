package oe;

/* loaded from: classes.dex */
public final class g1 extends k0 {

    /* renamed from: r, reason: collision with root package name */
    public final transient Object f19335r;

    public g1(Object obj) {
        obj.getClass();
        this.f19335r = obj;
    }

    @Override // oe.k0, oe.c0
    public final h0 a() {
        return h0.p(this.f19335r);
    }

    @Override // oe.c0
    public final int b(int i10, Object[] objArr) {
        objArr[i10] = this.f19335r;
        return i10 + 1;
    }

    @Override // oe.c0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f19335r.equals(obj);
    }

    @Override // oe.c0
    public final boolean g() {
        return false;
    }

    @Override // oe.k0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f19335r.hashCode();
    }

    @Override // oe.c0
    /* renamed from: j */
    public final h1 iterator() {
        return new m0(this.f19335r);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.f19335r.toString();
        StringBuilder sb2 = new StringBuilder(c7.a.d(2, string));
        sb2.append('[');
        sb2.append(string);
        sb2.append(']');
        return sb2.toString();
    }
}
