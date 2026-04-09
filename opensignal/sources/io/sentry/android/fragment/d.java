package io.sentry.android.fragment;

import androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks;
import br.l;
import io.sentry.b1;
import io.sentry.b5;
import io.sentry.e;
import io.sentry.h0;
import io.sentry.i1;
import io.sentry.o6;
import io.sentry.v3;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class d extends FragmentManager$FragmentLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final b1 f11820a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f11821b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11822c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakHashMap f11823d;

    public d(v3 v3Var, Set set, boolean z10) {
        l.e(v3Var, "scopes");
        l.e(set, "filterFragmentLifecycleBreadcrumbs");
        this.f11820a = v3Var;
        this.f11821b = set;
        this.f11822c = z10;
        this.f11823d = new WeakHashMap();
    }

    public final void a(androidx.fragment.app.b bVar, b bVar2) {
        if (this.f11821b.contains(bVar2)) {
            e eVar = new e();
            eVar.f12204x = "navigation";
            eVar.b(bVar2.getBreadcrumbName$sentry_android_fragment_release(), "state");
            String canonicalName = bVar.getClass().getCanonicalName();
            if (canonicalName == null) {
                canonicalName = bVar.getClass().getSimpleName();
            }
            eVar.b(canonicalName, "screen");
            eVar.B = "ui.fragment.lifecycle";
            eVar.E = b5.INFO;
            h0 h0Var = new h0();
            h0Var.c(bVar, "android:fragment");
            this.f11820a.g(eVar, h0Var);
        }
    }

    public final void b(androidx.fragment.app.b bVar) {
        i1 i1Var;
        if (this.f11820a.k().isTracingEnabled() && this.f11822c) {
            WeakHashMap weakHashMap = this.f11823d;
            if (weakHashMap.containsKey(bVar) && (i1Var = (i1) weakHashMap.get(bVar)) != null) {
                o6 o6VarU = i1Var.u();
                if (o6VarU == null) {
                    o6VarU = o6.OK;
                }
                i1Var.g(o6VarU);
            }
        }
    }
}
