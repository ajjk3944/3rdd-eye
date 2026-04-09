package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1194cm implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C0599Ji A00;

    static {
        A01();
    }

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{62, 37, 37, 38, 40, 43, 56};
    }

    public ViewOnClickListenerC1194cm(C0599Ji c0599Ji) {
        this.A00 = c0599Ji;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0p(A00(0, 7, 120));
            if (this.A00.A0b.A0D() != null) {
                this.A00.A0b.A0D().ACQ();
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
