package fd;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends wb.e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f24004f;
    public final SideSheetBehavior g;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i4) {
        this.f24004f = i4;
        this.g = sideSheetBehavior;
    }

    @Override // wb.e
    public final int A() {
        switch (this.f24004f) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // wb.e
    public final boolean D(float f10) {
        switch (this.f24004f) {
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

    @Override // wb.e
    public final boolean E(View view) {
        switch (this.f24004f) {
            case 0:
                if (view.getRight() < (u() - v()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (u() + this.g.f20555m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // wb.e
    public final boolean F(float f10, float f11) {
        switch (this.f24004f) {
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

    @Override // wb.e
    public final boolean L(View view, float f10) {
        switch (this.f24004f) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.g;
                float fAbs = Math.abs((f10 * sideSheetBehavior.f20553k) + left);
                sideSheetBehavior.getClass();
                if (fAbs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.g;
                float fAbs2 = Math.abs((f10 * sideSheetBehavior2.f20553k) + right);
                sideSheetBehavior2.getClass();
                if (fAbs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // wb.e
    public final void N(ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
        switch (this.f24004f) {
            case 0:
                marginLayoutParams.leftMargin = i4;
                break;
            default:
                marginLayoutParams.rightMargin = i4;
                break;
        }
    }

    @Override // wb.e
    public final void O(ViewGroup.MarginLayoutParams marginLayoutParams, int i4, int i10) {
        switch (this.f24004f) {
            case 0:
                if (i4 <= this.g.f20555m) {
                    marginLayoutParams.leftMargin = i10;
                    break;
                }
                break;
            default:
                int i11 = this.g.f20555m;
                if (i4 <= i11) {
                    marginLayoutParams.rightMargin = i11 - i4;
                    break;
                }
                break;
        }
    }

    @Override // wb.e
    public final int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f24004f) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // wb.e
    public final float d(int i4) {
        switch (this.f24004f) {
            case 0:
                float fV = v();
                return (i4 - fV) / (u() - fV);
            default:
                float f10 = this.g.f20555m;
                return (f10 - i4) / (f10 - u());
        }
    }

    @Override // wb.e
    public final int t(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f24004f) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // wb.e
    public final int u() {
        switch (this.f24004f) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.g;
                return Math.max(0, sideSheetBehavior.f20556n + sideSheetBehavior.f20557o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.g;
                return Math.max(0, (sideSheetBehavior2.f20555m - sideSheetBehavior2.f20554l) - sideSheetBehavior2.f20557o);
        }
    }

    @Override // wb.e
    public final int v() {
        switch (this.f24004f) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.g;
                return (-sideSheetBehavior.f20554l) - sideSheetBehavior.f20557o;
            default:
                return this.g.f20555m;
        }
    }

    @Override // wb.e
    public final int w() {
        switch (this.f24004f) {
            case 0:
                return this.g.f20557o;
            default:
                return this.g.f20555m;
        }
    }

    @Override // wb.e
    public final int x() {
        switch (this.f24004f) {
            case 0:
                return -this.g.f20554l;
            default:
                return u();
        }
    }

    @Override // wb.e
    public final int y(View view) {
        switch (this.f24004f) {
            case 0:
                return view.getRight() + this.g.f20557o;
            default:
                return view.getLeft() - this.g.f20557o;
        }
    }

    @Override // wb.e
    public final int z(CoordinatorLayout coordinatorLayout) {
        switch (this.f24004f) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }
}
