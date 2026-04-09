package ac;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends f {

    /* renamed from: c, reason: collision with root package name */
    public final transient f f309c;

    public d(f fVar) {
        this.f309c = fVar;
    }

    @Override // ac.f, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f309c.contains(obj);
    }

    @Override // ac.f
    public final f g() {
        return this.f309c;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        f fVar = this.f309c;
        jm.a.D(i4, fVar.size());
        return fVar.get((fVar.size() - 1) - i4);
    }

    @Override // ac.f, java.util.List
    /* renamed from: i */
    public final f subList(int i4, int i10) {
        f fVar = this.f309c;
        jm.a.E(i4, i10, fVar.size());
        return fVar.subList(fVar.size() - i10, fVar.size() - i4).g();
    }

    @Override // ac.f, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.f309c.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (r0.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // ac.f, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.f309c.indexOf(obj);
        if (iIndexOf >= 0) {
            return (r0.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f309c.size();
    }
}
