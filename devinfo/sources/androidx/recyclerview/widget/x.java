package androidx.recyclerview.widget;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class x extends b1 implements i1 {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final t B;

    /* renamed from: a, reason: collision with root package name */
    public final int f1527a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1528b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f1529c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f1530d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1531e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1532f;
    public final StateListDrawable g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f1533h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1534i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public int f1535k;

    /* renamed from: l, reason: collision with root package name */
    public int f1536l;

    /* renamed from: m, reason: collision with root package name */
    public float f1537m;

    /* renamed from: n, reason: collision with root package name */
    public int f1538n;

    /* renamed from: o, reason: collision with root package name */
    public int f1539o;

    /* renamed from: p, reason: collision with root package name */
    public float f1540p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f1543s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f1550z;

    /* renamed from: q, reason: collision with root package name */
    public int f1541q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f1542r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1544t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1545u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f1546v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f1547w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f1548x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f1549y = new int[2];

    public x(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i4, int i10, int i11) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f1550z = valueAnimatorOfFloat;
        this.A = 0;
        t tVar = new t(0, this);
        this.B = tVar;
        u uVar = new u(0 == true ? 1 : 0, this);
        this.f1529c = stateListDrawable;
        this.f1530d = drawable;
        this.g = stateListDrawable2;
        this.f1533h = drawable2;
        this.f1531e = Math.max(i4, stateListDrawable.getIntrinsicWidth());
        this.f1532f = Math.max(i4, drawable.getIntrinsicWidth());
        this.f1534i = Math.max(i4, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i4, drawable2.getIntrinsicWidth());
        this.f1527a = i10;
        this.f1528b = i11;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new v(this));
        valueAnimatorOfFloat.addUpdateListener(new w(this));
        RecyclerView recyclerView2 = this.f1543s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f1249q;
            f1 f1Var = recyclerView2.f1243n;
            if (f1Var != null) {
                f1Var.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.V();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f1543s;
            recyclerView3.f1251r.remove(this);
            if (recyclerView3.f1253s == this) {
                recyclerView3.f1253s = null;
            }
            ArrayList arrayList2 = this.f1543s.f1236j0;
            if (arrayList2 != null) {
                arrayList2.remove(uVar);
            }
            this.f1543s.removeCallbacks(tVar);
        }
        this.f1543s = recyclerView;
        recyclerView.i(this);
        this.f1543s.f1251r.add(this);
        this.f1543s.j(uVar);
    }

    public static int d(float f10, float f11, int[] iArr, int i4, int i10, int i11) {
        int i12 = iArr[1] - iArr[0];
        if (i12 != 0) {
            int i13 = i4 - i11;
            int i14 = (int) (((f11 - f10) / i12) * i13);
            int i15 = i10 + i14;
            if (i15 < i13 && i15 >= 0) {
                return i14;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.i1
    public final boolean a(MotionEvent motionEvent) {
        int i4 = this.f1546v;
        if (i4 != 1) {
            return i4 == 2;
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
            this.f1547w = 1;
            this.f1540p = (int) motionEvent.getX();
        } else if (zC) {
            this.f1547w = 2;
            this.f1537m = (int) motionEvent.getY();
        }
        e(2);
        return true;
    }

    public final boolean b(float f10, float f11) {
        if (f11 < this.f1542r - this.f1534i) {
            return false;
        }
        int i4 = this.f1539o;
        int i10 = this.f1538n;
        return f10 >= ((float) (i4 - (i10 / 2))) && f10 <= ((float) ((i10 / 2) + i4));
    }

    public final boolean c(float f10, float f11) {
        int layoutDirection = this.f1543s.getLayoutDirection();
        int i4 = this.f1531e;
        if (layoutDirection == 1) {
            if (f10 > i4) {
                return false;
            }
        } else if (f10 < this.f1541q - i4) {
            return false;
        }
        int i10 = this.f1536l;
        int i11 = this.f1535k / 2;
        return f11 >= ((float) (i10 - i11)) && f11 <= ((float) (i11 + i10));
    }

    public final void e(int i4) {
        t tVar = this.B;
        StateListDrawable stateListDrawable = this.f1529c;
        if (i4 == 2 && this.f1546v != 2) {
            stateListDrawable.setState(C);
            this.f1543s.removeCallbacks(tVar);
        }
        if (i4 == 0) {
            this.f1543s.invalidate();
        } else {
            f();
        }
        if (this.f1546v == 2 && i4 != 2) {
            stateListDrawable.setState(D);
            this.f1543s.removeCallbacks(tVar);
            this.f1543s.postDelayed(tVar, 1200);
        } else if (i4 == 1) {
            this.f1543s.removeCallbacks(tVar);
            this.f1543s.postDelayed(tVar, TTAdConstant.STYLE_SIZE_RADIO_3_2);
        }
        this.f1546v = i4;
    }

    public final void f() {
        int i4 = this.A;
        ValueAnimator valueAnimator = this.f1550z;
        if (i4 != 0) {
            if (i4 != 3) {
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

    @Override // androidx.recyclerview.widget.b1
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, t1 t1Var) {
        if (this.f1541q != this.f1543s.getWidth() || this.f1542r != this.f1543s.getHeight()) {
            this.f1541q = this.f1543s.getWidth();
            this.f1542r = this.f1543s.getHeight();
            e(0);
            return;
        }
        if (this.A != 0) {
            if (this.f1544t) {
                int i4 = this.f1541q;
                int i10 = this.f1531e;
                int i11 = i4 - i10;
                int i12 = this.f1536l;
                int i13 = this.f1535k;
                int i14 = i12 - (i13 / 2);
                StateListDrawable stateListDrawable = this.f1529c;
                stateListDrawable.setBounds(0, 0, i10, i13);
                int i15 = this.f1532f;
                int i16 = this.f1542r;
                Drawable drawable = this.f1530d;
                drawable.setBounds(0, 0, i15, i16);
                if (this.f1543s.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i10, i14);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i10, -i14);
                } else {
                    canvas.translate(i11, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i14);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i11, -i14);
                }
            }
            if (this.f1545u) {
                int i17 = this.f1542r;
                int i18 = this.f1534i;
                int i19 = i17 - i18;
                int i20 = this.f1539o;
                int i21 = this.f1538n;
                int i22 = i20 - (i21 / 2);
                StateListDrawable stateListDrawable2 = this.g;
                stateListDrawable2.setBounds(0, 0, i21, i18);
                int i23 = this.f1541q;
                int i24 = this.j;
                Drawable drawable2 = this.f1533h;
                drawable2.setBounds(0, 0, i23, i24);
                canvas.translate(0.0f, i19);
                drawable2.draw(canvas);
                canvas.translate(i22, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i22, -i19);
            }
        }
    }

    @Override // androidx.recyclerview.widget.i1
    public final void onTouchEvent(MotionEvent motionEvent) {
        if (this.f1546v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zC = c(motionEvent.getX(), motionEvent.getY());
            boolean zB = b(motionEvent.getX(), motionEvent.getY());
            if (zC || zB) {
                if (zB) {
                    this.f1547w = 1;
                    this.f1540p = (int) motionEvent.getX();
                } else if (zC) {
                    this.f1547w = 2;
                    this.f1537m = (int) motionEvent.getY();
                }
                e(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f1546v == 2) {
            this.f1537m = 0.0f;
            this.f1540p = 0.0f;
            e(1);
            this.f1547w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f1546v == 2) {
            f();
            int i4 = this.f1547w;
            int i10 = this.f1528b;
            if (i4 == 1) {
                float x10 = motionEvent.getX();
                int[] iArr = this.f1549y;
                iArr[0] = i10;
                int i11 = this.f1541q - i10;
                iArr[1] = i11;
                float fMax = Math.max(i10, Math.min(i11, x10));
                if (Math.abs(this.f1539o - fMax) >= 2.0f) {
                    int iD = d(this.f1540p, fMax, iArr, this.f1543s.computeHorizontalScrollRange(), this.f1543s.computeHorizontalScrollOffset(), this.f1541q);
                    if (iD != 0) {
                        this.f1543s.scrollBy(iD, 0);
                    }
                    this.f1540p = fMax;
                }
            }
            if (this.f1547w == 2) {
                float y10 = motionEvent.getY();
                int[] iArr2 = this.f1548x;
                iArr2[0] = i10;
                int i12 = this.f1542r - i10;
                iArr2[1] = i12;
                float fMax2 = Math.max(i10, Math.min(i12, y10));
                if (Math.abs(this.f1536l - fMax2) < 2.0f) {
                    return;
                }
                int iD2 = d(this.f1537m, fMax2, iArr2, this.f1543s.computeVerticalScrollRange(), this.f1543s.computeVerticalScrollOffset(), this.f1542r);
                if (iD2 != 0) {
                    this.f1543s.scrollBy(0, iD2);
                }
                this.f1537m = fMax2;
            }
        }
    }
}
