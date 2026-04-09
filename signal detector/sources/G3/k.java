package G3;

/* loaded from: classes.dex */
public final class k extends C0152f {

    /* renamed from: b, reason: collision with root package name */
    public final C0153g f1609b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1610c;

    public k(C0153g c0153g, float f2) {
        super(0);
        this.f1609b = c0153g;
        this.f1610c = f2;
    }

    @Override // G3.C0152f
    public final boolean i() {
        return true;
    }

    @Override // G3.C0152f
    public final void k(float f2, float f5, float f6, y yVar) {
        this.f1609b.k(f2, f5 - this.f1610c, f6, yVar);
    }
}
