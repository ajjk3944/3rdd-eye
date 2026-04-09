package d;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements androidx.lifecycle.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21590a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21591b;

    public /* synthetic */ e(int i4, Object obj) {
        this.f21590a = i4;
        this.f21591b = obj;
    }

    @Override // androidx.lifecycle.y
    public final void g(androidx.lifecycle.a0 a0Var, androidx.lifecycle.r rVar) {
        Window window;
        View viewPeekDecorView;
        switch (this.f21590a) {
            case 0:
                j jVar = (j) this.f21591b;
                if (rVar == androidx.lifecycle.r.ON_STOP && (window = jVar.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                j jVar2 = (j) this.f21591b;
                if (rVar == androidx.lifecycle.r.ON_DESTROY) {
                    jVar2.f21604b.f11935b = null;
                    if (!jVar2.isChangingConfigurations()) {
                        jVar2.e().a();
                    }
                    g gVar = jVar2.f21608f;
                    j jVar3 = gVar.f21596d;
                    jVar3.getWindow().getDecorView().removeCallbacks(gVar);
                    jVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(gVar);
                    break;
                }
                break;
            default:
                c6.a aVar = (c6.a) this.f21591b;
                if (rVar != androidx.lifecycle.r.ON_START) {
                    if (rVar == androidx.lifecycle.r.ON_STOP) {
                        aVar.f2768h = false;
                        break;
                    }
                } else {
                    aVar.f2768h = true;
                    break;
                }
                break;
        }
    }
}
