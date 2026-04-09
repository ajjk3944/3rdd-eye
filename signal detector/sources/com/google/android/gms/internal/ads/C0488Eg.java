package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Eg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0488Eg extends AbstractC0454Cg {
    @Override // com.google.android.gms.internal.ads.AbstractC0454Cg
    public final boolean b(String str) {
        String strD = u2.f.d(str, "MD5");
        InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) this.f7636c.get();
        if (interfaceC0828Yg != null && strD != null) {
            interfaceC0828Yg.M0(strD, this);
        }
        u2.k.h("VideoStreamNoopCache is doing nothing.");
        l(str, strD, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0454Cg
    public final void k() {
    }
}
