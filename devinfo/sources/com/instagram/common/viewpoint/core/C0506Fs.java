package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0506Fs extends AbstractC1380fo {
    public final /* synthetic */ VA A00;
    public final /* synthetic */ Y2 A01;
    public final /* synthetic */ C1274e5 A02;
    public final /* synthetic */ C0504Fq A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C0506Fs(C0504Fq c0504Fq, String str, C1274e5 c1274e5, VA va2, Map map, Y2 y22) {
        this.A03 = c0504Fq;
        this.A04 = str;
        this.A02 = c1274e5;
        this.A00 = va2;
        this.A05 = map;
        this.A01 = y22;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1380fo
    public final void A03() {
        if (!this.A03.A02.A0Z() && !TextUtils.isEmpty(this.A04) && !this.A03.A05.get(this.A02.A02())) {
            this.A00.ABJ(this.A04, new C1093b9(this.A05).A03(this.A03.A03).A02(this.A01).A05());
            C0700Ng.A07(this.A03.A00, this.A03.A06);
            this.A03.A05.put(this.A02.A02(), true);
        }
    }
}
