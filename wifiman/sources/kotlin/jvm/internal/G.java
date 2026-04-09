package kotlin.jvm.internal;

import th.o;

/* loaded from: classes4.dex */
public abstract class G extends I implements th.o {
    public G(Class cls, String str, String str2, int i10) {
        super(AbstractC6480f.NO_RECEIVER, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.AbstractC6480f
    protected th.c computeReflected() {
        return O.i(this);
    }

    @Override // mh.InterfaceC6839p
    public Object invoke(Object obj, Object obj2) {
        return P(obj, obj2);
    }

    @Override // th.l
    public o.a d() {
        return ((th.o) getReflected()).d();
    }
}
