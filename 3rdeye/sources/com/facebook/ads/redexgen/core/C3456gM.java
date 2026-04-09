package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.gM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3456gM implements Q6 {
    public static byte[] A07;
    public static String[] A08 = {"t5607oHfL2MNwmRFcsOr1jnyxzutumg5", "jNVCF7hNBx7qTlxJtSxtZf62y0YMH9ti", "vdh53KDEVDvYPF4U9zJ9CmemLfeqkfcW", "xmowDJGre", "ZTG0qcJaBRai17vkpDLZ7jbeFwjjrIPL", "kzc7Q54viT3CLivIFTQawvhHzc5bSJU6", "6m9Kb2lg4QS4P0ZcGJ2XwsRwfv4UyCAv", "gH"};
    public int A00;
    public OZ<C2796Pj> A01;
    public final InterfaceC2795Pi A02;
    public final Q7 A03;
    public final ArrayList<C2796Pj> A04;
    public final ArrayList<C2796Pj> A05;
    public final boolean A06;

    public static String A01(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{23, 25, 16, 19, 2, 26, 15, 12, 2, 7};
    }

    static {
        A02();
    }

    public C3456gM(InterfaceC2795Pi interfaceC2795Pi) {
        this(interfaceC2795Pi, false);
    }

    public C3456gM(InterfaceC2795Pi interfaceC2795Pi, boolean z10) {
        this.A01 = new C3468ga(30);
        this.A04 = new ArrayList<>();
        this.A05 = new ArrayList<>();
        this.A00 = 0;
        this.A02 = interfaceC2795Pi;
        this.A06 = z10;
        this.A03 = new Q7(this);
    }

    private final int A00(int i, int i10) {
        int count = this.A05.size();
        if (i10 < count) {
            this.A05.get(i10);
            throw new NullPointerException(A01(0, 3, 126));
        }
        return i;
    }

    private final void A03(List<C2796Pj> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i);
            A0A(null);
        }
        list.clear();
        if (A08[1].charAt(29) != '9') {
            throw new RuntimeException();
        }
        A08[2] = "ayjYK9F9Z6sDhNCNS52R1Qcr5XRGx639";
    }

    public final int A04(int i) {
        return A00(i, 0);
    }

    public final int A05(int i) {
        int size = this.A04.size();
        if (0 < size) {
            this.A04.get(0);
            throw new NullPointerException(A01(0, 3, 126));
        }
        return i;
    }

    public final void A06() {
        int count = this.A05.size();
        if (0 < count) {
            InterfaceC2795Pi interfaceC2795Pi = this.A02;
            this.A05.get(0);
            String[] strArr = A08;
            String str = strArr[0];
            String str2 = strArr[4];
            int i = str.charAt(3);
            int count2 = str2.charAt(3);
            if (i != count2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[0] = "Yhl0jQrdp33aIQ4Nx5XRCxKVlJRMQ99k";
            strArr2[4] = "te80aWrb7iKuE4ta48s0tNKQ3kiAwVCD";
            interfaceC2795Pi.AD2(null);
            throw null;
        }
        A03(this.A05);
        this.A00 = 0;
    }

    public final void A07() {
        A06();
        int count = this.A04.size();
        if (0 < count) {
            this.A04.get(0);
            throw new NullPointerException(A01(0, 3, 126));
        }
        A03(this.A04);
        this.A00 = 0;
    }

    public final void A08() {
        this.A03.A04(this.A04);
        int count = this.A04.size();
        if (0 < count) {
            this.A04.get(0);
            throw new NullPointerException(A01(0, 3, 126));
        }
        this.A04.clear();
    }

    public final void A09() {
        A03(this.A04);
        A03(this.A05);
        this.A00 = 0;
    }

    public final void A0A(C2796Pj c2796Pj) {
        if (!this.A06) {
            throw new NullPointerException(A01(3, 7, 105));
        }
    }

    public final boolean A0B() {
        return this.A04.size() > 0;
    }

    public final boolean A0C() {
        return (this.A05.isEmpty() || this.A04.isEmpty()) ? false : true;
    }

    public final boolean A0D(int i) {
        return (this.A00 & i) != 0;
    }
}
