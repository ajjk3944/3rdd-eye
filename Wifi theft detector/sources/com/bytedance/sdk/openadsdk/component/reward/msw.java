package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.activity.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.component.reward.sz;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.sf;
import com.bytedance.sdk.openadsdk.utils.db;
import com.bytedance.sdk.openadsdk.utils.iyl;
import java.util.Map;

/* loaded from: classes.dex */
class msw extends PAGInterstitialAd {
    private final sz dg;
    private final com.bytedance.sdk.openadsdk.core.model.emc emc;
    private final String xq = db.emc();
    private com.bytedance.sdk.openadsdk.emc.xq.ypw ypw;

    public msw(Context context, com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
        this.emc = emcVar;
        this.dg = new sz(context, emcVar, "fullscreen_interstitial_ad", new sz.emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.msw.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.sz.emc
            public Intent emc(Context context2, rie rieVar, @Nullable Activity activity) {
                return rieVar.wpn() ? new Intent(context2, (Class<?>) TTAdActivity.class) : rieVar.ycc() ? new Intent(context2, (Class<?>) TTFullScreenExpressVideoActivity.class) : new Intent(context2, (Class<?>) TTFullScreenVideoActivity.class);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.sz.emc
            public void emc(Intent intent, @Nullable Activity activity, rie rieVar, boolean z10) {
                com.bytedance.sdk.openadsdk.component.reward.emc.ypw.emc(intent, activity, msw.this.dg.xq(), msw.this.emc, msw.this.xq);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.sz.emc
            public void emc(boolean z10) {
                if (msw.this.ypw == null) {
                    return;
                }
                if (z10) {
                    sf.emc().emc(msw.this.xq, (String) msw.this.ypw);
                } else {
                    sf.emc().emc(msw.this.ypw);
                }
                msw.this.ypw = null;
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.sz.emc
            public void emc(rie rieVar) {
                ypw.emc(rieVar, msw.this.dg.xq(), false);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        return this.dg.emc(str);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        return this.dg.ypw();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d10, String str, String str2) {
        this.dg.emc(d10, str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionCallback(PAGInterstitialAdInteractionCallback pAGInterstitialAdInteractionCallback) {
        this.ypw = new com.bytedance.sdk.openadsdk.component.xq.emc(pAGInterstitialAdInteractionCallback, this.emc);
        emc(1);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionListener(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.ypw = new com.bytedance.sdk.openadsdk.component.xq.emc(pAGInterstitialAdInteractionListener, this.emc);
        emc(1);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void show(Activity activity) {
        this.dg.emc(activity);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        this.dg.emc(d10);
    }

    public void emc() {
        this.dg.emc();
    }

    private void emc(final int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            iyl.xq(new com.bytedance.sdk.component.msw.msw("FullScreen_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.reward.msw.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.emc emcVarEmc = com.bytedance.sdk.openadsdk.multipro.aidl.emc.emc();
                    if (i10 != 1 || msw.this.ypw == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.multipro.aidl.ypw.xq xqVar = new com.bytedance.sdk.openadsdk.multipro.aidl.ypw.xq(msw.this.ypw);
                    IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(emcVarEmc.emc(1));
                    if (iListenerManagerAsInterface != null) {
                        try {
                            iListenerManagerAsInterface.registerFullVideoListener(msw.this.xq, xqVar);
                        } catch (RemoteException e10) {
                            com.bytedance.sdk.component.utils.ul.xq("TTFullScreenVideoAdImpl", e10.getMessage());
                        }
                    }
                }
            }, 5);
        }
    }
}
