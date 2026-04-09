package H3;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class a extends com.bumptech.glide.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1782e;

    /* renamed from: f, reason: collision with root package name */
    public final SideSheetBehavior f1783f;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.f1782e = i;
        this.f1783f = sideSheetBehavior;
    }

    @Override // com.bumptech.glide.c
    public final boolean D(float f2) {
        switch (this.f1782e) {
            case 0:
                if (f2 > 0.0f) {
                }
                break;
            default:
                if (f2 < 0.0f) {
                }
                break;
        }
        return false;
    }

    @Override // com.bumptech.glide.c
    public final boolean F(View view) {
        switch (this.f1782e) {
            case 0:
                if (view.getRight() < (s() - t()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (s() + this.f1783f.f18439m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // com.bumptech.glide.c
    public final boolean G(float f2, float f5) {
        switch (this.f1782e) {
            case 0:
                if (Math.abs(f2) <= Math.abs(f5) || Math.abs(f2) <= 500) {
                }
                break;
            default:
                if (Math.abs(f2) <= Math.abs(f5) || Math.abs(f2) <= 500) {
                }
                break;
        }
        return false;
    }

    @Override // com.bumptech.glide.c
    public final boolean N(View view, float f2) {
        switch (this.f1782e) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f1783f;
                float fAbs = Math.abs((f2 * sideSheetBehavior.f18437k) + left);
                sideSheetBehavior.getClass();
                if (fAbs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f1783f;
                float fAbs2 = Math.abs((f2 * sideSheetBehavior2.f18437k) + right);
                sideSheetBehavior2.getClass();
                if (fAbs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // com.bumptech.glide.c
    public final void P(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        switch (this.f1782e) {
            case 0:
                marginLayoutParams.leftMargin = i;
                break;
            default:
                marginLayoutParams.rightMargin = i;
                break;
        }
    }

    @Override // com.bumptech.glide.c
    public final void Q(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i3) {
        switch (this.f1782e) {
            case 0:
                if (i <= this.f1783f.f18439m) {
                    marginLayoutParams.leftMargin = i3;
                    break;
                }
                break;
            default:
                int i6 = this.f1783f.f18439m;
                if (i <= i6) {
                    marginLayoutParams.rightMargin = i6 - i;
                    break;
                }
                break;
        }
    }

    @Override // com.bumptech.glide.c
    public final int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f1782e) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // com.bumptech.glide.c
    public final float c(int i) {
        switch (this.f1782e) {
            case 0:
                float fT = t();
                return (i - fT) / (s() - fT);
            default:
                float f2 = this.f1783f.f18439m;
                return (f2 - i) / (f2 - s());
        }
    }

    @Override // com.bumptech.glide.c
    public final int p(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f1782e) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // com.bumptech.glide.c
    public final int s() {
        switch (this.f1782e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f1783f;
                return Math.max(0, sideSheetBehavior.f18440n + sideSheetBehavior.f18419C);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f1783f;
                return Math.max(0, (sideSheetBehavior2.f18439m - sideSheetBehavior2.f18438l) - sideSheetBehavior2.f18419C);
        }
    }

    @Override // com.bumptech.glide.c
    public final int t() {
        switch (this.f1782e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f1783f;
                return (-sideSheetBehavior.f18438l) - sideSheetBehavior.f18419C;
            default:
                return this.f1783f.f18439m;
        }
    }

    @Override // com.bumptech.glide.c
    public final int u() {
        switch (this.f1782e) {
            case 0:
                return this.f1783f.f18419C;
            default:
                return this.f1783f.f18439m;
        }
    }

    @Override // com.bumptech.glide.c
    public final int v() {
        switch (this.f1782e) {
            case 0:
                return -this.f1783f.f18438l;
            default:
                return s();
        }
    }

    @Override // com.bumptech.glide.c
    public final int w(View view) {
        switch (this.f1782e) {
            case 0:
                return view.getRight() + this.f1783f.f18419C;
            default:
                return view.getLeft() - this.f1783f.f18419C;
        }
    }

    @Override // com.bumptech.glide.c
    public final int x(CoordinatorLayout coordinatorLayout) {
        switch (this.f1782e) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // com.bumptech.glide.c
    public final int y() {
        switch (this.f1782e) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }
}
