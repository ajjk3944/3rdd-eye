package wh;

import mh.InterfaceC6824a;
import wh.X;

/* loaded from: classes4.dex */
class T implements InterfaceC6824a {

    /* renamed from: a, reason: collision with root package name */
    private final X.a f65068a;

    /* renamed from: b, reason: collision with root package name */
    private final X f65069b;

    public T(X.a aVar, X x10) {
        this.f65068a = aVar;
        this.f65069b = x10;
    }

    @Override // mh.InterfaceC6824a
    public Object invoke() {
        return X.a.V(this.f65068a, this.f65069b);
    }
}
