package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.F;

/* loaded from: classes3.dex */
final class bk extends bi {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f38057c;

    /* renamed from: d, reason: collision with root package name */
    private final F f38058d;

    /* renamed from: e, reason: collision with root package name */
    private final long f38059e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j10) {
        super(bnVar, taskCompletionSource);
        this.f38057c = bnVar;
        this.f38058d = new F("OnRequestIntegrityTokenCallback");
        this.f38059e = j10;
    }

    @Override // com.google.android.play.core.integrity.bi, com.google.android.play.integrity.internal.x
    public final void c(Bundle bundle) throws RemoteException {
        super.c(bundle);
        this.f38058d.d("onRequestExpressIntegrityToken", new Object[0]);
        ApiException apiExceptionA = this.f38057c.f38068f.a(bundle);
        if (apiExceptionA != null) {
            this.f38054a.trySetException(apiExceptionA);
            return;
        }
        bj bjVar = new bj(this, this.f38057c.f38065c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f38054a;
        b bVar = new b();
        bVar.b(bundle.getString("token"));
        bVar.a(bjVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}
