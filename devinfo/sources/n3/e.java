package n3;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f29619a;

    /* renamed from: b, reason: collision with root package name */
    public int f29620b;

    /* renamed from: c, reason: collision with root package name */
    public int f29621c;

    /* renamed from: d, reason: collision with root package name */
    public int f29622d;

    /* renamed from: e, reason: collision with root package name */
    public int f29623e;

    /* renamed from: f, reason: collision with root package name */
    public int f29624f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f29625h;

    public e(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f29625h = constraintLayout;
        this.f29619a = constraintLayout2;
    }

    public static boolean a(int i4, int i10, int i11) {
        if (i4 == i10) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i11 == size;
        }
        return false;
    }

    public final void b(k3.d dVar, l3.b bVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        boolean z3;
        int measuredWidth;
        int baseline;
        int i4;
        if (dVar == null) {
            return;
        }
        k3.c cVar = dVar.K;
        k3.c cVar2 = dVar.I;
        if (dVar.f27851g0 == 8) {
            bVar.f28551e = 0;
            bVar.f28552f = 0;
            bVar.g = 0;
            return;
        }
        if (dVar.T == null) {
            return;
        }
        r rVar = ConstraintLayout.f856p;
        int i10 = bVar.f28547a;
        int i11 = bVar.f28548b;
        int i12 = bVar.f28549c;
        int i13 = bVar.f28550d;
        int i14 = this.f29620b + this.f29621c;
        int i15 = this.f29622d;
        View view = dVar.f27850f0;
        int iC = i3.e.c(i10);
        if (iC == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        } else if (iC == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f29624f, i15, -2);
        } else if (iC == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f29624f, i15, -2);
            boolean z10 = dVar.f27870r == 1;
            int i16 = bVar.j;
            if (i16 == 1 || i16 == 2) {
                boolean z11 = view.getMeasuredHeight() == dVar.k();
                if (bVar.j == 2 || !z10 || ((z10 && z11) || dVar.A())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dVar.q(), 1073741824);
                }
            }
        } else if (iC != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i17 = this.f29624f;
            int i18 = cVar2 != null ? cVar2.g : 0;
            if (cVar != null) {
                i18 += cVar.g;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i17, i15 + i18, -1);
        }
        int iC2 = i3.e.c(i11);
        if (iC2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        } else if (iC2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i14, -2);
        } else if (iC2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i14, -2);
            boolean z12 = dVar.f27871s == 1;
            int i19 = bVar.j;
            if (i19 == 1 || i19 == 2) {
                boolean z13 = view.getMeasuredWidth() == dVar.q();
                if (bVar.j == 2 || !z12 || ((z12 && z13) || dVar.B())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dVar.k(), 1073741824);
                }
            }
        } else if (iC2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i20 = this.g;
            int i21 = cVar2 != null ? dVar.J.g : 0;
            if (cVar != null) {
                i21 += dVar.L.g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i20, i14 + i21, -1);
        }
        k3.e eVar = (k3.e) dVar.T;
        ConstraintLayout constraintLayout = this.f29625h;
        if (eVar != null && k3.j.c(constraintLayout.f864i, 256) && view.getMeasuredWidth() == dVar.q() && view.getMeasuredWidth() < eVar.q() && view.getMeasuredHeight() == dVar.k() && view.getMeasuredHeight() < eVar.k() && view.getBaseline() == dVar.f27840a0 && !dVar.z() && a(dVar.G, iMakeMeasureSpec, dVar.q()) && a(dVar.H, iMakeMeasureSpec2, dVar.k())) {
            bVar.f28551e = dVar.q();
            bVar.f28552f = dVar.k();
            bVar.g = dVar.f27840a0;
            return;
        }
        boolean z14 = i10 == 3;
        boolean z15 = i11 == 3;
        boolean z16 = i11 == 4 || i11 == 1;
        boolean z17 = i10 == 4 || i10 == 1;
        boolean z18 = z14 && dVar.W > 0.0f;
        boolean z19 = z15 && dVar.W > 0.0f;
        if (view == null) {
            return;
        }
        d dVar2 = (d) view.getLayoutParams();
        int i22 = bVar.j;
        if (i22 != 1 && i22 != 2 && z14 && dVar.f27870r == 0 && z15 && dVar.f27871s == 0) {
            z3 = false;
            measuredWidth = 0;
            baseline = 0;
            i4 = -1;
            iMax = 0;
        } else {
            if ((view instanceof s) && (dVar instanceof k3.g)) {
                ((s) view).j((k3.g) dVar, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            dVar.G = iMakeMeasureSpec;
            dVar.H = iMakeMeasureSpec2;
            dVar.g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i23 = dVar.f27873u;
            int iMax2 = i23 > 0 ? Math.max(i23, measuredWidth2) : measuredWidth2;
            int i24 = dVar.f27874v;
            if (i24 > 0) {
                iMax2 = Math.min(i24, iMax2);
            }
            int i25 = dVar.f27876x;
            iMax = i25 > 0 ? Math.max(i25, measuredHeight) : measuredHeight;
            int i26 = iMakeMeasureSpec2;
            int i27 = dVar.f27877y;
            if (i27 > 0) {
                iMax = Math.min(i27, iMax);
            }
            if (!k3.j.c(constraintLayout.f864i, 1)) {
                if (z18 && z16) {
                    iMax2 = (int) ((iMax * dVar.W) + 0.5f);
                } else if (z19 && z17) {
                    iMax = (int) ((iMax2 / dVar.W) + 0.5f);
                }
            }
            if (measuredWidth2 == iMax2 && measuredHeight == iMax) {
                baseline = baseline2;
                measuredWidth = iMax2;
                z3 = false;
            } else {
                if (measuredWidth2 != iMax2) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                }
                int iMakeMeasureSpec3 = measuredHeight != iMax ? View.MeasureSpec.makeMeasureSpec(iMax, 1073741824) : i26;
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                dVar.G = iMakeMeasureSpec;
                dVar.H = iMakeMeasureSpec3;
                z3 = false;
                dVar.g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredHeight2;
            }
            i4 = -1;
        }
        boolean z20 = baseline != i4 ? true : z3;
        bVar.f28554i = (measuredWidth == bVar.f28549c && iMax == bVar.f28550d) ? z3 : true;
        boolean z21 = dVar2.f29584c0 ? true : z20;
        if (z21 && baseline != -1 && dVar.f27840a0 != baseline) {
            bVar.f28554i = true;
        }
        bVar.f28551e = measuredWidth;
        bVar.f28552f = iMax;
        bVar.f28553h = z21;
        bVar.g = baseline;
    }
}
