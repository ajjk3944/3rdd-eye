package kc;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.datastore.preferences.protobuf.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class e extends p3.b {

    /* renamed from: a, reason: collision with root package name */
    public k f28138a;

    /* renamed from: b, reason: collision with root package name */
    public int f28139b = 0;

    public e() {
    }

    @Override // p3.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
        x(coordinatorLayout, view, i4);
        if (this.f28138a == null) {
            this.f28138a = new k(view);
        }
        k kVar = this.f28138a;
        View view2 = (View) kVar.f1003d;
        kVar.f1000a = view2.getTop();
        kVar.f1001b = view2.getLeft();
        this.f28138a.d();
        int i10 = this.f28139b;
        if (i10 == 0) {
            return true;
        }
        k kVar2 = this.f28138a;
        if (kVar2.f1002c != i10) {
            kVar2.f1002c = i10;
            kVar2.d();
        }
        this.f28139b = 0;
        return true;
    }

    public final int w() {
        k kVar = this.f28138a;
        if (kVar != null) {
            return kVar.f1002c;
        }
        return 0;
    }

    public void x(CoordinatorLayout coordinatorLayout, View view, int i4) {
        coordinatorLayout.r(i4, view);
    }

    public e(int i4) {
    }
}
