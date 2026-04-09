package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ypw extends com.bytedance.sdk.openadsdk.core.ycc.xq {
    private float bw;
    private float dg;
    private final boolean emc;
    private boolean uym;
    private com.bytedance.sdk.openadsdk.core.ycc.xq xq;
    private com.bytedance.sdk.openadsdk.activity.msw ycc;
    private final boolean ypw;

    public ypw(Context context, boolean z6, boolean z7, final int i) {
        super(context);
        this.emc = z6;
        this.ypw = z7;
        if (z6) {
            setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ypw.2
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i);
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
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i);
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
    public void onMeasure(int i, int i3) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i3);
        if (this.ypw) {
            float f2 = this.dg;
            if (f2 > 0.0f) {
                int iMax = Math.max(0, (size - ((int) (size2 * f2))) / 2);
                setPadding(iMax, 0, iMax, 0);
            } else {
                float f5 = this.bw;
                if (f5 > 0.0f) {
                    int iMax2 = Math.max(0, (size - ((int) (size * f5))) / 2);
                    setPadding(iMax2, 0, iMax2, 0);
                }
            }
        } else if (this.emc) {
            float f6 = this.dg;
            if (f6 > 0.0f) {
                i3 = View.MeasureSpec.makeMeasureSpec((int) (size / f6), 1073741824);
            } else {
                float f7 = this.bw;
                if (f7 > 0.0f) {
                    i3 = View.MeasureSpec.makeMeasureSpec((int) (size2 * f7), 1073741824);
                }
            }
        } else {
            float f8 = this.dg;
            if (f8 > 0.0f) {
                int iMax3 = Math.max(0, (size - ((int) (size2 * f8))) / 2);
                setPadding(iMax3, 0, iMax3, 0);
            } else {
                float f9 = this.bw;
                if (f9 > 0.0f) {
                    int iMax4 = Math.max(0, (size - ((int) (size * f9))) / 2);
                    setPadding(iMax4, 0, iMax4, 0);
                }
            }
        }
        super.onMeasure(i, i3);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z6) {
        com.bytedance.sdk.openadsdk.activity.msw mswVar;
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVarEe;
        super.onWindowFocusChanged(z6);
        if (this.uym == z6 || (mswVar = this.ycc) == null || (emcVarEe = mswVar.ee()) == null) {
            return;
        }
        emcVarEe.db.ypw(z6);
    }

    public void setScene(com.bytedance.sdk.openadsdk.activity.msw mswVar) {
        this.ycc = mswVar;
    }

    public void setWidthAndHeightRatio(float f2) {
        this.dg = f2;
    }

    public void setWidthOrHeightInParentRatio(float f2) {
        this.bw = f2;
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
