package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;

/* loaded from: classes.dex */
public class d0 implements androidx.lifecycle.g, t1.d, j0 {

    /* renamed from: a, reason: collision with root package name */
    public final Fragment f3316a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f3317b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.p f3318c = null;

    /* renamed from: d, reason: collision with root package name */
    public t1.c f3319d = null;

    public d0(Fragment fragment, i0 i0Var) {
        this.f3316a = fragment;
        this.f3317b = i0Var;
    }

    public void a(Lifecycle.Event event) {
        this.f3318c.i(event);
    }

    public void b() {
        if (this.f3318c == null) {
            this.f3318c = new androidx.lifecycle.p(this);
            t1.c cVarA = t1.c.a(this);
            this.f3319d = cVarA;
            cVarA.c();
            SavedStateHandleSupport.c(this);
        }
    }

    public boolean c() {
        return this.f3318c != null;
    }

    public void d(Bundle bundle) {
        this.f3319d.d(bundle);
    }

    public void e(Bundle bundle) {
        this.f3319d.e(bundle);
    }

    public void f(Lifecycle.State state) {
        this.f3318c.n(state);
    }

    @Override // androidx.lifecycle.g
    public k1.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f3316a.requireContext().getApplicationContext();
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
        k1.d dVar = new k1.d();
        if (application != null) {
            dVar.c(f0.a.f3513g, application);
        }
        dVar.c(SavedStateHandleSupport.f3472a, this);
        dVar.c(SavedStateHandleSupport.f3473b, this);
        if (this.f3316a.getArguments() != null) {
            dVar.c(SavedStateHandleSupport.f3474c, this.f3316a.getArguments());
        }
        return dVar;
    }

    @Override // androidx.lifecycle.n
    public Lifecycle getLifecycle() {
        b();
        return this.f3318c;
    }

    @Override // t1.d
    public androidx.savedstate.a getSavedStateRegistry() {
        b();
        return this.f3319d.b();
    }

    @Override // androidx.lifecycle.j0
    public i0 getViewModelStore() {
        b();
        return this.f3317b;
    }
}
