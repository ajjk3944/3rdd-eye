package t1;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.Recreator;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f24378d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final d f24379a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.savedstate.a f24380b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24381c;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final c a(d owner) {
            p.e(owner, "owner");
            return new c(owner, null);
        }

        public a() {
        }
    }

    public /* synthetic */ c(d dVar, i iVar) {
        this(dVar);
    }

    public static final c a(d dVar) {
        return f24378d.a(dVar);
    }

    public final androidx.savedstate.a b() {
        return this.f24380b;
    }

    public final void c() {
        Lifecycle lifecycle = this.f24379a.getLifecycle();
        if (lifecycle.b() != Lifecycle.State.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new Recreator(this.f24379a));
        this.f24380b.e(lifecycle);
        this.f24381c = true;
    }

    public final void d(Bundle bundle) {
        if (!this.f24381c) {
            c();
        }
        Lifecycle lifecycle = this.f24379a.getLifecycle();
        if (!lifecycle.b().f(Lifecycle.State.STARTED)) {
            this.f24380b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
    }

    public final void e(Bundle outBundle) {
        p.e(outBundle, "outBundle");
        this.f24380b.g(outBundle);
    }

    public c(d dVar) {
        this.f24379a = dVar;
        this.f24380b = new androidx.savedstate.a();
    }
}
