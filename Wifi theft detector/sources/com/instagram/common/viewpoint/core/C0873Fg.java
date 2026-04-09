package com.instagram.common.viewpoint.core;

import android.text.TextUtils;

/* renamed from: com.facebook.ads.redexgen.X.Fg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0873Fg extends AbstractC1758fo {
    public final /* synthetic */ C4T A00;

    public C0873Fg(C4T c4t) {
        this.A00 = c4t;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1758fo
    public final void A03() {
        if (!this.A00.A0C.A07()) {
            this.A00.setImpressionRecordingFlag(this.A00.A0C);
            if (!TextUtils.isEmpty(this.A00.A0A)) {
                this.A00.A0F.ABJ(this.A00.A0A, new C1471b9().A03(this.A00.A09).A02(this.A00.A0C).A04(this.A00.A0D.A0z()).A05());
                C1078Ng.A07(this.A00.A0D.A2A(), this.A00.A0E);
                this.A00.A0E.A0F().A3L();
                AbstractC1098Oa.A02(this.A00.A03.A0y(), AbstractC1334Xm.A00(this.A00.A0D.A10()));
            }
        }
    }
}
