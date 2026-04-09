package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.h5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1459h5 implements OB {
    public static byte[] A04;
    public static String[] A05 = {"2TNZv5rtJTplZyjTIrSAFwUR6QP", "UjegX20Mk8HUIHIT", "Ti96PrkTuXG6IMzmEs5GDJe0LgUxYJn1", "WKFIsio5", "sT4eIPa9", "0D70Whi8Ioa2N41OWBvmw3gUZoSjgMHO", "iH11Sl", "erLbaj7N4o7d5mJ3hEM6"};

    @Nullable
    public NativeAd.NativeOptions A00;
    public S6 A01;
    public C1436gi A02;
    public final NativeAdBase.MediaCacheFlag A03;

    public static String A03(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i4, i4 + i10);
        int i12 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A05[6].length() == 1) {
                throw new RuntimeException();
            }
            A05[0] = "MdmGKNh4C3mG92xgGyorPLR3SXO";
            if (i12 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 88);
            i12++;
        }
    }

    public static void A04() {
        A04 = new byte[]{-26, -39, -20, -31, -18, -35, -28, -35, -38, -35, -34, -26, -35};
    }

    static {
        A04();
    }

    public C1459h5(@Nullable S6 s62, C1436gi c1436gi, NativeAdBase.MediaCacheFlag mediaCacheFlag, NativeAd.NativeOptions nativeOptions) {
        this.A00 = nativeOptions;
        this.A01 = s62;
        this.A02 = c1436gi;
        this.A03 = mediaCacheFlag;
    }

    @Override // com.instagram.common.viewpoint.core.OB
    public final void ADp(C0908Vm c0908Vm) {
        WT.A00(new C1462h8(this, c0908Vm));
    }

    @Override // com.instagram.common.viewpoint.core.OB
    public final void AEy(List<C1618ju> list) {
        C0842Sx manager = new C0842Sx(this.A02);
        String firstRequestId = A03(6, 7, 23);
        for (C1618ju c1618ju : list) {
            if (A03(6, 7, 23).equals(firstRequestId)) {
                firstRequestId = c1618ju.A0G();
            }
            if (this.A03.equals(NativeAdBase.MediaCacheFlag.ALL)) {
                if (c1618ju.A0E().A0I() != null) {
                    manager.A0c(new C0840Sv(c1618ju.A0E().A0I().getUrl(), c1618ju.A0E().A0I().getHeight(), c1618ju.A0E().A0I().getWidth(), c1618ju.A0G(), A03(0, 6, 32)));
                }
                if (c1618ju.A0E().A0H() != null) {
                    manager.A0c(new C0840Sv(c1618ju.A0E().A0H().getUrl(), c1618ju.A0E().A0H().getHeight(), c1618ju.A0E().A0H().getWidth(), c1618ju.A0G(), A03(0, 6, 32)));
                }
                if (!TextUtils.isEmpty(c1618ju.A0E().A0e())) {
                    manager.A0b(new C0838St(c1618ju.A0E().A0e(), c1618ju.A0G(), A03(0, 6, 32), c1618ju.A0E().A0D()));
                }
            }
        }
        manager.A0X(new C1460h6(this, list), new C0835Sq(firstRequestId, A03(0, 6, 32)));
    }
}
