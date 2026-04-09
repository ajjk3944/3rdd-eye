package fe;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import xu.d;

/* loaded from: classes.dex */
public final class a extends d {
    public final /* synthetic */ int j;
    public final SideSheetBehavior k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i10) {
        super(7);
        this.j = i10;
        this.k = sideSheetBehavior;
    }

    @Override // xu.d
    public final int D() {
        switch (this.j) {
            case 0:
                return this.k.f5695o;
            default:
                return this.k.f5693m;
        }
    }

    @Override // xu.d
    public final int E() {
        switch (this.j) {
            case 0:
                return -this.k.f5692l;
            default:
                return u();
        }
    }

    @Override // xu.d
    public final int G(View view) {
        switch (this.j) {
            case 0:
                return view.getRight() + this.k.f5695o;
            default:
                return view.getLeft() - this.k.f5695o;
        }
    }

    @Override // xu.d
    public final int H(CoordinatorLayout coordinatorLayout) {
        switch (this.j) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // xu.d
    public final int J() {
        switch (this.j) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // xu.d
    public final boolean O(float f10) {
        switch (this.j) {
            case 0:
                if (f10 > 0.0f) {
                }
                break;
            default:
                if (f10 < 0.0f) {
                }
                break;
        }
        return false;
    }

    @Override // xu.d
    public final boolean P(View view) {
        switch (this.j) {
            case 0:
                if (view.getRight() < (u() - x()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (u() + this.k.f5693m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // xu.d
    public final boolean R(float f10, float f11) {
        switch (this.j) {
            case 0:
                if (Math.abs(f10) <= Math.abs(f11) || Math.abs(f10) <= 500) {
                }
                break;
            default:
                if (Math.abs(f10) <= Math.abs(f11) || Math.abs(f10) <= 500) {
                }
                break;
        }
        return false;
    }

    @Override // xu.d
    public final int f(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.j) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // xu.d
    public final boolean f0(View view, float f10) {
        switch (this.j) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.k;
                float fAbs = Math.abs((f10 * sideSheetBehavior.k) + left);
                sideSheetBehavior.getClass();
                if (fAbs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.k;
                float fAbs2 = Math.abs((f10 * sideSheetBehavior2.k) + right);
                sideSheetBehavior2.getClass();
                if (fAbs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // xu.d
    public final float g(int i10) {
        switch (this.j) {
            case 0:
                float fX = x();
                return (i10 - fX) / (u() - fX);
            default:
                float f10 = this.k.f5693m;
                return (f10 - i10) / (f10 - u());
        }
    }

    @Override // xu.d
    public final void j0(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        switch (this.j) {
            case 0:
                if (i10 <= this.k.f5693m) {
                    marginLayoutParams.leftMargin = i11;
                    break;
                }
                break;
            default:
                int i12 = this.k.f5693m;
                if (i10 <= i12) {
                    marginLayoutParams.rightMargin = i12 - i10;
                    break;
                }
                break;
        }
    }

    @Override // xu.d
    public final int u() {
        switch (this.j) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.k;
                return Math.max(0, sideSheetBehavior.f5694n + sideSheetBehavior.f5695o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.k;
                return Math.max(0, (sideSheetBehavior2.f5693m - sideSheetBehavior2.f5692l) - sideSheetBehavior2.f5695o);
        }
    }

    @Override // xu.d
    public final int x() {
        switch (this.j) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.k;
                return (-sideSheetBehavior.f5692l) - sideSheetBehavior.f5695o;
            default:
                return this.k.f5693m;
        }
    }
}
