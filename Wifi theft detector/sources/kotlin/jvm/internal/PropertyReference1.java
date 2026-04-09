package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import r9.l;
import r9.n;

/* loaded from: classes4.dex */
public abstract class PropertyReference1 extends PropertyReference implements r9.n {
    public PropertyReference1() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public r9.b computeReflected() {
        return t.i(this);
    }

    @Override // r9.n
    @SinceKotlin(version = "1.1")
    public Object getDelegate(Object obj) {
        return ((r9.n) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ l.a getGetter() {
        mo459getGetter();
        return null;
    }

    @Override // l9.l
    public Object invoke(Object obj) {
        return get(obj);
    }

    public PropertyReference1(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // r9.n
    /* renamed from: getGetter, reason: collision with other method in class */
    public n.a mo459getGetter() {
        ((r9.n) getReflected()).mo459getGetter();
        return null;
    }
}
