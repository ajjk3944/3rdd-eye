package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ib implements Runnable {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ View j;

    public /* synthetic */ ib(pr2 pr2Var, View view, boolean z, int i) {
        this.i = pr2Var;
        this.j = view;
        this.g = z;
        this.h = i;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [hv1, rs2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [hv1, rs2] */
    /* JADX WARN: Type inference failed for: r2v3, types: [hv1, rs2] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                ((ActionMenuView) this.i).setTranslationX(((BottomAppBar) this.j).C(r0, this.h, this.g));
                break;
            default:
                pr2 pr2Var = (pr2) this.i;
                ?? r1 = pr2Var.w;
                if (r1 != 0) {
                    pr2Var.n.j(this.j, r1.X0(), pr2Var.w.g(), pr2Var.w.k(), this.g, pr2Var.k(), this.h);
                    break;
                } else {
                    gi2.U("Ad should be associated with an ad view before calling performClickForCustomGesture()");
                    break;
                }
        }
    }

    public ib(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.j = bottomAppBar;
        this.i = actionMenuView;
        this.h = i;
        this.g = z;
    }
}
