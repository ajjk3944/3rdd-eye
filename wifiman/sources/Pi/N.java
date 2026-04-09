package pi;

import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
class N implements InterfaceC6835l {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6835l f58080a;

    public N(InterfaceC6835l interfaceC6835l) {
        this.f58080a = interfaceC6835l;
    }

    @Override // mh.InterfaceC6835l
    public Object invoke(Object obj) {
        return Q.p(this.f58080a, (S) obj);
    }
}
