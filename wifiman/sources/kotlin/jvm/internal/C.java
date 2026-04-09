package kotlin.jvm.internal;

import th.m;

/* loaded from: classes4.dex */
public abstract class C extends I implements th.m {
    public C(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.AbstractC6480f
    protected th.c computeReflected() {
        return O.g(this);
    }

    @Override // mh.InterfaceC6824a
    public Object invoke() {
        return get();
    }

    @Override // th.l
    /* renamed from: d */
    public m.a l0() {
        return ((th.m) getReflected()).l0();
    }
}
