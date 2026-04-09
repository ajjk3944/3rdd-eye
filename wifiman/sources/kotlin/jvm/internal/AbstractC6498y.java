package kotlin.jvm.internal;

import th.j;
import th.n;

/* renamed from: kotlin.jvm.internal.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6498y extends A implements th.j {
    public AbstractC6498y(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.AbstractC6480f
    protected th.c computeReflected() {
        return O.f(this);
    }

    @Override // mh.InterfaceC6835l
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // th.l
    /* renamed from: d */
    public n.a l0() {
        return ((th.j) getReflected()).l0();
    }

    @Override // th.h
    public j.a g() {
        return ((th.j) getReflected()).g();
    }
}
