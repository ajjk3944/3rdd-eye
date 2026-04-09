package com.facebook.ads.redexgen.core;

import android.content.DialogInterface;

/* renamed from: com.facebook.ads.redexgen.X.Op, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2776Op extends AbstractRunnableC2959Vt {
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ DialogInterfaceOnClickListenerC2992Xc A01;

    public C2776Op(DialogInterfaceOnClickListenerC2992Xc dialogInterfaceOnClickListenerC2992Xc, DialogInterface dialogInterface) {
        this.A01 = dialogInterfaceOnClickListenerC2992Xc;
        this.A00 = dialogInterface;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2959Vt
    public final void A07() {
        if (this.A01.A01.A02 != null) {
            this.A01.A01.A02.AGD(VZ.A03(this.A01.A01.A00), new C3365er().A05(this.A01.A01.A02(this.A01.A00.getText().toString())).A08());
        }
        this.A00.cancel();
    }
}
