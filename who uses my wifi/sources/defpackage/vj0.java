package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vj0 extends nr {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vj0(ho0 ho0Var, int i) {
        super(ho0Var);
        this.d = i;
    }

    @Override // defpackage.nr
    public final int b(View view) {
        int right;
        int i;
        switch (this.d) {
            case 0:
                io0 io0Var = (io0) view.getLayoutParams();
                ((ho0) this.b).getClass();
                right = view.getRight() + ((io0) view.getLayoutParams()).b.right;
                i = ((ViewGroup.MarginLayoutParams) io0Var).rightMargin;
                break;
            default:
                io0 io0Var2 = (io0) view.getLayoutParams();
                ((ho0) this.b).getClass();
                right = view.getBottom() + ((io0) view.getLayoutParams()).b.bottom;
                i = ((ViewGroup.MarginLayoutParams) io0Var2).bottomMargin;
                break;
        }
        return right + i;
    }

    @Override // defpackage.nr
    public final int c(View view) {
        int iA;
        int i;
        switch (this.d) {
            case 0:
                io0 io0Var = (io0) view.getLayoutParams();
                ((ho0) this.b).getClass();
                iA = ho0.A(view) + ((ViewGroup.MarginLayoutParams) io0Var).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) io0Var).rightMargin;
                break;
            default:
                io0 io0Var2 = (io0) view.getLayoutParams();
                ((ho0) this.b).getClass();
                iA = ho0.z(view) + ((ViewGroup.MarginLayoutParams) io0Var2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) io0Var2).bottomMargin;
                break;
        }
        return iA + i;
    }

    @Override // defpackage.nr
    public final int d(View view) {
        int iZ;
        int i;
        switch (this.d) {
            case 0:
                io0 io0Var = (io0) view.getLayoutParams();
                ((ho0) this.b).getClass();
                iZ = ho0.z(view) + ((ViewGroup.MarginLayoutParams) io0Var).topMargin;
                i = ((ViewGroup.MarginLayoutParams) io0Var).bottomMargin;
                break;
            default:
                io0 io0Var2 = (io0) view.getLayoutParams();
                ((ho0) this.b).getClass();
                iZ = ho0.A(view) + ((ViewGroup.MarginLayoutParams) io0Var2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) io0Var2).rightMargin;
                break;
        }
        return iZ + i;
    }

    @Override // defpackage.nr
    public final int e(View view) {
        int left;
        int i;
        switch (this.d) {
            case 0:
                io0 io0Var = (io0) view.getLayoutParams();
                ((ho0) this.b).getClass();
                left = view.getLeft() - ((io0) view.getLayoutParams()).b.left;
                i = ((ViewGroup.MarginLayoutParams) io0Var).leftMargin;
                break;
            default:
                io0 io0Var2 = (io0) view.getLayoutParams();
                ((ho0) this.b).getClass();
                left = view.getTop() - ((io0) view.getLayoutParams()).b.top;
                i = ((ViewGroup.MarginLayoutParams) io0Var2).topMargin;
                break;
        }
        return left - i;
    }

    @Override // defpackage.nr
    public final int f() {
        switch (this.d) {
            case 0:
                return ((ho0) this.b).n;
            default:
                return ((ho0) this.b).o;
        }
    }

    @Override // defpackage.nr
    public final int g() {
        int i;
        int iF;
        switch (this.d) {
            case 0:
                ho0 ho0Var = (ho0) this.b;
                i = ho0Var.n;
                iF = ho0Var.F();
                break;
            default:
                ho0 ho0Var2 = (ho0) this.b;
                i = ho0Var2.o;
                iF = ho0Var2.D();
                break;
        }
        return i - iF;
    }

    @Override // defpackage.nr
    public final int h() {
        switch (this.d) {
            case 0:
                return ((ho0) this.b).F();
            default:
                return ((ho0) this.b).D();
        }
    }

    @Override // defpackage.nr
    public final int i() {
        switch (this.d) {
            case 0:
                return ((ho0) this.b).l;
            default:
                return ((ho0) this.b).m;
        }
    }

    @Override // defpackage.nr
    public final int j() {
        switch (this.d) {
            case 0:
                return ((ho0) this.b).m;
            default:
                return ((ho0) this.b).l;
        }
    }

    @Override // defpackage.nr
    public final int k() {
        switch (this.d) {
            case 0:
                return ((ho0) this.b).E();
            default:
                return ((ho0) this.b).G();
        }
    }

    @Override // defpackage.nr
    public final int l() {
        int iE;
        int iF;
        switch (this.d) {
            case 0:
                ho0 ho0Var = (ho0) this.b;
                iE = ho0Var.n - ho0Var.E();
                iF = ho0Var.F();
                break;
            default:
                ho0 ho0Var2 = (ho0) this.b;
                iE = ho0Var2.o - ho0Var2.G();
                iF = ho0Var2.D();
                break;
        }
        return iE - iF;
    }

    @Override // defpackage.nr
    public final int m(View view) {
        switch (this.d) {
            case 0:
                ho0 ho0Var = (ho0) this.b;
                Rect rect = (Rect) this.c;
                ho0Var.K(view, rect);
                return rect.right;
            default:
                ho0 ho0Var2 = (ho0) this.b;
                Rect rect2 = (Rect) this.c;
                ho0Var2.K(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // defpackage.nr
    public final int n(View view) {
        switch (this.d) {
            case 0:
                ho0 ho0Var = (ho0) this.b;
                Rect rect = (Rect) this.c;
                ho0Var.K(view, rect);
                return rect.left;
            default:
                ho0 ho0Var2 = (ho0) this.b;
                Rect rect2 = (Rect) this.c;
                ho0Var2.K(view, rect2);
                return rect2.top;
        }
    }

    @Override // defpackage.nr
    public final void o(int i) {
        switch (this.d) {
            case 0:
                ((ho0) this.b).O(i);
                break;
            default:
                ((ho0) this.b).P(i);
                break;
        }
    }
}
