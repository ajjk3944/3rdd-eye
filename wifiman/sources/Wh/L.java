package wh;

import mh.InterfaceC6824a;
import wh.X;

/* loaded from: classes4.dex */
class L implements InterfaceC6824a {

    /* renamed from: a, reason: collision with root package name */
    private final pi.S f65050a;

    /* renamed from: b, reason: collision with root package name */
    private final X.a f65051b;

    /* renamed from: c, reason: collision with root package name */
    private final X f65052c;

    public L(pi.S s10, X.a aVar, X x10) {
        this.f65050a = s10;
        this.f65051b = aVar;
        this.f65052c = x10;
    }

    @Override // mh.InterfaceC6824a
    public Object invoke() {
        return X.a.a0(this.f65050a, this.f65051b, this.f65052c);
    }
}
