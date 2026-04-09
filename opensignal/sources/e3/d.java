package e3;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import br.l;
import com.staircase3.opensignal.goldstar.loadingconfig.LoadConfigActivity;
import fj.i;
import l5.t;

/* loaded from: classes.dex */
public final class d implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7769a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f7770d;

    public d(r3.b bVar, LoadConfigActivity loadConfigActivity) {
        this.f7770d = loadConfigActivity;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        switch (this.f7769a) {
            case 0:
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = ((CoordinatorLayout) this.f7770d).M;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewAdded(view, view2);
                    break;
                }
                break;
            default:
                if (i.z(view2)) {
                    SplashScreenView splashScreenViewM = i.m(view2);
                    l.e(splashScreenViewM, "child");
                    WindowInsets windowInsetsBuild = t.i().build();
                    l.d(windowInsetsBuild, "Builder().build()");
                    Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
                    if (windowInsetsBuild == splashScreenViewM.getRootView().computeSystemWindowInsets(windowInsetsBuild, rect)) {
                        rect.isEmpty();
                    }
                    ((ViewGroup) ((LoadConfigActivity) this.f7770d).getWindow().getDecorView()).setOnHierarchyChangeListener(null);
                    break;
                }
                break;
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        switch (this.f7769a) {
            case 0:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f7770d;
                coordinatorLayout.r(2);
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.M;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewRemoved(view, view2);
                    break;
                }
                break;
        }
    }

    public d(CoordinatorLayout coordinatorLayout) {
        this.f7770d = coordinatorLayout;
    }

    private final void a(View view, View view2) {
    }
}
