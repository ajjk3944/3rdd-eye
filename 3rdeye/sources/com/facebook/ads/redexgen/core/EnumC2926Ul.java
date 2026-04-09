package com.facebook.ads.redexgen.core;

import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Ul, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC2926Ul {
    A05(0, NativeAdBase.MediaCacheFlag.NONE),
    A04(1, NativeAdBase.MediaCacheFlag.ALL);

    public static byte[] A02;
    public final long A00;
    public final NativeAdBase.MediaCacheFlag A01;

    public static String A01(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{117, -128, -128, -123, -122, -123, 124};
    }

    static {
        A02();
    }

    EnumC2926Ul(long j4, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = j4;
        this.A01 = mediaCacheFlag;
    }

    @Nullable
    public static EnumC2926Ul A00(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        for (EnumC2926Ul enumC2926Ul : values()) {
            if (enumC2926Ul.A01 == mediaCacheFlag) {
                return enumC2926Ul;
            }
        }
        return null;
    }
}
