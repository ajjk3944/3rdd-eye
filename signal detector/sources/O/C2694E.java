package o;

import n.InterfaceC2664A;

/* renamed from: o.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2694E extends AbstractViewOnTouchListenerC2737s0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C2699J f22367j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ M f22368k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2694E(M m6, M m7, C2699J c2699j) {
        super(m7);
        this.f22368k = m6;
        this.f22367j = c2699j;
    }

    @Override // o.AbstractViewOnTouchListenerC2737s0
    public final InterfaceC2664A b() {
        return this.f22367j;
    }

    @Override // o.AbstractViewOnTouchListenerC2737s0
    public final boolean c() {
        M m6 = this.f22368k;
        if (m6.getInternalPopup().a()) {
            return true;
        }
        m6.f22412f.m(m6.getTextDirection(), m6.getTextAlignment());
        return true;
    }
}
