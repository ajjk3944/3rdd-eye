package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
abstract class S extends H {

    /* renamed from: b, reason: collision with root package name */
    protected final TaskCompletionSource f34785b;

    public S(int i10, TaskCompletionSource taskCompletionSource) {
        super(i10);
        this.f34785b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.V
    public final void a(Status status) {
        this.f34785b.trySetException(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.V
    public final void b(Exception exc) {
        this.f34785b.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.V
    public final void c(C4296z c4296z) throws DeadObjectException {
        try {
            h(c4296z);
        } catch (DeadObjectException e10) {
            a(V.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(V.e(e11));
        } catch (RuntimeException e12) {
            this.f34785b.trySetException(e12);
        }
    }

    protected abstract void h(C4296z c4296z);
}
