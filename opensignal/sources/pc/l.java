package pc;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: g, reason: collision with root package name */
    public final transient int f20454g;

    /* renamed from: r, reason: collision with root package name */
    public final transient int f20455r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m f20456x;

    public l(m mVar, int i10, int i11) {
        this.f20456x = mVar;
        this.f20454g = i10;
        this.f20455r = i11;
    }

    @Override // pc.j
    public final Object[] a() {
        return this.f20456x.a();
    }

    @Override // pc.j
    public final int b() {
        return this.f20456x.b() + this.f20454g;
    }

    @Override // pc.j
    public final int c() {
        return this.f20456x.b() + this.f20454g + this.f20455r;
    }

    @Override // pc.j
    public final boolean d() {
        return true;
    }

    @Override // pc.m, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final m subList(int i10, int i11) {
        io.sentry.config.a.m0(i10, i11, this.f20455r);
        int i12 = this.f20454g;
        return this.f20456x.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        io.sentry.config.a.l0(i10, this.f20455r);
        return this.f20456x.get(i10 + this.f20454g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20455r;
    }
}
