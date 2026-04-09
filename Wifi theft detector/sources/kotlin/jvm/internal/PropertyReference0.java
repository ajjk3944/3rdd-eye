package kotlin.jvm.internal;

import r9.m;

/* loaded from: classes4.dex */
public abstract class PropertyReference0 extends PropertyReference implements r9.m {
    public PropertyReference0() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public r9.b computeReflected() {
        return t.h(this);
    }

    @Override // r9.m
    /* renamed from: getGetter */
    public m.a mo457getGetter() {
        ((r9.m) getReflected()).mo457getGetter();
        return null;
    }

    @Override // l9.a
    public Object invoke() {
        return get();
    }

    public PropertyReference0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
