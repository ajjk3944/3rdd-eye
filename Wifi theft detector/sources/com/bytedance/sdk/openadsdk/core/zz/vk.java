package com.bytedance.sdk.openadsdk.core.zz;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.utils.vw;
import org.json.JSONException;

/* loaded from: classes.dex */
public class vk extends com.bytedance.sdk.openadsdk.core.sz.ypw.ycc implements View.OnClickListener {

    /* renamed from: aa, reason: collision with root package name */
    private boolean f9310aa;

    public vk(@NonNull Context context, @NonNull com.bytedance.sdk.openadsdk.core.model.rie rieVar, String str, com.bytedance.sdk.openadsdk.dg.uym uymVar, boolean z10) {
        super(context, rieVar, false, str, false, false, uymVar);
        this.f9310aa = false;
        setOnClickListener(this);
        setNeedNativeVideoPlayBtnVisible(false);
        setNeedSelfManagerVideo(!z10);
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
                com.bytedance.sdk.openadsdk.yzg.ypw.ypw().emc(this.emc.iat().r(), this.emc.iat().B(), this.emc.iat().I(), this.msw, this.emc);
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
    public void emc(boolean z10) {
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
    public void onWindowFocusChanged(boolean z10) throws JSONException {
        ImageView imageView = this.zz;
        if (imageView == null || imageView.getVisibility() != 0) {
            super.onWindowFocusChanged(z10);
        } else {
            yzg();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.ycc, android.view.View
    public void onWindowVisibilityChanged(int i10) {
        ImageView imageView = this.zz;
        if (imageView == null || imageView.getVisibility() != 0) {
            super.onWindowVisibilityChanged(i10);
        } else {
            yzg();
        }
    }

    public void setCanInterruptVideoPlay(boolean z10) {
        this.f9310aa = z10;
    }

    public void setShouldCheckNetChange(boolean z10) {
        com.bytedance.sdk.openadsdk.core.sz.ypw.xq xqVar = this.ypw;
        if (xqVar != null) {
            xqVar.bw(z10);
        }
    }

    public void setShowAdInteractionView(boolean z10) {
        com.bytedance.sdk.openadsdk.core.sz.ypw.bw bwVarSup;
        com.bytedance.sdk.openadsdk.core.sz.ypw.xq xqVar = this.ypw;
        if (xqVar == null || (bwVarSup = xqVar.sup()) == null) {
            return;
        }
        bwVarSup.emc(z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.ycc
    public void xq() {
        if (this.f9310aa) {
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

    public void emc(int i10, int i11) {
        com.bytedance.sdk.openadsdk.core.sz.ypw.xq xqVar = this.ypw;
        if (xqVar != null) {
            xqVar.ypw(i10, i11);
        }
    }
}
