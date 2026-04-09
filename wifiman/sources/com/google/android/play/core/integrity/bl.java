package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.F;

/* loaded from: classes3.dex */
final class bl extends bi {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f38060c;

    /* renamed from: d, reason: collision with root package name */
    private final F f38061d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bl(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(bnVar, taskCompletionSource);
        this.f38060c = bnVar;
        this.f38061d = new F("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.bi, com.google.android.play.integrity.internal.x
    public final void e(Bundle bundle) throws RemoteException {
        super.e(bundle);
        this.f38061d.d("onWarmUpExpressIntegrityToken", new Object[0]);
        ApiException apiExceptionA = this.f38060c.f38068f.a(bundle);
        if (apiExceptionA != null) {
            this.f38054a.trySetException(apiExceptionA);
        } else {
            this.f38054a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
