package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

@MetaExoPlayerCustomization("Using fbDataSpecExtension instead of Object")
/* renamed from: com.facebook.ads.redexgen.X.5f, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C02535f {
    public static byte[] A0A;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public ML A06;
    public String A07;
    public Map<String, String> A08;
    public byte[] A09;

    static {
        A01();
    }

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0A = new byte[]{-35, -15, -18, -87, -2, -5, -14, -87, -10, -2, -4, -3, -87, -21, -18, -87, -4, -18, -3, -73};
    }

    public C02535f() {
        this.A01 = 1;
        this.A08 = Collections.emptyMap();
        this.A02 = -1L;
    }

    @MetaExoPlayerCustomization("Using fbDataSpecExtension instead of Object")
    public C02535f(C02565i c02565i) {
        this.A05 = c02565i.A06;
        this.A04 = c02565i.A05;
        this.A01 = c02565i.A01;
        this.A09 = c02565i.A0A;
        this.A08 = c02565i.A09;
        this.A03 = c02565i.A04;
        this.A02 = c02565i.A03;
        this.A07 = c02565i.A08;
        this.A00 = c02565i.A00;
        this.A06 = c02565i.A07;
    }

    public final C02535f A02(int i4) {
        this.A00 = i4;
        return this;
    }

    public final C02535f A03(long j) {
        this.A02 = j;
        return this;
    }

    public final C02535f A04(long j) {
        this.A03 = j;
        return this;
    }

    public final C02535f A05(long j) {
        this.A04 = j;
        return this;
    }

    public final C02535f A06(Uri uri) {
        this.A05 = uri;
        return this;
    }

    @MetaExoPlayerCustomization("Using fbDataSpecExtension instead of Object")
    public final C02535f A07(ML ml2) {
        this.A06 = ml2;
        return this;
    }

    public final C02535f A08(String str) {
        this.A07 = str;
        return this;
    }

    @MetaExoPlayerCustomization("D50990955; Ensure that fbDataSpecExtension is not null")
    public final C02565i A09() {
        ML ml2;
        AbstractC02203y.A03(this.A05, A00(0, 20, 122));
        Uri uri = this.A05;
        long j = this.A04;
        int i4 = this.A01;
        byte[] bArr = this.A09;
        Map<String, String> map = this.A08;
        long j8 = this.A03;
        long j9 = this.A02;
        String str = this.A07;
        int i10 = this.A00;
        if (this.A06 != null) {
            ml2 = this.A06;
        } else {
            ml2 = new ML();
        }
        return new C02565i(uri, j, i4, bArr, map, j8, j9, str, i10, ml2);
    }
}
