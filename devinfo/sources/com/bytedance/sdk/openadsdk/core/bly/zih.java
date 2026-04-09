package com.bytedance.sdk.openadsdk.core.bly;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.utils.osn;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class zih extends ouw {

    /* renamed from: jg, reason: collision with root package name */
    private FrameLayout f8100jg;
    private qbp mwh;
    private FrameLayout ouw;

    public zih(Context context) {
        super(context);
        this.vt = context;
    }

    public final View getBackupContainerBackgroundView() {
        return this.ouw;
    }

    public final FrameLayout getVideoContainer() {
        return this.f8100jg;
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar, qbp qbpVar, ViewGroup viewGroup) {
        com.bytedance.sdk.component.utils.ko.vt("FullRewardExpressBackupView", "show backup view");
        if (vppVar == null) {
            return;
        }
        setBackgroundColor(-1);
        this.f8071lh = vppVar;
        this.mwh = qbpVar;
        if (vppVar.uoy() == 7) {
            this.f8070le = "rewarded_video";
        } else {
            this.f8070le = "fullscreen_interstitial_ad";
        }
        this.ra = osn.ouw(this.vt, this.mwh.getExpectExpressWidth());
        this.pno = osn.ouw(this.vt, this.mwh.getExpectExpressWidth());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.ra, this.pno);
        }
        layoutParams.width = this.ra;
        layoutParams.height = this.pno;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        this.f8071lh.zih();
        com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(this.vt);
        this.ouw = lhVar;
        addView(lhVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.le.lh lhVar2 = new com.bytedance.sdk.openadsdk.core.le.lh(this.vt);
        this.f8100jg = lhVar2;
        this.ouw.addView(lhVar2, new FrameLayout.LayoutParams(-1, -1));
        this.f8100jg.removeAllViews();
        if (com.bytedance.sdk.openadsdk.core.model.th.lh(vppVar)) {
            this.mwh.addView(this, new ViewGroup.LayoutParams(-1, -1));
        } else {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 17;
            this.mwh.addView(this, layoutParams2);
        }
        int i4 = com.bytedance.sdk.openadsdk.utils.rn.bu;
        View viewFindViewById = viewGroup.findViewById(i4);
        if (viewFindViewById != null) {
            Object tag = viewFindViewById.getTag(i4);
            if (tag instanceof String) {
                String str = (String) tag;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.th.vt.ouw().ouw(str, viewFindViewById);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ouw
    public final void ouw(View view, int i4, com.bytedance.sdk.openadsdk.core.model.ko koVar) {
        qbp qbpVar = this.mwh;
        if (qbpVar != null) {
            qbpVar.ouw(view, i4, koVar);
        }
    }
}
