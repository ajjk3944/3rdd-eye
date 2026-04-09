package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3166bc implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C5Q A00;

    static {
        A01();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 92);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{71, 69, 86, 75, 81, 87, 65, 72, 123, 71, 69, 86, 64};
    }

    public ViewOnClickListenerC3166bc(C5Q c5q) {
        this.A00 = c5q;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2951Vl.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A0E(A00(0, 13, 120));
        } catch (Throwable th) {
            AbstractC2951Vl.A00(th, this);
        }
    }
}
