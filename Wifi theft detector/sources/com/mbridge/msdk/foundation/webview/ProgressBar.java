package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes3.dex */
public class ProgressBar extends View {

    /* renamed from: a, reason: collision with root package name */
    Runnable f15551a;

    /* renamed from: b, reason: collision with root package name */
    private float f15552b;

    /* renamed from: c, reason: collision with root package name */
    private float f15553c;

    /* renamed from: d, reason: collision with root package name */
    private float f15554d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f15555e;

    /* renamed from: f, reason: collision with root package name */
    private float f15556f;

    /* renamed from: g, reason: collision with root package name */
    private long f15557g;

    /* renamed from: h, reason: collision with root package name */
    private Handler f15558h;

    /* renamed from: i, reason: collision with root package name */
    private Drawable f15559i;

    /* renamed from: j, reason: collision with root package name */
    private int f15560j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f15561k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f15562l;

    /* renamed from: m, reason: collision with root package name */
    private long f15563m;

    /* renamed from: n, reason: collision with root package name */
    private float f15564n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f15565o;

    /* renamed from: p, reason: collision with root package name */
    private Drawable f15566p;

    /* renamed from: q, reason: collision with root package name */
    private Rect f15567q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f15568r;

    /* renamed from: s, reason: collision with root package name */
    private float f15569s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f15570t;

    /* renamed from: u, reason: collision with root package name */
    private int f15571u;

    /* renamed from: v, reason: collision with root package name */
    private int f15572v;

    /* renamed from: w, reason: collision with root package name */
    private int f15573w;

