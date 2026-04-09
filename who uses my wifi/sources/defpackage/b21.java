package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class b21 implements fe0 {
    public od0 f;
    public sd0 g;
    public final /* synthetic */ Toolbar h;

    public b21(Toolbar toolbar) {
        this.h = toolbar;
    }

    @Override // defpackage.fe0
    public final boolean b(sd0 sd0Var) {
        Toolbar toolbar = this.h;
        KeyEvent.Callback callback = toolbar.n;
        if (callback instanceof wf) {
            ((wf) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.n);
        toolbar.removeView(toolbar.m);
        toolbar.n = null;
        ArrayList arrayList = toolbar.J;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.g = null;
        toolbar.requestLayout();
        sd0Var.C = false;
        sd0Var.n.p(false);
        toolbar.v();
        return true;
    }

    @Override // defpackage.fe0
    public final boolean e(sd0 sd0Var) {
        Toolbar toolbar = this.h;
        toolbar.c();
        ViewParent parent = toolbar.m.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.m);
            }
            toolbar.addView(toolbar.m);
        }
        View actionView = sd0Var.getActionView();
        toolbar.n = actionView;
        this.g = sd0Var;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.n);
            }
            c21 c21VarH = Toolbar.h();
            c21VarH.a = (toolbar.s & 112) | 8388611;
            c21VarH.b = 2;
            toolbar.n.setLayoutParams(c21VarH);
            toolbar.addView(toolbar.n);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((c21) childAt.getLayoutParams()).b != 2 && childAt != toolbar.f) {
                toolbar.removeViewAt(childCount);
                toolbar.J.add(childAt);
            }
        }
        toolbar.requestLayout();
        sd0Var.C = true;
        sd0Var.n.p(false);
        KeyEvent.Callback callback = toolbar.n;
        if (callback instanceof wf) {
            ((wf) callback).onActionViewExpanded();
        }
        toolbar.v();
        return true;
    }

    @Override // defpackage.fe0
    public final void g() {
        if (this.g != null) {
            od0 od0Var = this.f;
            if (od0Var != null) {
                int size = od0Var.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f.getItem(i) == this.g) {
                        return;
                    }
                }
            }
            b(this.g);
        }
    }

    @Override // defpackage.fe0
    public final void i(Context context, od0 od0Var) {
        sd0 sd0Var;
        od0 od0Var2 = this.f;
        if (od0Var2 != null && (sd0Var = this.g) != null) {
            od0Var2.d(sd0Var);
        }
        this.f = od0Var;
    }

    @Override // defpackage.fe0
    public final boolean j(uy0 uy0Var) {
        return false;
    }

    @Override // defpackage.fe0
    public final boolean k() {
        return false;
    }

    @Override // defpackage.fe0
    public final void f(od0 od0Var, boolean z) {
    }
}
