package h7;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class i0 extends j0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10091d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(y0 y0Var, int i10) {
        super(y0Var);
        this.f10091d = i10;
    }

    @Override // h7.j0
    public final int b(View view) {
        int right;
        int i10;
        switch (this.f10091d) {
            case 0:
                z0 z0Var = (z0) view.getLayoutParams();
                ((y0) this.f10099b).getClass();
                right = view.getRight() + ((z0) view.getLayoutParams()).f10293b.right;
                i10 = ((ViewGroup.MarginLayoutParams) z0Var).rightMargin;
                break;
            default:
                z0 z0Var2 = (z0) view.getLayoutParams();
                ((y0) this.f10099b).getClass();
                right = view.getBottom() + ((z0) view.getLayoutParams()).f10293b.bottom;
                i10 = ((ViewGroup.MarginLayoutParams) z0Var2).bottomMargin;
                break;
        }
        return right + i10;
    }

    @Override // h7.j0
    public final int c(View view) {
        int iA;
        int i10;
        switch (this.f10091d) {
            case 0:
                z0 z0Var = (z0) view.getLayoutParams();
                ((y0) this.f10099b).getClass();
                iA = y0.A(view) + ((ViewGroup.MarginLayoutParams) z0Var).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) z0Var).rightMargin;
                break;
            default:
                z0 z0Var2 = (z0) view.getLayoutParams();
                ((y0) this.f10099b).getClass();
                iA = y0.z(view) + ((ViewGroup.MarginLayoutParams) z0Var2).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) z0Var2).bottomMargin;
                break;
        }
        return iA + i10;
    }

    @Override // h7.j0
    public final int d(View view) {
        int iZ;
        int i10;
        switch (this.f10091d) {
            case 0:
                z0 z0Var = (z0) view.getLayoutParams();
                ((y0) this.f10099b).getClass();
                iZ = y0.z(view) + ((ViewGroup.MarginLayoutParams) z0Var).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) z0Var).bottomMargin;
                break;
            default:
                z0 z0Var2 = (z0) view.getLayoutParams();
                ((y0) this.f10099b).getClass();
                iZ = y0.A(view) + ((ViewGroup.MarginLayoutParams) z0Var2).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) z0Var2).rightMargin;
                break;
        }
        return iZ + i10;
    }

    @Override // h7.j0
    public final int e(View view) {
        int left;
        int i10;
        switch (this.f10091d) {
            case 0:
                z0 z0Var = (z0) view.getLayoutParams();
                ((y0) this.f10099b).getClass();
                left = view.getLeft() - ((z0) view.getLayoutParams()).f10293b.left;
                i10 = ((ViewGroup.MarginLayoutParams) z0Var).leftMargin;
                break;
            default:
                z0 z0Var2 = (z0) view.getLayoutParams();
                ((y0) this.f10099b).getClass();
                left = view.getTop() - ((z0) view.getLayoutParams()).f10293b.top;
                i10 = ((ViewGroup.MarginLayoutParams) z0Var2).topMargin;
                break;
        }
        return left - i10;
    }

    @Override // h7.j0
    public final int f() {
        switch (this.f10091d) {
            case 0:
                return ((y0) this.f10099b).f10284n;
            default:
                return ((y0) this.f10099b).f10285o;
        }
    }

    @Override // h7.j0
    public final int g() {
        int i10;
        int iF;
        switch (this.f10091d) {
            case 0:
                y0 y0Var = (y0) this.f10099b;
                i10 = y0Var.f10284n;
                iF = y0Var.F();
                break;
            default:
                y0 y0Var2 = (y0) this.f10099b;
                i10 = y0Var2.f10285o;
                iF = y0Var2.D();
                break;
        }
        return i10 - iF;
    }

    @Override // h7.j0
    public final int h() {
        switch (this.f10091d) {
            case 0:
                return ((y0) this.f10099b).F();
            default:
                return ((y0) this.f10099b).D();
        }
    }

    @Override // h7.j0
    public final int i() {
        switch (this.f10091d) {
            case 0:
                return ((y0) this.f10099b).f10282l;
            default:
                return ((y0) this.f10099b).f10283m;
        }
    }

    @Override // h7.j0
    public final int j() {
        switch (this.f10091d) {
            case 0:
                return ((y0) this.f10099b).f10283m;
            default:
                return ((y0) this.f10099b).f10282l;
        }
    }

    @Override // h7.j0
    public final int k() {
        switch (this.f10091d) {
            case 0:
                return ((y0) this.f10099b).E();
            default:
                return ((y0) this.f10099b).G();
        }
    }

    @Override // h7.j0
    public final int l() {
        int iE;
        int iF;
        switch (this.f10091d) {
            case 0:
                y0 y0Var = (y0) this.f10099b;
                iE = y0Var.f10284n - y0Var.E();
                iF = y0Var.F();
                break;
            default:
                y0 y0Var2 = (y0) this.f10099b;
                iE = y0Var2.f10285o - y0Var2.G();
                iF = y0Var2.D();
                break;
        }
        return iE - iF;
    }

    @Override // h7.j0
    public final int m(View view) {
        switch (this.f10091d) {
            case 0:
                y0 y0Var = (y0) this.f10099b;
                Rect rect = (Rect) this.f10100c;
                y0Var.K(rect, view);
                return rect.right;
            default:
                y0 y0Var2 = (y0) this.f10099b;
                Rect rect2 = (Rect) this.f10100c;
                y0Var2.K(rect2, view);
                return rect2.bottom;
        }
    }

    @Override // h7.j0
    public final int n(View view) {
        switch (this.f10091d) {
            case 0:
                y0 y0Var = (y0) this.f10099b;
                Rect rect = (Rect) this.f10100c;
                y0Var.K(rect, view);
                return rect.left;
            default:
                y0 y0Var2 = (y0) this.f10099b;
                Rect rect2 = (Rect) this.f10100c;
                y0Var2.K(rect2, view);
                return rect2.top;
        }
    }

    @Override // h7.j0
    public final void o(int i10) {
        switch (this.f10091d) {
            case 0:
                ((y0) this.f10099b).O(i10);
                break;
            default:
                ((y0) this.f10099b).P(i10);
                break;
        }
    }
}
