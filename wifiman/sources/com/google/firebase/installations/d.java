package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import h5.AbstractC5952d;

/* loaded from: classes3.dex */
class d implements g {

    /* renamed from: a, reason: collision with root package name */
    private final h f38900a;

    /* renamed from: b, reason: collision with root package name */
    private final TaskCompletionSource f38901b;

    public d(h hVar, TaskCompletionSource taskCompletionSource) {
        this.f38900a = hVar;
        this.f38901b = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.g
    public boolean a(AbstractC5952d abstractC5952d) {
        if (!abstractC5952d.k() || this.f38900a.f(abstractC5952d)) {
            return false;
        }
        this.f38901b.setResult(f.a().b(abstractC5952d.b()).d(abstractC5952d.c()).c(abstractC5952d.h()).a());
        return true;
    }

    @Override // com.google.firebase.installations.g
    public boolean b(Exception exc) {
        this.f38901b.trySetException(exc);
        return true;
    }
}
