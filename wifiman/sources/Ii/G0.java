package Ii;

import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
final class G0 extends Q0 {

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC5380e f9269d;

    public G0(InterfaceC5384i interfaceC5384i, InterfaceC6839p interfaceC6839p) {
        super(interfaceC5384i, false);
        this.f9269d = AbstractC5467b.b(interfaceC6839p, this, this);
    }

    @Override // Ii.D0
    protected void w0() throws Throwable {
        Oi.a.b(this.f9269d, this);
    }
}
