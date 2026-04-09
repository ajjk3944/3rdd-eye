package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Xj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC2999Xj implements View.OnClickListener {
    public final /* synthetic */ N9 A00;
    public final /* synthetic */ C2915Ua A01;
    public final /* synthetic */ C3000Xk A02;
    public final /* synthetic */ InterfaceC3003Xn A03;
    public final /* synthetic */ String A04;

    public ViewOnClickListenerC2999Xj(C3000Xk c3000Xk, C2915Ua c2915Ua, InterfaceC3003Xn interfaceC3003Xn, String str, N9 n9) {
        this.A02 = c3000Xk;
        this.A01 = c2915Ua;
        this.A03 = interfaceC3003Xn;
        this.A04 = str;
        this.A00 = n9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2951Vl.A02(this)) {
            return;
        }
        try {
            this.A01.A04(UZ.A0A, null);
            if (this.A02.A02.A0O(this.A02.A03.A02(), true)) {
                this.A03.AAf(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                WN.A0O(new WN(), this.A02.A03, WQ.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th) {
            AbstractC2951Vl.A00(th, this);
        }
    }
}
