package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.bridge.fbsdk.FBLoginASID;
import com.facebook.ads.internal.bridge.gms.AdvertisingId;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class XN implements SV {
    public static byte[] A01;
    public final SQ A00;

    static {
        A01();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 57);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-20, 25, 15, 29, 26, 20, 15};
    }

    public XN(SQ sq) {
        this.A00 = sq;
    }

    @Override // com.facebook.ads.redexgen.core.SV
    public final String A71() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.SV
    public final String A7y() {
        return VZ.A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.SV
    public final String A7z() {
        return FBLoginASID.getFBLoginASID();
    }

    @Override // com.facebook.ads.redexgen.core.SV
    public final String A8N() {
        return AdInternalSettings.getMediationService();
    }

    @Override // com.facebook.ads.redexgen.core.SV
    public final String A8U() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.SV
    public final SU A8p() {
        AdvertisingId advertisingIdInfoDirectly = AdvertisingId.getAdvertisingIdInfoDirectly(this.A00);
        if (advertisingIdInfoDirectly == null) {
            return null;
        }
        return new XV(this, advertisingIdInfoDirectly);
    }

    @Override // com.facebook.ads.redexgen.core.SV
    public final String A9I() {
        return AdInternalSettings.getUrlPrefix();
    }

    @Override // com.facebook.ads.redexgen.core.SV
    public final String A9K() {
        return A00(0, 7, 114);
    }

    @Override // com.facebook.ads.redexgen.core.SV
    public final String A9L() {
        return BuildConfigApi.getVersionName(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.SV
    public final boolean AAF() {
        return BuildConfigApi.isDebug();
    }
}
