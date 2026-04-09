package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
final class bg extends bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f38044a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f38045b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f38046c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f38047d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f38048e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bg(bn bnVar, TaskCompletionSource taskCompletionSource, int i10, String str, long j10, long j11, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f38048e = bnVar;
        this.f38044a = str;
        this.f38045b = j10;
        this.f38046c = j11;
        this.f38047d = taskCompletionSource2;
    }

    @Override // com.google.android.play.integrity.internal.G
    protected final void b() {
        if (bn.k(this.f38048e)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f38048e;
            ((com.google.android.play.integrity.internal.v) bnVar.f38063a.e()).V(bn.a(bnVar, this.f38044a, this.f38045b, this.f38046c, 0), new bk(this.f38048e, this.f38047d, this.f38045b));
        } catch (RemoteException e10) {
            this.f38048e.f38064b.c(e10, "requestExpressIntegrityToken(%s, %s)", this.f38044a, Long.valueOf(this.f38045b));
            this.f38047d.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
