package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;

@Deprecated(level = DeprecationLevel.f21903b, message = "This class is no longer supported, do not use it.")
@Deprecated
/* loaded from: classes4.dex */
public abstract class FunctionImpl implements y8.e, Serializable, l9.a, l9.l, l9.p, l9.q, l9.r, l9.s, l9.t, l9.u, l9.v, l9.w, l9.b, l9.c, l9.d, l9.e, l9.f, l9.g, l9.h, l9.i, l9.j, l9.k, l9.m, l9.n, l9.o {
    public final void a(int i10) {
        if (getArity() != i10) {
            d(i10);
        }
    }

    public Object b(Object... objArr) {
        throw new UnsupportedOperationException();
    }

    @Override // l9.r
    public Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        a(4);
        return b(obj, obj2, obj3, obj4);
    }

    public final void d(int i10) {
        throw new IllegalStateException("Wrong function arity, expected: " + i10 + ", actual: " + getArity());
    }

    @Override // l9.u
    public Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        a(7);
        return b(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public abstract int getArity();

    @Override // l9.a
    public Object invoke() {
        a(0);
        return b(new Object[0]);
    }

    @Override // l9.s
    public Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        a(5);
        return b(obj, obj2, obj3, obj4, obj5);
    }

    @Override // l9.l
    public Object invoke(Object obj) {
        a(1);
        return b(obj);
    }

    @Override // l9.p
    public Object invoke(Object obj, Object obj2) {
        a(2);
        return b(obj, obj2);
    }

    @Override // l9.q
    public Object invoke(Object obj, Object obj2, Object obj3) {
        a(3);
        return b(obj, obj2, obj3);
    }

    @Override // l9.t
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        a(6);
        return b(obj, obj2, obj3, obj4, obj5, obj6);
    }
}
