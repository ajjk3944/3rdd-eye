package o4;

import android.view.View;
import android.view.ViewGroup;
import n0.o1;

/* loaded from: classes.dex */
public final class z implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18888a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18889d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f18890g;

    public /* synthetic */ z(int i10, View view, Object obj) {
        this.f18888a = i10;
        this.f18889d = view;
        this.f18890g = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f18888a) {
            case 0:
                androidx.fragment.app.e eVar = (androidx.fragment.app.e) this.f18889d;
                androidx.fragment.app.b bVar = eVar.f1462c;
                eVar.k();
                k.i((ViewGroup) bVar.f1413e0.getParent(), ((a0) this.f18890g).f18775a).h();
                return;
            case 1:
                y1.a aVar = (y1.a) this.f18889d;
                androidx.lifecycle.v vVarC = androidx.lifecycle.o0.c(aVar);
                if (vVarC != null) {
                    ((br.w) this.f18890g).f2917a = y1.e0.c(aVar, vVarC.h());
                    aVar.removeOnAttachStateChangeListener(this);
                    return;
                } else {
                    u1.a.c("View tree for " + aVar + " has no ViewTreeLifecycleOwner");
                    throw new bf.n();
                }
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f18888a) {
            case 0:
            case 1:
                break;
            default:
                ((View) this.f18889d).removeOnAttachStateChangeListener(this);
                ((o1) this.f18890g).r();
                break;
        }
    }

    public z(a0 a0Var, androidx.fragment.app.e eVar) {
        this.f18888a = 0;
        this.f18890g = a0Var;
        this.f18889d = eVar;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
