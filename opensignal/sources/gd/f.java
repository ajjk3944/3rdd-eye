package gd;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.datastore.preferences.protobuf.l;

/* loaded from: classes.dex */
public abstract class f extends e3.b {

    /* renamed from: a, reason: collision with root package name */
    public l f9516a;

    /* renamed from: b, reason: collision with root package name */
    public int f9517b = 0;

    public f() {
    }

    @Override // e3.b
    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
        t(coordinatorLayout, view, i10);
        if (this.f9516a == null) {
            this.f9516a = new l(view);
        }
        l lVar = this.f9516a;
        View view2 = (View) lVar.f1314d;
        lVar.f1311a = view2.getTop();
        lVar.f1312b = view2.getLeft();
        this.f9516a.c();
        int i11 = this.f9517b;
        if (i11 == 0) {
            return true;
        }
        l lVar2 = this.f9516a;
        if (lVar2.f1313c != i11) {
            lVar2.f1313c = i11;
            lVar2.c();
        }
        this.f9517b = 0;
        return true;
    }

    public final int s() {
        l lVar = this.f9516a;
        if (lVar != null) {
            return lVar.f1313c;
        }
        return 0;
    }

    public void t(CoordinatorLayout coordinatorLayout, View view, int i10) {
        coordinatorLayout.s(view, i10);
    }

    public f(int i10) {
    }
}
