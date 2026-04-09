package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.Xu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1342Xu implements InterfaceC1792gM {
    public static byte[] A02;
    public static String[] A03 = {"11yowYa9SjobATSyd4jbcYQKUh4edG44", "bHv0W2DtzV8d9jrYb9gmoc8MmzdN0fpB", "oW", "tKoi6cKGljbVocPn31APtwXZRyGd7igq", "ywmFCSl3Vn78B2eGXobUvwrScWlSo3bc", "aFROHHWcme9RokkBpAaOqFeveGyJeM2s", "QLtd5uCJprXFRqzwd31bhpzpUHhxzcVz", "aKhknuldK0UVZxwEW2ZbTGmFeUx0ymlu"};
    public final /* synthetic */ C1810ge A00;
    public final /* synthetic */ InterfaceC1790gK A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 80);
            if (A03[0].charAt(21) == 'R') {
                throw new RuntimeException();
            }
            A03[0] = "rnyHoYqJfuEUpW7gm8XbWdjDtWL8fGmk";
            bArrCopyOfRange[i13] = b10;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{101, 102, 98, 119, 118, 113, 102, 92, 96, 108, 109, 101, 106, 100};
    }

    static {
        A01();
    }

    public C1342Xu(InterfaceC1790gK interfaceC1790gK, C1810ge c1810ge) {
        this.A01 = interfaceC1790gK;
        this.A00 = c1810ge;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1792gM
    public final void A4m() {
        try {
            C1264Up.A0V(this.A00).A37(this.A01.A7i().optJSONObject(A00(0, 14, 83)));
        } catch (JSONException e10) {
            this.A00.A08().A4I(e10);
        }
    }
}
