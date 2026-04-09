package kotlin.jvm.internal;

import th.n;

/* loaded from: classes4.dex */
public abstract class E extends I implements th.n {
    public E() {
    }

    @Override // kotlin.jvm.internal.AbstractC6480f
    protected th.c computeReflected() {
        return O.h(this);
    }

    @Override // mh.InterfaceC6835l
    public Object invoke(Object obj) {
        return get(obj);
    }

    public E(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // th.l
    /* renamed from: d */
    public n.a l0() {
        return ((th.n) getReflected()).l0();
    }
}
