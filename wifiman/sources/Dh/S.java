package Dh;

import Bh.InterfaceC2494d;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
class S implements InterfaceC6824a {

    /* renamed from: a, reason: collision with root package name */
    private final T f3405a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2494d f3406b;

    public S(T t10, InterfaceC2494d interfaceC2494d) {
        this.f3405a = t10;
        this.f3406b = interfaceC2494d;
    }

    @Override // mh.InterfaceC6824a
    public Object invoke() {
        return T.r1(this.f3405a, this.f3406b);
    }
}
