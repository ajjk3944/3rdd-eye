package C;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f882a;

    /* renamed from: b, reason: collision with root package name */
    public int f883b;

    /* renamed from: c, reason: collision with root package name */
    public int f884c;

    /* renamed from: d, reason: collision with root package name */
    public int f885d;

    /* renamed from: e, reason: collision with root package name */
    public int f886e;

    /* renamed from: f, reason: collision with root package name */
    public int f887f;

    /* renamed from: g, reason: collision with root package name */
    public int f888g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f889h;

    public f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f889h = constraintLayout;
        this.f882a = constraintLayout2;
    }

    public static boolean a(int i, int i3, int i6) {
        if (i == i3) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i6 == size;
        }
        return false;
    }

    public final void b(z.d dVar, A.b bVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        boolean z6;
        int measuredWidth;
        int baseline;
        int i;
        if (dVar == null) {
            return;
        }
        z.c cVar = dVar.f24302K;
        z.c cVar2 = dVar.f24300I;
        if (dVar.f24329g0 == 8) {
            bVar.f4e = 0;
            bVar.f5f = 0;
            bVar.f6g = 0;
            return;
        }
        if (dVar.f24310T == null) {
            return;
        }
        int i3 = bVar.f0a;
        int i6 = bVar.f1b;
        int i7 = bVar.f2c;
        int i8 = bVar.f3d;
        int i9 = this.f883b + this.f884c;
        int i10 = this.f885d;
        View view = dVar.f24327f0;
        int iC = AbstractC2984e.c(i3);
        if (iC == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else if (iC == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f887f, i10, -2);
        } else if (iC == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f887f, i10, -2);
            boolean z7 = dVar.f24348r == 1;
            int i11 = bVar.f8j;
            if (i11 == 1 || i11 == 2) {
                boolean z8 = view.getMeasuredHeight() == dVar.k();
                if (bVar.f8j == 2 || !z7 || ((z7 && z8) || dVar.A())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dVar.q(), 1073741824);
                }
            }
        } else if (iC != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i12 = this.f887f;
            int i13 = cVar2 != null ? cVar2.f24290g : 0;
            if (cVar != null) {
                i13 += cVar.f24290g;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i12, i10 + i13, -1);
        }
        int iC2 = AbstractC2984e.c(i6);
        if (iC2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
        } else if (iC2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f888g, i9, -2);
        } else if (iC2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f888g, i9, -2);
            boolean z9 = dVar.f24349s == 1;
            int i14 = bVar.f8j;
            if (i14 == 1 || i14 == 2) {
                boolean z10 = view.getMeasuredWidth() == dVar.q();
                if (bVar.f8j == 2 || !z9 || ((z9 && z10) || dVar.B())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dVar.k(), 1073741824);
                }
            }
        } else if (iC2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i15 = this.f888g;
            int i16 = cVar2 != null ? dVar.f24301J.f24290g : 0;
            if (cVar != null) {
                i16 += dVar.f24303L.f24290g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i15, i9 + i16, -1);
        }
        z.e eVar = (z.e) dVar.f24310T;
        ConstraintLayout constraintLayout = this.f889h;
        if (eVar != null && z.j.c(constraintLayout.i, 256) && view.getMeasuredWidth() == dVar.q() && view.getMeasuredWidth() < eVar.q() && view.getMeasuredHeight() == dVar.k() && view.getMeasuredHeight() < eVar.k() && view.getBaseline() == dVar.f24318a0 && !dVar.z() && a(dVar.f24298G, iMakeMeasureSpec, dVar.q()) && a(dVar.f24299H, iMakeMeasureSpec2, dVar.k())) {
            bVar.f4e = dVar.q();
            bVar.f5f = dVar.k();
            bVar.f6g = dVar.f24318a0;
            return;
        }
        boolean z11 = i3 == 3;
        boolean z12 = i6 == 3;
        boolean z13 = i6 == 4 || i6 == 1;
        boolean z14 = i3 == 4 || i3 == 1;
        boolean z15 = z11 && dVar.f24313W > 0.0f;
        boolean z16 = z12 && dVar.f24313W > 0.0f;
        if (view == null) {
            return;
        }
        e eVar2 = (e) view.getLayoutParams();
        int i17 = bVar.f8j;
        if (i17 != 1 && i17 != 2 && z11 && dVar.f24348r == 0 && z12 && dVar.f24349s == 0) {
            z6 = false;
            measuredWidth = 0;
            baseline = 0;
            i = -1;
            iMax = 0;
        } else {
            if ((view instanceof t) && (dVar instanceof z.g)) {
                ((t) view).l((z.g) dVar, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            dVar.f24298G = iMakeMeasureSpec;
            dVar.f24299H = iMakeMeasureSpec2;
            dVar.f24328g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i18 = dVar.f24351u;
            int iMax2 = i18 > 0 ? Math.max(i18, measuredWidth2) : measuredWidth2;
            int i19 = dVar.f24352v;
            if (i19 > 0) {
                iMax2 = Math.min(i19, iMax2);
            }
            int i20 = dVar.f24354x;
            iMax = i20 > 0 ? Math.max(i20, measuredHeight) : measuredHeight;
            int i21 = iMakeMeasureSpec2;
            int i22 = dVar.f24355y;
            if (i22 > 0) {
                iMax = Math.min(i22, iMax);
            }
            if (!z.j.c(constraintLayout.i, 1)) {
                if (z15 && z13) {
                    iMax2 = (int) ((iMax * dVar.f24313W) + 0.5f);
                } else if (z16 && z14) {
                    iMax = (int) ((iMax2 / dVar.f24313W) + 0.5f);
                }
            }
            if (measuredWidth2 == iMax2 && measuredHeight == iMax) {
                baseline = baseline2;
                measuredWidth = iMax2;
                z6 = false;
            } else {
                if (measuredWidth2 != iMax2) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                }
                int iMakeMeasureSpec3 = measuredHeight != iMax ? View.MeasureSpec.makeMeasureSpec(iMax, 1073741824) : i21;
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                dVar.f24298G = iMakeMeasureSpec;
                dVar.f24299H = iMakeMeasureSpec3;
                z6 = false;
                dVar.f24328g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredHeight2;
            }
            i = -1;
        }
        boolean z17 = baseline != i ? true : z6;
        bVar.i = (measuredWidth == bVar.f2c && iMax == bVar.f3d) ? z6 : true;
        boolean z18 = eVar2.f846c0 ? true : z17;
        if (z18 && baseline != -1 && dVar.f24318a0 != baseline) {
            bVar.i = true;
        }
        bVar.f4e = measuredWidth;
        bVar.f5f = iMax;
        bVar.f7h = z18;
        bVar.f6g = baseline;
    }
}
