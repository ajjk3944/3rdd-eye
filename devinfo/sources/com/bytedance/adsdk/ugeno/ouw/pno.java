package com.bytedance.adsdk.ugeno.ouw;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class pno implements ra {
    private float fkw;

    /* renamed from: le, reason: collision with root package name */
    private float f6929le;

    /* renamed from: lh, reason: collision with root package name */
    private float f6930lh;
    public float ouw;
    private View vt;
    private float yu;

    public pno(View view) {
        this.vt = view;
    }

    public final void fkw(float f10) {
        this.f6929le = f10;
        this.vt.postInvalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ra
    public final float getRipple() {
        return this.f6930lh;
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ra
    public final float getRubIn() {
        return this.f6929le;
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ra
    public final float getShine() {
        return this.yu;
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ra
    public final float getStretch() {
        return this.fkw;
    }

    public final void lh(float f10) {
        View view = this.vt;
        if (view == null) {
            return;
        }
        this.yu = f10;
        view.postInvalidate();
    }

    public final void ouw(float f10) {
        View view = this.vt;
        if (view == null) {
            return;
        }
        this.ouw = f10;
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setCornerRadius(f10);
        }
    }

    public final void vt(float f10) {
        View view = this.vt;
        if (view == null) {
            return;
        }
        this.f6930lh = f10;
        view.postInvalidate();
    }

    public final void yu(float f10) {
        this.fkw = f10;
        this.vt.postInvalidate();
    }

    public final void ouw(int i4) {
        View view = this.vt;
        if (view == null) {
            return;
        }
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(i4);
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background.mutate()).setColor(i4);
        }
    }
}
