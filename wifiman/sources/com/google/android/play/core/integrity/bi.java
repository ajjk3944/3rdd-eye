package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
class bi extends com.google.android.play.integrity.internal.w {

    /* renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f38054a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f38055b;

    bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        this.f38055b = bnVar;
        this.f38054a = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.x
    public final void b(Bundle bundle) throws RemoteException {
        this.f38055b.f38063a.v(this.f38054a);
    }

    @Override // com.google.android.play.integrity.internal.x
    public void c(Bundle bundle) throws RemoteException {
        this.f38055b.f38063a.v(this.f38054a);
    }

    @Override // com.google.android.play.integrity.internal.x
    public final void d(Bundle bundle) throws RemoteException {
        this.f38055b.f38063a.v(this.f38054a);
    }

    @Override // com.google.android.play.integrity.internal.x
    public void e(Bundle bundle) throws RemoteException {
        this.f38055b.f38063a.v(this.f38054a);
    }
}
