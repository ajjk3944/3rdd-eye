package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LinearSmoothScroller.java */
/* loaded from: classes.dex */
public class u extends RecyclerView.A {

    /* renamed from: k, reason: collision with root package name */
    @SuppressLint({"UnknownNullness"})
    public PointF f16770k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f16771l;

    /* renamed from: n, reason: collision with root package name */
    public float f16773n;
    public final LinearInterpolator i = new LinearInterpolator();

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f16769j = new DecelerateInterpolator();

    /* renamed from: m, reason: collision with root package name */
    public boolean f16772m = false;

    /* renamed from: o, reason: collision with root package name */
    public int f16774o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f16775p = 0;

    @SuppressLint({"UnknownNullness"})
    public u(Context context) {
        this.f16771l = context.getResources().getDisplayMetrics();
    }

    public static int g(int i, int i10, int i11, int i12, int i13) {
        if (i13 == -1) {
            return i11 - i;
        }
        if (i13 != 0) {
            if (i13 == 1) {
                return i12 - i10;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i14 = i11 - i;
        if (i14 > 0) {
            return i14;
        }
        int i15 = i12 - i10;
        if (i15 < 0) {
            return i15;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A
    @SuppressLint({"UnknownNullness"})
    public final void c(int i, int i10, RecyclerView.A.a aVar) {
        if (this.f16449b.mLayout.O() == 0) {
            f();
            return;
        }
        int i11 = this.f16774o;
        int i12 = i11 - i;
        if (i11 * i12 <= 0) {
            i12 = 0;
        }
        this.f16774o = i12;
        int i13 = this.f16775p;
        int i14 = i13 - i10;
        int i15 = i13 * i14 > 0 ? i14 : 0;
        this.f16775p = i15;
        if (i12 == 0 && i15 == 0) {
            PointF pointFA = a(this.f16448a);
            if (pointFA != null) {
                if (pointFA.x != 0.0f || pointFA.y != 0.0f) {
                    float f10 = pointFA.y;
                    float fSqrt = (float) Math.sqrt((f10 * f10) + (r4 * r4));
                    float f11 = pointFA.x / fSqrt;
                    pointFA.x = f11;
                    float f12 = pointFA.y / fSqrt;
                    pointFA.y = f12;
                    this.f16770k = pointFA;
                    this.f16774o = (int) (f11 * 10000.0f);
                    this.f16775p = (int) (f12 * 10000.0f);
                    int iK = k(10000);
                    LinearInterpolator linearInterpolator = this.i;
                    aVar.f16456a = (int) (this.f16774o * 1.2f);
                    aVar.f16457b = (int) (this.f16775p * 1.2f);
                    aVar.f16458c = (int) (iK * 1.2f);
                    aVar.f16460e = linearInterpolator;
                    aVar.f16461f = true;
                    return;
                }
            }
            aVar.f16459d = this.f16448a;
            f();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A
    public final void d() {
        this.f16775p = 0;
        this.f16774o = 0;
        this.f16770k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A
    @SuppressLint({"UnknownNullness"})
    public void e(View view, RecyclerView.A.a aVar) {
        int iH = h(l(), view);
        int i = i(m(), view);
        int iCeil = (int) Math.ceil(k((int) Math.sqrt((i * i) + (iH * iH))) / 0.3356d);
        if (iCeil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f16769j;
            aVar.f16456a = -iH;
            aVar.f16457b = -i;
            aVar.f16458c = iCeil;
            aVar.f16460e = decelerateInterpolator;
            aVar.f16461f = true;
        }
    }

    @SuppressLint({"UnknownNullness"})
    public int h(int i, View view) {
        RecyclerView.p pVar = this.f16450c;
        if (pVar == null || !pVar.v()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return g((view.getLeft() - ((RecyclerView.q) view.getLayoutParams()).f16519b.left) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, view.getRight() + ((RecyclerView.q) view.getLayoutParams()).f16519b.right + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, pVar.Y(), pVar.f16510n - pVar.Z(), i);
    }

    @SuppressLint({"UnknownNullness"})
    public int i(int i, View view) {
        RecyclerView.p pVar = this.f16450c;
        if (pVar == null || !pVar.w()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return g((view.getTop() - ((RecyclerView.q) view.getLayoutParams()).f16519b.top) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, view.getBottom() + ((RecyclerView.q) view.getLayoutParams()).f16519b.bottom + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin, pVar.a0(), pVar.f16511o - pVar.X(), i);
    }

    @SuppressLint({"UnknownNullness"})
    public float j(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int k(int i) {
        float fAbs = Math.abs(i);
        if (!this.f16772m) {
            this.f16773n = j(this.f16771l);
            this.f16772m = true;
        }
        return (int) Math.ceil(fAbs * this.f16773n);
    }

    public int l() {
        PointF pointF = this.f16770k;
        if (pointF == null) {
            return 0;
        }
        float f10 = pointF.x;
        if (f10 == 0.0f) {
            return 0;
        }
        return f10 > 0.0f ? 1 : -1;
    }

    public int m() {
        PointF pointF = this.f16770k;
        if (pointF == null) {
            return 0;
        }
        float f10 = pointF.y;
        if (f10 == 0.0f) {
            return 0;
        }
        return f10 > 0.0f ? 1 : -1;
    }
}
