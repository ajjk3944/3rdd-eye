package y;

import Li.F;
import Li.y;
import Yg.J;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;

/* renamed from: y.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8559n implements InterfaceC8558m {

    /* renamed from: a, reason: collision with root package name */
    private final y f66191a = F.b(0, 16, Ki.a.DROP_OLDEST, 1, null);

    @Override // y.InterfaceC8558m
    public Object a(InterfaceC8555j interfaceC8555j, InterfaceC5380e interfaceC5380e) {
        Object objA = b().a(interfaceC8555j, interfaceC5380e);
        return objA == AbstractC5467b.g() ? objA : J.f24997a;
    }

    @Override // y.InterfaceC8558m
    public boolean c(InterfaceC8555j interfaceC8555j) {
        return b().j(interfaceC8555j);
    }

    @Override // y.InterfaceC8556k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public y b() {
        return this.f66191a;
    }
}
