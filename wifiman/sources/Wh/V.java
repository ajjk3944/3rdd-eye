package wh;

import mh.InterfaceC6824a;
import wh.X;

/* loaded from: classes4.dex */
class V implements InterfaceC6824a {

    /* renamed from: a, reason: collision with root package name */
    private final X.a f65081a;

    /* renamed from: b, reason: collision with root package name */
    private final X f65082b;

    public V(X.a aVar, X x10) {
        this.f65081a = aVar;
        this.f65082b = x10;
    }

    @Override // mh.InterfaceC6824a
    public Object invoke() {
        return X.a.Z(this.f65081a, this.f65082b);
    }
}
