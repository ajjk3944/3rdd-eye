package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ud implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ud(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 1:
                us usVar = (us) obj;
                AccessibilityManager accessibilityManager = usVar.y;
                if (usVar.z != null && accessibilityManager != null && usVar.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(usVar.z);
                    break;
                }
                break;
            case 2:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = e61.a;
                r51.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        switch (this.f) {
            case 0:
                xd xdVar = (xd) this.g;
                ViewTreeObserver viewTreeObserver = xdVar.C;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        xdVar.C = view.getViewTreeObserver();
                    }
                    xdVar.C.removeGlobalOnLayoutListener(xdVar.n);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                us usVar = (us) this.g;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = usVar.z;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = usVar.y) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.g;
                t00 t00Var = hideBottomViewOnScrollBehavior.h;
                if (t00Var != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.g) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(t00Var);
                    hideBottomViewOnScrollBehavior.h = null;
                    break;
                }
                break;
            case 4:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.g;
                t00 t00Var2 = hideViewOnScrollBehavior.c;
                if (t00Var2 != null && (accessibilityManager3 = hideViewOnScrollBehavior.b) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(t00Var2);
                    hideViewOnScrollBehavior.c = null;
                    break;
                }
                break;
            default:
                vx0 vx0Var = (vx0) this.g;
                ViewTreeObserver viewTreeObserver2 = vx0Var.t;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        vx0Var.t = view.getViewTreeObserver();
                    }
                    vx0Var.t.removeGlobalOnLayoutListener(vx0Var.n);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }
}
