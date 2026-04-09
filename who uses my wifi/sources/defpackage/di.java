package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class di {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final /* synthetic */ ConstraintLayout h;

    public di(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.a = constraintLayout2;
    }

    public static boolean a(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    public final void b(pi piVar, ra raVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        boolean z;
        int measuredWidth;
        int baseline;
        int i;
        if (piVar == null) {
            return;
        }
        wh whVar = piVar.K;
        wh whVar2 = piVar.I;
        if (piVar.g0 == 8) {
            raVar.e = 0;
            raVar.f = 0;
            raVar.g = 0;
            return;
        }
        if (piVar.T == null) {
            return;
        }
        tv0 tv0Var = ConstraintLayout.u;
        int i2 = raVar.a;
        int i3 = raVar.b;
        int i4 = raVar.c;
        int i5 = raVar.d;
        int i6 = this.b + this.c;
        int i7 = this.d;
        View view = piVar.f0;
        int iS = ex0.s(i2);
        if (iS == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else if (iS == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
        } else if (iS == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
            boolean z2 = piVar.r == 1;
            int i8 = raVar.j;
            if (i8 == 1 || i8 == 2) {
                boolean z3 = view.getMeasuredHeight() == piVar.k();
                if (raVar.j == 2 || !z2 || ((z2 && z3) || piVar.A())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(piVar.q(), 1073741824);
                }
            }
        } else if (iS != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i9 = this.f;
            int i10 = whVar2 != null ? whVar2.g : 0;
            if (whVar != null) {
                i10 += whVar.g;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i9, i7 + i10, -1);
        }
        int iS2 = ex0.s(i3);
        if (iS2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        } else if (iS2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6, -2);
        } else if (iS2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6, -2);
            boolean z4 = piVar.s == 1;
            int i11 = raVar.j;
            if (i11 == 1 || i11 == 2) {
                boolean z5 = view.getMeasuredWidth() == piVar.q();
                if (raVar.j == 2 || !z4 || ((z4 && z5) || piVar.B())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(piVar.k(), 1073741824);
                }
            }
        } else if (iS2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i12 = this.g;
            int i13 = whVar2 != null ? piVar.J.g : 0;
            if (whVar != null) {
                i13 += piVar.L.g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, i6 + i13, -1);
        }
        qi qiVar = (qi) piVar.T;
        ConstraintLayout constraintLayout = this.h;
        if (qiVar != null && zt0.m(constraintLayout.n, 256) && view.getMeasuredWidth() == piVar.q() && view.getMeasuredWidth() < qiVar.q() && view.getMeasuredHeight() == piVar.k() && view.getMeasuredHeight() < qiVar.k() && view.getBaseline() == piVar.a0 && !piVar.z() && a(piVar.G, iMakeMeasureSpec, piVar.q()) && a(piVar.H, iMakeMeasureSpec2, piVar.k())) {
            raVar.e = piVar.q();
            raVar.f = piVar.k();
            raVar.g = piVar.a0;
            return;
        }
        boolean z6 = i2 == 3;
        boolean z7 = i3 == 3;
        boolean z8 = i3 == 4 || i3 == 1;
        boolean z9 = i2 == 4 || i2 == 1;
        boolean z10 = z6 && piVar.W > 0.0f;
        boolean z11 = z7 && piVar.W > 0.0f;
        if (view == null) {
            return;
        }
        ci ciVar = (ci) view.getLayoutParams();
        int i14 = raVar.j;
        if (i14 != 1 && i14 != 2 && z6 && piVar.r == 0 && z7 && piVar.s == 0) {
            z = false;
            measuredWidth = 0;
            baseline = 0;
            i = -1;
            iMax = 0;
        } else {
            if ((view instanceof q71) && (piVar instanceof zu)) {
                ((q71) view).l((zu) piVar, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            piVar.G = iMakeMeasureSpec;
            piVar.H = iMakeMeasureSpec2;
            piVar.g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i15 = piVar.u;
            int iMax2 = i15 > 0 ? Math.max(i15, measuredWidth2) : measuredWidth2;
            int i16 = piVar.v;
            if (i16 > 0) {
                iMax2 = Math.min(i16, iMax2);
            }
            int i17 = piVar.x;
            iMax = i17 > 0 ? Math.max(i17, measuredHeight) : measuredHeight;
            int i18 = iMakeMeasureSpec2;
            int i19 = piVar.y;
            if (i19 > 0) {
                iMax = Math.min(i19, iMax);
            }
            if (!zt0.m(constraintLayout.n, 1)) {
                if (z10 && z8) {
                    iMax2 = (int) ((iMax * piVar.W) + 0.5f);
                } else if (z11 && z9) {
                    iMax = (int) ((iMax2 / piVar.W) + 0.5f);
                }
            }
            if (measuredWidth2 == iMax2 && measuredHeight == iMax) {
                baseline = baseline2;
                measuredWidth = iMax2;
                z = false;
            } else {
                if (measuredWidth2 != iMax2) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                }
                int iMakeMeasureSpec3 = measuredHeight != iMax ? View.MeasureSpec.makeMeasureSpec(iMax, 1073741824) : i18;
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                piVar.G = iMakeMeasureSpec;
                piVar.H = iMakeMeasureSpec3;
                z = false;
                piVar.g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredHeight2;
            }
            i = -1;
        }
        boolean z12 = baseline != i ? true : z;
        raVar.i = (measuredWidth == raVar.c && iMax == raVar.d) ? z : true;
        boolean z13 = ciVar.c0 ? true : z12;
        if (z13 && baseline != -1 && piVar.a0 != baseline) {
            raVar.i = true;
        }
        raVar.e = measuredWidth;
        raVar.f = iMax;
        raVar.h = z13;
        raVar.g = baseline;
    }
}
