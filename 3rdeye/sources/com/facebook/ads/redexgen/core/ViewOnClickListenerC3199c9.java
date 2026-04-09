package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.c9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3199c9 implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C4Z A00;

    static {
        A01();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 76);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{20, 23, 23, 24, 39, 20, 28, 31, 38};
    }

    public ViewOnClickListenerC3199c9(C4Z c4z) {
        this.A00 = c4z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2951Vl.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A0K) {
                this.A00.A0H.A02(A00(0, 9, 103));
                this.A00.A0Z.ABr();
            }
        } catch (Throwable th) {
            AbstractC2951Vl.A00(th, this);
        }
    }
}
