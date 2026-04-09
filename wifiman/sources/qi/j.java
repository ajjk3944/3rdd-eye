package Qi;

import Ii.AbstractC3043a;
import Yg.AbstractC3663g;
import dh.InterfaceC5384i;
import gg.InterfaceC5910A;

/* loaded from: classes4.dex */
final class j extends AbstractC3043a {

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC5910A f19372d;

    public j(InterfaceC5384i interfaceC5384i, InterfaceC5910A interfaceC5910A) {
        super(interfaceC5384i, false, true);
        this.f19372d = interfaceC5910A;
    }

    @Override // Ii.AbstractC3043a
    protected void O0(Throwable th2, boolean z10) {
        try {
            if (this.f19372d.c(th2)) {
                return;
            }
        } catch (Throwable th3) {
            AbstractC3663g.a(th2, th3);
        }
        d.a(th2, getContext());
    }

    @Override // Ii.AbstractC3043a
    protected void P0(Object obj) {
        try {
            this.f19372d.onSuccess(obj);
        } catch (Throwable th2) {
            d.a(th2, getContext());
        }
    }
}
