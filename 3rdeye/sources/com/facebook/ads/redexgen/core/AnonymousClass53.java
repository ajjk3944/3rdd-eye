package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

@MetaExoPlayerCustomization("Using fbDataSpecExtension instead of Object")
/* renamed from: com.facebook.ads.redexgen.X.53, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass53 {
    public static byte[] A0A;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public C2695Lj A06;
    public String A07;
    public Map<String, String> A08;
    public byte[] A09;

    static {
        A01();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0A = new byte[]{-35, -15, -18, -87, -2, -5, -14, -87, -10, -2, -4, -3, -87, -21, -18, -87, -4, -18, -3, -73};
    }

    public AnonymousClass53() {
        this.A01 = 1;
        this.A08 = Collections.emptyMap();
        this.A02 = -1L;
    }

    @MetaExoPlayerCustomization("Using fbDataSpecExtension instead of Object")
    public AnonymousClass53(AnonymousClass56 anonymousClass56) {
        this.A05 = anonymousClass56.A06;
        this.A04 = anonymousClass56.A05;
        this.A01 = anonymousClass56.A01;
        this.A09 = anonymousClass56.A0A;
        this.A08 = anonymousClass56.A09;
        this.A03 = anonymousClass56.A04;
        this.A02 = anonymousClass56.A03;
        this.A07 = anonymousClass56.A08;
        this.A00 = anonymousClass56.A00;
        this.A06 = anonymousClass56.A07;
    }

    public final AnonymousClass53 A02(int i) {
        this.A00 = i;
        return this;
    }

    public final AnonymousClass53 A03(long j4) {
        this.A02 = j4;
        return this;
    }

    public final AnonymousClass53 A04(long j4) {
        this.A03 = j4;
        return this;
    }

    public final AnonymousClass53 A05(long j4) {
        this.A04 = j4;
        return this;
    }

    public final AnonymousClass53 A06(Uri uri) {
        this.A05 = uri;
        return this;
    }

    @MetaExoPlayerCustomization("Using fbDataSpecExtension instead of Object")
    public final AnonymousClass53 A07(C2695Lj c2695Lj) {
        this.A06 = c2695Lj;
        return this;
    }

    public final AnonymousClass53 A08(String str) {
        this.A07 = str;
        return this;
    }

    @MetaExoPlayerCustomization("D50990955; Ensure that fbDataSpecExtension is not null")
    public final AnonymousClass56 A09() {
        C2695Lj c2695Lj;
        C3M.A03(this.A05, A00(0, 20, 122));
        Uri uri = this.A05;
        long j4 = this.A04;
        int i = this.A01;
        byte[] bArr = this.A09;
        Map<String, String> map = this.A08;
        long j10 = this.A03;
        long j11 = this.A02;
        String str = this.A07;
        int i10 = this.A00;
        if (this.A06 != null) {
            c2695Lj = this.A06;
        } else {
            c2695Lj = new C2695Lj();
        }
        return new AnonymousClass56(uri, j4, i, bArr, map, j10, j11, str, i10, c2695Lj);
    }
}
