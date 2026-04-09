package h7;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class x extends w0 implements b1 {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final b4.e B;

    /* renamed from: a, reason: collision with root package name */
    public final int f10235a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10236b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f10237c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f10238d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10239e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10240f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f10241g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f10242h;

    /* renamed from: i, reason: collision with root package name */
    public final int f10243i;
    public final int j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f10244l;

    /* renamed from: m, reason: collision with root package name */
    public float f10245m;

    /* renamed from: n, reason: collision with root package name */
    public int f10246n;

    /* renamed from: o, reason: collision with root package name */
    public int f10247o;

    /* renamed from: p, reason: collision with root package name */
    public float f10248p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f10251s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f10258z;

    /* renamed from: q, reason: collision with root package name */
    public int f10249q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f10250r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f10252t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10253u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f10254v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f10255w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f10256x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f10257y = new int[2];

    public x(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f10258z = valueAnimatorOfFloat;
        this.A = 0;
        b4.e eVar = new b4.e(7, this);
        this.B = eVar;
        v vVar = new v(this);
        this.f10237c = stateListDrawable;
        this.f10238d = drawable;
        this.f10241g = stateListDrawable2;
        this.f10242h = drawable2;
        this.f10239e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f10240f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f10243i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f10235a = i11;
        this.f10236b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new w(this));
        valueAnimatorOfFloat.addUpdateListener(new bq.f(1, this));
        RecyclerView recyclerView2 = this.f10251s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.L;
            y0 y0Var = recyclerView2.J;
            if (y0Var != null) {
                y0Var.c("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.T();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f10251s;
            recyclerView3.M.remove(this);
            if (recyclerView3.N == this) {
                recyclerView3.N = null;
            }
            ArrayList arrayList2 = this.f10251s.F0;
            if (arrayList2 != null) {
                arrayList2.remove(vVar);
            }
            this.f10251s.removeCallbacks(eVar);
        }
        this.f10251s = recyclerView;
        recyclerView.i(this);
        this.f10251s.M.add(this);
        this.f10251s.j(vVar);
    }

    public static int h(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 != 0) {
            int i14 = i10 - i12;
            int i15 = (int) (((f11 - f10) / i13) * i14);
            int i16 = i11 + i15;
            if (i16 < i14 && i16 >= 0) {
                return i15;
            }
        }
        return 0;
    }

    @Override // h7.b1
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f10254v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zG = g(motionEvent.getX(), motionEvent.getY());
            boolean zF = f(motionEvent.getX(), motionEvent.getY());
            if (zG || zF) {
                if (zF) {
                    this.f10255w = 1;
                    this.f10248p = (int) motionEvent.getX();
                } else if (zG) {
                    this.f10255w = 2;
                    this.f10245m = (int) motionEvent.getY();
                }
                i(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f10254v == 2) {
            this.f10245m = 0.0f;
            this.f10248p = 0.0f;
            i(1);
            this.f10255w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f10254v == 2) {
            j();
            int i10 = this.f10255w;
            int i11 = this.f10236b;
            if (i10 == 1) {
                float x10 = motionEvent.getX();
                int[] iArr = this.f10257y;
                iArr[0] = i11;
                int i12 = this.f10249q - i11;
                iArr[1] = i12;
                float fMax = Math.max(i11, Math.min(i12, x10));
                if (Math.abs(this.f10247o - fMax) >= 2.0f) {
                    int iH = h(this.f10248p, fMax, iArr, this.f10251s.computeHorizontalScrollRange(), this.f10251s.computeHorizontalScrollOffset(), this.f10249q);
                    if (iH != 0) {
                        this.f10251s.scrollBy(iH, 0);
                    }
                    this.f10248p = fMax;
                }
            }
            if (this.f10255w == 2) {
                float y10 = motionEvent.getY();
                int[] iArr2 = this.f10256x;
                iArr2[0] = i11;
                int i13 = this.f10250r - i11;
                iArr2[1] = i13;
                float fMax2 = Math.max(i11, Math.min(i13, y10));
                if (Math.abs(this.f10244l - fMax2) < 2.0f) {
                    return;
                }
                int iH2 = h(this.f10245m, fMax2, iArr2, this.f10251s.computeVerticalScrollRange(), this.f10251s.computeVerticalScrollOffset(), this.f10250r);
                if (iH2 != 0) {
                    this.f10251s.scrollBy(0, iH2);
                }
                this.f10245m = fMax2;
            }
        }
    }

    @Override // h7.b1
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f10254v;
        if (i10 != 1) {
            return i10 == 2;
        }
        boolean zG = g(motionEvent.getX(), motionEvent.getY());
        boolean zF = f(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zG && !zF) {
            return false;
        }
        if (zF) {
            this.f10255w = 1;
            this.f10248p = (int) motionEvent.getX();
        } else if (zG) {
            this.f10255w = 2;
            this.f10245m = (int) motionEvent.getY();
        }
        i(2);
        return true;
    }

    @Override // h7.w0
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        int i10 = this.f10249q;
        RecyclerView recyclerView2 = this.f10251s;
        if (i10 != recyclerView2.getWidth() || this.f10250r != recyclerView2.getHeight()) {
            this.f10249q = recyclerView2.getWidth();
            this.f10250r = recyclerView2.getHeight();
            i(0);
            return;
        }
        if (this.A != 0) {
            if (this.f10252t) {
                int i11 = this.f10249q;
                int i12 = this.f10239e;
                int i13 = i11 - i12;
                int i14 = this.f10244l;
                int i15 = this.k;
                int i16 = i14 - (i15 / 2);
                StateListDrawable stateListDrawable = this.f10237c;
                stateListDrawable.setBounds(0, 0, i12, i15);
                int i17 = this.f10240f;
                int i18 = this.f10250r;
                Drawable drawable = this.f10238d;
                drawable.setBounds(0, 0, i17, i18);
                WeakHashMap weakHashMap = u3.i0.f23177a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i12, i16);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i12, -i16);
                } else {
                    canvas.translate(i13, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i16);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i13, -i16);
                }
            }
            if (this.f10253u) {
                int i19 = this.f10250r;
                int i20 = this.f10243i;
                int i21 = i19 - i20;
                int i22 = this.f10247o;
                int i23 = this.f10246n;
                int i24 = i22 - (i23 / 2);
                StateListDrawable stateListDrawable2 = this.f10241g;
                stateListDrawable2.setBounds(0, 0, i23, i20);
                int i25 = this.f10249q;
                int i26 = this.j;
                Drawable drawable2 = this.f10242h;
                drawable2.setBounds(0, 0, i25, i26);
                canvas.translate(0.0f, i21);
                drawable2.draw(canvas);
                canvas.translate(i24, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i24, -i21);
            }
        }
    }

    public final boolean f(float f10, float f11) {
        if (f11 < this.f10250r - this.f10243i) {
            return false;
        }
        int i10 = this.f10247o;
        int i11 = this.f10246n;
        return f10 >= ((float) (i10 - (i11 / 2))) && f10 <= ((float) ((i11 / 2) + i10));
    }

    public final boolean g(float f10, float f11) {
        WeakHashMap weakHashMap = u3.i0.f23177a;
        int layoutDirection = this.f10251s.getLayoutDirection();
        int i10 = this.f10239e;
        if (layoutDirection == 1) {
            if (f10 > i10) {
                return false;
            }
        } else if (f10 < this.f10249q - i10) {
            return false;
        }
        int i11 = this.f10244l;
        int i12 = this.k / 2;
        return f11 >= ((float) (i11 - i12)) && f11 <= ((float) (i12 + i11));
    }

    public final void i(int i10) {
        b4.e eVar = this.B;
        StateListDrawable stateListDrawable = this.f10237c;
        if (i10 == 2 && this.f10254v != 2) {
            stateListDrawable.setState(C);
            this.f10251s.removeCallbacks(eVar);
        }
        if (i10 == 0) {
            this.f10251s.invalidate();
        } else {
            j();
        }
        if (this.f10254v == 2 && i10 != 2) {
            stateListDrawable.setState(D);
            this.f10251s.removeCallbacks(eVar);
            this.f10251s.postDelayed(eVar, 1200);
        } else if (i10 == 1) {
            this.f10251s.removeCallbacks(eVar);
            this.f10251s.postDelayed(eVar, 1500);
        }
        this.f10254v = i10;
    }

    public final void j() {
        int i10 = this.A;
        ValueAnimator valueAnimator = this.f10258z;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
