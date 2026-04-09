package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y extends s {

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f9145b;

    public y(TaskCompletionSource taskCompletionSource) {
        super(4);
        this.f9145b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public final boolean a(n nVar) {
        if (nVar.f9106f.get(null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.common.api.internal.s
    public final nb.d[] b(n nVar) {
        if (nVar.f9106f.get(null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.common.api.internal.s
    public final void c(Status status) {
        this.f9145b.trySetException(new ob.d(status));
    }

    @Override // com.google.android.gms.common.api.internal.s
    public final void d(Exception exc) {
        this.f9145b.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.s
    public final void e(n nVar) throws DeadObjectException {
        try {
            h(nVar);
        } catch (DeadObjectException e2) {
            c(s.g(e2));
            throw e2;
        } catch (RemoteException e10) {
            c(s.g(e10));
        } catch (RuntimeException e11) {
            this.f9145b.trySetException(e11);
        }
    }

    public final void h(n nVar) {
        if (nVar.f9106f.remove(null) != null) {
            throw new ClassCastException();
        }
        this.f9145b.trySetResult(Boolean.FALSE);
    }

    @Override // com.google.android.gms.common.api.internal.s
    public final /* bridge */ /* synthetic */ void f(yb.i iVar, boolean z3) {
    }
}
