package ac;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends f {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f310c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f312e;

    public e(f fVar, int i4, int i10) {
        this.f312e = fVar;
        this.f310c = i4;
        this.f311d = i10;
    }

    @Override // ac.b
    public final Object[] a() {
        return this.f312e.a();
    }

    @Override // ac.b
    public final int c() {
        return this.f312e.c() + this.f310c;
    }

    @Override // ac.b
    public final int d() {
        return this.f312e.c() + this.f310c + this.f311d;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        jm.a.D(i4, this.f311d);
        return this.f312e.get(i4 + this.f310c);
    }

    @Override // ac.f, java.util.List
    /* renamed from: i */
    public final f subList(int i4, int i10) {
        jm.a.E(i4, i10, this.f311d);
        int i11 = this.f310c;
        return this.f312e.subList(i4 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f311d;
    }
}
