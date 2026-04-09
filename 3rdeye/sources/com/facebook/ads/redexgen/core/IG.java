package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: assets/audience_network.dex */
public final class IG extends FrameLayout implements InterfaceC3004Xo {
    public static String[] A03 = {"wtXzJScKRPxajxCcdRbPmb0KadlxC", "7nKoFE8ui8VEpuvPlBMmVCUEP2sqkB6T", "33CWdOtYDTa7rzeiAlLBu", "lc", "strpzcWL7DajPBiGDWIDQH24h3nkF6Q8", "KD2NqWHNK6oFw2qGkV253wUFP2DdgfCk", "fVTYPEGDbO1sEyo8c0rX1ThQbYeRG1Ca", "mBAzb1XhvrptTGzmv2edBpTADNq"};
    public String A00;
    public final InterfaceC3003Xn A01;
    public final C3183bt A02;

    public IG(C3272dL c3272dL, InterfaceC3003Xn interfaceC3003Xn, C3183bt c3183bt, String str) {
        super(c3272dL);
        this.A02 = c3183bt;
        this.A01 = interfaceC3003Xn;
        this.A00 = str;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3004Xo
    public final void AAl(Intent intent, Bundle bundle, R0 r02) {
        C3183bt.A0B().incrementAndGet();
        this.A02.A0V();
        XP.A0H(this.A02.A0O());
        addView(this.A02.A0O(), new FrameLayout.LayoutParams(-1, -1));
        this.A01.A3x(this, new RelativeLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3004Xo
    public final void AEV(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3004Xo
    public final void AF0(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3004Xo
    public final void AIB(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3004Xo
    public String getCurrentClientToken() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3004Xo
    public final boolean onActivityResult(int i, int i10, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3004Xo
    public final void onDestroy() {
        this.A02.A0U();
        if (this.A02.A0N() != null) {
            this.A02.A0N().ADO();
        }
        AtomicInteger atomicIntegerA0B = C3183bt.A0B();
        String[] strArr = A03;
        if (strArr[7].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[7] = "U60adJ6O15pnx6aeoiW8dFURNXF";
        strArr2[0] = "aGZEm4xR2YGCAhvP8isAV9os5hRSz";
        atomicIntegerA0B.decrementAndGet();
    }

    public void setListener(InterfaceC3003Xn interfaceC3003Xn) {
    }
}
