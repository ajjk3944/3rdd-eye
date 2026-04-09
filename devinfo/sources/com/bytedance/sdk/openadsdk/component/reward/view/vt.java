package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt extends com.bytedance.sdk.openadsdk.core.le.lh {
    private float fkw;

    /* renamed from: le, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.activity.pno f8034le;

    /* renamed from: lh, reason: collision with root package name */
    private final boolean f8035lh;
    public com.bytedance.sdk.openadsdk.core.le.lh ouw;
    private boolean ra;
    private final boolean vt;
    private float yu;

    public vt(Context context, boolean z3, boolean z10, final int i4) {
        super(context);
        this.vt = z3;
        this.f8035lh = z10;
        if (z3) {
            setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.vt.2
                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i4);
                }
            });
            setClipToOutline(true);
            return;
        }
        this.ouw = new com.bytedance.sdk.openadsdk.core.le.lh(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.ouw, layoutParams);
        this.ouw.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.vt.1
            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i4);
            }
        });
        this.ouw.setClipToOutline(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        com.bytedance.sdk.openadsdk.activity.pno pnoVar;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVarKsc;
        super.onAttachedToWindow();
        if (this.ra || (pnoVar = this.f8034le) == null || (ouwVarKsc = pnoVar.ksc()) == null) {
            return;
        }
        ouwVarKsc.f7956cd.vt(true);
        this.ra = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        com.bytedance.sdk.openadsdk.activity.pno pnoVar;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVarKsc;
        super.onDetachedFromWindow();
        if (!this.ra || (pnoVar = this.f8034le) == null || (ouwVarKsc = pnoVar.ksc()) == null) {
            return;
        }
        ouwVarKsc.f7956cd.vt(false);
        this.ra = false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i10) {
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i10);
        if (this.f8035lh) {
            float f10 = this.yu;
            if (f10 > 0.0f) {
                int iMax = Math.max(0, (size - ((int) (size2 * f10))) / 2);
                setPadding(iMax, 0, iMax, 0);
            } else {
                float f11 = this.fkw;
                if (f11 > 0.0f) {
                    int iMax2 = Math.max(0, (size - ((int) (size * f11))) / 2);
                    setPadding(iMax2, 0, iMax2, 0);
                }
            }
        } else if (this.vt) {
            float f12 = this.yu;
            if (f12 > 0.0f) {
                i10 = View.MeasureSpec.makeMeasureSpec((int) (size / f12), 1073741824);
            } else {
                float f13 = this.fkw;
                if (f13 > 0.0f) {
                    i10 = View.MeasureSpec.makeMeasureSpec((int) (size2 * f13), 1073741824);
                }
            }
        } else {
            float f14 = this.yu;
            if (f14 > 0.0f) {
                int iMax3 = Math.max(0, (size - ((int) (size2 * f14))) / 2);
                setPadding(iMax3, 0, iMax3, 0);
            } else {
                float f15 = this.fkw;
                if (f15 > 0.0f) {
                    int iMax4 = Math.max(0, (size - ((int) (size * f15))) / 2);
                    setPadding(iMax4, 0, iMax4, 0);
                }
            }
        }
        super.onMeasure(i4, i10);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        com.bytedance.sdk.openadsdk.activity.pno pnoVar;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVarKsc;
        super.onWindowFocusChanged(z3);
        if (this.ra == z3 || (pnoVar = this.f8034le) == null || (ouwVarKsc = pnoVar.ksc()) == null) {
            return;
        }
        ouwVarKsc.f7956cd.vt(z3);
    }

    public final void setScene(com.bytedance.sdk.openadsdk.activity.pno pnoVar) {
        this.f8034le = pnoVar;
    }

    public final void setWidthAndHeightRatio(float f10) {
        this.yu = f10;
    }

    public final void setWidthOrHeightInParentRatio(float f10) {
        this.fkw = f10;
    }
}
