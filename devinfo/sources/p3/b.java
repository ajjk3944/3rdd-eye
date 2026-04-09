package p3;

import android.graphics.Rect;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class b {
    public boolean e(Rect rect, View view) {
        return false;
    }

    public boolean f(View view, View view2) {
        return false;
    }

    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
        return false;
    }

    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i4, int i10, int i11) {
        return false;
    }

    public boolean n(View view) {
        return false;
    }

    public void p(CoordinatorLayout coordinatorLayout, View view, int i4, int i10, int i11, int[] iArr) {
        iArr[0] = iArr[0] + i10;
        iArr[1] = iArr[1] + i11;
    }

    public boolean q(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z3) {
        return false;
    }

    public Parcelable s(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i10) {
        return false;
    }

    public boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public void j() {
    }

    public void g(e eVar) {
    }

    public void i(CoordinatorLayout coordinatorLayout, View view) {
    }

    public void r(View view, Parcelable parcelable) {
    }

    public void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i4) {
    }

    public void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i10, int[] iArr, int i11) {
    }
}
