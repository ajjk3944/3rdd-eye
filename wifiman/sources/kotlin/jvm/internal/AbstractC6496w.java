package kotlin.jvm.internal;

import th.i;
import th.m;

/* renamed from: kotlin.jvm.internal.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6496w extends A implements th.i {
    public AbstractC6496w(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.AbstractC6480f
    protected th.c computeReflected() {
        return O.e(this);
    }

    @Override // mh.InterfaceC6824a
    public Object invoke() {
        return get();
    }

    @Override // th.l
    public m.a d() {
        return ((th.i) getReflected()).d();
    }

    @Override // th.h
    public i.a g() {
        return ((th.i) getReflected()).g();
    }
}
