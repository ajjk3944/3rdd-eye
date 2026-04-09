package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.bly.ko;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.osn;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class tlj {
    private final vpp bly;

    /* renamed from: cf, reason: collision with root package name */
    private boolean f8031cf;

    /* renamed from: lh, reason: collision with root package name */
    public Handler f8033lh;
    public yu ouw;
    private final Activity pno;
    public com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ra;
    private final String tlj;
    com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh vt;
    public boolean yu = false;
    public boolean fkw = false;

    /* renamed from: le, reason: collision with root package name */
    boolean f8032le = false;

    public tlj(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        this.ra = ouwVar;
        this.pno = ouwVar.jvy;
        this.bly = ouwVar.vt;
        this.tlj = ouwVar.fkw;
    }

    private void pno() {
        if (vpp.fkw(this.bly)) {
            vpp vppVar = this.bly;
            if (vppVar.wbf == 3 && vppVar.zih() == 0) {
                try {
                    if (this.bly.jqy() == 1) {
                        int iOuw = osn.ouw(zih.ouw(), 90.0f);
                        FrameLayout frameLayout = (FrameLayout) this.ouw.getBackupContainerBackgroundView();
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            layoutParams.bottomMargin = iOuw;
                            frameLayout.setLayoutParams(layoutParams);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final int fkw() {
        yu yuVar = this.ouw;
        if (yuVar != null) {
            return yuVar.getDynamicShowType();
        }
        return 0;
    }

    public final void le() {
        yu yuVar = this.ouw;
        if (yuVar == null) {
            return;
        }
        yuVar.jg();
    }

    public final void lh() {
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.cf();
        }
    }

    public final void ouw(AdSlot adSlot, th thVar) {
        if (this.f8032le) {
            return;
        }
        this.f8032le = true;
        yu yuVar = new yu(this.ra, adSlot, this.tlj);
        this.ouw = yuVar;
        if (thVar != null) {
            thVar.ouw(yuVar, yuVar.getVideoFrameLayout());
        }
    }

    public final void ra() {
        yu yuVar = this.ouw;
        if (yuVar == null) {
            return;
        }
        yuVar.ko();
        this.ouw.cf();
    }

    public final void vt() {
        if (this.f8031cf) {
            return;
        }
        this.f8031cf = true;
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.mwh();
        }
        Handler handler = this.f8033lh;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final boolean yu() {
        yu yuVar = this.ouw;
        if (yuVar == null) {
            return false;
        }
        return yuVar.zih();
    }

    public final FrameLayout ouw() {
        yu yuVar = this.ouw;
        if (yuVar == null) {
            return null;
        }
        FrameLayout videoFrameLayout = yuVar.getVideoFrameLayout();
        if (this.ouw.zih()) {
            pno();
        }
        return videoFrameLayout;
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.bly.bly blyVar, com.bytedance.sdk.openadsdk.core.bly.pno pnoVar) {
        vpp vppVar;
        if (this.ouw == null || (vppVar = this.bly) == null) {
            return;
        }
        this.vt = ouw(vppVar);
        blyVar.ouw(this.ouw);
        blyVar.ouw(this.vt);
        this.ouw.setClickListener(blyVar);
        pnoVar.ouw((View) this.ouw);
        pnoVar.ouw(this.vt);
        this.ouw.setClickCreativeListener(pnoVar);
    }

    public final void ouw(ko koVar) {
        yu yuVar = this.ouw;
        if (yuVar == null) {
            return;
        }
        yuVar.setExpressVideoListenerProxy(koVar);
    }

    public final void ouw(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        yu yuVar = this.ouw;
        if (yuVar == null) {
            return;
        }
        yuVar.setExpressInteractionListener(pAGExpressAdWrapperListener);
    }

    public final JSONObject ouw(JSONObject jSONObject) {
        yu yuVar = this.ouw;
        if (yuVar != null) {
            return yuVar.ouw(jSONObject, this.ra.vt);
        }
        return null;
    }

    public final void ouw(int i4, boolean z3) {
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.ouw(i4, z3, false);
        }
    }

    public final void ouw(int i4, String str) throws JSONException {
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.vt(i4, str);
        }
    }

    private com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh ouw(vpp vppVar) {
        if (vppVar.f8305pd == 4) {
            return com.bytedance.sdk.openadsdk.qbp.ouw.ouw.yu.ouw(this.pno, this.tlj);
        }
        return null;
    }
}
