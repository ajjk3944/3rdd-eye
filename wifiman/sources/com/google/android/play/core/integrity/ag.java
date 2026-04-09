package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.A;
import com.google.android.play.integrity.internal.G;

/* loaded from: classes3.dex */
final class ag extends G {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f37991a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f37992b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f37993c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f37994d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ aj f37995e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i10) {
        super(taskCompletionSource);
        this.f37995e = ajVar;
        this.f37991a = bundle;
        this.f37992b = activity;
        this.f37993c = taskCompletionSource2;
        this.f37994d = i10;
    }

    @Override // com.google.android.play.integrity.internal.G
    protected final void b() {
        try {
            A a10 = (A) this.f37995e.f38000a.e();
            Bundle bundle = this.f37991a;
            aj ajVar = this.f37995e;
            a10.d(bundle, ajVar.f38003d.a(this.f37992b, this.f37993c, ajVar.f38000a));
        } catch (RemoteException e10) {
            this.f37995e.f38001b.c(e10, "requestAndShowDialog(%s)", Integer.valueOf(this.f37994d));
            this.f37993c.trySetException(new IntegrityServiceException(-100, e10));
        }
    }
}
