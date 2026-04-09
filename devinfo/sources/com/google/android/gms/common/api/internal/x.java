package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class x extends s {

    /* renamed from: b, reason: collision with root package name */
    public final k f9142b;

    /* renamed from: c, reason: collision with root package name */
    public final TaskCompletionSource f9143c;

    /* renamed from: d, reason: collision with root package name */
    public final ed.f f9144d;

    public x(int i4, k kVar, TaskCompletionSource taskCompletionSource, ed.f fVar) {
        super(i4);
        this.f9143c = taskCompletionSource;
        this.f9142b = kVar;
        this.f9144d = fVar;
        if (i4 == 2 && kVar.f9097c) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public final boolean a(n nVar) {
        return this.f9142b.f9097c;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public final nb.d[] b(n nVar) {
        return (nb.d[]) this.f9142b.f9096b;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public final void c(Status status) {
        this.f9144d.getClass();
        this.f9143c.trySetException(status.f9062c != null ? new ob.j(status) : new ob.d(status));
    }

    @Override // com.google.android.gms.common.api.internal.s
    public final void d(Exception exc) {
        this.f9143c.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.s
    public final void e(n nVar) throws DeadObjectException {
        TaskCompletionSource taskCompletionSource = this.f9143c;
        try {
            k kVar = this.f9142b;
            ((j) ((k) kVar.f9099e).f9099e).accept(nVar.f9102b, taskCompletionSource);
        } catch (DeadObjectException e2) {
            throw e2;
        } catch (RemoteException e10) {
            c(s.g(e10));
        } catch (RuntimeException e11) {
            taskCompletionSource.trySetException(e11);
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public final void f(yb.i iVar, boolean z3) {
        Boolean boolValueOf = Boolean.valueOf(z3);
        Map map = (Map) iVar.f37517c;
        TaskCompletionSource taskCompletionSource = this.f9143c;
        map.put(taskCompletionSource, boolValueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new y4.a(false, iVar, taskCompletionSource));
    }
}
