package M3;

import R.O;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import h3.AccessibilityManagerTouchExplorationStateChangeListenerC2362a;
import java.util.WeakHashMap;
import n.ViewOnKeyListenerC2665B;
import n.ViewOnKeyListenerC2671e;

/* loaded from: classes.dex */
public final class n implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2868a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2869b;

    public /* synthetic */ n(int i, Object obj) {
        this.f2868a = i;
        this.f2869b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f2868a;
        Object obj = this.f2869b;
        switch (i) {
            case 0:
                p pVar = (p) obj;
                AccessibilityManager accessibilityManager = pVar.f2879H;
                if (pVar.f2880I != null && accessibilityManager != null && pVar.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(pVar.f2880I);
                    break;
                }
                break;
            case 3:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = O.f3270a;
                R.D.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        switch (this.f2868a) {
            case 0:
                p pVar = (p) this.f2869b;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = pVar.f2880I;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = pVar.f2879H) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
            case 1:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f2869b;
                AccessibilityManagerTouchExplorationStateChangeListenerC2362a accessibilityManagerTouchExplorationStateChangeListenerC2362a = hideBottomViewOnScrollBehavior.f18093h;
                if (accessibilityManagerTouchExplorationStateChangeListenerC2362a != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.f18092g) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC2362a);
                    hideBottomViewOnScrollBehavior.f18093h = null;
                    break;
                }
                break;
            case 2:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f2869b;
                AccessibilityManagerTouchExplorationStateChangeListenerC2362a accessibilityManagerTouchExplorationStateChangeListenerC2362a2 = hideViewOnScrollBehavior.f18098c;
                if (accessibilityManagerTouchExplorationStateChangeListenerC2362a2 != null && (accessibilityManager3 = hideViewOnScrollBehavior.f18097b) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC2362a2);
                    hideViewOnScrollBehavior.f18098c = null;
                    break;
                }
                break;
            case 3:
                break;
            case 4:
                ViewOnKeyListenerC2671e viewOnKeyListenerC2671e = (ViewOnKeyListenerC2671e) this.f2869b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC2671e.f22038L;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC2671e.f22038L = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC2671e.f22038L.removeGlobalOnLayoutListener(viewOnKeyListenerC2671e.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC2665B viewOnKeyListenerC2665B = (ViewOnKeyListenerC2665B) this.f2869b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC2665B.f21989C;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC2665B.f21989C = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC2665B.f21989C.removeGlobalOnLayoutListener(viewOnKeyListenerC2665B.i);
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
