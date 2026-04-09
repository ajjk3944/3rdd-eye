package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f4601r = 0;

    /* renamed from: a, reason: collision with root package name */
    public final cj.f f4602a;

    /* renamed from: d, reason: collision with root package name */
    public float f4603d;

    /* renamed from: g, reason: collision with root package name */
    public int f4604g;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4604g = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, t.AspectRatioFrameLayout, 0, 0);
            try {
                this.f4604g = typedArrayObtainStyledAttributes.getInt(t.AspectRatioFrameLayout_resize_mode, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f4602a = new cj.f(this);
    }

    public int getResizeMode() {
        return this.f4604g;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f4603d <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = (this.f4603d / (f12 / f13)) - 1.0f;
        float fAbs = Math.abs(f14);
        cj.f fVar = this.f4602a;
        if (fAbs <= 0.01f) {
            if (fVar.f3983d) {
                return;
            }
            fVar.f3983d = true;
            ((AspectRatioFrameLayout) fVar.f3984g).post(fVar);
            return;
        }
        int i12 = this.f4604g;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    f10 = this.f4603d;
                } else if (i12 == 4) {
                    if (f14 > 0.0f) {
                        f10 = this.f4603d;
                    } else {
                        f11 = this.f4603d;
                    }
                }
                measuredWidth = (int) (f13 * f10);
            } else {
                f11 = this.f4603d;
            }
            measuredHeight = (int) (f12 / f11);
        } else if (f14 > 0.0f) {
            f11 = this.f4603d;
            measuredHeight = (int) (f12 / f11);
        } else {
            f10 = this.f4603d;
            measuredWidth = (int) (f13 * f10);
        }
        if (!fVar.f3983d) {
            fVar.f3983d = true;
            ((AspectRatioFrameLayout) fVar.f3984g).post(fVar);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f10) {
        if (this.f4603d != f10) {
            this.f4603d = f10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(b bVar) {
    }

    public void setResizeMode(int i10) {
        if (this.f4604g != i10) {
            this.f4604g = i10;
            requestLayout();
        }
    }
}
