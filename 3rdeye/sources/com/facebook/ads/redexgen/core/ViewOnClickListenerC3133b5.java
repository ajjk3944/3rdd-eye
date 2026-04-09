package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.b5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3133b5 implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ JU A00;

    static {
        A01();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 88);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{90, 69, 72, 73, 67};
    }

    public ViewOnClickListenerC3133b5(JU ju) {
        this.A00 = ju;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2951Vl.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A0Q) {
                this.A00.A0O.A02(A00(0, 5, 116));
            }
        } catch (Throwable th) {
            AbstractC2951Vl.A00(th, this);
        }
    }
}
