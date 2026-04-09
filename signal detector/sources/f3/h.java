package f3;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public abstract class h extends E.b {

    /* renamed from: a, reason: collision with root package name */
    public i f20104a;

    /* renamed from: b, reason: collision with root package name */
    public int f20105b = 0;

    public h() {
    }

    @Override // E.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        x(coordinatorLayout, view, i);
        if (this.f20104a == null) {
            this.f20104a = new i(view);
        }
        i iVar = this.f20104a;
        View view2 = iVar.f20106a;
        iVar.f20107b = view2.getTop();
        iVar.f20108c = view2.getLeft();
        this.f20104a.a();
        int i3 = this.f20105b;
        if (i3 == 0) {
            return true;
        }
        this.f20104a.b(i3);
        this.f20105b = 0;
        return true;
    }

    public final int w() {
        i iVar = this.f20104a;
        if (iVar != null) {
            return iVar.f20109d;
        }
        return 0;
    }

    public void x(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.r(i, view);
    }

    public h(int i) {
    }
}
