package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.h5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1837h5 implements OB {
    public static byte[] A04;
    public static String[] A05 = {"2TNZv5rtJTplZyjTIrSAFwUR6QP", "UjegX20Mk8HUIHIT", "Ti96PrkTuXG6IMzmEs5GDJe0LgUxYJn1", "WKFIsio5", "sT4eIPa9", "0D70Whi8Ioa2N41OWBvmw3gUZoSjgMHO", "iH11Sl", "erLbaj7N4o7d5mJ3hEM6"};

    @Nullable
    public NativeAd.NativeOptions A00;
    public S6 A01;
    public C1814gi A02;
    public final NativeAdBase.MediaCacheFlag A03;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A05[6].length() == 1) {
                throw new RuntimeException();
            }
            A05[0] = "MdmGKNh4C3mG92xgGyorPLR3SXO";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 88);
            i13++;
        }
    }

    public static void A04() {
        A04 = new byte[]{-26, -39, -20, -31, -18, -35, -28, -35, -38, -35, -34, -26, -35};
    }

    static {
        A04();
    }

    public C1837h5(@Nullable S6 s62, C1814gi c1814gi, NativeAdBase.MediaCacheFlag mediaCacheFlag, NativeAd.NativeOptions nativeOptions) {
        this.A00 = nativeOptions;
        this.A01 = s62;
        this.A02 = c1814gi;
        this.A03 = mediaCacheFlag;
    }

    @Override // com.instagram.common.viewpoint.core.OB
    public final void ADp(C1286Vm c1286Vm) {
        WT.A00(new C1840h8(this, c1286Vm));
    }

    @Override // com.instagram.common.viewpoint.core.OB
    public final void AEy(List<C1996ju> list) {
        C1220Sx manager = new C1220Sx(this.A02);
        String firstRequestId = A03(6, 7, 23);
        for (C1996ju c1996ju : list) {
            if (A03(6, 7, 23).equals(firstRequestId)) {
                firstRequestId = c1996ju.A0G();
            }
            if (this.A03.equals(NativeAdBase.MediaCacheFlag.ALL)) {
                if (c1996ju.A0E().A0I() != null) {
                    manager.A0c(new C1218Sv(c1996ju.A0E().A0I().getUrl(), c1996ju.A0E().A0I().getHeight(), c1996ju.A0E().A0I().getWidth(), c1996ju.A0G(), A03(0, 6, 32)));
                }
                if (c1996ju.A0E().A0H() != null) {
                    manager.A0c(new C1218Sv(c1996ju.A0E().A0H().getUrl(), c1996ju.A0E().A0H().getHeight(), c1996ju.A0E().A0H().getWidth(), c1996ju.A0G(), A03(0, 6, 32)));
                }
                if (!TextUtils.isEmpty(c1996ju.A0E().A0e())) {
                    manager.A0b(new C1216St(c1996ju.A0E().A0e(), c1996ju.A0G(), A03(0, 6, 32), c1996ju.A0E().A0D()));
                }
            }
        }
        manager.A0X(new C1838h6(this, list), new C1213Sq(firstRequestId, A03(0, 6, 32)));
    }
}
