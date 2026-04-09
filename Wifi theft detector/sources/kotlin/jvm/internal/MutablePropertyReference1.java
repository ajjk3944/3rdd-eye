package kotlin.jvm.internal;

import r9.n;

/* loaded from: classes4.dex */
public abstract class MutablePropertyReference1 extends MutablePropertyReference implements r9.j {
    @Override // kotlin.jvm.internal.CallableReference
    public r9.b computeReflected() {
        return t.f(this);
    }

    @Override // r9.n
    public Object getDelegate(Object obj) {
        return ((r9.j) getReflected()).getDelegate(obj);
    }

    @Override // r9.n
    /* renamed from: getGetter */
    public n.a mo459getGetter() {
        ((r9.j) getReflected()).mo459getGetter();
        return null;
    }

    @Override // l9.l
    public Object invoke(Object obj) {
        return get(obj);
    }
}
