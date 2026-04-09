package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
final class bf extends bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f38041a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f38042b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f38043c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i10, long j10, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f38043c = bnVar;
        this.f38041a = j10;
        this.f38042b = taskCompletionSource2;
    }

    @Override // com.google.android.play.integrity.internal.G
    protected final void b() {
        if (bn.k(this.f38043c)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f38043c;
            ((com.google.android.play.integrity.internal.v) bnVar.f38063a.e()).M(bn.b(bnVar, this.f38041a, 0), new bl(this.f38043c, this.f38042b));
        } catch (RemoteException e10) {
            this.f38043c.f38064b.c(e10, "warmUpIntegrityToken(%s)", Long.valueOf(this.f38041a));
            this.f38042b.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
