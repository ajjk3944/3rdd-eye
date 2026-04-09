package com.bytedance.sdk.openadsdk.core.sup;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.media.InteractionType;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import com.iab.omid.library.bytedance2.adsession.media.PlayerState;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import org.json.JSONException;

/* loaded from: classes.dex */
public class zz extends uym {

    @NonNull
    private final MediaEvents bw;
    private boolean ycc;

    public zz(@NonNull AdSession adSession, @NonNull AdEvents adEvents, @NonNull View view, @NonNull MediaEvents mediaEvents) {
        super(adSession, adEvents, view);
        this.bw = mediaEvents;
    }

    @Override // com.bytedance.sdk.openadsdk.core.sup.uym
    public void emc(boolean z10, float f10) {
        if (z10) {
            this.dg = VastProperties.createVastPropertiesForSkippableMedia(f10, true, Position.STANDALONE);
        } else {
            this.dg = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        }
        emc(2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sup.uym
    public void ypw(int i10) throws JSONException {
        if (emc()) {
            switch (i10) {
                case 0:
                    this.bw.pause();
                    break;
                case 1:
                    this.bw.resume();
                    break;
                case 2:
                case 14:
                    this.bw.skipped();
                    break;
                case 4:
                    this.bw.bufferStart();
                    break;
                case 5:
                    this.bw.bufferFinish();
                    break;
                case 6:
                    this.bw.firstQuartile();
                    break;
                case 7:
                    this.bw.midpoint();
                    break;
                case 8:
                    this.bw.thirdQuartile();
                    break;
                case 9:
                    this.bw.complete();
                    break;
                case 10:
                    this.bw.playerStateChange(PlayerState.FULLSCREEN);
                    break;
                case 11:
                    this.bw.playerStateChange(PlayerState.NORMAL);
                    break;
                case 12:
                    this.bw.volumeChange(this.ycc ? 0.0f : 1.0f);
                    break;
                case 13:
                    this.bw.adUserInteraction(InteractionType.CLICK);
                    break;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sup.uym
    public void emc(float f10, boolean z10) throws JSONException {
        if (emc()) {
            this.bw.start(f10, z10 ? 0.0f : 1.0f);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sup.uym
    public void emc(boolean z10) throws JSONException {
        this.ycc = z10;
        ypw(12);
    }
}
