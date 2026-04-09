package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.activity.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.component.reward.sz;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.sf;
import com.bytedance.sdk.openadsdk.utils.db;
import com.bytedance.sdk.openadsdk.utils.iyl;
import java.util.Map;

/* loaded from: classes.dex */
class ru extends PAGRewardedAd {
    private final sz bw;
    private final String dg = db.emc();
    private final com.bytedance.sdk.openadsdk.core.model.emc emc;
    private com.bytedance.sdk.openadsdk.emc.bw.emc xq;
    private final AdSlot ypw;

    public ru(Context context, com.bytedance.sdk.openadsdk.core.model.emc emcVar, AdSlot adSlot) {
        this.emc = emcVar;
        this.ypw = adSlot;
        this.bw = new sz(context, emcVar, "rewarded_video", new sz.emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.ru.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.sz.emc
            public Intent emc(Context context2, rie rieVar, Activity activity) {
                return rieVar.wpn() ? new Intent(context2, (Class<?>) TTAdActivity.class) : rieVar.ycc() ? new Intent(context2, (Class<?>) TTRewardExpressVideoActivity.class) : new Intent(context2, (Class<?>) TTRewardVideoActivity.class);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.sz.emc
            public void emc(Intent intent, Activity activity, rie rieVar, boolean z6) {
                com.bytedance.sdk.openadsdk.component.reward.emc.ypw.emc(intent, activity, ru.this.bw.xq(), ru.this.emc, ru.this.dg);
                intent.putExtra("media_extra", ru.this.ypw.getMediaExtra());
                intent.putExtra("user_id", ru.this.ypw.getUserID());
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.sz.emc
            public void emc(boolean z6) {
                if (ru.this.xq == null) {
                    return;
                }
                if (z6) {
                    sf.emc().emc(ru.this.dg, (String) ru.this.xq);
                } else {
                    sf.emc().emc(ru.this.xq);
                }
                ru.this.xq = null;
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.sz.emc
            public void emc(rie rieVar) {
                ypw.emc(rieVar, ru.this.bw.xq(), true);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        return this.bw.emc(str);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        return this.bw.ypw();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d6, String str, String str2) {
        this.bw.emc(d6, str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionCallback(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback) {
        this.xq = new gbl(pAGRewardedAdInteractionCallback, this.emc);
        emc(0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionListener(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener) {
        this.xq = new gbl(pAGRewardedAdInteractionListener, this.emc);
        emc(0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void show(Activity activity) {
        this.bw.emc(activity);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d6) {
        this.bw.emc(d6);
    }

    public void emc() {
        this.bw.emc();
    }

    private void emc(final int i) {
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            iyl.xq(new com.bytedance.sdk.component.msw.msw("Reward_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.reward.ru.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.emc emcVarEmc = com.bytedance.sdk.openadsdk.multipro.aidl.emc.emc();
                    if (i != 0 || ru.this.xq == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.multipro.aidl.ypw.dg dgVar = new com.bytedance.sdk.openadsdk.multipro.aidl.ypw.dg(ru.this.xq);
                    IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(emcVarEmc.emc(0));
                    if (iListenerManagerAsInterface != null) {
                        try {
                            iListenerManagerAsInterface.registerRewardVideoListener(ru.this.dg, dgVar);
                        } catch (RemoteException e6) {
                            com.bytedance.sdk.component.utils.ul.xq("TTRewardVideoAdImpl", e6.getMessage());
                        }
                    }
                }
            }, 5);
        }
    }
}
