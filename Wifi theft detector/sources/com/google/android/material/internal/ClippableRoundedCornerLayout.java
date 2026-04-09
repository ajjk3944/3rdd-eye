package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class ClippableRoundedCornerLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public Path f10601a;

    /* renamed from: b, reason: collision with root package name */
    public float[] f10602b;

    public ClippableRoundedCornerLayout(@NonNull Context context) {
        super(context);
        this.f10602b = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public void a() {
        this.f10601a = null;
        this.f10602b = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        invalidate();
    }

    public void b(float f10, float f11, float f12, float f13, float[] fArr) {
        d(new RectF(f10, f11, f12, f13), fArr);
    }

    public void c(Rect rect, float[] fArr) {
        b(rect.left, rect.top, rect.right, rect.bottom, fArr);
    }

    public void d(RectF rectF, float[] fArr) {
        if (this.f10601a == null) {
            this.f10601a = new Path();
        }
        this.f10602b = fArr;
        this.f10601a.reset();
        this.f10601a.addRoundRect(rectF, fArr, Path.Direction.CW);
        this.f10601a.close();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.f10601a == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(this.f10601a);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    public void e(float[] fArr) {
        b(getLeft(), getTop(), getRight(), getBottom(), fArr);
    }

    @NonNull
    public float[] getCornerRadii() {
        return this.f10602b;
    }

    public ClippableRoundedCornerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10602b = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public ClippableRoundedCornerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f10602b = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }
}
