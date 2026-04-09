package Ni;

import Ii.AbstractC3043a;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;

/* loaded from: classes4.dex */
public class y extends AbstractC3043a implements kotlin.coroutines.jvm.internal.e {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC5380e f16627d;

    public y(InterfaceC5384i interfaceC5384i, InterfaceC5380e interfaceC5380e) {
        super(interfaceC5384i, true, true);
        this.f16627d = interfaceC5380e;
    }

    @Override // Ii.AbstractC3043a
    protected void N0(Object obj) {
        InterfaceC5380e interfaceC5380e = this.f16627d;
        interfaceC5380e.resumeWith(Ii.D.a(obj, interfaceC5380e));
    }

    public void R0() {
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public final kotlin.coroutines.jvm.internal.e getCallerFrame() {
        InterfaceC5380e interfaceC5380e = this.f16627d;
        if (interfaceC5380e instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) interfaceC5380e;
        }
        return null;
    }

    @Override // Ii.D0
    protected final boolean i0() {
        return true;
    }

    @Override // Ii.D0
    protected void w(Object obj) {
        AbstractC3406h.b(AbstractC5467b.d(this.f16627d), Ii.D.a(obj, this.f16627d));
    }
}
