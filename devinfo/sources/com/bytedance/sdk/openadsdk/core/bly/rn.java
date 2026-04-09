package com.bytedance.sdk.openadsdk.core.bly;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.c;
import com.bytedance.sdk.openadsdk.utils.osn;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class rn extends com.bytedance.sdk.openadsdk.core.mwh.vt.le implements View.OnClickListener {
    private boolean zih;

    public rn(Context context, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, String str, com.bytedance.sdk.openadsdk.yu.ra raVar, boolean z3) {
        super(context, vppVar, false, str, false, raVar);
        this.zih = false;
        setOnClickListener(this);
        setNeedNativeVideoPlayBtnVisible(false);
        setNeedSelfManagerVideo(!z3);
    }

    private void ko() {
        osn.ouw((View) this.ra, 0);
        osn.ouw((View) this.pno, 0);
        osn.ouw((View) this.tlj, 8);
    }

    private void rn() {
        pno();
        RelativeLayout relativeLayout = this.ra;
        if (relativeLayout != null) {
            if (relativeLayout.getVisibility() == 0) {
                return;
            }
            com.bytedance.sdk.openadsdk.th.vt.ouw();
            com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.ouw;
            c cVar = vppVar.f8309sd;
            com.bytedance.sdk.openadsdk.th.vt.ouw(cVar.f6578f, cVar.f6574b, cVar.f6573a, this.pno, vppVar);
        }
        ko();
    }

    public final void fkw() {
        pno();
        osn.ouw((View) this.ra, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.le
    public final void lh() {
        if (this.zih) {
            super.lh();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ImageView imageView = this.bly;
        if (imageView != null && imageView.getVisibility() == 0) {
            osn.fkw(this.ra);
        }
        lh();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.le, android.view.View
    public void onWindowFocusChanged(boolean z3) {
        ImageView imageView = this.bly;
        if (imageView == null || imageView.getVisibility() != 0) {
            super.onWindowFocusChanged(z3);
        } else {
            rn();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.le, android.view.View
    public void onWindowVisibilityChanged(int i4) {
        ImageView imageView = this.bly;
        if (imageView == null || imageView.getVisibility() != 0) {
            super.onWindowVisibilityChanged(i4);
        } else {
            rn();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.le
    public final void ouw(boolean z3) {
    }

    public void setCanInterruptVideoPlay(boolean z3) {
        this.zih = z3;
    }

    public void setShouldCheckNetChange(boolean z3) {
        com.bytedance.sdk.openadsdk.core.mwh.vt.lh lhVar = this.vt;
        if (lhVar != null) {
            lhVar.lh(z3);
        }
    }

    public void setShowAdInteractionView(boolean z3) {
        com.bytedance.sdk.openadsdk.core.mwh.vt.fkw fkwVar;
        com.bytedance.sdk.openadsdk.core.mwh.vt.lh lhVar = this.vt;
        if (lhVar == null || (fkwVar = lhVar.ra) == null) {
            return;
        }
        fkwVar.ouw(z3);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.le
    public final void vt() {
        if (!this.fkw || !ex.vt(this.ryl)) {
            this.yu = false;
        }
        super.vt();
    }

    public final void yu() {
        ImageView imageView = this.tlj;
        if (imageView != null) {
            osn.ouw((View) imageView, 8);
        }
    }

    public final void ouw(int i4, int i10) {
        com.bytedance.sdk.openadsdk.core.mwh.vt.lh lhVar = this.vt;
        if (lhVar != null) {
            lhVar.ouw(i4, i10);
            com.bytedance.sdk.openadsdk.core.mwh.vt.fkw fkwVar = lhVar.ra;
            if (fkwVar == null || i4 <= 0 || i10 <= 0) {
                return;
            }
            fkwVar.vt(i4, i10);
            lhVar.ra.ouw(i4, i10);
            lhVar.ksc();
        }
    }
}
