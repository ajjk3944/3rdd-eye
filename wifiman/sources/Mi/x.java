package Mi;

import Li.InterfaceC3221h;
import Yg.J;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;

/* loaded from: classes4.dex */
public final class x implements InterfaceC3221h {

    /* renamed from: a, reason: collision with root package name */
    private final Ki.w f13309a;

    public x(Ki.w wVar) {
        this.f13309a = wVar;
    }

    @Override // Li.InterfaceC3221h
    public Object a(Object obj, InterfaceC5380e interfaceC5380e) {
        Object objB = this.f13309a.b(obj, interfaceC5380e);
        return objB == AbstractC5467b.g() ? objB : J.f24997a;
    }
}
