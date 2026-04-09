package androidx.recyclerview.widget;

import L0.S;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;

/* compiled from: FastScroller.java */
/* loaded from: classes.dex */
public final class r extends RecyclerView.o implements RecyclerView.t {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f16712C = {R.attr.state_pressed};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f16713D = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public int f16714A;

    /* renamed from: B, reason: collision with root package name */
    public final a f16715B;

    /* renamed from: a, reason: collision with root package name */
    public final int f16716a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16717b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f16718c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f16719d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16720e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16721f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f16722g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f16723h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f16724j;

    /* renamed from: k, reason: collision with root package name */
    public int f16725k;

    /* renamed from: l, reason: collision with root package name */
    public int f16726l;

    /* renamed from: m, reason: collision with root package name */
    public float f16727m;

    /* renamed from: n, reason: collision with root package name */
    public int f16728n;

    /* renamed from: o, reason: collision with root package name */
    public int f16729o;

    /* renamed from: p, reason: collision with root package name */
    public float f16730p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f16733s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f16740z;

    /* renamed from: q, reason: collision with root package name */
    public int f16731q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f16732r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f16734t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f16735u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f16736v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f16737w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f16738x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f16739y = new int[2];

    /* compiled from: FastScroller.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            r rVar = r.this;
            int i = rVar.f16714A;
            ValueAnimator valueAnimator = rVar.f16740z;
            if (i == 1) {
                valueAnimator.cancel();
            } else if (i != 2) {
                return;
            }
            rVar.f16714A = 3;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            valueAnimator.setDuration(500);
            valueAnimator.start();
        }
    }

    /* compiled from: FastScroller.java */
    public class b extends RecyclerView.u {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public final void b(RecyclerView recyclerView, int i, int i10) {
            int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            r rVar = r.this;
            int iComputeVerticalScrollRange = rVar.f16733s.computeVerticalScrollRange();
            int i11 = rVar.f16732r;
            int i12 = iComputeVerticalScrollRange - i11;
            int i13 = rVar.f16716a;
            rVar.f16734t = i12 > 0 && i11 >= i13;
            int iComputeHorizontalScrollRange = rVar.f16733s.computeHorizontalScrollRange();
            int i14 = rVar.f16731q;
            boolean z10 = iComputeHorizontalScrollRange - i14 > 0 && i14 >= i13;
            rVar.f16735u = z10;
            boolean z11 = rVar.f16734t;
            if (!z11 && !z10) {
                if (rVar.f16736v != 0) {
                    rVar.e(0);
                    return;
                }
                return;
            }
            if (z11) {
                float f10 = i11;
                rVar.f16726l = (int) ((((f10 / 2.0f) + iComputeVerticalScrollOffset) * f10) / iComputeVerticalScrollRange);
                rVar.f16725k = Math.min(i11, (i11 * i11) / iComputeVerticalScrollRange);
            }
            if (rVar.f16735u) {
                float f11 = iComputeHorizontalScrollOffset;
                float f12 = i14;
                rVar.f16729o = (int) ((((f12 / 2.0f) + f11) * f12) / iComputeHorizontalScrollRange);
                rVar.f16728n = Math.min(i14, (i14 * i14) / iComputeHorizontalScrollRange);
            }
            int i15 = rVar.f16736v;
            if (i15 == 0 || i15 == 1) {
                rVar.e(1);
            }
        }
    }

