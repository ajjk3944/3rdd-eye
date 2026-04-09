package li;

import mh.InterfaceC6824a;
import ni.C6963N;

/* renamed from: li.C, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6600C implements InterfaceC6824a {

    /* renamed from: a, reason: collision with root package name */
    private final C6608K f52619a;

    /* renamed from: b, reason: collision with root package name */
    private final Uh.n f52620b;

    /* renamed from: c, reason: collision with root package name */
    private final C6963N f52621c;

    public C6600C(C6608K c6608k, Uh.n nVar, C6963N c6963n) {
        this.f52619a = c6608k;
        this.f52620b = nVar;
        this.f52621c = c6963n;
    }

    @Override // mh.InterfaceC6824a
    public Object invoke() {
        return C6608K.v(this.f52619a, this.f52620b, this.f52621c);
    }
}
