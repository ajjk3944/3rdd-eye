package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.net.TrafficStats;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* renamed from: com.facebook.ads.redexgen.X.Sw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class CallableC0841Sw implements Callable<Boolean> {
    public static byte[] A02;
    public final C0840Sv A00;
    public final /* synthetic */ C0842Sx A01;

    static {
        A02();
    }

    public static String A01(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-35, -31, -43, -37, -39};
    }

    public CallableC0841Sw(C0842Sx c0842Sx, C0840Sv c0840Sv) {
        this.A01 = c0842Sx;
        this.A00 = c0840Sv;
    }

    private final Boolean A00() throws Throwable {
        if (WU.A02(this)) {
            return null;
        }
        try {
            TrafficStats.setThreadStatsTag(61453);
            LX lx = new LX(this.A00.A08, this.A00.A07, this.A00.A06, A01(0, 5, 114), this.A00.A02, this.A00.A03);
            lx.A01 = this.A00.A05;
            lx.A00 = this.A00.A04;
            if (T0.A06(this.A01.A04)) {
                C0842Sx.A0F.put(this.A00.A08, lx);
            }
            boolean precacheResult = false;
            if (this.A01.A08) {
                precacheResult = C0842Sx.A03(this.A01.A04.A02()).AIe(lx, false).A01();
            } else if (this.A01.A03.A0F(this.A00) != null) {
                precacheResult = true;
            }
            T3 t32 = this.A00.A01;
            if (t32 != null && t32.A02()) {
                int iA00 = t32.A00();
                int iA01 = t32.A01();
                if (iA00 <= 0 || iA01 <= 0) {
                    if (this.A01.A08) {
                        A04(this.A00.A08, lx);
                    } else {
                        A03(this.A00.A04, this.A00.A05);
                    }
                } else if (this.A01.A08) {
                    lx.A00 = iA00;
                    lx.A01 = iA01;
                    A04(this.A00.A08, lx);
                } else {
                    A03(iA00, iA01);
                }
            }
            return Boolean.valueOf(precacheResult);
        } catch (Throwable th2) {
            WU.A00(th2, this);
            return null;
        }
    }

    private void A03(int i4, int i10) {
        Bitmap bitmapA0G = this.A01.A03.A0G(this.A01.A04, this.A00.A08, i4, i10, this.A00.A02);
        if (bitmapA0G == null) {
            return;
        }
        this.A01.A07.put(this.A00.A08, bitmapA0G);
    }

    private void A04(String str, LX lx) {
        Bitmap bitmapA00 = C0842Sx.A03(this.A01.A04.A02()).AIe(lx, true).A00();
        if (bitmapA00 == null) {
            return;
        }
        this.A01.A07.put(str, bitmapA00);
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
        if (WU.A02(this)) {
            return null;
        }
        try {
            return A00();
        } catch (Throwable th2) {
            WU.A00(th2, this);
            return null;
        }
    }
}
