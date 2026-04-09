package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import r3.C7566d;

/* loaded from: classes.dex */
public final class T extends H {

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC4285n f34786b;

    /* renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f34787c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4284m f34788d;

    public T(int i10, AbstractC4285n abstractC4285n, TaskCompletionSource taskCompletionSource, InterfaceC4284m interfaceC4284m) {
        super(i10);
        this.f34787c = taskCompletionSource;
        this.f34786b = abstractC4285n;
        this.f34788d = interfaceC4284m;
        if (i10 == 2 && abstractC4285n.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.V
    public final void a(Status status) {
        this.f34787c.trySetException(this.f34788d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.V
    public final void b(Exception exc) {
        this.f34787c.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.V
    public final void c(C4296z c4296z) throws DeadObjectException {
        try {
            this.f34786b.b(c4296z.v(), this.f34787c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(V.e(e11));
        } catch (RuntimeException e12) {
            this.f34787c.trySetException(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.V
    public final void d(C4288q c4288q, boolean z10) {
        c4288q.b(this.f34787c, z10);
    }

    @Override // com.google.android.gms.common.api.internal.H
    public final boolean f(C4296z c4296z) {
        return this.f34786b.c();
    }

    @Override // com.google.android.gms.common.api.internal.H
    public final C7566d[] g(C4296z c4296z) {
        return this.f34786b.e();
    }
}
