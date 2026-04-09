package com.bytedance.sdk.openadsdk.core.sup;

import android.util.Pair;
import android.view.View;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import java.util.Set;

/* loaded from: classes.dex */
public class uym {
    private final AdSession bw;
    protected VastProperties dg;
    protected String xq;
    private final AdEvents ycc;
    private boolean uym = false;
    protected boolean emc = false;
    protected int ypw = 0;

    public uym(AdSession adSession, AdEvents adEvents, View view) {
        this.bw = adSession;
        this.ycc = adEvents;
        this.xq = adSession.getAdSessionId();
        emc(view);
    }

    public void dg() {
        emc(3);
    }

    public void emc(float f2, boolean z6) {
    }

    public void xq() {
        emc(4);
    }

    public void ypw(int i) {
    }

    public void emc(boolean z6) {
    }

    public void ypw() {
        emc(1);
    }

    public void emc(boolean z6, float f2) {
    }

    public void emc(View view) {
        AdSession adSession;
        if (view == null || (adSession = this.bw) == null) {
            return;
        }
        adSession.registerAdView(view);
    }

    public void emc(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.bw;
        if (adSession != null) {
            adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
        }
    }

    public boolean emc() {
        return this.emc;
    }

    public void emc(int i) {
        int i3;
        if (this.bw == null || this.ycc == null || !bw.xq()) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 || (i3 = this.ypw) == 0 || i3 == 4) {
                        return;
                    }
                    this.bw.finish();
                    this.emc = false;
                } else {
                    if (this.uym) {
                        return;
                    }
                    int i6 = this.ypw;
                    if (i6 != 1 && i6 != 2) {
                        return;
                    }
                    this.ycc.impressionOccurred();
                    this.uym = true;
                }
            } else {
                if (this.ypw != 0) {
                    return;
                }
                this.bw.start();
                if (this.dg == null) {
                    this.dg = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                }
                this.ycc.loaded(this.dg);
                this.emc = true;
                this.dg = null;
            }
        } else {
            if (this.ypw != 0) {
                return;
            }
            this.bw.start();
            this.ycc.loaded();
            this.emc = true;
        }
        this.ypw = i;
    }

    public void emc(Set<Pair<View, FriendlyObstructionPurpose>> set) {
        for (Pair<View, FriendlyObstructionPurpose> pair : set) {
            emc((View) pair.first, (FriendlyObstructionPurpose) pair.second);
        }
    }
}
