package com.bytedance.sdk.openadsdk.core.dg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.utils.vw;
import com.bytedance.sdk.openadsdk.utils.xmt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class uym extends PAGBannerAd {
    private boolean bw;
    private boolean dg;
    protected Context emc;
    private List<com.bytedance.sdk.openadsdk.core.dg.emc> gbl;
    private int msw;
    private final AtomicBoolean ru = new AtomicBoolean(false);
    private boolean uym;
    protected AdSlot xq;
    private bw ycc;
    protected rie ypw;
    private int zz;

    public interface emc {
        void emc();
    }

    public uym(Context context, rie rieVar, AdSlot adSlot) {
        this.msw = 0;
        this.zz = 0;
        this.emc = context;
        this.ypw = rieVar;
        this.xq = adSlot;
        this.msw = (int) adSlot.getExpressViewAcceptedWidth();
        this.zz = (int) this.xq.getExpressViewAcceptedHeight();
        emc(this.ypw);
        ypw(rieVar);
    }

    private void ypw(rie rieVar) {
        com.bytedance.sdk.openadsdk.core.model.emc emcVarDg;
        if (rieVar == null || (emcVarDg = rieVar.dg()) == null) {
            return;
        }
        this.gbl = new ArrayList();
        int size = emcVarDg.dg().size();
        if (!this.uym) {
            this.gbl.add(new com.bytedance.sdk.openadsdk.core.dg.emc(this.emc, rieVar, this.xq, this, false));
            return;
        }
        this.ycc = new bw(emcVarDg.uym(), this.emc, this.msw, this.zz);
        for (int i = 0; i < size; i++) {
            this.xq.setExpressViewAccepted(((this.msw - vw.xq(this.emc, emcVarDg.uym().bw())) - vw.xq(this.emc, emcVarDg.uym().ycc())) - (vw.xq(this.emc, emcVarDg.uym().uym()) * 2), this.zz);
            rie rieVar2 = emcVarDg.dg().get(i);
            if (i != 0) {
                emc(i, rieVar2);
            }
            com.bytedance.sdk.openadsdk.core.dg.emc emcVar = new com.bytedance.sdk.openadsdk.core.dg.emc(this.emc, rieVar2, this.xq, this, true);
            emcVar.emc(i);
            this.gbl.add(emcVar);
        }
        this.ycc.emc(this.gbl);
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void destroy() {
        try {
            List<com.bytedance.sdk.openadsdk.core.dg.emc> list = this.gbl;
            if (list == null || list.isEmpty()) {
                return;
            }
            if (this.uym) {
                this.ycc.emc();
            } else {
                this.gbl.get(0).uym();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public PAGBannerSize getBannerSize() {
        return this.xq != null ? new PAGBannerSize(this.msw, this.zz) : new PAGBannerSize(0, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public View getBannerView() {
        try {
            List<com.bytedance.sdk.openadsdk.core.dg.emc> list = this.gbl;
            if (list != null && !list.isEmpty()) {
                return this.uym ? this.ycc.ypw() : this.gbl.get(0).emc();
            }
        } catch (Throwable unused) {
        }
        return new View(this.emc);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        rie rieVar = this.ypw;
        if (rieVar == null || rieVar.zek() == null) {
            return null;
        }
        try {
            return this.ypw.zek().get(str);
        } catch (Throwable th) {
            ul.xq("PAGBannerAdImpl", th.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        rie rieVar = this.ypw;
        if (rieVar != null) {
            return rieVar.zek();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d6, String str, String str2) {
        if (this.bw) {
            return;
        }
        xmt.emc(this.ypw, d6, str, str2);
        this.bw = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionCallback(final PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback) {
        List<com.bytedance.sdk.openadsdk.core.dg.emc> list = this.gbl;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < this.gbl.size(); i++) {
            this.gbl.get(i).emc(new PAGBannerAdInteractionCallback() { // from class: com.bytedance.sdk.openadsdk.core.dg.uym.1
                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdClicked() {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback;
                    if (pAGBannerAdInteractionCallback2 != null) {
                        pAGBannerAdInteractionCallback2.onAdClicked();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdDismissed() {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback;
                    if (pAGBannerAdInteractionCallback2 != null) {
                        pAGBannerAdInteractionCallback2.onAdDismissed();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback
                public void onAdShowFailed(PAGErrorModel pAGErrorModel) {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback;
                    if (pAGBannerAdInteractionCallback2 != null) {
                        pAGBannerAdInteractionCallback2.onAdShowFailed(pAGErrorModel);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdShowed() {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2;
                    if (!uym.this.ru.compareAndSet(false, true) || (pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback) == null) {
                        return;
                    }
                    pAGBannerAdInteractionCallback2.onAdShowed();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionListener(final PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        List<com.bytedance.sdk.openadsdk.core.dg.emc> list = this.gbl;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < this.gbl.size(); i++) {
            this.gbl.get(i).emc(new PAGBannerAdInteractionListener() { // from class: com.bytedance.sdk.openadsdk.core.dg.uym.2
                @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdClicked() {
                    PAGBannerAdInteractionListener pAGBannerAdInteractionListener2 = pAGBannerAdInteractionListener;
                    if (pAGBannerAdInteractionListener2 != null) {
                        pAGBannerAdInteractionListener2.onAdClicked();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdDismissed() {
                    PAGBannerAdInteractionListener pAGBannerAdInteractionListener2 = pAGBannerAdInteractionListener;
                    if (pAGBannerAdInteractionListener2 != null) {
                        pAGBannerAdInteractionListener2.onAdDismissed();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdShowed() {
                    PAGBannerAdInteractionListener pAGBannerAdInteractionListener2;
                    if (!uym.this.ru.compareAndSet(false, true) || (pAGBannerAdInteractionListener2 = pAGBannerAdInteractionListener) == null) {
                        return;
                    }
                    pAGBannerAdInteractionListener2.onAdShowed();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d6) {
        if (this.dg) {
            return;
        }
        xmt.emc(this.ypw, d6);
        this.dg = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void emc(com.bytedance.sdk.openadsdk.core.model.rie r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L1d
            com.bytedance.sdk.openadsdk.core.model.emc r2 = r2.dg()
            if (r2 == 0) goto L1d
            boolean r0 = r2.ru()
            if (r0 == 0) goto L1a
            java.util.List r2 = r2.dg()
            int r2 = r2.size()
            r0 = 1
            if (r2 <= r0) goto L1a
            goto L1b
        L1a:
            r0 = 0
        L1b:
            r1.uym = r0
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.dg.uym.emc(com.bytedance.sdk.openadsdk.core.model.rie):void");
    }

    public boolean emc() {
        return this.uym;
    }

    private void emc(int i, rie rieVar) {
        if (i != 0) {
            if (!TextUtils.isEmpty(rieVar.vum())) {
                rieVar.qh("0");
            }
            Map<String, Object> mapZek = rieVar.zek();
            if (mapZek == null || !mapZek.containsKey("price")) {
                return;
            }
            mapZek.put("price", "0");
        }
    }
}
