package Mi;

import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import Yg.J;
import dh.C5385j;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class g extends f {
    public /* synthetic */ g(InterfaceC3220g interfaceC3220g, InterfaceC5384i interfaceC5384i, int i10, Ki.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC3220g, (i11 & 2) != 0 ? C5385j.f46088a : interfaceC5384i, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? Ki.a.SUSPEND : aVar);
    }

    @Override // Mi.d
    protected d i(InterfaceC5384i interfaceC5384i, int i10, Ki.a aVar) {
        return new g(this.f13246d, interfaceC5384i, i10, aVar);
    }

    @Override // Mi.d
    public InterfaceC3220g k() {
        return this.f13246d;
    }

    @Override // Mi.f
    protected Object s(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
        Object objB = this.f13246d.b(interfaceC3221h, interfaceC5380e);
        return objB == AbstractC5467b.g() ? objB : J.f24997a;
    }

    public g(InterfaceC3220g interfaceC3220g, InterfaceC5384i interfaceC5384i, int i10, Ki.a aVar) {
        super(interfaceC3220g, interfaceC5384i, i10, aVar);
    }
}
