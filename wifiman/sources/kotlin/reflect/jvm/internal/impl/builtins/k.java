package kotlin.reflect.jvm.internal.impl.builtins;

import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
class k implements InterfaceC6824a {

    /* renamed from: a, reason: collision with root package name */
    private final l f51754a;

    public k(l lVar) {
        this.f51754a = lVar;
    }

    @Override // mh.InterfaceC6824a
    public Object invoke() {
        return l.arrayTypeFqName_delegate$lambda$1(this.f51754a);
    }
}
