package Ii;

import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;

/* loaded from: classes4.dex */
class W extends AbstractC3043a implements V {
    public W(InterfaceC5384i interfaceC5384i, boolean z10) {
        super(interfaceC5384i, true, z10);
    }

    static /* synthetic */ Object R0(W w10, InterfaceC5380e interfaceC5380e) throws Throwable {
        Object objX = w10.x(interfaceC5380e);
        AbstractC5467b.g();
        return objX;
    }

    @Override // Ii.V
    public Object await(InterfaceC5380e interfaceC5380e) {
        return R0(this, interfaceC5380e);
    }

    @Override // Ii.V
    public Object getCompleted() {
        return O();
    }
}
