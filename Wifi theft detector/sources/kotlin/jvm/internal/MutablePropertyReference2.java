package kotlin.jvm.internal;

import r9.o;

/* loaded from: classes4.dex */
public abstract class MutablePropertyReference2 extends MutablePropertyReference implements r9.k {
    @Override // kotlin.jvm.internal.CallableReference
    public r9.b computeReflected() {
        return t.g(this);
    }

    @Override // r9.o
    public o.a getGetter() {
        ((r9.k) getReflected()).getGetter();
        return null;
    }

    @Override // l9.p
    public Object invoke(Object obj, Object obj2) {
        return m(obj, obj2);
    }
}
