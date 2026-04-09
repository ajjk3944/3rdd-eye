package com.google.android.exoplayer2.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class e extends View implements c0 {
    public final Paint B;
    public final Paint D;
    public final Paint E;
    public final Paint F;
    public final Drawable G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final StringBuilder Q;
    public final Formatter R;
    public final androidx.lifecycle.f0 S;
    public final CopyOnWriteArraySet T;
    public final Point U;
    public final float V;
    public int W;

    /* renamed from: a, reason: collision with root package name */
    public final Rect f4637a;

    /* renamed from: a0, reason: collision with root package name */
    public long f4638a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f4639b0;

    /* renamed from: c0, reason: collision with root package name */
    public Rect f4640c0;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f4641d;

    /* renamed from: d0, reason: collision with root package name */
    public float f4642d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f4643e0;

    /* renamed from: f0, reason: collision with root package name */
    public long f4644f0;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f4645g;

    /* renamed from: g0, reason: collision with root package name */
    public long f4646g0;

    /* renamed from: h0, reason: collision with root package name */
    public long f4647h0;

    /* renamed from: i0, reason: collision with root package name */
    public long f4648i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f4649j0;

    /* renamed from: k0, reason: collision with root package name */
    public long[] f4650k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean[] f4651l0;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f4652r;

    /* renamed from: x, reason: collision with root package name */
    public final Paint f4653x;

    /* renamed from: y, reason: collision with root package name */
    public final Paint f4654y;

    public e(Context context, AttributeSet attributeSet) {
        Paint paint;
        super(context, null, 0);
        this.f4637a = new Rect();
        this.f4641d = new Rect();
        this.f4645g = new Rect();
        this.f4652r = new Rect();
        Paint paint2 = new Paint();
        this.f4653x = paint2;
        Paint paint3 = new Paint();
        this.f4654y = paint3;
        Paint paint4 = new Paint();
        this.B = paint4;
        Paint paint5 = new Paint();
        this.D = paint5;
        Paint paint6 = new Paint();
        this.E = paint6;
        Paint paint7 = new Paint();
        this.F = paint7;
        paint7.setAntiAlias(true);
        this.T = new CopyOnWriteArraySet();
        this.U = new Point();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.V = f10;
        this.P = a(-50, f10);
        int iA = a(4, f10);
        int iA2 = a(26, f10);
        int iA3 = a(4, f10);
        int iA4 = a(12, f10);
        int iA5 = a(0, f10);
        int iA6 = a(16, f10);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, t.DefaultTimeBar, 0, 0);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(t.DefaultTimeBar_scrubber_drawable);
                this.G = drawable;
                if (drawable != null) {
                    int i10 = qb.v.f20828a;
                    if (i10 >= 23) {
                        paint = paint5;
                        int layoutDirection = getLayoutDirection();
                        if (i10 < 23 || drawable.setLayoutDirection(layoutDirection)) {
                        }
                    } else {
                        paint = paint5;
                    }
                    iA2 = Math.max(drawable.getMinimumHeight(), iA2);
                } else {
                    paint = paint5;
                }
                this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(t.DefaultTimeBar_bar_height, iA);
                this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(t.DefaultTimeBar_touch_target_height, iA2);
                this.J = typedArrayObtainStyledAttributes.getInt(t.DefaultTimeBar_bar_gravity, 0);
                this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(t.DefaultTimeBar_ad_marker_width, iA3);
                this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(t.DefaultTimeBar_scrubber_enabled_size, iA4);
                this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(t.DefaultTimeBar_scrubber_disabled_size, iA5);
                this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(t.DefaultTimeBar_scrubber_dragged_size, iA6);
                int i11 = typedArrayObtainStyledAttributes.getInt(t.DefaultTimeBar_played_color, -1);
                int i12 = typedArrayObtainStyledAttributes.getInt(t.DefaultTimeBar_scrubber_color, -1);
                int i13 = typedArrayObtainStyledAttributes.getInt(t.DefaultTimeBar_buffered_color, -855638017);
                int i14 = typedArrayObtainStyledAttributes.getInt(t.DefaultTimeBar_unplayed_color, 872415231);
                int i15 = typedArrayObtainStyledAttributes.getInt(t.DefaultTimeBar_ad_marker_color, -1291845888);
                int i16 = typedArrayObtainStyledAttributes.getInt(t.DefaultTimeBar_played_ad_marker_color, 872414976);
                paint2.setColor(i11);
                paint7.setColor(i12);
                paint3.setColor(i13);
                paint4.setColor(i14);
                paint.setColor(i15);
                paint6.setColor(i16);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            this.H = iA;
            this.I = iA2;
            this.J = 0;
            this.K = iA3;
            this.L = iA4;
            this.M = iA5;
            this.N = iA6;
            paint2.setColor(-1);
            paint7.setColor(-1);
            paint3.setColor(-855638017);
            paint4.setColor(872415231);
            paint5.setColor(-1291845888);
            paint6.setColor(872414976);
            this.G = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.Q = sb2;
        this.R = new Formatter(sb2, Locale.getDefault());
        this.S = new androidx.lifecycle.f0(8, this);
        Drawable drawable2 = this.G;
        if (drawable2 != null) {
            this.O = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.O = (Math.max(this.M, Math.max(this.L, this.N)) + 1) / 2;
        }
        this.f4642d0 = 1.0f;
        new ValueAnimator().addUpdateListener(new bq.b(1, this));
        this.f4646g0 = -9223372036854775807L;
        this.f4638a0 = -9223372036854775807L;
        this.W = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static int a(int i10, float f10) {
        return (int) ((i10 * f10) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.f4638a0;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j7 = this.f4646g0;
        if (j7 == -9223372036854775807L) {
            return 0L;
        }
        return j7 / this.W;
    }

    private String getProgressText() {
        return qb.v.w(this.Q, this.R, this.f4647h0);
    }

    private long getScrubberPosition() {
        if (this.f4641d.width() <= 0 || this.f4646g0 == -9223372036854775807L) {
            return 0L;
        }
        return (this.f4652r.width() * this.f4646g0) / r0.width();
    }

    public final boolean b(long j) {
        long j7 = this.f4646g0;
        if (j7 <= 0) {
            return false;
        }
        long j10 = this.f4643e0 ? this.f4644f0 : this.f4647h0;
        long j11 = qb.v.j(j10 + j, 0L, j7);
        if (j11 == j10) {
            return false;
        }
        if (this.f4643e0) {
            f(j11);
        } else {
            c(j11);
        }
        e();
        return true;
    }

    public final void c(long j) {
        this.f4644f0 = j;
        this.f4643e0 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.T.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).onScrubStart(this, j);
        }
    }

    public final void d(boolean z10) {
        removeCallbacks(this.S);
        this.f4643e0 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.T.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).onScrubStop(this, this.f4644f0, z10);
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.G;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e() {
        Rect rect = this.f4645g;
        Rect rect2 = this.f4641d;
        rect.set(rect2);
        Rect rect3 = this.f4652r;
        rect3.set(rect2);
        long j = this.f4643e0 ? this.f4644f0 : this.f4647h0;
        if (this.f4646g0 > 0) {
            rect.right = Math.min(rect2.left + ((int) ((rect2.width() * this.f4648i0) / this.f4646g0)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((rect2.width() * j) / this.f4646g0)), rect2.right);
        } else {
            int i10 = rect2.left;
            rect.right = i10;
            rect3.right = i10;
        }
        invalidate(this.f4637a);
    }

    public final void f(long j) {
        if (this.f4644f0 == j) {
            return;
        }
        this.f4644f0 = j;
        Iterator it = this.T.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).onScrubMove(this, j);
        }
    }

    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.f4641d.width() / this.V);
        if (iWidth == 0) {
            return Long.MAX_VALUE;
        }
        long j = this.f4646g0;
        if (j == 0 || j == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j / iWidth;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        Rect rect = this.f4641d;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i10 = iCenterY + iHeight;
        long j = this.f4646g0;
        Paint paint = this.B;
        Rect rect2 = this.f4652r;
        if (j <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(rect.left, iCenterY, rect.right, i10, paint);
        } else {
            Rect rect3 = this.f4645g;
            int i11 = rect3.left;
            int i12 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i12), rect2.right);
            int i13 = rect.right;
            if (iMax < i13) {
                canvas.drawRect(iMax, iCenterY, i13, i10, paint);
            }
            int iMax2 = Math.max(i11, rect2.right);
            if (i12 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i12, i10, this.f4654y);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i10, this.f4653x);
            }
            if (this.f4649j0 != 0) {
                long[] jArr = this.f4650k0;
                jArr.getClass();
                boolean[] zArr = this.f4651l0;
                zArr.getClass();
                int i14 = this.K;
                int i15 = i14 / 2;
                int i16 = 0;
                int i17 = 0;
                while (i17 < this.f4649j0) {
                    int i18 = i17;
                    canvas.drawRect(Math.min(rect.width() - i14, Math.max(i16, ((int) ((rect.width() * qb.v.j(jArr[i17], 0L, this.f4646g0)) / this.f4646g0)) - i15)) + rect.left, iCenterY, r3 + i14, i10, zArr[i17] ? this.E : this.D);
                    i17 = i18 + 1;
                    i16 = i16;
                }
            }
            canvas2 = canvas;
        }
        if (this.f4646g0 > 0) {
            int i19 = qb.v.i(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.G;
            if (drawable == null) {
                canvas2.drawCircle(i19, iCenterY2, (int) ((((this.f4643e0 || isFocused()) ? this.N : isEnabled() ? this.L : this.M) * this.f4642d0) / 2.0f), this.F);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f4642d0)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.f4642d0)) / 2;
                drawable.setBounds(i19 - intrinsicWidth, iCenterY2 - intrinsicHeight, i19 + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (!this.f4643e0 || z10) {
            return;
        }
        d(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f4646g0 <= 0) {
            return;
        }
        if (qb.v.f20828a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L2e
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L25
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L25;
                default: goto L12;
            }
        L12:
            goto L2e
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.b(r0)
            if (r0 == 0) goto L2e
            androidx.lifecycle.f0 r5 = r4.S
            r4.removeCallbacks(r5)
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L25:
            boolean r0 = r4.f4643e0
            if (r0 == 0) goto L2e
            r5 = 0
            r4.d(r5)
            return r3
        L2e:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.e.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingBottom;
        int paddingBottom2;
        Rect rect;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i14 - getPaddingRight();
        int i16 = this.J;
        int i17 = this.H;
        int i18 = this.I;
        int i19 = this.O;
        if (i16 == 1) {
            paddingBottom = (i15 - getPaddingBottom()) - i18;
            paddingBottom2 = ((i15 - getPaddingBottom()) - i17) - Math.max(i19 - (i17 / 2), 0);
        } else {
            paddingBottom = (i15 - i18) / 2;
            paddingBottom2 = (i15 - i17) / 2;
        }
        Rect rect2 = this.f4637a;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i18 + paddingBottom);
        this.f4641d.set(rect2.left + i19, paddingBottom2, rect2.right - i19, i17 + paddingBottom2);
        if (qb.v.f20828a >= 29 && ((rect = this.f4640c0) == null || rect.width() != i14 || this.f4640c0.height() != i15)) {
            Rect rect3 = new Rect(0, 0, i14, i15);
            this.f4640c0 = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        e();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int i12 = this.I;
        if (mode == 0) {
            size = i12;
        } else if (mode != 1073741824) {
            size = Math.min(i12, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        Drawable drawable = this.G;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        Drawable drawable = this.G;
        if (drawable == null || qb.v.f20828a < 23 || !drawable.setLayoutDirection(i10)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.isEnabled()
            r1 = 0
            if (r0 == 0) goto La1
            long r2 = r9.f4646g0
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L11
            goto La1
        L11:
            float r0 = r10.getX()
            int r0 = (int) r0
            float r2 = r10.getY()
            int r2 = (int) r2
            android.graphics.Point r3 = r9.U
            r3.set(r0, r2)
            int r0 = r3.x
            int r2 = r3.y
            int r3 = r10.getAction()
            android.graphics.Rect r4 = r9.f4641d
            android.graphics.Rect r5 = r9.f4652r
            r6 = 1
            if (r3 == 0) goto L7d
            r7 = 3
            if (r3 == r6) goto L6e
            r8 = 2
            if (r3 == r8) goto L38
            if (r3 == r7) goto L6e
            goto La1
        L38:
            boolean r10 = r9.f4643e0
            if (r10 == 0) goto La1
            int r10 = r9.P
            if (r2 >= r10) goto L52
            int r10 = r9.f4639b0
            int r0 = r0 - r10
            int r0 = r0 / r7
            int r0 = r0 + r10
            float r10 = (float) r0
            int r10 = (int) r10
            int r0 = r4.left
            int r1 = r4.right
            int r10 = qb.v.i(r10, r0, r1)
            r5.right = r10
            goto L60
        L52:
            r9.f4639b0 = r0
            float r10 = (float) r0
            int r10 = (int) r10
            int r0 = r4.left
            int r1 = r4.right
            int r10 = qb.v.i(r10, r0, r1)
            r5.right = r10
        L60:
            long r0 = r9.getScrubberPosition()
            r9.f(r0)
            r9.e()
            r9.invalidate()
            return r6
        L6e:
            boolean r0 = r9.f4643e0
            if (r0 == 0) goto La1
            int r10 = r10.getAction()
            if (r10 != r7) goto L79
            r1 = r6
        L79:
            r9.d(r1)
            return r6
        L7d:
            float r10 = (float) r0
            float r0 = (float) r2
            int r10 = (int) r10
            int r0 = (int) r0
            android.graphics.Rect r2 = r9.f4637a
            boolean r0 = r2.contains(r10, r0)
            if (r0 == 0) goto La1
            int r0 = r4.left
            int r1 = r4.right
            int r10 = qb.v.i(r10, r0, r1)
            r5.right = r10
            long r0 = r9.getScrubberPosition()
            r9.c(r0)
            r9.e()
            r9.invalidate()
            return r6
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.e.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (this.f4646g0 <= 0) {
            return false;
        }
        if (i10 == 8192) {
            if (b(-getPositionIncrement())) {
                d(false);
            }
        } else {
            if (i10 != 4096) {
                return false;
            }
            if (b(getPositionIncrement())) {
                d(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i10) {
        this.D.setColor(i10);
        invalidate(this.f4637a);
    }

    public void setBufferedColor(int i10) {
        this.f4654y.setColor(i10);
        invalidate(this.f4637a);
    }

    public void setBufferedPosition(long j) {
        if (this.f4648i0 == j) {
            return;
        }
        this.f4648i0 = j;
        e();
    }

    public void setDuration(long j) {
        if (this.f4646g0 == j) {
            return;
        }
        this.f4646g0 = j;
        if (this.f4643e0 && j == -9223372036854775807L) {
            d(true);
        }
        e();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!this.f4643e0 || z10) {
            return;
        }
        d(true);
    }

    public void setKeyCountIncrement(int i10) {
        qb.b.g(i10 > 0);
        this.W = i10;
        this.f4638a0 = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        qb.b.g(j > 0);
        this.W = -1;
        this.f4638a0 = j;
    }

    public void setPlayedAdMarkerColor(int i10) {
        this.E.setColor(i10);
        invalidate(this.f4637a);
    }

    public void setPlayedColor(int i10) {
        this.f4653x.setColor(i10);
        invalidate(this.f4637a);
    }

    public void setPosition(long j) {
        if (this.f4647h0 == j) {
            return;
        }
        this.f4647h0 = j;
        setContentDescription(getProgressText());
        e();
    }

    public void setScrubberColor(int i10) {
        this.F.setColor(i10);
        invalidate(this.f4637a);
    }

    public void setUnplayedColor(int i10) {
        this.B.setColor(i10);
        invalidate(this.f4637a);
    }
}
