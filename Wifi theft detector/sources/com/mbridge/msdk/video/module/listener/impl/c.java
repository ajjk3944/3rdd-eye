package com.mbridge.msdk.video.module.listener.impl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.signal.factory.IJSFactory;

/* loaded from: classes3.dex */
public class c extends d {

    /* renamed from: n, reason: collision with root package name */
    private IJSFactory f19178n;

    public c(IJSFactory iJSFactory, CampaignEx campaignEx, com.mbridge.msdk.videocommon.entity.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, com.mbridge.msdk.video.module.listener.a aVar2, int i10, boolean z10) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i10, z10);
        this.f19178n = iJSFactory;
        if (iJSFactory == null) {
            this.f19187a = false;
        }
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.d, com.mbridge.msdk.video.module.listener.impl.k, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        if (this.f19187a) {
            if (i10 != 8) {
                if (i10 == 105) {
                    this.f19178n.getJSNotifyProxy().a(3, obj.toString());
                    i10 = -1;
                } else if (i10 == 107) {
                    this.f19178n.getJSContainerModule().showVideoClickView(-1);
                    this.f19178n.getJSVideoModule().setCover(false);
                    this.f19178n.getJSVideoModule().setMiniEndCardState(false);
                    this.f19178n.getJSVideoModule().videoOperate(1);
                } else if (i10 == 112) {
                    this.f19178n.getJSVideoModule().setCover(true);
                    this.f19178n.getJSVideoModule().setMiniEndCardState(true);
                    this.f19178n.getJSVideoModule().videoOperate(2);
                } else if (i10 == 115) {
                    com.mbridge.msdk.video.signal.j jSVideoModule = this.f19178n.getJSVideoModule();
                    this.f19178n.getJSContainerModule().resizeMiniCard(jSVideoModule.getBorderViewWidth(), jSVideoModule.getBorderViewHeight(), jSVideoModule.getBorderViewRadius());
                }
            } else if (this.f19178n.getJSContainerModule().showAlertWebView()) {
                this.f19178n.getJSVideoModule().alertWebViewShowed();
            } else {
                this.f19178n.getJSVideoModule().showAlertView();
            }
        }
        super.a(i10, obj);
    }
}
