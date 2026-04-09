package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.Vi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2948Vi implements InterfaceC3378f4 {
    public static byte[] A02;
    public static String[] A03 = {"11yowYa9SjobATSyd4jbcYQKUh4edG44", "bHv0W2DtzV8d9jrYb9gmoc8MmzdN0fpB", "oW", "tKoi6cKGljbVocPn31APtwXZRyGd7igq", "ywmFCSl3Vn78B2eGXobUvwrScWlSo3bc", "aFROHHWcme9RokkBpAaOqFeveGyJeM2s", "QLtd5uCJprXFRqzwd31bhpzpUHhxzcVz", "aKhknuldK0UVZxwEW2ZbTGmFeUx0ymlu"};
    public final /* synthetic */ C3246cu A00;
    public final /* synthetic */ InterfaceC3376f2 A01;

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            byte b10 = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 80);
            if (A03[0].charAt(21) == 'R') {
                throw new RuntimeException();
            }
            A03[0] = "rnyHoYqJfuEUpW7gm8XbWdjDtWL8fGmk";
            bArrCopyOfRange[i12] = b10;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{101, 102, 98, 119, 118, 113, 102, 92, 96, 108, 109, 101, 106, 100};
    }

    static {
        A01();
    }

    public C2948Vi(InterfaceC3376f2 interfaceC3376f2, C3246cu c3246cu) {
        this.A01 = interfaceC3376f2;
        this.A00 = c3246cu;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3378f4
    public final void A4e() {
        try {
            U7.A0V(this.A00).A2z(this.A01.A7a().optJSONObject(A00(0, 14, 83)));
        } catch (JSONException e4) {
            this.A00.A08().A4A(e4);
        }
    }
}
