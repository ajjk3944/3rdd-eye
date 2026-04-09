package c3;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3191a;

    /* renamed from: b, reason: collision with root package name */
    public int f3192b;

    /* renamed from: c, reason: collision with root package name */
    public int f3193c;

    /* renamed from: d, reason: collision with root package name */
    public int f3194d;

    /* renamed from: e, reason: collision with root package name */
    public int f3195e;

    /* renamed from: f, reason: collision with root package name */
    public int f3196f;

    /* renamed from: g, reason: collision with root package name */
    public int f3197g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f3198h;

    public g(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f3198h = constraintLayout;
        this.f3191a = constraintLayout2;
    }

    public static boolean a(int i10, int i11, int i12) {
        if (i10 == i11) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
        }
        return false;
    }

    public final void b(z2.g gVar, a3.b bVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        int iMax2;
        boolean z10;
        int baseline;
        int i10;
        int childMeasureSpec;
        if (gVar == null) {
            return;
        }
        z2.d dVar = gVar.K;
        z2.d dVar2 = gVar.I;
        if (gVar.f26551h0 == 8) {
            bVar.f36e = 0;
            bVar.f37f = 0;
            bVar.f38g = 0;
            return;
        }
        if (gVar.U == null) {
            return;
        }
        t tVar = ConstraintLayout.L;
        z2.f fVar = bVar.f32a;
        z2.f fVar2 = bVar.f33b;
        int i11 = bVar.f34c;
        int i12 = bVar.f35d;
        int i13 = this.f3192b + this.f3193c;
        int i14 = this.f3194d;
        View view = gVar.f26549g0;
        int[] iArr = d.f3149a;
        int i15 = iArr[fVar.ordinal()];
        if (i15 != 1) {
            if (i15 == 2) {
                childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3196f, i14, -2);
            } else if (i15 == 3) {
                int i16 = this.f3196f;
                int i17 = dVar2 != null ? dVar2.f26532g : 0;
                if (dVar != null) {
                    i17 += dVar.f26532g;
                }
                childMeasureSpec = ViewGroup.getChildMeasureSpec(i16, i14 + i17, -1);
            } else if (i15 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3196f, i14, -2);
                boolean z11 = gVar.f26567r == 1;
                int i18 = bVar.j;
                if (i18 == 1 || i18 == 2) {
                    boolean z12 = view.getMeasuredHeight() == gVar.k();
                    if (bVar.j == 2 || !z11 || ((z11 && z12) || gVar.A())) {
                        childMeasureSpec = View.MeasureSpec.makeMeasureSpec(gVar.q(), 1073741824);
                    }
                }
            }
            iMakeMeasureSpec = childMeasureSpec;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        int i19 = iArr[fVar2.ordinal()];
        if (i19 == 1) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        } else if (i19 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3197g, i13, -2);
        } else if (i19 == 3) {
            int i20 = this.f3197g;
            int i21 = dVar2 != null ? gVar.J.f26532g : 0;
            if (dVar != null) {
                i21 += gVar.L.f26532g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i20, i13 + i21, -1);
        } else if (i19 != 4) {
            iMakeMeasureSpec2 = 0;
        } else {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3197g, i13, -2);
            boolean z13 = gVar.f26568s == 1;
            int i22 = bVar.j;
            if (i22 == 1 || i22 == 2) {
                boolean z14 = view.getMeasuredWidth() == gVar.q();
                if (bVar.j == 2 || !z13 || ((z13 && z14) || gVar.B())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(gVar.k(), 1073741824);
                }
            }
        }
        z2.h hVar = (z2.h) gVar.U;
        ConstraintLayout constraintLayout = this.f3198h;
        if (hVar != null && z2.n.c(constraintLayout.E, 256) && view.getMeasuredWidth() == gVar.q() && view.getMeasuredWidth() < hVar.q() && view.getMeasuredHeight() == gVar.k() && view.getMeasuredHeight() < hVar.k() && view.getBaseline() == gVar.f26539b0 && !gVar.z() && a(gVar.G, iMakeMeasureSpec, gVar.q()) && a(gVar.H, iMakeMeasureSpec2, gVar.k())) {
            bVar.f36e = gVar.q();
            bVar.f37f = gVar.k();
            bVar.f38g = gVar.f26539b0;
            return;
        }
        z2.f fVar3 = z2.f.MATCH_CONSTRAINT;
        boolean z15 = fVar == fVar3;
        boolean z16 = fVar2 == fVar3;
        z2.f fVar4 = z2.f.MATCH_PARENT;
        boolean z17 = fVar2 == fVar4 || fVar2 == z2.f.FIXED;
        boolean z18 = fVar == fVar4 || fVar == z2.f.FIXED;
        boolean z19 = z15 && gVar.X > 0.0f;
        boolean z20 = z16 && gVar.X > 0.0f;
        if (view == null) {
            return;
        }
        f fVar5 = (f) view.getLayoutParams();
        int i23 = bVar.j;
        if (i23 != 1 && i23 != 2 && z15 && gVar.f26567r == 0 && z16 && gVar.f26568s == 0) {
            z10 = false;
            i10 = -1;
            baseline = 0;
            iMax = 0;
            iMax2 = 0;
        } else {
            if ((view instanceof u) && (gVar instanceof z2.j)) {
                ((u) view).l((z2.j) gVar, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            gVar.G = iMakeMeasureSpec;
            gVar.H = iMakeMeasureSpec2;
            gVar.f26548g = false;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i24 = gVar.f26570u;
            iMax = i24 > 0 ? Math.max(i24, measuredWidth) : measuredWidth;
            int i25 = gVar.f26571v;
            if (i25 > 0) {
                iMax = Math.min(i25, iMax);
            }
            int i26 = gVar.f26573x;
            iMax2 = i26 > 0 ? Math.max(i26, measuredHeight) : measuredHeight;
            int i27 = iMakeMeasureSpec2;
            int i28 = gVar.f26574y;
            if (i28 > 0) {
                iMax2 = Math.min(i28, iMax2);
            }
            if (!z2.n.c(constraintLayout.E, 1)) {
                if (z19 && z17) {
                    iMax = (int) ((iMax2 * gVar.X) + 0.5f);
                } else if (z20 && z18) {
                    iMax2 = (int) ((iMax / gVar.X) + 0.5f);
                }
            }
            if (measuredWidth == iMax && measuredHeight == iMax2) {
                baseline = baseline2;
                z10 = false;
            } else {
                if (measuredWidth != iMax) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                }
                int iMakeMeasureSpec3 = measuredHeight != iMax2 ? View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824) : i27;
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                gVar.G = iMakeMeasureSpec;
                gVar.H = iMakeMeasureSpec3;
                z10 = false;
                gVar.f26548g = false;
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredWidth2;
                iMax2 = measuredHeight2;
            }
            i10 = -1;
        }
        boolean z21 = baseline != i10 ? true : z10;
        bVar.f40i = (iMax == bVar.f34c && iMax2 == bVar.f35d) ? z10 : true;
        if (fVar5.f3156c0) {
            z21 = true;
        }
        if (z21 && baseline != -1 && gVar.f26539b0 != baseline) {
            bVar.f40i = true;
        }
        bVar.f36e = iMax;
        bVar.f37f = iMax2;
        bVar.f39h = z21;
        bVar.f38g = baseline;
    }
}
