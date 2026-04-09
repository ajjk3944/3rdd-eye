package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Hc implements InterfaceC5027vg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ic f39576a;

    public Hc(Ic ic) {
        this.f39576a = ic;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5027vg
    public final void a(C5102yg c5102yg) {
        if (c5102yg == null) {
            return;
        }
        C4683i6 c4683i6 = new C4683i6("", "", 0);
        c4683i6.setValueBytes(c5102yg.a());
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        c4683i6.f41047d = 4097;
        this.f39576a.a(c4683i6);
    }
}
