package com.bytedance.adsdk.ugeno.emc;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* loaded from: classes.dex */
public class msw implements uym {
    private float bw;
    private float dg;
    private View emc;
    private float xq;
    private float ycc;
    private float ypw;

    public msw(View view) {
        this.emc = view;
    }

    public void bw(float f10) {
        this.ycc = f10;
        this.emc.postInvalidate();
    }

    public void dg(float f10) {
        this.bw = f10;
        this.emc.postInvalidate();
    }

    public void emc(float f10) {
        View view = this.emc;
        if (view == null) {
            return;
        }
        this.ypw = f10;
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setCornerRadius(f10);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.emc.uym
    public float getRipple() {
        return this.xq;
    }

    @Override // com.bytedance.adsdk.ugeno.emc.uym
    public float getRubIn() {
        return this.ycc;
    }

    @Override // com.bytedance.adsdk.ugeno.emc.uym
    public float getShine() {
        return this.dg;
    }

    @Override // com.bytedance.adsdk.ugeno.emc.uym
    public float getStretch() {
        return this.bw;
    }

    public void xq(float f10) {
        View view = this.emc;
        if (view == null) {
            return;
        }
        this.dg = f10;
        view.postInvalidate();
    }

    public void ypw(float f10) {
        View view = this.emc;
        if (view == null) {
            return;
        }
        this.xq = f10;
        view.postInvalidate();
    }

    public float emc() {
        return this.ypw;
    }

    public void emc(int i10) {
        View view = this.emc;
        if (view == null) {
            return;
        }
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(i10);
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background.mutate()).setColor(i10);
        }
    }
}
