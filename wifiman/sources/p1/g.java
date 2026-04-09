package p1;

import p1.f;

/* loaded from: classes.dex */
class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f57484m;

    public g(m mVar) {
        super(mVar);
        if (mVar instanceof j) {
            this.f57476e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f57476e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // p1.f
    public void d(int i10) {
        if (this.f57481j) {
            return;
        }
        this.f57481j = true;
        this.f57478g = i10;
        for (d dVar : this.f57482k) {
            dVar.a(dVar);
        }
    }
}
