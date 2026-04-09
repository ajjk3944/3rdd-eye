package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public class MBRotationView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private Camera f14259a;

    /* renamed from: b, reason: collision with root package name */
    private Matrix f14260b;

    /* renamed from: c, reason: collision with root package name */
    private int f14261c;

    /* renamed from: d, reason: collision with root package name */
    private int f14262d;

    /* renamed from: e, reason: collision with root package name */
    private int f14263e;

    /* renamed from: f, reason: collision with root package name */
    private int f14264f;

    /* renamed from: g, reason: collision with root package name */
    private int f14265g;

    /* renamed from: h, reason: collision with root package name */
    private int f14266h;

    /* renamed from: i, reason: collision with root package name */
    private int f14267i;

    /* renamed from: j, reason: collision with root package name */
    private int f14268j;

    /* renamed from: k, reason: collision with root package name */
    private float f14269k;

    /* renamed from: l, reason: collision with root package name */
    private float f14270l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f14271m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f14272n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f14273o;

    /* renamed from: p, reason: collision with root package name */
    Runnable f14274p;

    public MBRotationView(Context context) {
        super(context);
        this.f14263e = 40;
        this.f14264f = 20;
        this.f14265g = 0;
        this.f14266h = 0;
        this.f14268j = 0;
        this.f14269k = 0.5f;
        this.f14270l = 0.9f;
        this.f14271m = true;
        this.f14272n = false;
        this.f14273o = false;
        this.f14274p = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.this.b();
            }
        };
        a();
    }

    private void b(Canvas canvas) {
        int height = getHeight() / 2;
        int i10 = ((this.f14265g * this.f14261c) / 2) / this.f14263e;
        a(canvas, i10, height, 0);
        a(canvas, i10, height, 1);
        if (Math.abs(this.f14265g) > this.f14263e / 2) {
            a(canvas, i10, height, 3);
            a(canvas, i10, height, 2);
        } else {
            a(canvas, i10, height, 2);
            a(canvas, i10, height, 3);
        }
    }

    private int c(int i10) {
        int i11;
        int i12;
        int i13;
        if (i10 == 0) {
            i11 = this.f14273o ? this.f14266h - 2 : this.f14266h + 2;
        } else if (i10 != 1) {
            if (i10 != 2) {
                i11 = i10 != 3 ? 0 : this.f14266h;
            } else if (this.f14273o) {
                i12 = this.f14266h;
                i11 = i12 - 1;
            } else {
                i13 = this.f14266h;
                i11 = i13 + 1;
            }
        } else if (this.f14273o) {
            i13 = this.f14266h;
            i11 = i13 + 1;
        } else {
            i12 = this.f14266h;
            i11 = i12 - 1;
        }
        int childCount = i11 % getChildCount();
        return childCount >= 0 ? childCount : childCount + getChildCount();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (getChildCount() == 0) {
            return;
        }
        if (this.f14272n) {
            b(canvas);
        } else {
            a(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        float f10 = i14;
        float f11 = this.f14269k;
        int i15 = (int) (((1.0f - f11) * f10) / 2.0f);
        int i16 = i13 - i11;
        float f12 = i16;
        float f13 = this.f14270l;
        int i17 = (int) (((1.0f - f13) * f12) / 2.0f);
        this.f14261c = (int) (f12 * f13);
        this.f14262d = (int) (f10 * f11);
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            childAt.layout(i15, i17, i14 - i15, i16 - i17);
            childAt.setClickable(true);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int i19 = layoutParams.width;
            int i20 = this.f14262d;
            if (i19 != i20) {
                layoutParams.width = i20;
                layoutParams.height = this.f14261c;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public void setAutoscroll(boolean z10) {
        if (z10) {
            postDelayed(this.f14274p, 1000 / this.f14264f);
        }
        this.f14271m = z10;
    }

    public void setHeightRatio(float f10) {
        this.f14270l = f10;
    }

    public void setRotateV(boolean z10) {
        this.f14272n = z10;
        invalidate();
    }

    public void setWidthRatio(float f10) {
        this.f14269k = f10;
    }

    private void a() {
        this.f14259a = new Camera();
        this.f14260b = new Matrix();
        setWillNotDraw(false);
    }

    private void a(Canvas canvas) {
        int width = getWidth() / 2;
        int i10 = ((this.f14265g * this.f14262d) / 2) / this.f14263e;
        b(canvas, i10, width, 0);
        b(canvas, i10, width, 1);
        if (Math.abs(this.f14265g) > this.f14263e / 2) {
            b(canvas, i10, width, 3);
            b(canvas, i10, width, 2);
        } else {
            b(canvas, i10, width, 2);
            b(canvas, i10, width, 3);
        }
    }

    private void b(int i10, int i11, int i12) {
        float f10 = (-i10) / 2.0f;
        if (i12 == 0) {
            this.f14259a.translate(0.0f, f10, 0.0f);
            float f11 = -i11;
            this.f14259a.rotateX(f11);
            this.f14259a.translate(0.0f, f10, 0.0f);
            this.f14259a.translate(0.0f, f10, 0.0f);
            this.f14259a.rotateX(f11);
            this.f14259a.translate(0.0f, f10, 0.0f);
            return;
        }
        if (i12 == 1) {
            this.f14259a.translate(0.0f, f10, 0.0f);
            this.f14259a.rotateX(i11);
            this.f14259a.translate(0.0f, f10, 0.0f);
        } else if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            this.f14259a.rotateX(0.0f);
        } else {
            this.f14259a.translate(0.0f, f10, 0.0f);
            this.f14259a.rotateX(-i11);
            this.f14259a.translate(0.0f, f10, 0.0f);
        }
    }

    public MBRotationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14263e = 40;
        this.f14264f = 20;
        this.f14265g = 0;
        this.f14266h = 0;
        this.f14268j = 0;
        this.f14269k = 0.5f;
        this.f14270l = 0.9f;
        this.f14271m = true;
        this.f14272n = false;
        this.f14273o = false;
        this.f14274p = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.this.b();
            }
        };
        a();
    }

    private void a(Canvas canvas, int i10, int i11, int i12) {
        canvas.save();
        this.f14259a.save();
        this.f14260b.reset();
        float f10 = i10;
        this.f14259a.translate(0.0f, f10, 0.0f);
        this.f14259a.rotateX(this.f14265g);
        this.f14259a.translate(0.0f, f10, 0.0f);
        if (i10 == 0) {
            if (this.f14273o) {
                b(this.f14261c, this.f14263e, i12);
            } else {
                b(-this.f14261c, -this.f14263e, i12);
            }
        } else if (i10 > 0) {
            b(this.f14261c, this.f14263e, i12);
        } else if (i10 < 0) {
            b(-this.f14261c, -this.f14263e, i12);
        }
        this.f14259a.getMatrix(this.f14260b);
        this.f14259a.restore();
        this.f14260b.preTranslate((-getWidth()) / 2, -i11);
        this.f14260b.postTranslate(getWidth() / 2, i11);
        canvas.concat(this.f14260b);
        View childAt = getChildAt(c(i12));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (getChildCount() == 0) {
            return;
        }
        int i10 = this.f14265g - 1;
        this.f14265g = i10;
        this.f14267i = this.f14266h;
        a(i10);
        if (this.f14271m) {
            postDelayed(this.f14274p, 1000 / this.f14264f);
        }
    }

    public MBRotationView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14263e = 40;
        this.f14264f = 20;
        this.f14265g = 0;
        this.f14266h = 0;
        this.f14268j = 0;
        this.f14269k = 0.5f;
        this.f14270l = 0.9f;
        this.f14271m = true;
        this.f14272n = false;
        this.f14273o = false;
        this.f14274p = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.this.b();
            }
        };
        a();
    }

    private void b(Canvas canvas, int i10, int i11, int i12) {
        canvas.save();
        this.f14259a.save();
        this.f14260b.reset();
        float f10 = i10;
        this.f14259a.translate(f10, 0.0f, 0.0f);
        this.f14259a.rotateY(this.f14265g);
        this.f14259a.translate(f10, 0.0f, 0.0f);
        if (i10 == 0) {
            if (this.f14273o) {
                a(this.f14262d, this.f14263e, i12);
            } else {
                a(-this.f14262d, -this.f14263e, i12);
            }
        } else if (i10 > 0) {
            a(this.f14262d, this.f14263e, i12);
        } else if (i10 < 0) {
            a(-this.f14262d, -this.f14263e, i12);
        }
        this.f14259a.getMatrix(this.f14260b);
        this.f14259a.restore();
        this.f14260b.preTranslate(-i11, (-getHeight()) / 2);
        this.f14260b.postTranslate(i11, getHeight() / 2);
        canvas.concat(this.f14260b);
        View childAt = getChildAt(c(i12));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    private void a(int i10) {
        int i11 = this.f14263e;
        int i12 = this.f14267i - (i10 / i11);
        this.f14265g = i10 % i11;
        b(i12);
        invalidate();
    }

    private void a(int i10, int i11, int i12) {
        if (i12 == 0) {
            float f10 = (-i10) / 2;
            this.f14259a.translate(f10, 0.0f, 0.0f);
            float f11 = -i11;
            this.f14259a.rotateY(f11);
            this.f14259a.translate(f10, 0.0f, 0.0f);
            this.f14259a.translate(f10, 0.0f, 0.0f);
            this.f14259a.rotateY(f11);
            this.f14259a.translate(f10, 0.0f, 0.0f);
            return;
        }
        if (i12 == 1) {
            float f12 = i10 / 2;
            this.f14259a.translate(f12, 0.0f, 0.0f);
            this.f14259a.rotateY(i11);
            this.f14259a.translate(f12, 0.0f, 0.0f);
            return;
        }
        if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            this.f14259a.rotateY(0.0f);
        } else {
            float f13 = (-i10) / 2;
            this.f14259a.translate(f13, 0.0f, 0.0f);
            this.f14259a.rotateY(-i11);
            this.f14259a.translate(f13, 0.0f, 0.0f);
        }
    }

    private void b(int i10) {
        int iC;
        this.f14266h = i10;
        if (Math.abs(this.f14265g) > this.f14263e / 2) {
            iC = c(2);
        } else {
            iC = c(3);
        }
        if (this.f14268j != iC) {
            this.f14268j = iC;
        }
    }
}
