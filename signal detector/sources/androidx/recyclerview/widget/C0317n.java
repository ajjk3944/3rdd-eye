package androidx.recyclerview.widget;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: androidx.recyclerview.widget.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0317n extends M {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f5525C = {R.attr.state_pressed};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f5526D = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public int f5527A;

    /* renamed from: B, reason: collision with root package name */
    public final RunnableC0315l f5528B;

    /* renamed from: a, reason: collision with root package name */
    public final int f5529a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5530b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f5531c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f5532d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5533e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5534f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f5535g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f5536h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5537j;

    /* renamed from: k, reason: collision with root package name */
    public int f5538k;

    /* renamed from: l, reason: collision with root package name */
    public int f5539l;

    /* renamed from: m, reason: collision with root package name */
    public float f5540m;

    /* renamed from: n, reason: collision with root package name */
    public int f5541n;

    /* renamed from: o, reason: collision with root package name */
    public int f5542o;

    /* renamed from: p, reason: collision with root package name */
    public float f5543p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f5546s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f5553z;

    /* renamed from: q, reason: collision with root package name */
    public int f5544q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f5545r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f5547t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5548u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f5549v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f5550w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f5551x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f5552y = new int[2];

    public C0317n(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i3, int i6) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f5553z = valueAnimatorOfFloat;
        this.f5527A = 0;
        RunnableC0315l runnableC0315l = new RunnableC0315l(0, this);
        this.f5528B = runnableC0315l;
        Q4.a aVar = new Q4.a(2, this);
        this.f5531c = stateListDrawable;
        this.f5532d = drawable;
        this.f5535g = stateListDrawable2;
        this.f5536h = drawable2;
        this.f5533e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f5534f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f5537j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f5529a = i3;
        this.f5530b = i6;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new Q3.c(this));
        valueAnimatorOfFloat.addUpdateListener(new C0316m(this));
        RecyclerView recyclerView2 = this.f5546s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f5309C;
            Q q3 = recyclerView2.f5362m;
            if (q3 != null) {
                q3.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.P();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f5546s;
            recyclerView3.f5311D.remove(this);
            if (recyclerView3.f5313E == this) {
                recyclerView3.f5313E = null;
            }
            ArrayList arrayList2 = this.f5546s.f5373w0;
            if (arrayList2 != null) {
                arrayList2.remove(aVar);
            }
            this.f5546s.removeCallbacks(runnableC0315l);
        }
        this.f5546s = recyclerView;
        recyclerView.g(this);
        this.f5546s.f5311D.add(this);
        this.f5546s.h(aVar);
    }

    public static int c(float f2, float f5, int[] iArr, int i, int i3, int i6) {
        int i7 = iArr[1] - iArr[0];
        if (i7 != 0) {
            int i8 = i - i6;
            int i9 = (int) (((f5 - f2) / i7) * i8);
            int i10 = i3 + i9;
            if (i10 < i8 && i10 >= 0) {
                return i9;
            }
        }
        return 0;
    }

    public final boolean a(float f2, float f5) {
        if (f5 < this.f5545r - this.i) {
            return false;
        }
        int i = this.f5542o;
        int i3 = this.f5541n;
        return f2 >= ((float) (i - (i3 / 2))) && f2 <= ((float) ((i3 / 2) + i));
    }

    public final boolean b(float f2, float f5) {
        WeakHashMap weakHashMap = R.O.f3270a;
        int layoutDirection = this.f5546s.getLayoutDirection();
        int i = this.f5533e;
        if (layoutDirection == 1) {
            if (f2 > i) {
                return false;
            }
        } else if (f2 < this.f5544q - i) {
            return false;
        }
        int i3 = this.f5539l;
        int i6 = this.f5538k / 2;
        return f5 >= ((float) (i3 - i6)) && f5 <= ((float) (i6 + i3));
    }

    public final void d(int i) {
        RunnableC0315l runnableC0315l = this.f5528B;
        StateListDrawable stateListDrawable = this.f5531c;
        if (i == 2 && this.f5549v != 2) {
            stateListDrawable.setState(f5525C);
            this.f5546s.removeCallbacks(runnableC0315l);
        }
        if (i == 0) {
            this.f5546s.invalidate();
        } else {
            e();
        }
        if (this.f5549v == 2 && i != 2) {
            stateListDrawable.setState(f5526D);
            this.f5546s.removeCallbacks(runnableC0315l);
            this.f5546s.postDelayed(runnableC0315l, 1200);
        } else if (i == 1) {
            this.f5546s.removeCallbacks(runnableC0315l);
            this.f5546s.postDelayed(runnableC0315l, TTAdConstant.STYLE_SIZE_RADIO_3_2);
        }
        this.f5549v = i;
    }

    public final void e() {
        int i = this.f5527A;
        ValueAnimator valueAnimator = this.f5553z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f5527A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // androidx.recyclerview.widget.M
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, d0 d0Var) {
        int i = this.f5544q;
        RecyclerView recyclerView2 = this.f5546s;
        if (i != recyclerView2.getWidth() || this.f5545r != recyclerView2.getHeight()) {
            this.f5544q = recyclerView2.getWidth();
            this.f5545r = recyclerView2.getHeight();
            d(0);
            return;
        }
        if (this.f5527A != 0) {
            if (this.f5547t) {
                int i3 = this.f5544q;
                int i6 = this.f5533e;
                int i7 = i3 - i6;
                int i8 = this.f5539l;
                int i9 = this.f5538k;
                int i10 = i8 - (i9 / 2);
                StateListDrawable stateListDrawable = this.f5531c;
                stateListDrawable.setBounds(0, 0, i6, i9);
                int i11 = this.f5534f;
                int i12 = this.f5545r;
                Drawable drawable = this.f5532d;
                drawable.setBounds(0, 0, i11, i12);
                WeakHashMap weakHashMap = R.O.f3270a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i6, i10);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i6, -i10);
                } else {
                    canvas.translate(i7, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i10);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i7, -i10);
                }
            }
            if (this.f5548u) {
                int i13 = this.f5545r;
                int i14 = this.i;
                int i15 = i13 - i14;
                int i16 = this.f5542o;
                int i17 = this.f5541n;
                int i18 = i16 - (i17 / 2);
                StateListDrawable stateListDrawable2 = this.f5535g;
                stateListDrawable2.setBounds(0, 0, i17, i14);
                int i19 = this.f5544q;
                int i20 = this.f5537j;
                Drawable drawable2 = this.f5536h;
                drawable2.setBounds(0, 0, i19, i20);
                canvas.translate(0.0f, i15);
                drawable2.draw(canvas);
                canvas.translate(i18, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i18, -i15);
            }
        }
    }
}
