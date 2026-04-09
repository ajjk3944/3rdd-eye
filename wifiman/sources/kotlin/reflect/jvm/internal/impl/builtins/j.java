package kotlin.reflect.jvm.internal.impl.builtins;

import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
class j implements InterfaceC6824a {

    /* renamed from: a, reason: collision with root package name */
    private final l f51753a;

    public j(l lVar) {
        this.f51753a = lVar;
    }

    @Override // mh.InterfaceC6824a
    public Object invoke() {
        return l.typeFqName_delegate$lambda$0(this.f51753a);
    }
}
