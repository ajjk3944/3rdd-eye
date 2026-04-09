package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
class k implements InterfaceC6824a {

    /* renamed from: a, reason: collision with root package name */
    private final l f51918a;

    public k(l lVar) {
        this.f51918a = lVar;
    }

    @Override // mh.InterfaceC6824a
    public Object invoke() {
        return l.c(this.f51918a);
    }
}
