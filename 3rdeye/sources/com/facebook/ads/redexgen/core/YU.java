package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class YU implements InterfaceC2949Vj {
    @Override // com.facebook.ads.redexgen.core.InterfaceC2949Vj
    public final void AHp(Throwable th, Object obj) {
        if (obj instanceof SM) {
            C3272dL adContext = ((SM) obj).A6e();
            if (adContext != null) {
                adContext.A0Q(th);
                return;
            }
            return;
        }
        if (!(obj instanceof View)) {
            return;
        }
        Context context = ((View) obj).getContext();
        if (!(context instanceof C3272dL)) {
            return;
        }
        ((C3272dL) context).A0Q(th);
    }
}
