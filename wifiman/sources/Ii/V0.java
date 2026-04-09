package Ii;

import dh.InterfaceC5380e;

/* loaded from: classes4.dex */
final class V0 extends Ni.y implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final long f9288e;

    public V0(long j10, InterfaceC5380e interfaceC5380e) {
        super(interfaceC5380e.getContext(), interfaceC5380e);
        this.f9288e = j10;
    }

    @Override // Ii.AbstractC3043a, Ii.D0
    public String o0() {
        return super.o0() + "(timeMillis=" + this.f9288e + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        A(W0.a(this.f9288e, Y.b(getContext()), this));
    }
}
