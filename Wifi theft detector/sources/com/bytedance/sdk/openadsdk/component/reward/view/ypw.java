package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class ypw extends com.bytedance.sdk.openadsdk.core.ycc.xq {
    private float bw;
    private float dg;
    private final boolean emc;
    private boolean uym;
    private com.bytedance.sdk.openadsdk.core.ycc.xq xq;
    private com.bytedance.sdk.openadsdk.activity.msw ycc;
    private final boolean ypw;

    public ypw(@NonNull Context context, boolean z10, boolean z11, final int i10) {
        super(context);
        this.emc = z10;
        this.ypw = z11;
        if (z10) {
            setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ypw.2
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i10);
                }
            });
            setClipToOutline(true);
            return;
        }
        this.xq = new com.bytedance.sdk.openadsdk.core.ycc.xq(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.xq, layoutParams);
        this.xq.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ypw.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i10);
            }
        });
        this.xq.setClipToOutline(true);
    }

    public void emc(msw mswVar, FrameLayout.LayoutParams layoutParams) {
        com.bytedance.sdk.openadsdk.core.ycc.xq xqVar = this.xq;
        if (xqVar != null) {
            xqVar.addView(mswVar, layoutParams);
        } else {
            addView(mswVar, layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.bytedance.sdk.openadsdk.activity.msw mswVar;
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVarEe;
        super.onAttachedToWindow();
        if (this.uym || (mswVar = this.ycc) == null || (emcVarEe = mswVar.ee()) == null) {
            return;
        }
        emcVarEe.db.ypw(true);
        this.uym = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.bytedance.sdk.openadsdk.activity.msw mswVar;
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVarEe;
        super.onDetachedFromWindow();
        if (!this.uym || (mswVar = this.ycc) == null || (emcVarEe = mswVar.ee()) == null) {
            return;
        }
        emcVarEe.db.ypw(false);
        this.uym = false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ycc.xq, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (this.ypw) {
            float f10 = this.dg;
            if (f10 > 0.0f) {
                int iMax = Math.max(0, (size - ((int) (size2 * f10))) / 2);
                setPadding(iMax, 0, iMax, 0);
            } else {
                float f11 = this.bw;
                if (f11 > 0.0f) {
                    int iMax2 = Math.max(0, (size - ((int) (size * f11))) / 2);
                    setPadding(iMax2, 0, iMax2, 0);
                }
            }
        } else if (this.emc) {
            float f12 = this.dg;
            if (f12 > 0.0f) {
                i11 = View.MeasureSpec.makeMeasureSpec((int) (size / f12), 1073741824);
            } else {
                float f13 = this.bw;
                if (f13 > 0.0f) {
                    i11 = View.MeasureSpec.makeMeasureSpec((int) (size2 * f13), 1073741824);
                }
            }
        } else {
            float f14 = this.dg;
            if (f14 > 0.0f) {
                int iMax3 = Math.max(0, (size - ((int) (size2 * f14))) / 2);
                setPadding(iMax3, 0, iMax3, 0);
            } else {
                float f15 = this.bw;
                if (f15 > 0.0f) {
                    int iMax4 = Math.max(0, (size - ((int) (size * f15))) / 2);
                    setPadding(iMax4, 0, iMax4, 0);
                }
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        com.bytedance.sdk.openadsdk.activity.msw mswVar;
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVarEe;
        super.onWindowFocusChanged(z10);
        if (this.uym == z10 || (mswVar = this.ycc) == null || (emcVarEe = mswVar.ee()) == null) {
            return;
        }
        emcVarEe.db.ypw(z10);
    }

    public void setScene(com.bytedance.sdk.openadsdk.activity.msw mswVar) {
        this.ycc = mswVar;
    }

    public void setWidthAndHeightRatio(float f10) {
        this.dg = f10;
    }

    public void setWidthOrHeightInParentRatio(float f10) {
        this.bw = f10;
    }

    public void emc() {
        com.bytedance.sdk.openadsdk.core.ycc.xq xqVar = this.xq;
        if (xqVar != null) {
            xqVar.removeAllViews();
        } else {
            removeAllViews();
        }
    }
}
