package com.facebook.ads.redexgen.core;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H&J(\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0015\u001a\u00020\u0016H\u0004¨\u0006\u001a"}, d2 = {"Lcom/facebook/video/heroplayer/exocustom/MediaCodecPoolTracker;", "", "<init>", "()V", "reportCodecCreating", "Lcom/facebook/video/heroplayer/exocustom/MediaCodecPoolTracker$CreatingEvent;", "isVideo", "", "codecName", "", AdRevenueConstants.SOURCE_KEY, "Lcom/facebook/video/heroplayer/exocustom/MediaCodecPoolTracker$Source;", "reportCodecCreated", "", "creatingEvent", "codecInstanceId", "", "reportCodecAcquiredFromPool", "reportCodecReturnedToPool", "reportCodecReleasing", "reportCodecReleased", "getNowMilliseconds", "", "Source", "CreatingEvent", "ReleasingEvent", "fbandroid.java.com.facebook.video.heroplayer.exocustom.exocustom"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.hr, reason: from Kotlin metadata */
/* loaded from: assets/audience_network.dex */
public abstract class MediaCodecPoolTracker {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A03(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 52);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-84, -72, -83, -82, -84, -105, -86, -74, -82, 19, 15, 21, 18, 3, 5};
    }

    public abstract void A06(C3539ho c3539ho, int i);

    public abstract void A07(EnumC3541hq enumC3541hq, int i);

    public abstract void A08(EnumC3541hq enumC3541hq, int i);

    public abstract void A09(EnumC3541hq enumC3541hq, int i);

    public abstract void A0A(boolean z10, String str, EnumC3541hq enumC3541hq, int i);

    private final long A02() {
        return C2431Bc.A00().AC6();
    }

    public final C3539ho A05(boolean z10, String str, EnumC3541hq enumC3541hq) {
        C3963p6.A09(str, A03(0, 9, 21));
        C3963p6.A09(enumC3541hq, A03(9, 6, 108));
        return new C3539ho(A02(), z10, str, enumC3541hq);
    }
}
