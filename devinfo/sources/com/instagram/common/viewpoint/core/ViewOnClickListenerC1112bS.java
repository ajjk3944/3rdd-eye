package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1112bS implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"vbhQ772KrwwyBQLqSF0Uu1FphjZjOARV", "IBW1fWQIdJqQUPoAbqLmLzYGzWB3AFkH", "HmN3zdDh8QwXEewFzD7cRbgjZyFP74AB", "Oi9kNPYT1HPYswCV1WaLs9ucCNZpJU", "sMEUezQpAx8L6vs1CqhHVpU4S2CWDUzq", "l1dCE", "7cDzGVZ60", "I6JIiCAB6gfHFMUig9c3ijD4Ynx17v"};
    public final /* synthetic */ C1113bT A00;

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 54);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-87, -71, -74, -66, -70, -84, -71, -90, -73, -84, -84, -78};
    }

    static {
        A01();
    }

    public ViewOnClickListenerC1112bS(C1113bT c1113bT) {
        this.A00 = c1113bT;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0D.A0E(A00(0, 12, 17));
            this.A00.A0B();
        } catch (Throwable th2) {
            if (A02[6].length() != 9) {
                throw new RuntimeException();
            }
            A02[6] = "D5vzh5bnP";
            WU.A00(th2, this);
        }
    }
}
