package com.bytedance.sdk.openadsdk.api.nativeAd;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.sz.ypw.ycc;
import com.bytedance.sdk.openadsdk.core.xq.emc;
import com.bytedance.sdk.openadsdk.utils.dg;

/* loaded from: classes.dex */
public class PAGVideoMediaView extends PAGMediaView implements emc.InterfaceC0166emc {
    private rie dg;
    private final com.bytedance.sdk.openadsdk.emc.ypw.emc xq;
    private ycc ypw;

    public PAGVideoMediaView(Context context, @Nullable View view, @Nullable com.bytedance.sdk.openadsdk.emc.ypw.emc emcVar) {
        super(context);
        emc(view);
        this.xq = emcVar;
    }

    private void emc(View view) {
        if (view instanceof ycc) {
            ycc yccVar = (ycc) view;
            this.ypw = yccVar;
            addView(yccVar, -1, -1);
        }
    }

    private boolean ypw() {
        ycc yccVar = this.ypw;
        if (yccVar != null) {
            return yccVar.sz();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void close() {
        ycc yccVar = this.ypw;
        if (yccVar != null) {
            yccVar.vk();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.xq.emc.InterfaceC0166emc
    public long getVideoProgress() {
        ycc yccVar = this.ypw;
        if (yccVar == null || yccVar.getNativeVideoController() == null) {
            return 0L;
        }
        return this.ypw.getNativeVideoController().ycc();
    }

    public void handleInterruptVideo() {
        if (ypw()) {
            return;
        }
        emc();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        dg.emc(this, this.dg);
    }

    public void setMaterialMeta(rie rieVar) {
        this.dg = rieVar;
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        if (onClickListener instanceof emc) {
            ((emc) onClickListener).emc((emc.InterfaceC0166emc) this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void setVideoAdListener(final PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.emc.ypw.emc emcVar = this.xq;
        if (emcVar == null) {
            return;
        }
        emcVar.emc(new PAGVideoAdListener() { // from class: com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView.1
            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdComplete() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdPaused() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdPlay() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoError() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }
        });
    }

    private void emc() {
        ycc yccVar = this.ypw;
        if (yccVar != null) {
            yccVar.cf();
        }
    }
}