    /* renamed from: x, reason: collision with root package name */
    private long f15574x;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProgressBar.this.invalidate();
        }
    }

    public ProgressBar(Context context) {
        super(context);
        this.f15551a = new a();
        this.f15557g = 25L;
        this.f15558h = new Handler(Looper.getMainLooper());
        this.f15561k = false;
        this.f15564n = 0.95f;
        this.f15565o = false;
        this.f15567q = new Rect();
        a(context);
    }

    private void a(Context context) {
        setWillNotDraw(false);
    }

    private float getVelocity() {
        if (this.f15570t) {
            return this.f15562l ? 1.0f : 0.4f;
        }
        if (this.f15574x < 2000) {
            if (this.f15572v == 1) {
                return this.f15562l ? 1.0f : 0.4f;
            }
            if (this.f15571u == 1) {
                return this.f15562l ? 0.4f : 0.2f;
            }
            if (this.f15562l) {
                return 0.2f;
            }
        }
        return 0.05f;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (!this.f15561k) {
            this.f15561k = true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.f15565o ? 0L : jCurrentTimeMillis - this.f15563m;
        this.f15554d = Math.abs(j10 / 1000.0f);
        this.f15563m = jCurrentTimeMillis;
        this.f15574x += j10;
        float velocity = getVelocity();
        this.f15553c = velocity;
        float f10 = this.f15552b + (velocity * this.f15554d);
        this.f15552b = f10;
        if (!this.f15570t) {
            float f11 = this.f15564n;
            if (f10 > f11) {
                this.f15552b = f11;
            }
        }
        this.f15567q.right = (int) (this.f15552b * this.f15569s);
        this.f15558h.removeCallbacksAndMessages(null);
        this.f15558h.postDelayed(this.f15551a, this.f15557g);
        super.draw(canvas);
        a(canvas, this.f15554d);
    }

    @Override // android.view.View
    public Bitmap getDrawingCache(boolean z10) {
        return null;
    }

    public float getProgress() {
        return this.f15552b;
    }

    public void initResource(boolean z10) throws Resources.NotFoundException {
        if (z10 || (this.f15559i == null && this.f15566p == null && this.f15568r == null && this.f15555e == null)) {
            Drawable drawable = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_highlight", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            this.f15559i = drawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f15559i.getIntrinsicHeight());
            }
            Drawable drawable2 = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_head", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            this.f15566p = drawable2;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.f15566p.getIntrinsicHeight());
            }
            this.f15568r = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_tail", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            this.f15555e = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_end_animation", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f15569s = getMeasuredWidth();
    }

    public void onThemeChange() throws Resources.NotFoundException {
        if (this.f15561k) {
            initResource(true);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        Drawable drawable = this.f15559i;
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) (drawable.getIntrinsicWidth() * 1.5d), getHeight());
        }
        Drawable drawable2 = this.f15566p;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    public void setPaused(boolean z10) {
        this.f15565o = z10;
        if (z10) {
            return;
        }
        this.f15563m = System.currentTimeMillis();
    }

    public void setProgress(float f10, boolean z10) {
        if (!z10 || f10 < 1.0f) {
            return;
        }
        startEndAnimation();
    }

    public void setProgressBarListener(c cVar) {
    }

    public void setProgressState(int i10) {
        if (i10 == 5) {
            this.f15571u = 1;
            this.f15572v = 0;
            this.f15573w = 0;
            this.f15574x = 0L;
            return;
        }
        if (i10 == 6) {
            this.f15572v = 1;
            if (this.f15573w == 1) {
                startEndAnimation();
            }
            this.f15574x = 0L;
            return;
        }
        if (i10 == 7) {
            startEndAnimation();
        } else {
            if (i10 != 8) {
                return;
            }
            this.f15573w = 1;
            if (this.f15572v == 1) {
                startEndAnimation();
            }
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public void setVisible(boolean z10) {
        if (!z10) {
            setVisibility(4);
            return;
        }
        this.f15562l = true;
        this.f15563m = System.currentTimeMillis();
        this.f15554d = 0.0f;
        this.f15574x = 0L;
        this.f15570t = false;
        this.f15556f = 0.0f;
        this.f15552b = 0.0f;
        this.f15569s = getMeasuredWidth();
        this.f15565o = false;
        this.f15571u = 0;
        this.f15572v = 0;
        this.f15573w = 0;
        Drawable drawable = this.f15559i;
        if (drawable != null) {
            this.f15560j = -drawable.getIntrinsicWidth();
        } else {
            this.f15560j = 0;
        }
        Drawable drawable2 = this.f15568r;
        if (drawable2 != null) {
            drawable2.setAlpha(255);
        }
        Drawable drawable3 = this.f15555e;
        if (drawable3 != null) {
            drawable3.setAlpha(255);
        }
        Drawable drawable4 = this.f15566p;
        if (drawable4 != null) {
            drawable4.setAlpha(255);
        }
        setVisibility(0);
        invalidate();
    }

    public void startEndAnimation() {
        if (this.f15570t) {
            return;
        }
        this.f15570t = true;
        this.f15556f = 0.0f;
    }

    private void a(Canvas canvas, float f10) {
        Drawable drawable;
        Drawable drawable2;
        if (this.f15570t) {
            float f11 = this.f15556f;
            float f12 = this.f15569s * 0.5f;
            int i10 = (int) ((1.0f - (f11 / f12)) * 255.0f);
            if (i10 < 0) {
                i10 = 0;
            }
            if (f11 > f12) {
                setVisible(false);
            }
            Drawable drawable3 = this.f15568r;
            if (drawable3 != null) {
                drawable3.setAlpha(i10);
            }
            Drawable drawable4 = this.f15555e;
            if (drawable4 != null) {
                drawable4.setAlpha(i10);
            }
            Drawable drawable5 = this.f15566p;
            if (drawable5 != null) {
                drawable5.setAlpha(i10);
            }
            canvas.save();
            canvas.translate(this.f15556f, 0.0f);
        }
        if (this.f15568r != null && this.f15566p != null) {
            Drawable drawable6 = this.f15568r;
            drawable6.setBounds(0, 0, (int) (this.f15567q.width() - (this.f15566p.getIntrinsicWidth() * 0.05f)), drawable6.getIntrinsicHeight());
            this.f15568r.draw(canvas);
        }
        if (this.f15570t && (drawable2 = this.f15555e) != null && this.f15566p != null) {
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            Drawable drawable7 = this.f15555e;
            drawable7.setBounds(0, 0, intrinsicWidth, drawable7.getIntrinsicHeight());
            canvas.save();
            canvas.translate(-intrinsicWidth, 0.0f);
            this.f15555e.draw(canvas);
            canvas.restore();
        }
        if (this.f15566p != null) {
            canvas.save();
            canvas.translate(this.f15567q.width() - getWidth(), 0.0f);
            this.f15566p.draw(canvas);
            canvas.restore();
        }
        if (!this.f15570t && Math.abs(this.f15552b - this.f15564n) < 1.0E-5f && (drawable = this.f15559i) != null) {
            int i11 = (int) (this.f15560j + (f10 * 0.2f * this.f15569s));
            this.f15560j = i11;
            if (i11 + drawable.getIntrinsicWidth() >= this.f15567q.width()) {
                this.f15560j = -this.f15559i.getIntrinsicWidth();
            }
            canvas.save();
            canvas.translate(this.f15560j, 0.0f);
            this.f15559i.draw(canvas);
            canvas.restore();
        }
        if (this.f15570t) {
            canvas.restore();
        }
    }

    public ProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15551a = new a();
        this.f15557g = 25L;
        this.f15558h = new Handler(Looper.getMainLooper());
        this.f15561k = false;
        this.f15564n = 0.95f;
        this.f15565o = false;
        this.f15567q = new Rect();
        a(context);
    }
}
