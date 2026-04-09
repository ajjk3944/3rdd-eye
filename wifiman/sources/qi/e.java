package Qi;

import Ii.AbstractC3043a;
import Yg.AbstractC3663g;
import Yg.J;
import dh.InterfaceC5384i;
import gg.InterfaceC5913c;

/* loaded from: classes4.dex */
final class e extends AbstractC3043a {

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC5913c f19361d;

    public e(InterfaceC5384i interfaceC5384i, InterfaceC5913c interfaceC5913c) {
        super(interfaceC5384i, false, true);
        this.f19361d = interfaceC5913c;
    }

    @Override // Ii.AbstractC3043a
    protected void O0(Throwable th2, boolean z10) {
        try {
            if (this.f19361d.c(th2)) {
                return;
            }
        } catch (Throwable th3) {
            AbstractC3663g.a(th2, th3);
        }
        d.a(th2, getContext());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Ii.AbstractC3043a
    /* renamed from: R0, reason: merged with bridge method [inline-methods] */
    public void P0(J j10) {
        try {
            this.f19361d.a();
        } catch (Throwable th2) {
            d.a(th2, getContext());
        }
    }
}
