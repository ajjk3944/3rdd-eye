package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import r9.i;
import r9.l;
import r9.m;

/* loaded from: classes4.dex */
public abstract class MutablePropertyReference0 extends MutablePropertyReference implements r9.i {
    public MutablePropertyReference0() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public r9.b computeReflected() {
        return t.e(this);
    }

    @Override // r9.m
    @SinceKotlin(version = "1.1")
    public Object getDelegate() {
        return ((r9.i) getReflected()).getDelegate();
    }

    public /* bridge */ /* synthetic */ l.a getGetter() {
        mo457getGetter();
        return null;
    }

    public /* bridge */ /* synthetic */ r9.h getSetter() {
        mo458getSetter();
        return null;
    }

    @Override // l9.a
    public Object invoke() {
        return get();
    }

    public MutablePropertyReference0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // r9.m
    /* renamed from: getGetter, reason: collision with other method in class */
    public m.a mo457getGetter() {
        ((r9.i) getReflected()).mo457getGetter();
        return null;
    }

    @Override // r9.i
    /* renamed from: getSetter, reason: collision with other method in class */
    public i.a mo458getSetter() {
        ((r9.i) getReflected()).mo458getSetter();
        return null;
    }
}
