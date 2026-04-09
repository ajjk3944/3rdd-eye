package com.bytedance.sdk.openadsdk.core.zz;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class vk extends com.bytedance.sdk.openadsdk.core.sz.ypw.ycc implements View.OnClickListener {
    private boolean aa;

    public vk(Context context, com.bytedance.sdk.openadsdk.core.model.rie rieVar, String str, com.bytedance.sdk.openadsdk.dg.uym uymVar, boolean z6) {
        super(context, rieVar, false, str, false, false, uymVar);
        this.aa = false;
        setOnClickListener(this);
        setNeedNativeVideoPlayBtnVisible(false);
        setNeedSelfManagerVideo(!z6);
    }

    private void sba() {
        vw.emc((View) this.uym, 0);
        vw.emc((View) this.msw, 0);
        vw.emc((View) this.ru, 8);
    }

    private void yzg() {
        uym();
        RelativeLayout relativeLayout = this.uym;
        if (relativeLayout != null) {
            if (relativeLayout.getVisibility() == 0) {
                return;
            } else {
                com.bytedance.sdk.openadsdk.yzg.ypw.ypw().emc(this.emc.iat().f6585f, this.emc.iat().f6581b, this.emc.iat().f6580a, this.msw, this.emc);
            }
        }
        sba();
    }

    public void bw() {
        uym();
        vw.emc((View) this.uym, 0);
    }

    public void dg() {
        ImageView imageView = this.ru;
        if (imageView != null) {
            vw.emc((View) imageView, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.ycc
    public void emc(boolean z6) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ImageView imageView = this.zz;
        if (imageView != null && imageView.getVisibility() == 0) {
            vw.bw(this.uym);
        }
        xq();
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.ycc, android.view.View
    public void onWindowFocusChanged(boolean z6) {
        ImageView imageView = this.zz;
        if (imageView == null || imageView.getVisibility() != 0) {
            super.onWindowFocusChanged(z6);
        } else {
            yzg();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.ycc, android.view.View
    public void onWindowVisibilityChanged(int i) {
        ImageView imageView = this.zz;
        if (imageView == null || imageView.getVisibility() != 0) {
            super.onWindowVisibilityChanged(i);
        } else {
            yzg();
        }
    }

    public void setCanInterruptVideoPlay(boolean z6) {
        this.aa = z6;
    }

    public void setShouldCheckNetChange(boolean z6) {
        com.bytedance.sdk.openadsdk.core.sz.ypw.xq xqVar = this.ypw;
        if (xqVar != null) {
            xqVar.bw(z6);
        }
    }

    public void setShowAdInteractionView(boolean z6) {
        com.bytedance.sdk.openadsdk.core.sz.ypw.bw bwVarSup;
        com.bytedance.sdk.openadsdk.core.sz.ypw.xq xqVar = this.ypw;
        if (xqVar == null || (bwVarSup = xqVar.sup()) == null) {
            return;
        }
        bwVarSup.emc(z6);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.ycc
    public void xq() {
        if (this.aa) {
            super.xq();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.ycc
    public void ypw() {
        if (!this.bw || !hxp.ypw(this.sup)) {
            this.dg = false;
        }
        super.ypw();
    }

    public void emc(int i, int i3) {
        com.bytedance.sdk.openadsdk.core.sz.ypw.xq xqVar = this.ypw;
        if (xqVar != null) {
            xqVar.ypw(i, i3);
        }
    }
}
