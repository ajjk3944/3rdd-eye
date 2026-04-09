package mh;

/* loaded from: classes.dex */
public final class e extends d {
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f16731l;

    @Override // mh.d
    public final boolean c() {
        return this.k < this.f16731l && !this.f16729h.get();
    }

    @Override // mh.d
    public final void d(c cVar) {
        super.d(cVar);
        this.k++;
    }
}
