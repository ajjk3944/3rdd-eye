package kotlin.jvm.internal;

import r9.o;

/* loaded from: classes4.dex */
public abstract class PropertyReference2 extends PropertyReference implements r9.o {
    @Override // kotlin.jvm.internal.CallableReference
    public r9.b computeReflected() {
        return t.j(this);
    }

    @Override // r9.o
    public o.a getGetter() {
        ((r9.o) getReflected()).getGetter();
        return null;
    }

    @Override // l9.p
    public Object invoke(Object obj, Object obj2) {
        return m(obj, obj2);
    }
}
