package com.mbridge.msdk.video.module.listener.impl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;

/* loaded from: classes3.dex */
public class b extends d {

    /* renamed from: n, reason: collision with root package name */
    private MBridgeVideoView f19176n;

    /* renamed from: o, reason: collision with root package name */
    private MBridgeContainerView f19177o;

    public b(MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, com.mbridge.msdk.videocommon.entity.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, com.mbridge.msdk.video.module.listener.a aVar2, int i10, boolean z10) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i10, z10);
        this.f19176n = mBridgeVideoView;
        this.f19177o = mBridgeContainerView;
        if (mBridgeVideoView == null || mBridgeContainerView == null) {
            this.f19187a = false;
        }
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.d, com.mbridge.msdk.video.module.listener.impl.k, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        if (this.f19187a) {
            if (i10 == 8) {
                MBridgeContainerView mBridgeContainerView = this.f19177o;
                if (mBridgeContainerView == null) {
                    MBridgeVideoView mBridgeVideoView = this.f19176n;
                    if (mBridgeVideoView != null) {
                        mBridgeVideoView.showAlertView();
                    }
                } else if (mBridgeContainerView.showAlertWebView()) {
                    MBridgeVideoView mBridgeVideoView2 = this.f19176n;
                    if (mBridgeVideoView2 != null) {
                        mBridgeVideoView2.alertWebViewShowed();
                    }
                } else {
                    MBridgeVideoView mBridgeVideoView3 = this.f19176n;
                    if (mBridgeVideoView3 != null) {
                        mBridgeVideoView3.showAlertView();
                    }
                }
            } else if (i10 == 107) {
                this.f19177o.showVideoClickView(-1);
                this.f19176n.setCover(false);
                this.f19176n.setMiniEndCardState(false);
                this.f19176n.videoOperate(1);
            } else if (i10 == 112) {
                this.f19176n.setCover(true);
                this.f19176n.setMiniEndCardState(true);
                this.f19176n.videoOperate(2);
            } else if (i10 == 115) {
                this.f19177o.resizeMiniCard(this.f19176n.getBorderViewWidth(), this.f19176n.getBorderViewHeight(), this.f19176n.getBorderViewRadius());
            }
        }
        super.a(i10, obj);
    }
}
