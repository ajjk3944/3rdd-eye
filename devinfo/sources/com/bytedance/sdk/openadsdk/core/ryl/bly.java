package com.bytedance.sdk.openadsdk.core.ryl;

import android.view.View;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.media.InteractionType;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import com.iab.omid.library.bytedance2.adsession.media.PlayerState;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class bly extends ra {
    private final MediaEvents fkw;

    /* renamed from: le, reason: collision with root package name */
    private boolean f8391le;

    public bly(AdSession adSession, AdEvents adEvents, View view, MediaEvents mediaEvents) {
        super(adSession, adEvents, view);
        this.fkw = mediaEvents;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ryl.ra
    public final void ouw(boolean z3, float f10) {
        if (z3) {
            this.yu = VastProperties.createVastPropertiesForSkippableMedia(f10, true, Position.STANDALONE);
        } else {
            this.yu = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        }
        ouw(2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ryl.ra
    public final void vt(int i4) throws JSONException {
        if (ouw()) {
            switch (i4) {
                case 0:
                    this.fkw.pause();
                    break;
                case 1:
                    this.fkw.resume();
                    break;
                case 2:
                case 14:
                    this.fkw.skipped();
                    break;
                case 4:
                    this.fkw.bufferStart();
                    break;
                case 5:
                    this.fkw.bufferFinish();
                    break;
                case 6:
                    this.fkw.firstQuartile();
                    break;
                case 7:
                    this.fkw.midpoint();
                    break;
                case 8:
                    this.fkw.thirdQuartile();
                    break;
                case 9:
                    this.fkw.complete();
                    break;
                case 10:
                    this.fkw.playerStateChange(PlayerState.FULLSCREEN);
                    break;
                case 11:
                    this.fkw.playerStateChange(PlayerState.NORMAL);
                    break;
                case 12:
                    this.fkw.volumeChange(this.f8391le ? 0.0f : 1.0f);
                    break;
                case 13:
                    this.fkw.adUserInteraction(InteractionType.CLICK);
                    break;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ryl.ra
    public final void ouw(float f10, boolean z3) throws JSONException {
        if (ouw()) {
            this.fkw.start(f10, z3 ? 0.0f : 1.0f);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ryl.ra
    public final void ouw(boolean z3) throws JSONException {
        this.f8391le = z3;
        vt(12);
    }
}
