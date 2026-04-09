package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class YD implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"JgnztxPB1ZV2mLM4m5Ycre18QBHHAk68", "CqsGK2dWtG2Q1DXDtFIDYNZ7LNeefiOg", "ReCIjC0Dk67HsAjJsB8iXJFEf", "PfgM7dkBWjhvKpVZ4i4n1U6unvdzg33Y", "kMFA3e10HFnOKZH1eaTne45N5cSMFKSk", "5KU3gv1KQuWrXHx7nmrwofFdJow3SSmj", "5WlCrnbha1GubMPeTb3kZmJbp07Xs3gb", "slx8IL4rEGsN"};
    public final /* synthetic */ C2688Lc A00;

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 49);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{122, 124, 106, 125, 108, 99, 102, 108, 100};
    }

    static {
        A01();
    }

    public YD(C2688Lc c2688Lc) {
        this.A00 = c2688Lc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2951Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0U(false, A00(0, 9, 62));
        } catch (Throwable th) {
            AbstractC2951Vl.A00(th, this);
            if (A02[0].charAt(6) != 'P') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[5] = "xlN8Ec18ebAkjRgfSypG9cj38q3wwfUZ";
            strArr[4] = "6rpL9N1SajG3bsAtkGH0kzQNranKOLWT";
        }
    }
}
