package d;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class x implements androidx.lifecycle.y {

    /* renamed from: b, reason: collision with root package name */
    public static final yj.n f21638b = a.a.u(new b6.a(3));

    /* renamed from: a, reason: collision with root package name */
    public final j f21639a;

    public x(j jVar) {
        this.f21639a = jVar;
    }

    @Override // androidx.lifecycle.y
    public final void g(androidx.lifecycle.a0 a0Var, androidx.lifecycle.r rVar) {
        if (rVar != androidx.lifecycle.r.ON_DESTROY) {
            return;
        }
        Object systemService = this.f21639a.getSystemService("input_method");
        nk.k.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        u uVar = (u) f21638b.getValue();
        Object objB = uVar.b(inputMethodManager);
        if (objB == null) {
            return;
        }
        synchronized (objB) {
            View viewC = uVar.c(inputMethodManager);
            if (viewC == null) {
                return;
            }
            if (viewC.isAttachedToWindow()) {
                return;
            }
            boolean zA = uVar.a(inputMethodManager);
            if (zA) {
                inputMethodManager.isActive();
            }
        }
    }
}
