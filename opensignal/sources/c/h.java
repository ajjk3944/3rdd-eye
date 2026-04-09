package c;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.v0;

/* loaded from: classes.dex */
public final class h implements androidx.lifecycle.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3020a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f3021d;

    public /* synthetic */ h(l lVar, int i10) {
        this.f3020a = i10;
        this.f3021d = lVar;
    }

    @Override // androidx.lifecycle.t
    public final void b(androidx.lifecycle.v vVar, androidx.lifecycle.m mVar) {
        switch (this.f3020a) {
            case 0:
                if (mVar == androidx.lifecycle.m.ON_STOP) {
                    Window window = this.f3021d.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                        break;
                    }
                }
                break;
            case 1:
                if (mVar == androidx.lifecycle.m.ON_DESTROY) {
                    this.f3021d.f3028d.f26826b = null;
                    if (!this.f3021d.isChangingConfigurations()) {
                        this.f3021d.d().a();
                    }
                    k kVar = this.f3021d.D;
                    l lVar = kVar.f3027r;
                    lVar.getWindow().getDecorView().removeCallbacks(kVar);
                    lVar.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(kVar);
                    break;
                }
                break;
            case 2:
                l lVar2 = this.f3021d;
                if (lVar2.f3032y == null) {
                    j jVar = (j) lVar2.getLastNonConfigurationInstance();
                    if (jVar != null) {
                        lVar2.f3032y = jVar.f3023b;
                    }
                    if (lVar2.f3032y == null) {
                        lVar2.f3032y = new v0();
                    }
                }
                lVar2.f3030r.m1(this);
                break;
            default:
                if (mVar == androidx.lifecycle.m.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
                    w wVar = this.f3021d.B;
                    OnBackInvokedDispatcher onBackInvokedDispatcherA = i.a((l) vVar);
                    wVar.getClass();
                    br.l.e(onBackInvokedDispatcherA, "invoker");
                    wVar.f3058e = onBackInvokedDispatcherA;
                    wVar.c(wVar.f3060g);
                    break;
                }
                break;
        }
    }
}
