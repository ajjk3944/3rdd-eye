package Y2;

/* loaded from: classes.dex */
public final class E extends F {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f4258c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f4259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ F f4260e;

    public E(F f2, int i, int i3) {
        this.f4260e = f2;
        this.f4258c = i;
        this.f4259d = i3;
    }

    @Override // Y2.C
    public final int b() {
        return this.f4260e.c() + this.f4258c + this.f4259d;
    }

    @Override // Y2.C
    public final int c() {
        return this.f4260e.c() + this.f4258c;
    }

    @Override // Y2.C
    public final Object[] d() {
        return this.f4260e.d();
    }

    @Override // Y2.F, java.util.List
    /* renamed from: e */
    public final F subList(int i, int i3) {
        A.d(i, i3, this.f4259d);
        int i6 = this.f4258c;
        return this.f4260e.subList(i + i6, i3 + i6);
    }

    @Override // java.util.List
    public final Object get(int i) {
        A.b(i, this.f4259d);
        return this.f4260e.get(i + this.f4258c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4259d;
    }
}
