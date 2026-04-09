package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Ex, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2528Ex extends AbstractC3344eW {
    public final /* synthetic */ US A00;
    public final /* synthetic */ XH A01;
    public final /* synthetic */ C3239cn A02;
    public final /* synthetic */ C2526Ev A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C2528Ex(C2526Ev c2526Ev, String str, C3239cn c3239cn, US us, Map map, XH xh) {
        this.A03 = c2526Ev;
        this.A04 = str;
        this.A02 = c3239cn;
        this.A00 = us;
        this.A05 = map;
        this.A01 = xh;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3344eW
    public final void A03() {
        if (!this.A03.A02.A0Z() && !TextUtils.isEmpty(this.A04) && !this.A03.A08.get(this.A02.A02())) {
            this.A00.AB5(this.A04, new C3057Zp(this.A05).A03(this.A03.A03).A02(this.A01).A05());
            N3.A07(this.A03.A00, this.A03.A09);
            this.A03.A08.put(this.A02.A02(), true);
        }
    }
}
