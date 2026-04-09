package androidx.fragment.app;

import C.g0;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.C1791y;
import androidx.lifecycle.InterfaceC1777j;
import androidx.lifecycle.e0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import j1.AbstractC5165a;
import j1.C5166b;
import java.util.LinkedHashMap;

/* compiled from: FragmentViewLifecycleOwner.java */
/* loaded from: classes.dex */
public final class O implements InterfaceC1777j, D1.e, j0 {

    /* renamed from: b, reason: collision with root package name */
    public final ComponentCallbacksC1759l f15824b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f15825c;

    /* renamed from: d, reason: collision with root package name */
    public final g0 f15826d;

    /* renamed from: e, reason: collision with root package name */
    public C1791y f15827e = null;

    /* renamed from: f, reason: collision with root package name */
    public D1.d f15828f = null;

    public O(ComponentCallbacksC1759l componentCallbacksC1759l, i0 i0Var, g0 g0Var) {
        this.f15824b = componentCallbacksC1759l;
        this.f15825c = i0Var;
        this.f15826d = g0Var;
    }

    public final void a(AbstractC1781n.a aVar) {
        this.f15827e.d(aVar);
    }

    public final void b() {
        if (this.f15827e == null) {
            this.f15827e = new C1791y(this);
            D1.d dVar = new D1.d(this);
            this.f15828f = dVar;
            dVar.a();
            this.f15826d.run();
        }
    }

    @Override // androidx.lifecycle.InterfaceC1777j
    public final AbstractC5165a getDefaultViewModelCreationExtras() {
        Application application;
        ComponentCallbacksC1759l componentCallbacksC1759l = this.f15824b;
        Context applicationContext = componentCallbacksC1759l.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C5166b c5166b = new C5166b(0);
        LinkedHashMap linkedHashMap = c5166b.f42676a;
        if (application != null) {
            linkedHashMap.put(e0.f16144d, application);
        }
        linkedHashMap.put(androidx.lifecycle.U.f16101a, componentCallbacksC1759l);
        linkedHashMap.put(androidx.lifecycle.U.f16102b, this);
        if (componentCallbacksC1759l.getArguments() != null) {
            linkedHashMap.put(androidx.lifecycle.U.f16103c, componentCallbacksC1759l.getArguments());
        }
        return c5166b;
    }

    @Override // androidx.lifecycle.InterfaceC1790x
    public final AbstractC1781n getLifecycle() {
        b();
        return this.f15827e;
    }

    @Override // D1.e
    public final D1.c getSavedStateRegistry() {
        b();
        return this.f15828f.f1029b;
    }

    @Override // androidx.lifecycle.j0
    public final i0 getViewModelStore() {
        b();
        return this.f15825c;
    }
}
