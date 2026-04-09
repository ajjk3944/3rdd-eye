package com.bytedance.sdk.openadsdk.core.ryl;

import android.util.Pair;
import android.view.View;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ra {
    private final AdSession fkw;

    /* renamed from: le, reason: collision with root package name */
    private final AdEvents f8419le;

    /* renamed from: lh, reason: collision with root package name */
    protected String f8420lh;
    protected VastProperties yu;
    private boolean ra = false;
    protected boolean ouw = false;
    protected int vt = 0;

    public ra(AdSession adSession, AdEvents adEvents, View view) {
        this.fkw = adSession;
        this.f8419le = adEvents;
        this.f8420lh = adSession.getAdSessionId();
        if (view == null || adSession == null) {
            return;
        }
        adSession.registerAdView(view);
    }

    public final void lh() {
        ouw(4);
    }

    public void ouw(float f10, boolean z3) {
    }

    public void vt(int i4) {
    }

    public final void yu() {
        ouw(3);
    }

    public void ouw(boolean z3) {
    }

    public final void vt() {
        ouw(1);
    }

    public void ouw(boolean z3, float f10) {
    }

    public final void ouw(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.fkw;
        if (adSession != null) {
            adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
        }
    }

    public final boolean ouw() {
        return this.ouw;
    }

    public final void ouw(int i4) {
        int i10;
        if (this.fkw == null || this.f8419le == null || !fkw.lh()) {
            return;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4 || (i10 = this.vt) == 0 || i10 == 4) {
                        return;
                    }
                    this.fkw.finish();
                    this.ouw = false;
                } else {
                    if (this.ra) {
                        return;
                    }
                    int i11 = this.vt;
                    if (i11 != 1 && i11 != 2) {
                        return;
                    }
                    this.f8419le.impressionOccurred();
                    this.ra = true;
                }
            } else {
                if (this.vt != 0) {
                    return;
                }
                this.fkw.start();
                if (this.yu == null) {
                    this.yu = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                }
                this.f8419le.loaded(this.yu);
                this.ouw = true;
                this.yu = null;
            }
        } else {
            if (this.vt != 0) {
                return;
            }
            this.fkw.start();
            this.f8419le.loaded();
            this.ouw = true;
        }
        this.vt = i4;
    }

    public final void ouw(Set<Pair<View, FriendlyObstructionPurpose>> set) {
        for (Pair<View, FriendlyObstructionPurpose> pair : set) {
            ouw((View) pair.first, (FriendlyObstructionPurpose) pair.second);
        }
    }
}
