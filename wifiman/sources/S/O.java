package s;

import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import l0.C6531g;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public final class O implements S {

    /* renamed from: a, reason: collision with root package name */
    public static final O f60688a = new O();

    private O() {
    }

    @Override // s.S
    public Object a(long j10, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
        Object objInvoke = interfaceC6839p.invoke(Y0.y.b(j10), interfaceC5380e);
        return objInvoke == AbstractC5467b.g() ? objInvoke : Yg.J.f24997a;
    }

    @Override // s.S
    public long b(long j10, int i10, InterfaceC6835l interfaceC6835l) {
        return ((C6531g) interfaceC6835l.invoke(C6531g.d(j10))).v();
    }

    @Override // s.S
    public androidx.compose.ui.e c() {
        return androidx.compose.ui.e.f28771b0;
    }

    @Override // s.S
    public boolean d() {
        return false;
    }
}
