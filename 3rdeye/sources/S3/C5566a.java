package s3;

import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.vungle.ads.C4045c;
import kotlin.jvm.internal.l;
import r3.AbstractC5521a;

/* compiled from: VungleRtbAppOpenAd.kt */
/* renamed from: s3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5566a extends AbstractC5521a {
    @Override // r3.AbstractC5521a
    public final String a(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        String bidResponse = mediationAppOpenAdConfiguration.getBidResponse();
        l.e(bidResponse, "mediationAppOpenAdConfiguration.bidResponse");
        return bidResponse;
    }

    @Override // r3.AbstractC5521a
    public final void b(C4045c c4045c, MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        String watermark = mediationAppOpenAdConfiguration.getWatermark();
        l.e(watermark, "mediationAppOpenAdConfiguration.watermark");
        if (watermark.length() > 0) {
            c4045c.setWatermark(watermark);
        }
    }
}
