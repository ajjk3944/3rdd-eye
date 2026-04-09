package Ni;

import Ii.T0;
import dh.InterfaceC5384i;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
final class N {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC5384i f16582a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f16583b;

    /* renamed from: c, reason: collision with root package name */
    private final T0[] f16584c;

    /* renamed from: d, reason: collision with root package name */
    private int f16585d;

    public N(InterfaceC5384i interfaceC5384i, int i10) {
        this.f16582a = interfaceC5384i;
        this.f16583b = new Object[i10];
        this.f16584c = new T0[i10];
    }

    public final void a(T0 t02, Object obj) {
        Object[] objArr = this.f16583b;
        int i10 = this.f16585d;
        objArr[i10] = obj;
        T0[] t0Arr = this.f16584c;
        this.f16585d = i10 + 1;
        AbstractC6492s.g(t02, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        t0Arr[i10] = t02;
    }

    public final void b(InterfaceC5384i interfaceC5384i) {
        int length = this.f16584c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            T0 t02 = this.f16584c[length];
            AbstractC6492s.f(t02);
            t02.T(interfaceC5384i, this.f16583b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }
}
