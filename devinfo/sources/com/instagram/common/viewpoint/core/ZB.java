package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class ZB implements View.OnClickListener {
    public final /* synthetic */ C0706Nm A00;
    public final /* synthetic */ VI A01;
    public final /* synthetic */ InterfaceC0977Yh A02;
    public final /* synthetic */ ZC A03;
    public final /* synthetic */ String A04;

    public ZB(ZC zc2, VI vi2, InterfaceC0977Yh interfaceC0977Yh, String str, C0706Nm c0706Nm) {
        this.A03 = zc2;
        this.A01 = vi2;
        this.A02 = interfaceC0977Yh;
        this.A04 = str;
        this.A00 = c0706Nm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A01.A04(VH.A0A, null);
            if (this.A03.A01.A0O(this.A03.A02.A02(), true)) {
                this.A02.AAo(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                X6.A0O(new X6(), this.A03.A02, XB.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
