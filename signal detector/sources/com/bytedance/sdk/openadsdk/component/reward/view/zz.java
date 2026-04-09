package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardFullExpressAdListenerProxy;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.ul;
import com.bytedance.sdk.openadsdk.core.zz.cf;
import com.bytedance.sdk.openadsdk.utils.vw;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zz {
    com.bytedance.sdk.openadsdk.ul.emc.emc.xq emc;
    private boolean gbl;
    private final String msw;
    private com.bytedance.sdk.openadsdk.component.reward.emc.emc ru;
    private final rie uym;
    private final Activity ycc;
    Handler ypw;
    private xq zz;
    boolean xq = false;
    boolean dg = false;
    boolean bw = false;

    public zz(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
        this.ru = emcVar;
        this.ycc = emcVar.mxo;
        this.uym = emcVar.ypw;
        this.msw = emcVar.bw;
    }

    public Handler bw() {
        if (this.ypw == null) {
            this.ypw = new Handler(Looper.getMainLooper());
        }
        return this.ypw;
    }

    public void cf() {
        if (rie.bw(this.uym) && this.uym.se() == 3 && this.uym.pxj() == 0) {
            try {
                if (this.uym.ono() == 1) {
                    int iYpw = vw.ypw(aa.emc(), 90.0f);
                    FrameLayout frameLayout = (FrameLayout) this.zz.getBackupContainerBackgroundView();
                    if (frameLayout != null) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                        layoutParams.bottomMargin = iYpw;
                        frameLayout.setLayoutParams(layoutParams);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public boolean dg() {
        return this.dg;
    }

    public void emc(AdSlot adSlot, ul ulVar) {
        if (this.bw) {
            return;
        }
        this.bw = true;
        xq xqVar = new xq(this.ru, adSlot, this.msw);
        this.zz = xqVar;
        if (ulVar != null) {
            ulVar.emc(xqVar, xqVar.getVideoFrameLayout());
        }
    }

    public int gbl() {
        xq xqVar = this.zz;
        if (xqVar != null) {
            return xqVar.getDynamicShowType();
        }
        return 0;
    }

    public void msw() {
        xq xqVar = this.zz;
        if (xqVar != null) {
            xqVar.gbl();
        }
    }

    public void qh() {
        xq xqVar = this.zz;
        if (xqVar == null) {
            return;
        }
        xqVar.yzg();
        this.zz.ru();
    }

    public boolean ru() {
        xq xqVar = this.zz;
        return xqVar != null && xqVar.rie();
    }

    public boolean sup() {
        xq xqVar = this.zz;
        if (xqVar != null) {
            return xqVar.sf instanceof com.bytedance.sdk.component.adexpress.bw.emc;
        }
        return false;
    }

    public void sz() {
        xq xqVar = this.zz;
        if (xqVar == null) {
            return;
        }
        xqVar.sba();
    }

    public void uym() {
        xq xqVar = this.zz;
        if (xqVar != null) {
            xqVar.ru();
        }
    }

    public boolean xq() {
        return this.xq;
    }

    public void ycc() {
        if (this.gbl) {
            return;
        }
        this.gbl = true;
        xq xqVar = this.zz;
        if (xqVar != null) {
            xqVar.sup();
        }
        Handler handler = this.ypw;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public FrameLayout ypw() {
        xq xqVar = this.zz;
        if (xqVar == null) {
            return null;
        }
        FrameLayout videoFrameLayout = xqVar.getVideoFrameLayout();
        if (this.zz.ylm()) {
            cf();
        }
        return videoFrameLayout;
    }

    public boolean zz() {
        xq xqVar = this.zz;
        if (xqVar == null) {
            return false;
        }
        return xqVar.ylm();
    }

    public xq emc() {
        return this.zz;
    }

    public void ypw(boolean z6) {
        this.dg = z6;
    }

    private com.bytedance.sdk.openadsdk.ul.emc.emc.xq ypw(rie rieVar) {
        if (rieVar.sx() == 4) {
            return com.bytedance.sdk.openadsdk.ul.emc.emc.dg.emc(this.ycc, this.msw);
        }
        return null;
    }

    public void emc(boolean z6) {
        this.xq = z6;
    }

    public void emc(com.bytedance.sdk.openadsdk.core.zz.zz zzVar, com.bytedance.sdk.openadsdk.core.zz.msw mswVar) {
        rie rieVar;
        if (this.zz == null || (rieVar = this.uym) == null) {
            return;
        }
        this.emc = ypw(rieVar);
        zzVar.emc(this.zz);
        zzVar.emc(this.emc);
        this.zz.setClickListener(zzVar);
        mswVar.emc((View) this.zz);
        mswVar.emc(this.emc);
        this.zz.setClickCreativeListener(mswVar);
    }

    public void emc(cf cfVar) {
        xq xqVar = this.zz;
        if (xqVar == null) {
            return;
        }
        xqVar.setExpressVideoListenerProxy(cfVar);
    }

    public void emc(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        if (this.zz == null) {
            return;
        }
        this.zz.setExpressInteractionListener(new PAGRewardFullExpressAdListenerProxy(pAGExpressAdWrapperListener));
    }

    public JSONObject emc(JSONObject jSONObject) {
        xq xqVar = this.zz;
        if (xqVar != null) {
            return xqVar.emc(jSONObject, this.ru.ypw);
        }
        return null;
    }

    public void emc(int i, boolean z6) {
        xq xqVar = this.zz;
        if (xqVar != null) {
            xqVar.emc(i, z6, false);
        }
    }

    public void emc(int i, String str) {
        xq xqVar = this.zz;
        if (xqVar != null) {
            xqVar.ypw(i, str);
        }
    }

    public void emc(rie rieVar) {
        xq xqVar = this.zz;
        if (xqVar != null) {
            xqVar.emc(rieVar, rieVar.vaf(), rieVar.bw(), this.ru.yz, !r1.wbn);
        }
    }

    public void emc(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
        this.ru = emcVar;
    }
}
