package wh;

import mh.InterfaceC6824a;
import wh.X;

/* loaded from: classes4.dex */
class O implements InterfaceC6824a {

    /* renamed from: a, reason: collision with root package name */
    private final X f65058a;

    /* renamed from: b, reason: collision with root package name */
    private final X.a f65059b;

    public O(X x10, X.a aVar) {
        this.f65058a = x10;
        this.f65059b = aVar;
    }

    @Override // mh.InterfaceC6824a
    public Object invoke() {
        return X.a.Y(this.f65058a, this.f65059b);
    }
}
