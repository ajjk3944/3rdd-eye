package pi;

import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
class X implements InterfaceC6824a {

    /* renamed from: a, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.types.checker.g f58102a;

    /* renamed from: b, reason: collision with root package name */
    private final Y f58103b;

    public X(kotlin.reflect.jvm.internal.impl.types.checker.g gVar, Y y10) {
        this.f58102a = gVar;
        this.f58103b = y10;
    }

    @Override // mh.InterfaceC6824a
    public Object invoke() {
        return Y.V0(this.f58102a, this.f58103b);
    }
}
