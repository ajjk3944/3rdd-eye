package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import h5.AbstractC5952d;

/* loaded from: classes3.dex */
class e implements g {

    /* renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f38902a;

    public e(TaskCompletionSource taskCompletionSource) {
        this.f38902a = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.g
    public boolean a(AbstractC5952d abstractC5952d) {
        if (!abstractC5952d.l() && !abstractC5952d.k() && !abstractC5952d.i()) {
            return false;
        }
        this.f38902a.trySetResult(abstractC5952d.d());
        return true;
    }

    @Override // com.google.firebase.installations.g
    public boolean b(Exception exc) {
        return false;
    }
}
