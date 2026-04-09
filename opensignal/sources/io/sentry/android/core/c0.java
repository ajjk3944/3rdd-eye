package io.sentry.android.core;

import androidx.lifecycle.DefaultLifecycleObserver;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c0 implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f11548a = new b0(0, this);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f11549d;

    public c0(d0 d0Var) {
        this.f11549d = d0Var;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(androidx.lifecycle.v vVar) {
        this.f11549d.f11558r = Boolean.FALSE;
        Iterator it = this.f11548a.iterator();
        while (it.hasNext()) {
            ((a0) it.next()).b();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(androidx.lifecycle.v vVar) {
        this.f11549d.f11558r = Boolean.TRUE;
        Iterator it = this.f11548a.iterator();
        while (it.hasNext()) {
            ((a0) it.next()).f();
        }
    }
}
