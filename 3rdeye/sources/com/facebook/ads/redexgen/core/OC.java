package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class OC extends QT {
    public static String[] A01 = {"LeWmJ2AEMrGR8tgfwsG9m8UwM76zwmUz", "6Bm", "ck2sw", "Oj1Ntvfg6dck0NxJmQASjzaKZXVqT4Sf", "CtYf7ZmPdO", "plI1JnuA", "RZR4g54lk6KTwqItkRA6ECctcTUw", "cGd5igXf7vOVCpmuGQi5cRxrBgQCM2pW"};
    public final /* synthetic */ C21660h A00;

    public OC(C21660h c21660h) {
        this.A00 = c21660h;
    }

    @Override // com.facebook.ads.redexgen.core.QT
    public final void A0L(C23196g c23196g, int i) {
        int iA25;
        InterfaceC3010Xu interfaceC3010Xu;
        super.A0L(c23196g, i);
        C3452gI linearLayoutManager = this.A00.getLayoutManager();
        if (linearLayoutManager != null && (iA25 = linearLayoutManager.A25()) >= 0) {
            C21660h c21660h = this.A00;
            int scrollPosition = A01[3].charAt(13);
            if (scrollPosition == 48) {
                throw new RuntimeException();
            }
            A01[5] = "JmqJ93Os7fwoNBdh";
            if (c21660h.getAdapter() == null || iA25 >= this.A00.getAdapter().A0B() || (interfaceC3010Xu = (InterfaceC3010Xu) c23196g.A1F(iA25)) == null) {
                return;
            }
            interfaceC3010Xu.AIV();
        }
    }
}
