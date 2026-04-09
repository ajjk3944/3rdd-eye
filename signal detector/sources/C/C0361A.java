package c;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.EnumC0291m;
import androidx.lifecycle.InterfaceC0296s;
import androidx.lifecycle.InterfaceC0298u;
import c5.C0410g;
import h.AbstractActivityC2349g;

/* renamed from: c.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0361A implements InterfaceC0296s {

    /* renamed from: b, reason: collision with root package name */
    public static final C0410g f5782b = new C0410g(x.f5876b);

    /* renamed from: a, reason: collision with root package name */
    public final AbstractActivityC2349g f5783a;

    public C0361A(AbstractActivityC2349g abstractActivityC2349g) {
        this.f5783a = abstractActivityC2349g;
    }

    @Override // androidx.lifecycle.InterfaceC0296s
    public final void d(InterfaceC0298u interfaceC0298u, EnumC0291m enumC0291m) {
        if (enumC0291m != EnumC0291m.ON_DESTROY) {
            return;
        }
        Object systemService = this.f5783a.getSystemService("input_method");
        q5.i.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        w wVar = (w) f5782b.getValue();
        Object objB = wVar.b(inputMethodManager);
        if (objB == null) {
            return;
        }
        synchronized (objB) {
            View viewC = wVar.c(inputMethodManager);
            if (viewC == null) {
                return;
            }
            if (viewC.isAttachedToWindow()) {
                return;
            }
            boolean zA = wVar.a(inputMethodManager);
            if (zA) {
                inputMethodManager.isActive();
            }
        }
    }
}
