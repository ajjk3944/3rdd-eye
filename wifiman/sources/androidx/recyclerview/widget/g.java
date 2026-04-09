package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class g extends RecyclerView.y {

    /* renamed from: k, reason: collision with root package name */
    protected PointF f32232k;

    /* renamed from: l, reason: collision with root package name */
    private final DisplayMetrics f32233l;

    /* renamed from: n, reason: collision with root package name */
    private float f32235n;

    /* renamed from: i, reason: collision with root package name */
    protected final LinearInterpolator f32230i = new LinearInterpolator();

    /* renamed from: j, reason: collision with root package name */
    protected final DecelerateInterpolator f32231j = new DecelerateInterpolator();

    /* renamed from: m, reason: collision with root package name */
    private boolean f32234m = false;

    /* renamed from: o, reason: collision with root package name */
    protected int f32236o = 0;

    /* renamed from: p, reason: collision with root package name */
    protected int f32237p = 0;

    public g(Context context) {
        this.f32233l = context.getResources().getDisplayMetrics();
    }

    private float A() {
        if (!this.f32234m) {
            this.f32235n = v(this.f32233l);
            this.f32234m = true;
        }
        return this.f32235n;
    }

    private int y(int i10, int i11) {
        int i12 = i10 - i11;
        if (i10 * i12 <= 0) {
            return 0;
        }
        return i12;
    }

    protected int B() {
        PointF pointF = this.f32232k;
        if (pointF != null) {
            float f10 = pointF.y;
            if (f10 != 0.0f) {
                return f10 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    protected void C(RecyclerView.y.a aVar) {
        PointF pointFA = a(f());
        if (pointFA == null || (pointFA.x == 0.0f && pointFA.y == 0.0f)) {
            aVar.b(f());
            r();
            return;
        }
        i(pointFA);
        this.f32232k = pointFA;
        this.f32236o = (int) (pointFA.x * 10000.0f);
        this.f32237p = (int) (pointFA.y * 10000.0f);
        aVar.d((int) (this.f32236o * 1.2f), (int) (this.f32237p * 1.2f), (int) (x(10000) * 1.2f), this.f32230i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    protected void l(int i10, int i11, RecyclerView.z zVar, RecyclerView.y.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.f32236o = y(this.f32236o, i10);
        int iY = y(this.f32237p, i11);
        this.f32237p = iY;
        if (this.f32236o == 0 && iY == 0) {
            C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    protected void m() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    protected void n() {
        this.f32237p = 0;
        this.f32236o = 0;
        this.f32232k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    protected void o(View view, RecyclerView.z zVar, RecyclerView.y.a aVar) {
        int iT = t(view, z());
        int iU = u(view, B());
        int iW = w((int) Math.sqrt((iT * iT) + (iU * iU)));
        if (iW > 0) {
            aVar.d(-iT, -iU, iW, this.f32231j);
        }
    }

    public int s(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 != 0) {
            if (i14 == 1) {
                return i13 - i11;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i15 = i12 - i10;
        if (i15 > 0) {
            return i15;
        }
        int i16 = i13 - i11;
        if (i16 < 0) {
            return i16;
        }
        return 0;
    }

    public int t(View view, int i10) {
        RecyclerView.o oVarE = e();
        if (oVarE == null || !oVarE.p()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return s(oVarE.V(view) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, oVarE.Y(view) + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, oVarE.i0(), oVarE.s0() - oVarE.j0(), i10);
    }

    public int u(View view, int i10) {
        RecyclerView.o oVarE = e();
        if (oVarE == null || !oVarE.q()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return s(oVarE.Z(view) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, oVarE.T(view) + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin, oVarE.k0(), oVarE.b0() - oVarE.h0(), i10);
    }

    protected float v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    protected int w(int i10) {
        return (int) Math.ceil(x(i10) / 0.3356d);
    }

    protected int x(int i10) {
        return (int) Math.ceil(Math.abs(i10) * A());
    }

    protected int z() {
        PointF pointF = this.f32232k;
        if (pointF != null) {
            float f10 = pointF.x;
            if (f10 != 0.0f) {
                return f10 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
