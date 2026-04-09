package com.instagram.common.viewpoint.core;

import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.ht, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1508ht implements InterfaceC0778Qk {
    public static byte[] A07;
    public static String[] A08 = {"t5607oHfL2MNwmRFcsOr1jnyxzutumg5", "jNVCF7hNBx7qTlxJtSxtZf62y0YMH9ti", "vdh53KDEVDvYPF4U9zJ9CmemLfeqkfcW", "xmowDJGre", "ZTG0qcJaBRai17vkpDLZ7jbeFwjjrIPL", "kzc7Q54viT3CLivIFTQawvhHzc5bSJU6", "6m9Kb2lg4QS4P0ZcGJ2XwsRwfv4UyCAv", "gH"};
    public int A00;
    public PD<QN> A01;
    public final QM A02;
    public final C0779Ql A03;
    public final ArrayList<QN> A04;
    public final ArrayList<QN> A05;
    public final boolean A06;

    public static String A01(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i4, i4 + i10);
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

    public C1508ht(QM qm) {
        this(qm, false);
    }

    public C1508ht(QM qm, boolean z3) {
        this.A01 = new C1519i6(30);
        this.A04 = new ArrayList<>();
        this.A05 = new ArrayList<>();
        this.A00 = 0;
        this.A02 = qm;
        this.A06 = z3;
        this.A03 = new C0779Ql(this);
    }

    private final int A00(int i4, int i10) {
        int count = this.A05.size();
        if (i10 < count) {
            this.A05.get(i10);
            throw new NullPointerException(A01(0, 3, WebSocketProtocol.PAYLOAD_SHORT));
        }
        return i4;
    }

    private final void A03(List<QN> list) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            list.get(i4);
            A0A(null);
        }
        list.clear();
        if (A08[1].charAt(29) != '9') {
            throw new RuntimeException();
        }
        A08[2] = "ayjYK9F9Z6sDhNCNS52R1Qcr5XRGx639";
    }

    public final int A04(int i4) {
        return A00(i4, 0);
    }

    public final int A05(int i4) {
        int size = this.A04.size();
        if (0 < size) {
            this.A04.get(0);
            throw new NullPointerException(A01(0, 3, WebSocketProtocol.PAYLOAD_SHORT));
        }
        return i4;
    }

    public final void A06() {
        int count = this.A05.size();
        if (0 < count) {
            QM qm = this.A02;
            this.A05.get(0);
            String[] strArr = A08;
            String str = strArr[0];
            String str2 = strArr[4];
            int i4 = str.charAt(3);
            int count2 = str2.charAt(3);
            if (i4 != count2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[0] = "Yhl0jQrdp33aIQ4Nx5XRCxKVlJRMQ99k";
            strArr2[4] = "te80aWrb7iKuE4ta48s0tNKQ3kiAwVCD";
            qm.ADg(null);
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
            throw new NullPointerException(A01(0, 3, WebSocketProtocol.PAYLOAD_SHORT));
        }
        A03(this.A04);
        this.A00 = 0;
    }

    public final void A08() {
        this.A03.A04(this.A04);
        int count = this.A04.size();
        if (0 < count) {
            this.A04.get(0);
            throw new NullPointerException(A01(0, 3, WebSocketProtocol.PAYLOAD_SHORT));
        }
        this.A04.clear();
    }

    public final void A09() {
        A03(this.A04);
        A03(this.A05);
        this.A00 = 0;
    }

    public final void A0A(QN qn) {
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

    public final boolean A0D(int i4) {
        return (this.A00 & i4) != 0;
    }
}