    /* compiled from: FastScroller.java */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f16743a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f16743a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f16743a) {
                this.f16743a = false;
                return;
            }
            r rVar = r.this;
            if (((Float) rVar.f16740z.getAnimatedValue()).floatValue() == 0.0f) {
                rVar.f16714A = 0;
                rVar.e(0);
            } else {
                rVar.f16714A = 2;
                rVar.f16733s.invalidate();
            }
        }
    }

    /* compiled from: FastScroller.java */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            r rVar = r.this;
            rVar.f16718c.setAlpha(iFloatValue);
            rVar.f16719d.setAlpha(iFloatValue);
            rVar.f16733s.invalidate();
        }
    }

    public r(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i10, int i11) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f16740z = valueAnimatorOfFloat;
        this.f16714A = 0;
        a aVar = new a();
        this.f16715B = aVar;
        b bVar = new b();
        this.f16718c = stateListDrawable;
        this.f16719d = drawable;
        this.f16722g = stateListDrawable2;
        this.f16723h = drawable2;
        this.f16720e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f16721f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f16724j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f16716a = i10;
        this.f16717b = i11;
        stateListDrawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        drawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.f16733s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.f16733s.removeOnItemTouchListener(this);
            this.f16733s.removeOnScrollListener(bVar);
            this.f16733s.removeCallbacks(aVar);
        }
        this.f16733s = recyclerView;
        recyclerView.addItemDecoration(this);
        this.f16733s.addOnItemTouchListener(this);
        this.f16733s.addOnScrollListener(bVar);
    }

    public static int d(float f10, float f11, int[] iArr, int i, int i10, int i11) {
        int i12 = iArr[1] - iArr[0];
        if (i12 != 0) {
            int i13 = i - i11;
            int i14 = (int) (((f11 - f10) / i12) * i13);
            int i15 = i10 + i14;
            if (i15 < i13 && i15 >= 0) {
                return i14;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final boolean a(MotionEvent motionEvent) {
        int i = this.f16736v;
        if (i != 1) {
            return i == 2;
        }
        boolean zC = c(motionEvent.getX(), motionEvent.getY());
        boolean zB = b(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zC && !zB) {
            return false;
        }
        if (zB) {
            this.f16737w = 1;
            this.f16730p = (int) motionEvent.getX();
        } else if (zC) {
            this.f16737w = 2;
            this.f16727m = (int) motionEvent.getY();
        }
        e(2);
        return true;
    }

    public final boolean b(float f10, float f11) {
        if (f11 < this.f16732r - this.i) {
            return false;
        }
        int i = this.f16729o;
        int i10 = this.f16728n;
        return f10 >= ((float) (i - (i10 / 2))) && f10 <= ((float) ((i10 / 2) + i));
    }

    public final boolean c(float f10, float f11) {
        RecyclerView recyclerView = this.f16733s;
        WeakHashMap<View, S> weakHashMap = L0.I.f3792a;
        boolean z10 = recyclerView.getLayoutDirection() == 1;
        int i = this.f16720e;
        if (!z10 ? f10 >= this.f16731q - i : f10 <= i) {
            int i10 = this.f16726l;
            int i11 = this.f16725k / 2;
            if (f11 >= i10 - i11 && f11 <= i11 + i10) {
                return true;
            }
        }
        return false;
    }

    public final void e(int i) {
        a aVar = this.f16715B;
        StateListDrawable stateListDrawable = this.f16718c;
        if (i == 2 && this.f16736v != 2) {
            stateListDrawable.setState(f16712C);
            this.f16733s.removeCallbacks(aVar);
        }
        if (i == 0) {
            this.f16733s.invalidate();
        } else {
            f();
        }
        if (this.f16736v == 2 && i != 2) {
            stateListDrawable.setState(f16713D);
            this.f16733s.removeCallbacks(aVar);
            this.f16733s.postDelayed(aVar, 1200);
        } else if (i == 1) {
            this.f16733s.removeCallbacks(aVar);
            this.f16733s.postDelayed(aVar, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f16736v = i;
    }

    public final void f() {
        int i = this.f16714A;
        ValueAnimator valueAnimator = this.f16740z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f16714A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10) {
        int i = this.f16731q;
        RecyclerView recyclerView2 = this.f16733s;
        if (i != recyclerView2.getWidth() || this.f16732r != recyclerView2.getHeight()) {
            this.f16731q = recyclerView2.getWidth();
            this.f16732r = recyclerView2.getHeight();
            e(0);
            return;
        }
        if (this.f16714A != 0) {
            if (this.f16734t) {
                int i10 = this.f16731q;
                int i11 = this.f16720e;
                int i12 = i10 - i11;
                int i13 = this.f16726l;
                int i14 = this.f16725k;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable = this.f16718c;
                stateListDrawable.setBounds(0, 0, i11, i14);
                int i16 = this.f16732r;
                int i17 = this.f16721f;
                Drawable drawable = this.f16719d;
                drawable.setBounds(0, 0, i17, i16);
                WeakHashMap<View, S> weakHashMap = L0.I.f3792a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i11, i15);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i11, -i15);
                } else {
                    canvas.translate(i12, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i15);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i12, -i15);
                }
            }
            if (this.f16735u) {
                int i18 = this.f16732r;
                int i19 = this.i;
                int i20 = i18 - i19;
                int i21 = this.f16729o;
                int i22 = this.f16728n;
                int i23 = i21 - (i22 / 2);
                StateListDrawable stateListDrawable2 = this.f16722g;
                stateListDrawable2.setBounds(0, 0, i22, i19);
                int i24 = this.f16731q;
                int i25 = this.f16724j;
                Drawable drawable2 = this.f16723h;
                drawable2.setBounds(0, 0, i24, i25);
                canvas.translate(0.0f, i20);
                drawable2.draw(canvas);
                canvas.translate(i23, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i23, -i20);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onTouchEvent(MotionEvent motionEvent) {
        if (this.f16736v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zC = c(motionEvent.getX(), motionEvent.getY());
            boolean zB = b(motionEvent.getX(), motionEvent.getY());
            if (zC || zB) {
                if (zB) {
                    this.f16737w = 1;
                    this.f16730p = (int) motionEvent.getX();
                } else if (zC) {
                    this.f16737w = 2;
                    this.f16727m = (int) motionEvent.getY();
                }
                e(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f16736v == 2) {
            this.f16727m = 0.0f;
            this.f16730p = 0.0f;
            e(1);
            this.f16737w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f16736v == 2) {
            f();
            int i = this.f16737w;
            int i10 = this.f16717b;
            if (i == 1) {
                float x10 = motionEvent.getX();
                int[] iArr = this.f16739y;
                iArr[0] = i10;
                int i11 = this.f16731q - i10;
                iArr[1] = i11;
                float fMax = Math.max(i10, Math.min(i11, x10));
                if (Math.abs(this.f16729o - fMax) >= 2.0f) {
                    int iD = d(this.f16730p, fMax, iArr, this.f16733s.computeHorizontalScrollRange(), this.f16733s.computeHorizontalScrollOffset(), this.f16731q);
                    if (iD != 0) {
                        this.f16733s.scrollBy(iD, 0);
                    }
                    this.f16730p = fMax;
                }
            }
            if (this.f16737w == 2) {
                float y10 = motionEvent.getY();
                int[] iArr2 = this.f16738x;
                iArr2[0] = i10;
                int i12 = this.f16732r - i10;
                iArr2[1] = i12;
                float fMax2 = Math.max(i10, Math.min(i12, y10));
                if (Math.abs(this.f16726l - fMax2) < 2.0f) {
                    return;
                }
                int iD2 = d(this.f16727m, fMax2, iArr2, this.f16733s.computeVerticalScrollRange(), this.f16733s.computeVerticalScrollOffset(), this.f16732r);
                if (iD2 != 0) {
                    this.f16733s.scrollBy(0, iD2);
                }
                this.f16727m = fMax2;
            }
        }
    }
}
