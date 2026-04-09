package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class i50 extends i30 {
    public final /* synthetic */ int w;
    public final SideSheetBehavior x;

    public /* synthetic */ i50(SideSheetBehavior sideSheetBehavior, int i) {
        this.w = i;
        this.x = sideSheetBehavior;
    }

    @Override // defpackage.i30
    public final int A() {
        switch (this.w) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // defpackage.i30
    public final boolean E(float f) {
        switch (this.w) {
            case 0:
                if (f > 0.0f) {
                }
                break;
            default:
                if (f < 0.0f) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.i30
    public final boolean G(View view) {
        switch (this.w) {
            case 0:
                if (view.getRight() < (u() - v()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (u() + this.x.m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.i30
    public final boolean H(float f, float f2) {
        switch (this.w) {
            case 0:
                if (Math.abs(f) <= Math.abs(f2) || Math.abs(f) <= 500) {
                }
                break;
            default:
                if (Math.abs(f) <= Math.abs(f2) || Math.abs(f) <= 500) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.i30
    public final boolean R(View view, float f) {
        switch (this.w) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.x;
                float fAbs = Math.abs((f * sideSheetBehavior.k) + left);
                sideSheetBehavior.getClass();
                if (fAbs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.x;
                float fAbs2 = Math.abs((f * sideSheetBehavior2.k) + right);
                sideSheetBehavior2.getClass();
                if (fAbs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.i30
    public final void U(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        switch (this.w) {
            case 0:
                marginLayoutParams.leftMargin = i;
                break;
            default:
                marginLayoutParams.rightMargin = i;
                break;
        }
    }

    @Override // defpackage.i30
    public final void V(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.w) {
            case 0:
                if (i <= this.x.m) {
                    marginLayoutParams.leftMargin = i2;
                    break;
                }
                break;
            default:
                int i3 = this.x.m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.i30
    public final int g(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.w) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // defpackage.i30
    public final float h(int i) {
        switch (this.w) {
            case 0:
                float fV = v();
                return (i - fV) / (u() - fV);
            default:
                float f = this.x.m;
                return (f - i) / (f - u());
        }
    }

    @Override // defpackage.i30
    public final int t(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.w) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // defpackage.i30
    public final int u() {
        switch (this.w) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.x;
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.x;
                return Math.max(0, (sideSheetBehavior2.m - sideSheetBehavior2.l) - sideSheetBehavior2.o);
        }
    }

    @Override // defpackage.i30
    public final int v() {
        switch (this.w) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.x;
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return this.x.m;
        }
    }

    @Override // defpackage.i30
    public final int w() {
        switch (this.w) {
            case 0:
                return this.x.o;
            default:
                return this.x.m;
        }
    }

    @Override // defpackage.i30
    public final int x() {
        switch (this.w) {
            case 0:
                return -this.x.l;
            default:
                return u();
        }
    }

    @Override // defpackage.i30
    public final int y(View view) {
        switch (this.w) {
            case 0:
                return view.getRight() + this.x.o;
            default:
                return view.getLeft() - this.x.o;
        }
    }

    @Override // defpackage.i30
    public final int z(CoordinatorLayout coordinatorLayout) {
        switch (this.w) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }
}
