package com.lefan.base.view;

import G4.b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ZoomImageView extends AppCompatImageView implements ViewTreeObserver.OnGlobalLayoutListener, View.OnTouchListener, ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: C, reason: collision with root package name */
    public boolean f18787C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f18788D;

    /* renamed from: E, reason: collision with root package name */
    public final GestureDetector f18789E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f18790F;

    /* renamed from: G, reason: collision with root package name */
    public View.OnClickListener f18791G;

    /* renamed from: H, reason: collision with root package name */
    public int f18792H;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18793d;

    /* renamed from: e, reason: collision with root package name */
    public final Matrix f18794e;

    /* renamed from: f, reason: collision with root package name */
    public float f18795f;

    /* renamed from: g, reason: collision with root package name */
    public float f18796g;

    /* renamed from: h, reason: collision with root package name */
    public float f18797h;
    public final ScaleGestureDetector i;

    /* renamed from: j, reason: collision with root package name */
    public int f18798j;

    /* renamed from: k, reason: collision with root package name */
    public float f18799k;

    /* renamed from: l, reason: collision with root package name */
    public float f18800l;

    /* renamed from: m, reason: collision with root package name */
    public final int f18801m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18802n;

    public ZoomImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f18792H = -1;
        this.f18794e = new Matrix();
        this.i = new ScaleGestureDetector(context, this);
        this.f18789E = new GestureDetector(context, new b(this));
        setOnTouchListener(this);
        this.f18801m = ViewConfiguration.get(context).getScaledTouchSlop();
        new ArrayList();
    }

    private RectF getMatrixRectF() {
        RectF rectF = new RectF();
        if (getDrawable() != null) {
            rectF.set(0.0f, 0.0f, r1.getIntrinsicWidth(), r1.getIntrinsicHeight());
            this.f18794e.mapRect(rectF);
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getScale() {
        float[] fArr = new float[9];
        this.f18794e.getValues(fArr);
        return fArr[0];
    }

    public final void d() {
        float fWidth;
        RectF matrixRectF = getMatrixRectF();
        int width = getWidth();
        int height = getHeight();
        float f2 = width;
        float fHeight = 0.0f;
        if (matrixRectF.width() >= f2) {
            float f5 = matrixRectF.left;
            fWidth = f5 > 0.0f ? -f5 : 0.0f;
            float f6 = matrixRectF.right;
            if (f6 < f2) {
                fWidth = f2 - f6;
            }
        } else {
            fWidth = 0.0f;
        }
        float f7 = height;
        if (matrixRectF.height() >= f7) {
            float f8 = matrixRectF.bottom;
            if (f8 < f7) {
                fHeight = f7 - f8;
            }
        }
        if (matrixRectF.width() < f2) {
            fWidth = (matrixRectF.width() / 2.0f) + ((f2 / 2.0f) - matrixRectF.right);
        }
        if (matrixRectF.height() < f7) {
            fHeight = (matrixRectF.height() / 2.0f) + ((f7 / 2.0f) - matrixRectF.bottom);
        }
        Matrix matrix = this.f18794e;
        matrix.postTranslate(fWidth, fHeight);
        setImageMatrix(matrix);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.f18792H != -1) {
            this.f18792H = -1;
            return;
        }
        setScaleType(ImageView.ScaleType.MATRIX);
        getDrawable();
        if (getDrawable() == null || getWidth() == 0 || getHeight() == 0 || this.f18793d) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float f2 = height * 1.0f;
        float f5 = width;
        float f6 = f2 / f5;
        int intrinsicHeight = getDrawable().getIntrinsicHeight();
        int intrinsicWidth = getDrawable().getIntrinsicWidth();
        float f7 = intrinsicHeight;
        float f8 = intrinsicWidth;
        float f9 = (f7 * 1.0f) / f8;
        Matrix matrix = this.f18794e;
        if (f6 >= f9) {
            float fMin = (intrinsicWidth <= width || intrinsicHeight >= height) ? 1.0f : (f5 * 1.0f) / f8;
            if (intrinsicHeight > height && intrinsicWidth < width) {
                fMin = f2 / f7;
            }
            if (intrinsicHeight > height && intrinsicWidth > width) {
                fMin = Math.min((f5 * 1.0f) / f8, f2 / f7);
            }
            if (intrinsicHeight < height && intrinsicWidth < width) {
                fMin = Math.min((f5 * 1.0f) / f8, f2 / f7);
            }
            this.f18795f = fMin;
            this.f18796g = 2.0f * fMin;
            this.f18797h = fMin * 4.0f;
            matrix.postTranslate((getWidth() / 2) - (intrinsicWidth / 2), (getHeight() / 2) - (intrinsicHeight / 2));
            float f10 = this.f18795f;
            matrix.postScale(f10, f10, width / 2, height / 2);
        } else {
            float f11 = (f5 * 1.0f) / f8;
            this.f18797h = f11;
            this.f18796g = f11 / 2.0f;
            this.f18795f = f11 / 4.0f;
            matrix.postScale(f11, f11, 0.0f, 0.0f);
        }
        setImageMatrix(matrix);
        this.f18793d = true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float scale = getScale();
        if (getDrawable() == null) {
            return true;
        }
        float f2 = this.f18797h;
        if ((scale < f2 && scaleFactor > 1.0f) || (scale > this.f18795f && scaleFactor < 1.0f)) {
            float f5 = scaleFactor * scale;
            float f6 = this.f18795f;
            if (f5 < f6) {
                scaleFactor = f6 / scale;
            }
            if (scale * scaleFactor > f2) {
                scaleFactor = f2 / scale;
            }
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            Matrix matrix = this.f18794e;
            matrix.postScale(scaleFactor, scaleFactor, focusX, focusY);
            d();
            setImageMatrix(matrix);
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r11 != 3) goto L88;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lefan.base.view.ZoomImageView.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f18793d = false;
        setTag(null);
        this.f18794e.reset();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f18793d = false;
        setTag(null);
        this.f18794e.reset();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        this.f18793d = false;
        setTag(null);
        this.f18794e.reset();
        super.setImageResource(i);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f18791G = onClickListener;
    }
}
