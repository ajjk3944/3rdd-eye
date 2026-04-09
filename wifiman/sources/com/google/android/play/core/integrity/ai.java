package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.B;
import com.google.android.play.integrity.internal.F;

/* loaded from: classes3.dex */
final class ai extends B {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aj f37997a;

    /* renamed from: b, reason: collision with root package name */
    private final F f37998b = new F("OnRequestIntegrityTokenCallback");

    /* renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f37999c;

    ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        this.f37997a = ajVar;
        this.f37999c = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.C
    public final void b(Bundle bundle) {
        this.f37997a.f38000a.v(this.f37999c);
        this.f37998b.d("onRequestIntegrityToken", new Object[0]);
        ApiException apiExceptionA = this.f37997a.f38004e.a(bundle);
        if (apiExceptionA != null) {
            this.f37999c.trySetException(apiExceptionA);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f37999c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        ah ahVar = new ah(this, this.f37997a.f38002c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f37999c;
        a aVar = new a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
