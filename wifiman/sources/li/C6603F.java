package li;

import mh.InterfaceC6824a;

/* renamed from: li.F, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6603F implements InterfaceC6824a {

    /* renamed from: a, reason: collision with root package name */
    private final C6608K f52628a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f52629b;

    /* renamed from: c, reason: collision with root package name */
    private final Uh.n f52630c;

    public C6603F(C6608K c6608k, boolean z10, Uh.n nVar) {
        this.f52628a = c6608k;
        this.f52629b = z10;
        this.f52630c = nVar;
    }

    @Override // mh.InterfaceC6824a
    public Object invoke() {
        return C6608K.n(this.f52628a, this.f52629b, this.f52630c);
    }
}
