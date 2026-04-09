package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class s61 extends vj {
    public o9 a;
    public int b = 0;

    public s61() {
    }

    @Override // defpackage.vj
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        x(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new o9(view);
        }
        o9 o9Var = this.a;
        View view2 = (View) o9Var.d;
        o9Var.a = view2.getTop();
        o9Var.b = view2.getLeft();
        this.a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        o9 o9Var2 = this.a;
        if (o9Var2.c != i2) {
            o9Var2.c = i2;
            o9Var2.a();
        }
        this.b = 0;
        return true;
    }

    public final int w() {
        o9 o9Var = this.a;
        if (o9Var != null) {
            return o9Var.c;
        }
        return 0;
    }

    public void x(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.r(view, i);
    }

    public s61(int i) {
    }
}
